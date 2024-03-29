// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.schedule;

import es.uca.b2mml.domain.Priority;
import es.uca.b2mml.domain.product.ProductProductionRule;
import es.uca.b2mml.domain.schedule.ProductionRequest;
import es.uca.b2mml.domain.schedule.ProductionSchedule;
import es.uca.b2mml.domain.schedule.SegmentRequirement;
import java.util.Calendar;
import java.util.Set;

privileged aspect ProductionRequest_Roo_JavaBean {
    
    public ProductionSchedule ProductionRequest.getSchedule() {
        return this.schedule;
    }
    
    public void ProductionRequest.setSchedule(ProductionSchedule schedule) {
        this.schedule = schedule;
    }
    
    public String ProductionRequest.getRequestId() {
        return this.requestId;
    }
    
    public void ProductionRequest.setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
    public String ProductionRequest.getDescription() {
        return this.description;
    }
    
    public void ProductionRequest.setDescription(String description) {
        this.description = description;
    }
    
    public ProductProductionRule ProductionRequest.getProductionRule() {
        return this.productionRule;
    }
    
    public void ProductionRequest.setProductionRule(ProductProductionRule productionRule) {
        this.productionRule = productionRule;
    }
    
    public Calendar ProductionRequest.getStartTime() {
        return this.startTime;
    }
    
    public void ProductionRequest.setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }
    
    public Calendar ProductionRequest.getEndTime() {
        return this.endTime;
    }
    
    public void ProductionRequest.setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }
    
    public Priority ProductionRequest.getPriority() {
        return this.priority;
    }
    
    public void ProductionRequest.setPriority(Priority priority) {
        this.priority = priority;
    }
    
    public Set<SegmentRequirement> ProductionRequest.getSegments() {
        return this.segments;
    }
    
    public void ProductionRequest.setSegments(Set<SegmentRequirement> segments) {
        this.segments = segments;
    }
    
}
