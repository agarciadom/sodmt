// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.schedule;

import es.uca.b2mml.domain.schedule.ProductionSchedule;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ProductionSchedule_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager ProductionSchedule.entityManager;
    
    public static final EntityManager ProductionSchedule.entityManager() {
        EntityManager em = new ProductionSchedule().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ProductionSchedule.countProductionSchedules() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ProductionSchedule o", Long.class).getSingleResult();
    }
    
    public static List<ProductionSchedule> ProductionSchedule.findAllProductionSchedules() {
        return entityManager().createQuery("SELECT o FROM ProductionSchedule o", ProductionSchedule.class).getResultList();
    }
    
    public static ProductionSchedule ProductionSchedule.findProductionSchedule(Long id) {
        if (id == null) return null;
        return entityManager().find(ProductionSchedule.class, id);
    }
    
    public static List<ProductionSchedule> ProductionSchedule.findProductionScheduleEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ProductionSchedule o", ProductionSchedule.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void ProductionSchedule.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ProductionSchedule.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ProductionSchedule attached = ProductionSchedule.findProductionSchedule(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ProductionSchedule.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ProductionSchedule.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public ProductionSchedule ProductionSchedule.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ProductionSchedule merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
