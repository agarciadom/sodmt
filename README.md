# Source code for SODM+T thesis

This is the source code for the programs used to develop SODM+T, an extended version of the SODM model-driven methodology for service-oriented systems.

Unless otherwise specified, the code is under the [Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/) with secondary GPLv3 license and is copyright (C) 2008-2022 Antonio García Domínguez.

## Installation

To use the SODM+T toolset, first download and run the [Eclipse Installer](https://www.eclipse.org/downloads/).

Switch to Advanced Mode, and pick "Eclipse Modeling Tools" in its 2021-12 version (2022-03 is known not to work at the moment).
Click on "Next".

In the "Projects" page:

1. Click on the "+" button.
1. Select the "Github Projects" option within "Catalog".
1. Paste the URL of [this link](https://raw.githubusercontent.com/agarciadom/sodmt/master/workspace-models/sodmt.models.oomph/SODMTModelsGIT.setup) into the "Resource URIs" field.
1. Click on OK.
1. Tick the "SODM+T Models GIT" option.
1. Click on "Next".

In the "Variables" page, you can simply click on "Next".

In the "Confirmation" page, you can also click directly on "Finish".

In the "Progress" page, trust the software sources, and click on "Finish" when done.

After some time, the new installation will start on its own: Eclipse will clone this repository and import a collection of sample models: after some time, you will be able to click on "Finish" and start using SODM+T.

## Basic usage

For a full discussion, please check the PhD thesis and viva slides (both mostly in English) from the University of Cádiz's institutional repository, [here](http://rodin.uca.es/xmlui/handle/10498/15965).

Please start by opening the `ws.profile/model.profile.di` and `wsdl.profile/model.profile.di` files, to set up the WS and WSDL Papyrus profiles before opening any other models.

After this, you can study the remaining projects:

* [`es.uca.b2mml.perftest`](workspace-models/es.uca.b2mml.perftest) has an example set of performance models, created for the SchedulerImplService in the [`case-study-multimodule`](case-study-multimodule) project.
* [`example.adhoc.v2`](workspace-models/example.adhoc.v2) has an example service process diagram that you can use to test out the algorithm with the lightweight UML-inspired notation, by right-clicking on the background of the diagram and using one of the "Wizards - Infer..." options ("Infer performance annotations" is the EOL-based graph-based incremental algorithm, "Infer time limits (old algorithm)" is the EOL-based exhaustive algorithm, and "Infer time limits (GLPK)" uses the [`glpsol`](https://www.gnu.org/software/glpk/) solver by generating constraints in an exhaustive manner as well).
* [`examples.marte`](workspace-models/examples.marte) has an UML activity diagram which can also be used to play with the SODM+T algorithm. To represent the time limits, it uses the [MARTE GQAM](https://www.omg.org/omgmarte/) profile as [implemented](https://www.eclipse.org/papyrus/components/marte/) by Papyrus. In this case, you will have to right-click on the top-level activity in the diagram and select the relevant option in "Wizards". Only the incremental graph algorithm is available for MARTE.
* [`examples.weaving.modisco`](workspace-models/examples.weaving.modisco) contains a set of Java models extracted from the `case-study-multimodule` program with [MoDisco](https://www.eclipse.org/MoDisco/), and a weaving model that relates the Java models to the performance requirements. You can generate [ContiPerf](https://sourceforge.net/projects/contiperf/) performance tests from it by switching to the "Java" perspective, right-clicking on the `ws-impl.modisco_perfreq` file, and selecting "SODM+T for MoDisco - Generate Performance Tests". You can also see how they related to each other by opening the `.modelink` file in its `weaving` subfolder, using [Epsilon ModeLink](https://www.eclipse.org/epsilon/doc/modelink/).
* [`examples.weaving.wsdl`](workspace-models/examples.weaving.wsdl) contains a similar set of models, but rather than Java the models relate to a message catalog extracted from a WSDL file by [ServiceAnalyzer](workspace-metamodels/bundles/es.uca.webservices.service-analyzer), and a corresponding `orders.wsdl_perfreq` weaving model (with its own `.modelink` file for 3-way browsing).
* [`keraben.processes`](workspace-models/keraben.processes) contains a mix of models extracted from the `case-study-multimodule` project, together with their weaving models.
* [`keraben.usecases`](workspace-models/keraben.usecases) contains the SODM Use Case and Extended Use Case diagrams for the above case study, which were created as part of the case study for the PhD.

## Update site

This project also has a standard update site here, in case you would like to use your existing Eclipse installation:

https://agarciadom.github.io/sodmt/updates/1.0.0/

## Selected publications

* A. García-Domínguez, I. Medina-Bulo and M. Marcos Bárcena, "Performance Test Case Generation for Java and WSDL-based Web Services from MARTE", International Journal on Advances in Internet Technology, vol. 5, no. 3–4, p. 173–185, December 2012, ISSN 1942-2652. [PDF](http://www.iariajournals.org/internet_technology/inttech_v5_n34_2012_paged.pdf)
* A. García-Domínguez, Dimitrios S. Kolovos, Louis M. Rose, Richard F. Paige and I. Medina-Bulo, “EUnit: a Unit Testing Framework for Model Management Tasks”, Proceedings of the ACM/IEEE 14th International Conference on Model Driven Engineering Languages and Systems, vol. 6981/2011, p. 395–409, October 2011, Wellington, New Zealand. DOI: [10.1007/978-3-642-24485-8_29](http://dx.doi.org/10.1007/978-3-642-24485-8_29)
* A. García-Domínguez, I. Medina-Bulo and M. Marcos-Bárcena, “Model-Driven Design of Performance Requirements”, Proceedings of the 11th International Conference on Quality Software, p. 76–85, July 2011, Madrid, Spain. DOI: [10.1109/QSIC.2011.16](http://dx.doi.org/10.1109/QSIC.2011.16).
