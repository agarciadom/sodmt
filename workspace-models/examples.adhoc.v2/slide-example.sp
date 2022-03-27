<?xml version="1.0" encoding="UTF-8"?>
<perf:ServiceProcess xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:perf="www.uca.es/modeling/performance/sodmt">
  <nodes xsi:type="perf:InitialNode" outgoing="//@edges.0"/>
  <nodes xsi:type="perf:FinalNode" incoming="//@edges.12"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.0" outgoing="//@edges.1" name="RQ" annotation="//@nodes.12"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.2" outgoing="//@edges.4" name="QAA" annotation="//@nodes.13"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.3" outgoing="//@edges.5" name="QAB" annotation="//@nodes.17"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.7" outgoing="//@edges.9" name="QHC" annotation="//@nodes.14"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.8" outgoing="//@edges.10" name="QHD" annotation="//@nodes.16"/>
  <nodes xsi:type="perf:Action" incoming="//@edges.11" outgoing="//@edges.12" name="B" annotation="//@nodes.15"/>
  <nodes xsi:type="perf:ForkNode" incoming="//@edges.1" outgoing="//@edges.2 //@edges.3"/>
  <nodes xsi:type="perf:JoinNode" incoming="//@edges.4 //@edges.5" outgoing="//@edges.6"/>
  <nodes xsi:type="perf:DecisionNode" incoming="//@edges.6" outgoing="//@edges.7 //@edges.8"/>
  <nodes xsi:type="perf:MergeNode" incoming="//@edges.9 //@edges.10" outgoing="//@edges.11"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="10.0" secsTimeLimit="0.6" execNode="//@nodes.2"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="10.0" secsTimeLimit="5.0" minimumTime="5.0" weight="0.0" execNode="//@nodes.3"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="8.0" secsTimeLimit="2.6" execNode="//@nodes.5"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="10.0" secsTimeLimit="1.8000000000000003" weight="3.0" execNode="//@nodes.7"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="2.0" secsTimeLimit="2.6" minimumTime="2.0" execNode="//@nodes.6"/>
  <nodes xsi:type="perf:LocalPerformanceAnnotation" concurrentUsers="10.0" secsTimeLimit="1.6666666666666665" reps="3.0" execNode="//@nodes.4"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.0" target="//@nodes.2"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.2" target="//@nodes.8"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.8" target="//@nodes.3"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.8" target="//@nodes.4"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.3" target="//@nodes.9"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.4" target="//@nodes.9"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.9" target="//@nodes.10"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.10" target="//@nodes.5" condition="x >= 0" probability="0.8"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.10" target="//@nodes.6" condition="x &lt; 0" probability="0.2"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.5" target="//@nodes.11"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.6" target="//@nodes.11"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.11" target="//@nodes.7"/>
  <edges xsi:type="perf:ControlFlow" source="//@nodes.7" target="//@nodes.1"/>
  <processPerformance concurrentUsers="10.0" secsTimeLimit="10.0"/>
</perf:ServiceProcess>
