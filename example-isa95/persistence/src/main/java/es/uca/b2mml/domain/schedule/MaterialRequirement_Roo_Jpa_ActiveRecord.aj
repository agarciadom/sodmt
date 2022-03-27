// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.schedule;

import es.uca.b2mml.domain.schedule.MaterialRequirement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialRequirement_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager MaterialRequirement.entityManager;
    
    public static final EntityManager MaterialRequirement.entityManager() {
        EntityManager em = new MaterialRequirement().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long MaterialRequirement.countMaterialRequirements() {
        return entityManager().createQuery("SELECT COUNT(o) FROM MaterialRequirement o", Long.class).getSingleResult();
    }
    
    public static List<MaterialRequirement> MaterialRequirement.findAllMaterialRequirements() {
        return entityManager().createQuery("SELECT o FROM MaterialRequirement o", MaterialRequirement.class).getResultList();
    }
    
    public static MaterialRequirement MaterialRequirement.findMaterialRequirement(Long id) {
        if (id == null) return null;
        return entityManager().find(MaterialRequirement.class, id);
    }
    
    public static List<MaterialRequirement> MaterialRequirement.findMaterialRequirementEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM MaterialRequirement o", MaterialRequirement.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void MaterialRequirement.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void MaterialRequirement.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            MaterialRequirement attached = MaterialRequirement.findMaterialRequirement(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void MaterialRequirement.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void MaterialRequirement.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public MaterialRequirement MaterialRequirement.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        MaterialRequirement merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}