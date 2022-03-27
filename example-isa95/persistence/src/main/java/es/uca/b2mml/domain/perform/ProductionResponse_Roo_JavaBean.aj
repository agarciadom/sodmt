// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.perform;

import es.uca.b2mml.domain.perform.ProductionPerformance;
import es.uca.b2mml.domain.perform.ProductionResponse;
import es.uca.b2mml.domain.perform.SegmentResponse;
import es.uca.b2mml.domain.product.ProductProductionRule;
import es.uca.b2mml.domain.schedule.ProductionRequest;
import java.util.Calendar;
import java.util.Set;

privileged aspect ProductionResponse_Roo_JavaBean {
    
    public ProductionPerformance ProductionResponse.getProductionPerformance() {
        return this.productionPerformance;
    }
    
    public void ProductionResponse.setProductionPerformance(ProductionPerformance productionPerformance) {
        this.productionPerformance = productionPerformance;
    }
    
    public ProductionRequest ProductionResponse.getProductionRequest() {
        return this.productionRequest;
    }
    
    public void ProductionResponse.setProductionRequest(ProductionRequest productionRequest) {
        this.productionRequest = productionRequest;
    }
    
    public ProductProductionRule ProductionResponse.getProductionRule() {
        return this.productionRule;
    }
    
    public void ProductionResponse.setProductionRule(ProductProductionRule productionRule) {
        this.productionRule = productionRule;
    }
    
    public String ProductionResponse.getResponseId() {
        return this.responseId;
    }
    
    public void ProductionResponse.setResponseId(String responseId) {
        this.responseId = responseId;
    }
    
    public Calendar ProductionResponse.getStartTime() {
        return this.startTime;
    }
    
    public void ProductionResponse.setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }
    
    public Calendar ProductionResponse.getEndTime() {
        return this.endTime;
    }
    
    public void ProductionResponse.setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }
    
    public Set<SegmentResponse> ProductionResponse.getSegmentResponses() {
        return this.segmentResponses;
    }
    
    public void ProductionResponse.setSegmentResponses(Set<SegmentResponse> segmentResponses) {
        this.segmentResponses = segmentResponses;
    }
    
}