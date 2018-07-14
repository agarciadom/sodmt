// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.product;

import es.uca.b2mml.domain.product.EquipmentSpecProperty;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EquipmentSpecProperty_Roo_Jpa_ActiveRecord {
    
    public static long EquipmentSpecProperty.countEquipmentSpecProperties() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EquipmentSpecProperty o", Long.class).getSingleResult();
    }
    
    public static List<EquipmentSpecProperty> EquipmentSpecProperty.findAllEquipmentSpecProperties() {
        return entityManager().createQuery("SELECT o FROM EquipmentSpecProperty o", EquipmentSpecProperty.class).getResultList();
    }
    
    public static EquipmentSpecProperty EquipmentSpecProperty.findEquipmentSpecProperty(Long id) {
        if (id == null) return null;
        return entityManager().find(EquipmentSpecProperty.class, id);
    }
    
    public static List<EquipmentSpecProperty> EquipmentSpecProperty.findEquipmentSpecPropertyEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EquipmentSpecProperty o", EquipmentSpecProperty.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public EquipmentSpecProperty EquipmentSpecProperty.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EquipmentSpecProperty merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
