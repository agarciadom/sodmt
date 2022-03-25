---
layout: page
title: Requirement Design
permalink: /requirement-design/
---

Once you have [installed](/installation/) SODM+T, you can start designing performance test cases with it.
You may want to use the simpler service process / service composition diagrams built into SODM+T, or you may want to use Papyrus UML diagrams using the MARTE GQAM profile.

# SODM+T Service Process/Composition Diagrams

SODM+T includes two notations inspired by UML activity diagrams, simplified to the elements strictly needed to generate its performance tests: service processes and service compositions.
They have essentially the same elements, but service compositions support "activity partitions" to represent the various stakeholders in a composition (e.g. the service implementing the composition, and third parties).

To create one of these diagrams, use "File - New - Other...", and select "Examples - Service Process Diagram" or "Examples - Service Composition Diagram".
Follow the steps, and you will see an editor like this one:

![Screenshot of the service process diagram editor](spdiag-editor.png)

You can click on the "Objects" in the palette, and then click on the relevant part of the diagram to place an object.
Likewise, you can click on one of the "Connections", click on the source node, and then click on the target node.

A process/composition is made up of the following types of elements:

* Action: a specific unit of behaviour to be executed (e.g. a service invocation / piece of code).
* Decision: execution will continue through exactly one of its outgoing control flows, depending on the conditions. The probabilities of all outgoing control flows must add up to 1.
* Final Node: execution will finish here. There must be exactly one final node in the whole process.
* Fork: execution will continue concurrently through all outgoing control flows.
* Initial Node: execution will start from here. There must be exactly one initial node in the whole process.
* Join: combines two mutually exclusive execution paths, which diverged at a Decision node.
* Merge: waits for execution to complete at its incoming control flows, then continues execution. These incoming control flows should have diverged at a Fork node.
* Object Node: represents an object (message) being exchanged between Actions through Object Flows. Does not have any impact in execution flow.
* Structured Activity Node: contains a subprocess of its own, with its own Initial Node and Final Node.

Additionally, a process/composition must have exactly one Global Performance Constraint, and may have Local Performance Constraints associated to the various Actions and Structured Activity Nodes:
* A Global Performance Constraint can have a time limit (measured in seconds) for the whole process/composition, and an expected throughput (measured in requests/second) for the whole process/composition.
* A Local Performance Constraint has three inputs, and two outputs:
  * Users can specify the minimum time needed, the weight to be used to distribute the available *slack* (time not needed to meet minimum times), and the number of repetitions ("reps") that are typically needed.
  * Upon execution, the performance inference algorithms will compute and update the time limit for each execution of that node, under a specific load (requests/second).

A minimal service process diagram would look like this:

![Minimal service process](spdiag-minimal.png)

It has an initial node, an action, a final node, and a global performance constraint of 5 seconds handling 5 requests/second.

We can save the model, and check in the Problems view that no issues have been detected in the diagram.
Right click on the background of the diagram, and select "Wizards".
Three options will be listed:

* "Infer time limits (GLPK)" is the oldest approach, which uses the [`glpsol`](https://www.gnu.org/software/glpk/) solver by generating constraints across all paths from the initial node. You will need to install `glpsol` yourself.
* "Infer time limits (old algorithm)" is the next approach, which implements an EOL-based algorithm distributing slack across all paths: you do not need to install anything for this one.
* "Infer performance annotations" is the latest EOL-based graph-based incremental algorithm, which discards irrelevant subpaths as soon as possible and can therefore handle diagrams with many more paths. This is also self-contained.

If you use any of these options, you will notice that a new local performance constraint will be automatically added to the diagram and linked to "a":

![Minimal service process - after inference](spdiag-minimal-inferred.png)

Feel free to play around with the diagram editor, creating more complex diagrams.
The installation instructions include a more complex service process model in the `example.adhoc.v2` project.

# Papyrus UML MARTE diagrams

You can also design performance constraints on UML activity diagrams developed with Eclipse Papyrus, using the MARTE profile.
This is generally only recommended if you need to relate the diagram with other UML models: Papyrus is generally more complex to use.

Before using Papyrus, make sure that you have opened the Papyrus models inside the `ws.profile` and `wsdl.profile` projects inside the sample projects.
These profiles are needed by the model weaving parts of SODM+T.

Create a new "Papyrus Project", using the "UML" architecture context, and the "Software Analysis" and "Software Design" architecture viewpoints.
Give it a name, and in "Representation Kind" tick "Activity Diagram".
Click on "Browse Registered Profiles", and select "MARTE".
Click on "Finish", and this editor will be shown:

![Papyrus activity diagram - start](papyrus-activity-start.png)

Similar nodes are supported here:

* Initial/activity final node
* Activity final node
* Decision/merge nodes
* Fork/join nodes
* Opaque Action
* Structured Activity Node
* Loop Node (including test/setup sections)

Global performance constraints are set by right-clicking on the all-encompassing activity, and selecting "Wizards - Set global constraints".
Epsilon will ask for the global time limit and throughput, and will set the appropriate values through GaScenario and GaAnalysisContext stereotypes.
You can inspect these stereotypes from the Properties view of the activity, inside the "Profile" tab:

![Papyrus activity diagram - stereotypes](papyrus-activity-stereotypes.png)

Specifically, the global constraints are specified as the *throughput* and *respT* (response time) of the GaScenario.

To infer the throughput and time limits of each executable node in the activity, right-click on the activity and select "Wizards - Infer time limits" and "Wizards - Infer throughput".
This will add a GaStep stereotype to every executable node, with the results of the algorithm: the time limit will be specified in the *hostDemand* attribute (as a `source=calc` value), and the throughput will be in the *throughput* attribute (also as a `source=calc` value).

Should you like to set a local performance constraint on an executable node, right-click on it and select "Wizards - Set time limit expression" or "Wizard - Set repetitions".
This will update the *hostDemand* and *rep* attributes of its GaStep stereotype with the appropriate `source=req` values (representing a requirement, rather than a calculation).

The installation instructions include more complex Papyrus UML models in the `examples.marte` and `examples.weaving.*` projects.