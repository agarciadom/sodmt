// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.capability;

import es.uca.b2mml.domain.capability.EquipmentCapability;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EquipmentCapability_Roo_Jpa_ActiveRecord {
    
    public static long EquipmentCapability.countEquipmentCapabilities() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EquipmentCapability o", Long.class).getSingleResult();
    }
    
    public static List<EquipmentCapability> EquipmentCapability.findAllEquipmentCapabilities() {
        return entityManager().createQuery("SELECT o FROM EquipmentCapability o", EquipmentCapability.class).getResultList();
    }
    
    public static EquipmentCapability EquipmentCapability.findEquipmentCapability(Long id) {
        if (id == null) return null;
        return entityManager().find(EquipmentCapability.class, id);
    }
    
    public static List<EquipmentCapability> EquipmentCapability.findEquipmentCapabilityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EquipmentCapability o", EquipmentCapability.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public EquipmentCapability EquipmentCapability.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EquipmentCapability merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}