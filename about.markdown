---
layout: page
title: About
permalink: /about/
---

SODM+T was started as part of [Antonio García-Domínguez's](https://github.com/agarciadom/) PhD thesis at the UCASE research group of the University of Cádiz. You can find the dissertation and viva slides (both mostly in English) at the [University of Cádiz's institutional repository](http://rodin.uca.es/xmlui/handle/10498/15965).

### Selected publications

This section discusses a few of the papers related to SODM+T, and how they relate to the current version of the toolset.

* A. García-Domínguez, I. Medina-Bulo and M. Marcos-Bárcena, “Model-Driven Design of Performance Requirements”, Proceedings of the 11th International Conference on Quality Software, p. 76–85, July 2011, Madrid, Spain. DOI: [10.1109/QSIC.2011.16](http://dx.doi.org/10.1109/QSIC.2011.16).

The QSIC paper describes a first version of the performance requirement inference algorithms. The algorithms have been extended in a number of ways since then, adding support for repetitions (for emulating loops) and nesting (for analysing services composed of other services), and improving its formal analysis.

* A. García-Domínguez, I. Medina-Bulo and M. Marcos Bárcena, "Performance Test Case Generation for Java and WSDL-based Web Services from MARTE", International Journal on Advances in Internet Technology, vol. 5, no. 3–4, p. 173–185, December 2012, ISSN 1942-2652. [PDF](http://www.iariajournals.org/internet_technology/inttech_v5_n34_2012_paged.pdf)

The IJAIT journal paper is an extended version of a conference paper which describes the extraction of models from Java programs and WSDL definitions, and their weaving with performance requirements to drive the generation of performance tests for the ContiPerf and The Grinder tools.

* A. García-Domínguez, Dimitrios S. Kolovos, Louis M. Rose, Richard F. Paige and I. Medina-Bulo, "EUnit: a Unit Testing Framework for Model Management Tasks", Proceedings of MODELS 2011, October 2011, Wellington, New Zealand. DOI: [10.1007/978-3-642-24485-8_29](http://dx.doi.org/10.1007/978-3-642-24485-8_29)

This MODELS 2011 paper discusses the first version of [EUnit](https://www.eclipse.org/epsilon/doc/eunit/), a tool in the [Eclipse Epsilon](https://www.eclipse.org/epsilon/) open-source project for automated unit testing of model management tasks. EUnit is used to test the SODM+T performance inference algorithms, as well as its automated model validation facilities.