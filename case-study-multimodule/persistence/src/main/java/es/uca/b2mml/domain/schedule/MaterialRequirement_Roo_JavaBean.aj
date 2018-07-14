// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.schedule;

import es.uca.b2mml.domain.equip.Equipment;
import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialLot;
import es.uca.b2mml.domain.material.MaterialSublot;
import es.uca.b2mml.domain.schedule.MaterialRequirement;
import es.uca.b2mml.domain.schedule.MaterialRequirementProperty;
import es.uca.b2mml.domain.schedule.SegmentRequirement;
import java.util.Set;

privileged aspect MaterialRequirement_Roo_JavaBean {
    
    public SegmentRequirement MaterialRequirement.getSegmentRequirement() {
        return this.segmentRequirement;
    }
    
    public void MaterialRequirement.setSegmentRequirement(SegmentRequirement segmentRequirement) {
        this.segmentRequirement = segmentRequirement;
    }
    
    public Set<MaterialClass> MaterialRequirement.getMaterialClasses() {
        return this.materialClasses;
    }
    
    public void MaterialRequirement.setMaterialClasses(Set<MaterialClass> materialClasses) {
        this.materialClasses = materialClasses;
    }
    
    public Set<MaterialDefinition> MaterialRequirement.getMaterialDefinitions() {
        return this.materialDefinitions;
    }
    
    public void MaterialRequirement.setMaterialDefinitions(Set<MaterialDefinition> materialDefinitions) {
        this.materialDefinitions = materialDefinitions;
    }
    
    public Set<MaterialLot> MaterialRequirement.getMaterialLots() {
        return this.materialLots;
    }
    
    public void MaterialRequirement.setMaterialLots(Set<MaterialLot> materialLots) {
        this.materialLots = materialLots;
    }
    
    public Set<MaterialSublot> MaterialRequirement.getMaterialSublots() {
        return this.materialSublots;
    }
    
    public void MaterialRequirement.setMaterialSublots(Set<MaterialSublot> materialSublots) {
        this.materialSublots = materialSublots;
    }
    
    public String MaterialRequirement.getDescription() {
        return this.description;
    }
    
    public void MaterialRequirement.setDescription(String description) {
        this.description = description;
    }
    
    public Equipment MaterialRequirement.getLocation() {
        return this.location;
    }
    
    public void MaterialRequirement.setLocation(Equipment location) {
        this.location = location;
    }
    
    public Boolean MaterialRequirement.getConsumed() {
        return this.consumed;
    }
    
    public void MaterialRequirement.setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }
    
    public Set<MaterialRequirementProperty> MaterialRequirement.getProperties() {
        return this.properties;
    }
    
    public void MaterialRequirement.setProperties(Set<MaterialRequirementProperty> properties) {
        this.properties = properties;
    }
    
}
