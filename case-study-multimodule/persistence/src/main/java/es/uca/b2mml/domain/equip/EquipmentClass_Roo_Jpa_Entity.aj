// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.equip;

import es.uca.b2mml.domain.equip.EquipmentClass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect EquipmentClass_Roo_Jpa_Entity {
    
    declare @type: EquipmentClass: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long EquipmentClass.id;
    
    @Version
    @Column(name = "version")
    private Integer EquipmentClass.version;
    
    public Long EquipmentClass.getId() {
        return this.id;
    }
    
    public void EquipmentClass.setId(Long id) {
        this.id = id;
    }
    
    public Integer EquipmentClass.getVersion() {
        return this.version;
    }
    
    public void EquipmentClass.setVersion(Integer version) {
        this.version = version;
    }
    
}
