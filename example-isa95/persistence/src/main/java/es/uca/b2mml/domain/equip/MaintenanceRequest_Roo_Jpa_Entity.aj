// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.equip;

import es.uca.b2mml.domain.equip.MaintenanceRequest;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect MaintenanceRequest_Roo_Jpa_Entity {
    
    declare @type: MaintenanceRequest: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long MaintenanceRequest.id;
    
    @Version
    @Column(name = "version")
    private Integer MaintenanceRequest.version;
    
    public Long MaintenanceRequest.getId() {
        return this.id;
    }
    
    public void MaintenanceRequest.setId(Long id) {
        this.id = id;
    }
    
    public Integer MaintenanceRequest.getVersion() {
        return this.version;
    }
    
    public void MaintenanceRequest.setVersion(Integer version) {
        this.version = version;
    }
    
}