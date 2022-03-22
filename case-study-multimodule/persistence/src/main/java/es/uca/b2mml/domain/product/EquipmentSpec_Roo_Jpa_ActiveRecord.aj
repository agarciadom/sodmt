// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.product;

import es.uca.b2mml.domain.product.EquipmentSpec;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EquipmentSpec_Roo_Jpa_ActiveRecord {
    
    public static long EquipmentSpec.countEquipmentSpecs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EquipmentSpec o", Long.class).getSingleResult();
    }
    
    public static List<EquipmentSpec> EquipmentSpec.findAllEquipmentSpecs() {
        return entityManager().createQuery("SELECT o FROM EquipmentSpec o", EquipmentSpec.class).getResultList();
    }
    
    public static EquipmentSpec EquipmentSpec.findEquipmentSpec(Long id) {
        if (id == null) return null;
        return entityManager().find(EquipmentSpec.class, id);
    }
    
    public static List<EquipmentSpec> EquipmentSpec.findEquipmentSpecEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EquipmentSpec o", EquipmentSpec.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public EquipmentSpec EquipmentSpec.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EquipmentSpec merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}