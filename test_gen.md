---
layout: page
title: Test Generation
permalink: /test-generation/
---

Once you have designed your performance requirements, you can use them to generate performance tests for [The Grinder](http://grinder.sourceforge.net/) (for WSDL-based web services) or [ContiPerf](https://sourceforge.net/projects/contiperf/) (for arbitrary Java programs).

## Generation of ContiPerf tests

ContiPerf is a performance testing framework that allows for easily repurposing a JUnit unit test into a performance test.
SODM+T can generate a ContiPerf test case from a JUnit test case, once a MoDisco Java discovery model has been extracted from the codebase.

### Extracting a MoDisco Java model

First, import the Java project with your JUnit test cases into your Eclipse workspace, and right-click on it in the "Package Explorer" view of the Java perspective. Choose "SODM+T for MoDisco - Analyze Java Project", and a `.javaxmi` model will be created from its sources.

You can right-click the `.javaxmi` model and use "Open With - Other... - Exeed Editor" to open it in a reflective, tree-style editor:

![Screenshot of Exeed editor on MoDisco model](modisco-tree.png)

### Creating a SODM+T MoDisco weaving model

We now need a *weaving model* to relate the relevant test class (and optionally, test methods) to target with ContiPerf tests.
Use "File - New... - Other...", and select "SODM+T - MoDisco Weaving Model" to create an empty weaving model.
For "Model Object", choose "Performance Requirement Links" and click on "Finish".
You'll see a tree-based editor like this, which allows you to configure options for the generated tests in the root element:

![Screenshot of tree-based editor on MoDisco weaving model](modisco-weaving.png)

To do the actual weaving, there are two approaches: one is to use this same editor, and another is to use [Epsilon Modelink](https://www.eclipse.org/epsilon/doc/modelink/).

### Weaving with the tree-based editor

To create the links with the tree-based editor, select the "Links Editor" menu at the top, and use "Load Resource" to load the `.javaxmi` model you extracted from your source code, and the `.uml` model you created with Papyrus and populated with [inferred performance requirements](/requirement-design).

You can then right-click on the "Performance Requirement Links" element, and add a new "Performance Requirement Link" element.
Select the new link element, and in the "Properties" view set the "Exec Node" to a relevant executable node within your model, and set the "Klazz" to the JUnit test class which will be turned into performance tests given the performance requirements of the node.
You can also select specific methods within the class to be reused (rather than reusing all test methods).

### Weaving with Modelink

Alternatively, you can use Modelink to have a three-way view of the MoDisco model, the weaving model, and the UML model:

1. Close the `.modisco_perfreq` editor.
1. Use "File - New - Other..." and select "Other - EMF ModeLink".
1. Choose the relevant container folder, enter a suitable filename, and click on "Next".
1. Choose "Three panels".
1. On the left side, add the `.javaxmi` model.
1. In the middle, add the `.modisco_perfreq` model and tick "Force Exeed".
1. On the right side, add the `.uml` model.
1. Click on "Finish".

You should now see a three-pane editor like this one:

![Screenshot of Modelink with MoDisco weaving model](modisco-modelink.png)

You can create new links by right-clicking on the "Performance Requirement Links" element and adding new children, just like before.
In addition, you can browse the left and right models much more comfortably, and you can drag elements from the left or right models on top of a link to set the relevant references.

### Generating the tests

Once you are satisfied with your `.modisco_perfreq` weaving model, you can right-click on it inside the "Package Explorer" within the Java perspective, and use "SODM+T for MoDisco - Generate Performance Tests" to generate the source code for your new ContiPerf tests.
Enjoy!

## Generation of The Grinder tests

Generating performance tests for a web service described with a WSDL document works similarly: we extract a model, create a weaving model to relate its services to executable nodes within the MARTE diagram, and right-click on the weaving model to generate the source code for the tests.

### Extracting a message catalog model

To extract a message catalog model from a WSDL definition, you have two options:

* If you have the `.wsdl` folder in your workspace, right-click on it from the "Package Explorer" while in the Java perspective and select "Generate ServiceAnalyzer Catalog". A `.msgcat` file with the same name as the `.wsdl` will be generated.
* If you have the URL to the WSDL document, right-click on a folder in the "Package Explorer" while in the Java perspective, and select "Generate ServiceAnalyzer Catalog from URL...". Paste the URL, and click on "Browse..." to select the destination path for the `.msgcat` file.

![Screenshot of creating .msgcat from URL to WSDL](msgcat-from-wsdl.png)

### Creating a SODM+T WSDL weaving model

Similarly to the MoDisco weaving models, you'll need a WSDL weaving model.
Use "File - New - Other...", and then "SODM+T - WSDL Weaving Model" to create a new weaving model.
Choose "Performance Requirement Links" for your "Model Object".

### Weaving with Modelink

You have the same two options as before for populating your weaving model: in this case, we will jump directly to using Modelink.
Close the `.wsdl_perfreq` editor and create a new Modelink model.
Configure it as follows:

1. Left: `.msgcat` model.
1. Middle: `.wsdl_perfreq` model, forcing Exeed.
1. Right: `.uml` model.

You can now drag `Operation`s from the left on top of a new "Performance Requirement Link".
From the right, you can drag any executable node (e.g. an OpaqueAction or a CallOperationAction) on top of a link.

When you are done weaving, your editor will look like this:

![Screenshot of weaving a WSDL message catalog and a UML MARTE model](wsdl-weaving.png)

### Generating the tests

Once you are done creating the weaving model, you can right-click on your `.wsdl_perfreq` model, and select "SODM+T for WSDL - Generate Performance Tests", and a new Eclipse project will be created with all relevant files.
Please note that many of the generation options (including the project name) can be customised from the "Performance Requirement Links" element.