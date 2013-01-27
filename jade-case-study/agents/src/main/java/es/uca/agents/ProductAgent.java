package es.uca.agents;

import jade.content.ContentElement;
import jade.content.abs.AbsPredicate;
import jade.content.lang.Codec.CodecException;
import jade.content.lang.sl.SLCodec;
import jade.content.lang.sl.SLVocabulary;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.UngroundedException;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.agents.ontology.ProductionOntology;
import es.uca.agents.ontology.concepts.Product;
import es.uca.agents.ontology.predicates.RequiresWetCutting;

/**
 * <p>
 * Implementation of the product agent of the PROSA architecture [1]. The agents
 * receive two arguments for their initialization: the product ID, and whether it
 * requires wet cutting or not.
 * </p>
 * <p>
 * [1]: H. Van Brussel, J. Wyns, P. Valckenaers, L. Bongaerts, and P. Peeters,
 * <em>Reference architecture for holonic manufacturing systems: PROSA</em>,
 * Computers in Industry, vol. 37, no. 3, pp. 255–274, Nov. 1998.
 * </p>
 *
 * TODO: use a proper database for storing process information
 * TODO: use an ontology derived from the ISA-95 spec
 */
public class ProductAgent extends Agent {
	private final class ProcessQueryServer extends CyclicBehaviour {
		private static final long serialVersionUID = 1L;

		@Override
		public void action() {
			MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.QUERY_IF);
			ACLMessage request = myAgent.receive(mt);
			if (request != null) {
				ACLMessage reply;
				try {
					reply = handle(request);
				} catch (Exception e) {
					LOGGER.error("Could not reply to the request", e);
					reply = request.createReply();
					reply.setPerformative(ACLMessage.FAILURE);
				}
				myAgent.send(reply);
			} else {
				block();
			}
		}

		private ACLMessage handle(ACLMessage request)
				throws CodecException, UngroundedException, OntologyException
		{
			ContentElement content = myAgent.getContentManager().extractContent(request);
			if (content instanceof RequiresWetCutting) {
				return handleQuery(request, (RequiresWetCutting)content);
			}
			else {
				LOGGER.warn("Did not understand the request with content '{}'", request.getContent());
				ACLMessage reply = request.createReply();
				reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
				return reply;
			}
		}

		private ACLMessage handleQuery(ACLMessage request, RequiresWetCutting pred)
				throws CodecException, OntologyException
		{
			final ACLMessage reply = request.createReply();

			if (info.getProductID().equals(pred.getProductID())) {
				reply.setPerformative(ACLMessage.INFORM);
				if (info.isRequiresWetCutting()) {
					myAgent.getContentManager().fillContent(reply, pred);
				} else {
					Ontology oM = getContentManager().lookupOntology(ProductionOntology.NAME);
					AbsPredicate not = new AbsPredicate(SLVocabulary.NOT);
					not.set(SLVocabulary.NOT_WHAT, oM.fromObject(pred));
					myAgent.getContentManager().fillContent(reply, not);
				}
			} else {
				// We don't know about this product
				reply.setPerformative(ACLMessage.REFUSE);
			}
			
			return reply;
		}
	}

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductAgent.class);

	private Product info;
	private SLCodec codec = new SLCodec();

	@Override
	protected void setup() {
		initialize(getArguments());

		getContentManager().registerLanguage(codec);
		getContentManager().registerOntology(ProductionOntology.getInstance());

		addBehaviour(new ProcessQueryServer());
	}

	private void initialize(final Object[] args) {
		if (args.length != 2 || !(args[0] instanceof String)) {
			throw new IllegalArgumentException("Agent requires productID and requiresWetCutting");
		}

		final String id = (String)args[0];
		boolean requiresWetCutting;
		if (args[1] instanceof String) {
			requiresWetCutting = Boolean.parseBoolean((String)args[0]);
		}
		else if (args[1] instanceof Boolean) {
			requiresWetCutting = (Boolean)args[0];
		}
		else {
			throw new IllegalArgumentException("requiresWetCutting must be a String or a Boolean");
		}

		info = new Product(id, requiresWetCutting);
	}

	public Product getInfo() {
		return info;
	}

	public void setInfo(Product info) {
		this.info = info;
	}
}
