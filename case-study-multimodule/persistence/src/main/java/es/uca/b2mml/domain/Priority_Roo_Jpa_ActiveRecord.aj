// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain;

import es.uca.b2mml.domain.Priority;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Priority_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Priority.entityManager;
    
    public static final EntityManager Priority.entityManager() {
        EntityManager em = new Priority().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Priority.countPriorities() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Priority o", Long.class).getSingleResult();
    }
    
    public static List<Priority> Priority.findAllPriorities() {
        return entityManager().createQuery("SELECT o FROM Priority o", Priority.class).getResultList();
    }
    
    public static Priority Priority.findPriority(Long id) {
        if (id == null) return null;
        return entityManager().find(Priority.class, id);
    }
    
    public static List<Priority> Priority.findPriorityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Priority o", Priority.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Priority.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Priority.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Priority attached = Priority.findPriority(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Priority.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Priority.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Priority Priority.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Priority merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
