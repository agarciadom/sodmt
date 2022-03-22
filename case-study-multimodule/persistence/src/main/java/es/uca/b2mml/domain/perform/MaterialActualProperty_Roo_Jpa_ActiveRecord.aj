// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.perform;

import es.uca.b2mml.domain.perform.MaterialActualProperty;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MaterialActualProperty_Roo_Jpa_ActiveRecord {
    
    public static long MaterialActualProperty.countMaterialActualProperties() {
        return entityManager().createQuery("SELECT COUNT(o) FROM MaterialActualProperty o", Long.class).getSingleResult();
    }
    
    public static List<MaterialActualProperty> MaterialActualProperty.findAllMaterialActualProperties() {
        return entityManager().createQuery("SELECT o FROM MaterialActualProperty o", MaterialActualProperty.class).getResultList();
    }
    
    public static MaterialActualProperty MaterialActualProperty.findMaterialActualProperty(Long id) {
        if (id == null) return null;
        return entityManager().find(MaterialActualProperty.class, id);
    }
    
    public static List<MaterialActualProperty> MaterialActualProperty.findMaterialActualPropertyEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM MaterialActualProperty o", MaterialActualProperty.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public MaterialActualProperty MaterialActualProperty.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        MaterialActualProperty merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}