// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.schedule;

import es.uca.b2mml.domain.schedule.ProductionParameter;
import es.uca.b2mml.domain.schedule.SegmentRequirement;

privileged aspect ProductionParameter_Roo_JavaBean {
    
    public SegmentRequirement ProductionParameter.getSegmentRequirement() {
        return this.segmentRequirement;
    }
    
    public void ProductionParameter.setSegmentRequirement(SegmentRequirement segmentRequirement) {
        this.segmentRequirement = segmentRequirement;
    }
    
}
