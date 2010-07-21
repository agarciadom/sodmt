SODM+T and Epsilon
==================

Hi everyone :-). I'm [Antonio
Garcia-Dominguez](https://neptuno.uca.es/~agarcia), a researcher at
the Software Process Improvement and Formal Methods group of the
University of Cadiz. I've been using Epsilon for a while for my PhD,
and the kind people at Epsilon suggested I share my experiences with
it. I'll talk a bit about my work and then go more in depth in how
Epsilon plays a role in it.

What is SODM+T?
---------------

SODM+T is the Eclipse toolset that will assist the SODM+Testing SOA
model-driven development methodology (code and articles
[here](https://neptuno.uca.es/redmine/projects/sodmt/wiki)). The
methodology intends to revise and extend the existing SODM methodology
with testing models and techniques, to make it easier to define the
test cases for the services (W3C-style Web Services) and analyze the
results.

Work on SODM+Testing and SODM+T was started recently, and the first
and current line of work is in helping users define test cases for
load testing of Web Service compositions using a model-driven
approach.

Basically, the idea is to infer the required performance of the
external services from the required performance of the whole
composition and the structure of the composition itself. More
information about this approach is available in a paper submitted to
MoSE 2010, freely available from
[here](https://neptuno.uca.es/redmine/projects/sodmt/wiki/MoSE_2010).

In order to implement this approach in Eclipse, we needed to:

* Reimplement the graphical editor with support for manual and
  automatic performance annotations.

* Implement automatic validation on the models before applying the
  inference algorithms.

* Implement the algorithms so they work directly on the model created
  by the user and they are integrated seamlessly within the Eclipse UI.

* After annotating a high-level view of the compositions with
  performance constraints, transform it automatically to a lower-level
  view which decomposes each action into a nested action subgraph.

All these tasks were performed using Epsilon, and I'm quite happy with
the results.

Why Epsilon?
------------

After evaluating the existing tools, I picked Epsilon because of
several factors:

- It is integrated. There is a large variety of languages for all
  sorts of things out there, but they mostly do just one thing. The
  tasks above would require juggling tools from several projects and
  their dependencies.

  Also, reusing code across these tools can be difficult since they do
  not have a common layer, like Epsilon does with its base language,
  the Epsilon Object Language. Thanks to EOL, I have been able to
  reuse code for validation and for the inference algorithms.

- It is well documented. I have suffered my share of poorly documented
  projects, and seeing a project with screencasts, code examples, a
  blog, a Twitter account, and a LaTeX-typeset book in the front page
  made a very good impression.

- It is actively maintained. The developers are responsive and have
  handled all the issues I have thrown at them quite well ;-).

- It has some nice features. For instance, EuGENia made it much easier
  to get the first versions of the diagrams running for someone who
  did not know much about EMF or GMF like me. Integrated problem
  markers when validating with EVL, transactions in EOL, Ant tasks for
  running the scripts... and the list goes on.

Graphical editor: EuGENia + Ant tasks
-------------------------------------

I wanted to create the editor with EMF and GMF, but I didn't like
having to manually refine the models and follow all the steps from the
ECore model to modifying the generated GMF code. It's error prone,
tedious, and unflexible: what if I needed to change the metamodels and
run everything from scratch? What if a new version of EMF or GMF came
out and the automatic migration didn't cut it?

Instead, I opted for not storing any generated artifact in the source
code repository. The idea was to generate everything automatically on
the fly and have all the modifications to the models and the code
performed automatically.

EuGENia played a large role in that: starting from an ECore metamodel,
it was able to generate mostly everything that I needed with a few
annotations. Further modifications on the models were implemented as
EOL scripts, and changes on the generated code were done with dynamic
templates.

One thing I didn't like about the original EuGENia workflow is that it
was too click-intensive, so I set out to try and automate it. The
Epsilon Ant tasks were a big help here, though I needed to grab a few
more tasks from other sources and write some of my own for the
EMF/GMF-specific parts. All in all, I can now just hit Clean from
Eclipse and have all the code for my editors regenerated on the
fly. You can get the more information from [this thread at the Eclipse
forums](http://www.eclipse.org/forums/index.php?t=msg&th=158862).

Validation
----------

Obviously, since I was going to apply several algorithms on the Web
Service composition models, I needed to automatically check upon save
their preconditions on the models.

I could have written the validation code in Java or with OCL, but EVL
(the Epsilon Validation Language) was a big time saver for me, thanks
to its declarative syntax and the ability to split them up in several
files, so I could reuse some of the constraints in several
metamodels. I moved the most complicated constraints to EOL operations
("the graph must be acyclic") and reused some of their code for the
inference algorithms.

There is only one thing that I was unable to do with EVL: prevent an
user from creating a link which would violate some constraint. Still,
that's best left to the simple built-in OCL validation in EMF, so it's
all good.

Algorithms
----------

The two inference algorithms were implemented in EOL, and take
advantage of several nice features in the EOL language: extended
properties (for storing temporary values needed by the algorithms on
the model elements themselves), cached results (to avoid doing
expensive computations again and again) and extending the metamodel
classes with new operations.

I am not too fond of OCL, but EOL's mix of imperative programming and
OCL-like declarative operations is nice to work with. Definitely nicer
than changing things through raw Java code.

To integrate these algorithms into the Eclipse UI, I only needed to
call them from two EWL (Epsilon Wizard Language) scripts referenced
from two extension points. These EWL scripts also ensure that the
algorithms have transactional semantics.

Transformations
---------------

The transformation from the higher-level composition metamodel to the
lower-level metamodel was done with ETL (Epsilon Transformation
Language). First, I created a simple copying transformation using
Epsilon, and then I revised it to handle the slight differences
between the two metamodels.

I integrated this transformation in the Eclipse UI using a separate
plug-in project with an extension point for the drop-down menu entry,
as EWL is by definition dedicated to in-place transformations. It
wasn't too hard, but it would have be nice to have ETL add a
"Transform >" drop down menu to the Eclipse UI.

What's next?
------------

There are a few Epsilon features that I haven't tried yet, and that
I'd like to try in the medium term: first of all, I'd like to try EML
(Epsilon Merging Language) to implement bottom-up transformations, in
addition to the usual top-down transformations. HUTN as a zero-cost
textual notation for the models sounds promising as well.

Also, Epsilon 0.8.9 brought Flock, a specialized transformation
language for migrations. I need to have a look at it: perhaps I could
write my transformation as a simple migration, though I wonder if the
migration is done in-place or not.

Well, that's all. I hope you liked the article. If you have any
comments, please drop me an email :-).
