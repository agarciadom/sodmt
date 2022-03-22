// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.product;

import es.uca.b2mml.domain.product.ProductSegment;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ProductSegment_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager ProductSegment.entityManager;
    
    public static final EntityManager ProductSegment.entityManager() {
        EntityManager em = new ProductSegment().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ProductSegment.countProductSegments() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ProductSegment o", Long.class).getSingleResult();
    }
    
    public static List<ProductSegment> ProductSegment.findAllProductSegments() {
        return entityManager().createQuery("SELECT o FROM ProductSegment o", ProductSegment.class).getResultList();
    }
    
    public static ProductSegment ProductSegment.findProductSegment(Long id) {
        if (id == null) return null;
        return entityManager().find(ProductSegment.class, id);
    }
    
    public static List<ProductSegment> ProductSegment.findProductSegmentEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ProductSegment o", ProductSegment.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void ProductSegment.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ProductSegment.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ProductSegment attached = ProductSegment.findProductSegment(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ProductSegment.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ProductSegment.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public ProductSegment ProductSegment.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ProductSegment merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}