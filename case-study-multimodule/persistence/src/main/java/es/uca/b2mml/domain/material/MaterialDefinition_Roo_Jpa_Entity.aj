// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.material;

import es.uca.b2mml.domain.material.MaterialDefinition;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect MaterialDefinition_Roo_Jpa_Entity {
    
    declare @type: MaterialDefinition: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long MaterialDefinition.id;
    
    @Version
    @Column(name = "version")
    private Integer MaterialDefinition.version;
    
    public Long MaterialDefinition.getId() {
        return this.id;
    }
    
    public void MaterialDefinition.setId(Long id) {
        this.id = id;
    }
    
    public Integer MaterialDefinition.getVersion() {
        return this.version;
    }
    
    public void MaterialDefinition.setVersion(Integer version) {
        this.version = version;
    }
    
}
