// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.psegment;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.psegment.ProcessSegment;
import es.uca.b2mml.domain.psegment.ProcessSegmentParameter;

privileged aspect ProcessSegmentParameter_Roo_JavaBean {
    
    public String ProcessSegmentParameter.getName() {
        return this.name;
    }
    
    public void ProcessSegmentParameter.setName(String name) {
        this.name = name;
    }
    
    public ProcessSegment ProcessSegmentParameter.getSegment() {
        return this.segment;
    }
    
    public void ProcessSegmentParameter.setSegment(ProcessSegment segment) {
        this.segment = segment;
    }
    
    public String ProcessSegmentParameter.getDescription() {
        return this.description;
    }
    
    public void ProcessSegmentParameter.setDescription(String description) {
        this.description = description;
    }
    
    public String ProcessSegmentParameter.getParameterValue() {
        return this.parameterValue;
    }
    
    public void ProcessSegmentParameter.setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    public Unit ProcessSegmentParameter.getUnit() {
        return this.unit;
    }
    
    public void ProcessSegmentParameter.setUnit(Unit unit) {
        this.unit = unit;
    }
    
}
