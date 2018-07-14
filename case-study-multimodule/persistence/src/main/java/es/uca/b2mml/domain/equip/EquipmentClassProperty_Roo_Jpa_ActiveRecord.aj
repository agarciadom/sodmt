// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.equip;

import es.uca.b2mml.domain.equip.EquipmentClassProperty;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EquipmentClassProperty_Roo_Jpa_ActiveRecord {
    
    public static long EquipmentClassProperty.countEquipmentClassProperties() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EquipmentClassProperty o", Long.class).getSingleResult();
    }
    
    public static List<EquipmentClassProperty> EquipmentClassProperty.findAllEquipmentClassProperties() {
        return entityManager().createQuery("SELECT o FROM EquipmentClassProperty o", EquipmentClassProperty.class).getResultList();
    }
    
    public static EquipmentClassProperty EquipmentClassProperty.findEquipmentClassProperty(Long id) {
        if (id == null) return null;
        return entityManager().find(EquipmentClassProperty.class, id);
    }
    
    public static List<EquipmentClassProperty> EquipmentClassProperty.findEquipmentClassPropertyEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EquipmentClassProperty o", EquipmentClassProperty.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public EquipmentClassProperty EquipmentClassProperty.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EquipmentClassProperty merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
