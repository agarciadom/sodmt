# Contributing to SODM+T

If you would like to work on SODM+T, follow these instructions.

## Running SODM+T from sources

The initial setup is similar to the basic installation in the [`README`](./README.md).

First, download and run the [Eclipse Installer](https://www.eclipse.org/downloads/).
Switch to Advanced Mode, and pick "Eclipse Modeling Tools" in its 2021-12 version (2022-03 is known not to work at the moment).
Click on "Next".

In the "Projects" page, use [this project setup](https://raw.githubusercontent.com/agarciadom/sodmt/master/workspace-metamodels/releng/es.uca.modeling.sodmt.oomph/sodmt.setup) and follow the usual steps.

After a while, you should have a fully set up workbench.

## 	Basic project structure

* [`docs`](./docs) contains a number of miscellaneous documents and early experiments used to disseminate the research, study the capabilities of `glpsol`, and examine how likely the worst case of the graph-based algorithm really is.
* [`example-isa95`](./example-isa95) contains a multimodule Maven project with a basic [Spring Roo](https://projects.spring.io/spring-roo/) website implementing a simplified ERP for a manufacturing company, inspired by ISA-95. This website includes a scheduling web service, which can be tested with SODM+T, and is backed by a PostgreSQL database.
* [`example-orders`](./example-orders) contains another multimodule Maven project, this time with a set of web services for managing invoices, orders, shipments and warehouses. This is a simpler project, using only an in-memory H2 database, but it also contains manually written ContiPerf and The Grinder tests that were taken as a base to develop the automated performance test generators in SODM+T.
* [`workspace-metamodels`](./workspace-metamodels) contains the code of SODM+T in the form of a [structured environment](http://blog.vogella.com/2015/12/15/pom-less-tycho-builds-for-structured-environments/), following the usual Eclipse folder conventions.
* [`workspace-models`](./workspace-models) has a set of sample models developed with SODM+T: the [README](./README.md) has more information about them.

## Running the SODM+T tests

To run all the tests, use these commands:

```shell
cd workspace-metamodels
mvn clean verify
```

This will also build the Eclipse update site at `releng/es.uca.modeling.sodmt.updatesite`.