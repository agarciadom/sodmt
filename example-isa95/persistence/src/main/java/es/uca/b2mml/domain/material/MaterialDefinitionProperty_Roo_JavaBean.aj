// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.material;

import es.uca.b2mml.domain.material.MaterialDefinition;
import es.uca.b2mml.domain.material.MaterialDefinitionProperty;
import es.uca.b2mml.domain.material.QATestSpec;
import java.util.Set;

privileged aspect MaterialDefinitionProperty_Roo_JavaBean {
    
    public MaterialDefinition MaterialDefinitionProperty.getDefinition() {
        return this.definition;
    }
    
    public void MaterialDefinitionProperty.setDefinition(MaterialDefinition definition) {
        this.definition = definition;
    }
    
    public Set<QATestSpec> MaterialDefinitionProperty.getQualityTestSpecs() {
        return this.qualityTestSpecs;
    }
    
    public void MaterialDefinitionProperty.setQualityTestSpecs(Set<QATestSpec> qualityTestSpecs) {
        this.qualityTestSpecs = qualityTestSpecs;
    }
    
}