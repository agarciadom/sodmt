// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.material;

import es.uca.b2mml.domain.material.MaterialClass;
import es.uca.b2mml.domain.material.MaterialClassProperty;
import es.uca.b2mml.domain.material.MaterialDefinition;
import java.util.Set;

privileged aspect MaterialClass_Roo_JavaBean {
    
    public String MaterialClass.getClassId() {
        return this.classId;
    }
    
    public void MaterialClass.setClassId(String classId) {
        this.classId = classId;
    }
    
    public String MaterialClass.getDescription() {
        return this.description;
    }
    
    public void MaterialClass.setDescription(String description) {
        this.description = description;
    }
    
    public Set<MaterialDefinition> MaterialClass.getDefinitions() {
        return this.definitions;
    }
    
    public void MaterialClass.setDefinitions(Set<MaterialDefinition> definitions) {
        this.definitions = definitions;
    }
    
    public Set<MaterialClassProperty> MaterialClass.getProperties() {
        return this.properties;
    }
    
    public void MaterialClass.setProperties(Set<MaterialClassProperty> properties) {
        this.properties = properties;
    }
    
}