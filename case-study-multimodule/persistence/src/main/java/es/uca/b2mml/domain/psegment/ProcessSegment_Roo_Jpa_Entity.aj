// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.psegment;

import es.uca.b2mml.domain.psegment.ProcessSegment;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect ProcessSegment_Roo_Jpa_Entity {
    
    declare @type: ProcessSegment: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ProcessSegment.id;
    
    @Version
    @Column(name = "version")
    private Integer ProcessSegment.version;
    
    public Long ProcessSegment.getId() {
        return this.id;
    }
    
    public void ProcessSegment.setId(Long id) {
        this.id = id;
    }
    
    public Integer ProcessSegment.getVersion() {
        return this.version;
    }
    
    public void ProcessSegment.setVersion(Integer version) {
        this.version = version;
    }
    
}