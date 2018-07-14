// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.schedule;

import es.uca.b2mml.domain.schedule.PersonnelRequirement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PersonnelRequirement_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager PersonnelRequirement.entityManager;
    
    public static final EntityManager PersonnelRequirement.entityManager() {
        EntityManager em = new PersonnelRequirement().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long PersonnelRequirement.countPersonnelRequirements() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PersonnelRequirement o", Long.class).getSingleResult();
    }
    
    public static List<PersonnelRequirement> PersonnelRequirement.findAllPersonnelRequirements() {
        return entityManager().createQuery("SELECT o FROM PersonnelRequirement o", PersonnelRequirement.class).getResultList();
    }
    
    public static PersonnelRequirement PersonnelRequirement.findPersonnelRequirement(Long id) {
        if (id == null) return null;
        return entityManager().find(PersonnelRequirement.class, id);
    }
    
    public static List<PersonnelRequirement> PersonnelRequirement.findPersonnelRequirementEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PersonnelRequirement o", PersonnelRequirement.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void PersonnelRequirement.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void PersonnelRequirement.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            PersonnelRequirement attached = PersonnelRequirement.findPersonnelRequirement(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void PersonnelRequirement.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void PersonnelRequirement.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public PersonnelRequirement PersonnelRequirement.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PersonnelRequirement merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
