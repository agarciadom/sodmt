// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.product;

import es.uca.b2mml.domain.Unit;
import es.uca.b2mml.domain.product.ProductParameter;
import es.uca.b2mml.domain.product.ProductSegment;

privileged aspect ProductParameter_Roo_JavaBean {
    
    public ProductSegment ProductParameter.getSegment() {
        return this.segment;
    }
    
    public void ProductParameter.setSegment(ProductSegment segment) {
        this.segment = segment;
    }
    
    public String ProductParameter.getDescription() {
        return this.description;
    }
    
    public void ProductParameter.setDescription(String description) {
        this.description = description;
    }
    
    public String ProductParameter.getParameterName() {
        return this.parameterName;
    }
    
    public void ProductParameter.setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    
    public String ProductParameter.getParameterValue() {
        return this.parameterValue;
    }
    
    public void ProductParameter.setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    public Unit ProductParameter.getUnit() {
        return this.unit;
    }
    
    public void ProductParameter.setUnit(Unit unit) {
        this.unit = unit;
    }
    
}
