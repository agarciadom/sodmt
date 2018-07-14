// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.perform;

import es.uca.b2mml.domain.perform.EquipmentActual;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EquipmentActual_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager EquipmentActual.entityManager;
    
    public static final EntityManager EquipmentActual.entityManager() {
        EntityManager em = new EquipmentActual().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long EquipmentActual.countEquipmentActuals() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EquipmentActual o", Long.class).getSingleResult();
    }
    
    public static List<EquipmentActual> EquipmentActual.findAllEquipmentActuals() {
        return entityManager().createQuery("SELECT o FROM EquipmentActual o", EquipmentActual.class).getResultList();
    }
    
    public static EquipmentActual EquipmentActual.findEquipmentActual(Long id) {
        if (id == null) return null;
        return entityManager().find(EquipmentActual.class, id);
    }
    
    public static List<EquipmentActual> EquipmentActual.findEquipmentActualEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EquipmentActual o", EquipmentActual.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void EquipmentActual.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void EquipmentActual.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            EquipmentActual attached = EquipmentActual.findEquipmentActual(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void EquipmentActual.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void EquipmentActual.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public EquipmentActual EquipmentActual.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EquipmentActual merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
