// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.material;

import es.uca.b2mml.domain.material.MaterialSublot;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialSublot_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager MaterialSublot.entityManager;
    
    public static final EntityManager MaterialSublot.entityManager() {
        EntityManager em = new MaterialSublot().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long MaterialSublot.countMaterialSublots() {
        return entityManager().createQuery("SELECT COUNT(o) FROM MaterialSublot o", Long.class).getSingleResult();
    }
    
    public static List<MaterialSublot> MaterialSublot.findAllMaterialSublots() {
        return entityManager().createQuery("SELECT o FROM MaterialSublot o", MaterialSublot.class).getResultList();
    }
    
    public static MaterialSublot MaterialSublot.findMaterialSublot(Long id) {
        if (id == null) return null;
        return entityManager().find(MaterialSublot.class, id);
    }
    
    public static List<MaterialSublot> MaterialSublot.findMaterialSublotEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM MaterialSublot o", MaterialSublot.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void MaterialSublot.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void MaterialSublot.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            MaterialSublot attached = MaterialSublot.findMaterialSublot(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void MaterialSublot.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void MaterialSublot.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public MaterialSublot MaterialSublot.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        MaterialSublot merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
