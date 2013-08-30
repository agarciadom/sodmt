<?xml version="1.0" encoding="UTF-8"?>
<perf:ServiceProcess xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:perf="www.uca.es/modeling/performance/sodmt">
  <nodes xsi:type="perf:InitialNode" outgoing="//@edges.0"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.0" outgoing="//@edges.1" name="Evaluate Order" annotation="//@nodes.10"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.5" outgoing="//@edges.6" name="Close Order" annotation="//@nodes.7"/>
  <nodes xsi:type="perf:FinalNode" incoming="//@edges.6"/>
  <nodes xsi:type="perf:DecisionNode" incoming="//@edges.1" outgoing="//@edges.2 //@edges.7"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.2" outgoing="//@edges.3" name="Divide into Segments" annotation="//@nodes.9"/>
  <nodes xsi:type="perf:StructuredActivityNode" incoming="//@edges.3" outgoing="//@edges.4" name="Process Segments" annotation="//@nodes.8">
    <nodes xsi:type="perf:InitialNode" outgoing="//@edges.8"/>
    <nodes xsi:type="perf:FinalNode" incoming="//@edges.13"/>
    <nodes xsi:type="perf:Action" incoming="//@edges.9" outgoing="//@edges.14" name="Ship Order" annotation="//@nodes.6/@nodes.7"/>
    <nodes xsi:type="perf:Action" incoming="//@edges.10" outgoing="//@edges.11" name="Create Invoice" annotation="//@nodes.6/@nodes.9"/>
    <nodes xsi:type="perf:Action" incoming="//@edges.11" outgoing="//@edges.12" name="Perform Payment" annotation="//@nodes.6/@nodes.8"/>
    <nodes xsi:type="perf:ForkNode" incoming="//@edges.8" outgoing="//@edges.9 //@edges.10"/>
    <nodes xsi:type="perf:JoinNode" incoming="//@edges.12 //@edges.14" outgoing="//@edges.13"/>
    <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="0.5" secsTimeLimit="0.0857142857142857" execNode="//@nodes.6/@nodes.2"/>
    <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="0.5" secsTimeLimit="0.04285714285714285" execNode="//@nodes.6/@nodes.4"/>
    <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="0.5" secsTimeLimit="0.04285714285714285" execNode="//@nodes.6/@nodes.3"/>
  </nodes>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" secsTimeLimit="0.08571428571428574" execNode="//@nodes.2"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="0.5" secsTimeLimit="0.0857142857142857" reps="5.0" execNode="//@nodes.6"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="0.5" secsTimeLimit="0.08571428571428572" execNode="//@nodes.5"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" secsTimeLimit="0.4" minimumTime="0.4" weight="0.0" execNode="//@nodes.1"/>
  <nodes xsi:type="perf:MergeNode" incoming="//@edges.4 //@edges.7" outgoing="//@edges.5"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.0" target="//@nodes.1"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.1" target="//@nodes.4"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.4" target="//@nodes.5" condition="accepted" probability="0.5"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.5" target="//@nodes.6"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6" target="//@nodes.11"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.11" target="//@nodes.2"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.2" target="//@nodes.3"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.4" target="//@nodes.11" condition="rejected" probability="0.5"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6/@nodes.0" target="//@nodes.6/@nodes.5"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6/@nodes.5" target="//@nodes.6/@nodes.2"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6/@nodes.5" target="//@nodes.6/@nodes.3"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6/@nodes.3" target="//@nodes.6/@nodes.4"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6/@nodes.4" target="//@nodes.6/@nodes.6"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6/@nodes.6" target="//@nodes.6/@nodes.1"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6/@nodes.2" target="//@nodes.6/@nodes.6"/>
  <processPerformance secsTimeLimit="1.0"/>
</perf:ServiceProcess>
