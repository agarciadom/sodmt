// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.equip;

import es.uca.b2mml.domain.equip.EquipmentCapabilityTestResult;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect EquipmentCapabilityTestResult_Roo_Jpa_Entity {
    
    declare @type: EquipmentCapabilityTestResult: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long EquipmentCapabilityTestResult.id;
    
    @Version
    @Column(name = "version")
    private Integer EquipmentCapabilityTestResult.version;
    
    public Long EquipmentCapabilityTestResult.getId() {
        return this.id;
    }
    
    public void EquipmentCapabilityTestResult.setId(Long id) {
        this.id = id;
    }
    
    public Integer EquipmentCapabilityTestResult.getVersion() {
        return this.version;
    }
    
    public void EquipmentCapabilityTestResult.setVersion(Integer version) {
        this.version = version;
    }
    
}
