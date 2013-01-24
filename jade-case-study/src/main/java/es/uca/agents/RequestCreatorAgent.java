package es.uca.agents;

import jade.content.AgentAction;
import jade.content.lang.Codec;
import jade.content.lang.Codec.CodecException;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.OntologyException;
import jade.content.onto.basic.Action;
import jade.content.onto.basic.Result;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPANames;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.FIPAManagementOntology;
import jade.domain.FIPAAgentManagement.NotUnderstoodException;
import jade.domain.FIPAAgentManagement.Property;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.uca.agents.ontology.Manufacture;
import es.uca.agents.ontology.OrderResult;
import es.uca.agents.ontology.ProductionOntology;

public class RequestCreatorAgent extends Agent {
	private static final long serialVersionUID = 1L;
	private static final String WSIG_HIER = "wsig-hierarchical-type";
	private static final String WSIG = "wsig";

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestCreatorAgent.class);
	
	private static final class RequestServer extends CyclicBehaviour {
		private static final long serialVersionUID = 1L;
		private static final MessageTemplate MSG_TEMPLATE
			= MessageTemplate.MatchOntology(ProductionOntology.NAME);

		protected ACLMessage handleRequest(ACLMessage request) throws NotUnderstoodException {
			AgentAction agAct = null;
			try {
				Action act = (Action) myAgent.getContentManager().extractContent(request);
				agAct = (AgentAction)act.getAction();
			} catch (Exception e) {
				LOGGER.error("Could not understand the request", e);
			}

			try {
				if (agAct instanceof Manufacture) {
					return handleManufacture(request, (Manufacture)agAct);
				}
			} catch (Exception e) {
				LOGGER.error("Could not reply to the request", e);
				ACLMessage reply = request.createReply();
				reply.setPerformative(ACLMessage.FAILURE);
				return reply;
			}

			throw new NotUnderstoodException(request);
		}

		private ACLMessage handleManufacture(ACLMessage request, Manufacture action)
				throws CodecException, OntologyException
		{
			// Dummy reply for now
			OrderResult r = new OrderResult();
			r.setSuccessful(true);

			ACLMessage reply = request.createReply();
			reply.setPerformative(ACLMessage.INFORM);
			myAgent.getContentManager().fillContent(reply, new Result(action, r));

			return reply;
		}

		@Override
		public void action() {
			ACLMessage msg = myAgent.receive(MSG_TEMPLATE);
			if (msg != null) {
				LOGGER.info("Received query");
				LOGGER.debug("Query content is: {}", msg.getContent());
				ACLMessage reply;
				try {
					reply = handleRequest(msg);
				} catch (NotUnderstoodException e) {
					reply = msg.createReply();
					reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
					LOGGER.error("Did not understand the request", e);
				}
				myAgent.send(reply);
			} else {
				block();
			}
		}
	}

	private Codec codec = new SLCodec();

	@Override
	protected void setup() {
		LOGGER.info("Setup starting for agent {}", getLocalName());

		getContentManager().registerLanguage(codec);
		getContentManager().registerOntology(FIPAManagementOntology.getInstance());
		getContentManager().registerOntology(ProductionOntology.getInstance());

		try {
			DFAgentDescription dfad = createDFDescription();
			DFService.register(this, dfad);
		} catch (FIPAException e) {
			LOGGER.error("Could not register in DF", e);
			doDelete();
			return;
		}
		LOGGER.info("Successfully registered in DF");

		addBehaviour(new RequestServer());

		LOGGER.info("Setup completed");
	}

	private DFAgentDescription createDFDescription() {
		ServiceDescription sd = new ServiceDescription();
		sd.addLanguages(codec.getName());
		sd.addProtocols(FIPANames.InteractionProtocol.FIPA_REQUEST);
		sd.setType("OrderCreator");
		sd.setOwnership("OrderCreatorOwner");
		sd.setName("createOrder");
		sd.addOntologies(ProductionOntology.NAME);

		// Expose the agent as a web service (WSIG_HIER is needed since we use a bean ontology)
		sd.addProperties(new Property(WSIG, "true"));
		sd.addProperties(new Property(WSIG_HIER, "true"));

		DFAgentDescription dfad = new DFAgentDescription();
		dfad.setName(getAID());
		dfad.addLanguages(codec.getName());
		dfad.addProtocols(FIPANames.InteractionProtocol.FIPA_REQUEST);
		dfad.addServices(sd);
		return dfad;
	}

	@Override
	protected void takeDown() {
		try {
			DFService.deregister(this);
		} catch (FIPAException e) {
			LOGGER.error("Could not deregister from the DF", e);
		}
	}
}
