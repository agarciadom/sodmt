---
# Feel free to add content and custom Front Matter to this file.
# To modify the layout, see https://jekyllrb.com/docs/themes/#overriding-theme-defaults

layout: home
---

SODM+T is an extension of the [SODM](doi.org/10.1007/978-3-540-30480-7_6) methodology for model web information systems, focusing on the design and generation of automated performance tests for the services in a service composition workflow.

![Screenshot of a SODM+T service process diagram](assets/images/sodmt-spdiag.png)

## Tools

SODM+T provides tool support through [Eclipse GMF editors](https://www.eclipse.org/modeling/gmp/), [Eclipse Epsilon](https://www.eclipse.org/epsilon/), and [Eclipse Papyrus](https://www.eclipse.org/papyrus/):

* Graphical editors to create SODM use case and extended use case diagrams.
* Graphical editors for SODM+T service processes (simplified UML activity diagrams) and service compositions (which extend service processes with activity partitions).
* Automated in-place model transformations to compute local performance requirements for SODM+T service process models, SODM+T service composition models, and Papyrus UML models using the [MARTE](https://www.eclipse.org/papyrus/components/marte/) profile, from a combination of a global performance requirement and a set of optional local performance annotations.
* Automated generation of [ContiPerf]() performance tests from a weaving model relating the computed performance requirements to a [MoDisco](https://www.eclipse.org/MoDisco/) Java model.
* Automated generation of [The Grinder](http://grinder.sourceforge.net/) performance tests from a weaving model relating the computed performance requirements to a message catalog model extracted from a WSDL document.

## License

SODM+T is licensed under the [Eclipse Public License 2.0](https://www.eclipse.org/legal/epl-2.0/), with the [GNU General Public License version 3](https://www.gnu.org/licenses/gpl-3.0.html) as a secondary license.