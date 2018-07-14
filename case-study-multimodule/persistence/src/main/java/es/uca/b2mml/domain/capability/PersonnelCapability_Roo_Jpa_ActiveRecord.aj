// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.capability;

import es.uca.b2mml.domain.capability.PersonnelCapability;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PersonnelCapability_Roo_Jpa_ActiveRecord {
    
    public static long PersonnelCapability.countPersonnelCapabilities() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PersonnelCapability o", Long.class).getSingleResult();
    }
    
    public static List<PersonnelCapability> PersonnelCapability.findAllPersonnelCapabilities() {
        return entityManager().createQuery("SELECT o FROM PersonnelCapability o", PersonnelCapability.class).getResultList();
    }
    
    public static PersonnelCapability PersonnelCapability.findPersonnelCapability(Long id) {
        if (id == null) return null;
        return entityManager().find(PersonnelCapability.class, id);
    }
    
    public static List<PersonnelCapability> PersonnelCapability.findPersonnelCapabilityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PersonnelCapability o", PersonnelCapability.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public PersonnelCapability PersonnelCapability.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PersonnelCapability merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
