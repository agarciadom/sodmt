// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.perform;

import es.uca.b2mml.domain.perform.ProductionData;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ProductionData_Roo_Jpa_ActiveRecord {
    
    public static long ProductionData.countProductionDatas() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ProductionData o", Long.class).getSingleResult();
    }
    
    public static List<ProductionData> ProductionData.findAllProductionDatas() {
        return entityManager().createQuery("SELECT o FROM ProductionData o", ProductionData.class).getResultList();
    }
    
    public static ProductionData ProductionData.findProductionData(Long id) {
        if (id == null) return null;
        return entityManager().find(ProductionData.class, id);
    }
    
    public static List<ProductionData> ProductionData.findProductionDataEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ProductionData o", ProductionData.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public ProductionData ProductionData.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ProductionData merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
