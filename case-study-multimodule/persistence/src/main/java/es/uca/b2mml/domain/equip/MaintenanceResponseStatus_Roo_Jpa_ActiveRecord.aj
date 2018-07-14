// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.equip;

import es.uca.b2mml.domain.equip.MaintenanceResponseStatus;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaintenanceResponseStatus_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager MaintenanceResponseStatus.entityManager;
    
    public static final EntityManager MaintenanceResponseStatus.entityManager() {
        EntityManager em = new MaintenanceResponseStatus().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long MaintenanceResponseStatus.countMaintenanceResponseStatuses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM MaintenanceResponseStatus o", Long.class).getSingleResult();
    }
    
    public static List<MaintenanceResponseStatus> MaintenanceResponseStatus.findAllMaintenanceResponseStatuses() {
        return entityManager().createQuery("SELECT o FROM MaintenanceResponseStatus o", MaintenanceResponseStatus.class).getResultList();
    }
    
    public static MaintenanceResponseStatus MaintenanceResponseStatus.findMaintenanceResponseStatus(Long id) {
        if (id == null) return null;
        return entityManager().find(MaintenanceResponseStatus.class, id);
    }
    
    public static List<MaintenanceResponseStatus> MaintenanceResponseStatus.findMaintenanceResponseStatusEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM MaintenanceResponseStatus o", MaintenanceResponseStatus.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void MaintenanceResponseStatus.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void MaintenanceResponseStatus.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            MaintenanceResponseStatus attached = MaintenanceResponseStatus.findMaintenanceResponseStatus(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void MaintenanceResponseStatus.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void MaintenanceResponseStatus.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public MaintenanceResponseStatus MaintenanceResponseStatus.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        MaintenanceResponseStatus merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
