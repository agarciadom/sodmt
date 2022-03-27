// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.product;

import es.uca.b2mml.domain.product.PersonnelSpec;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PersonnelSpec_Roo_Jpa_ActiveRecord {
    
    public static long PersonnelSpec.countPersonnelSpecs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PersonnelSpec o", Long.class).getSingleResult();
    }
    
    public static List<PersonnelSpec> PersonnelSpec.findAllPersonnelSpecs() {
        return entityManager().createQuery("SELECT o FROM PersonnelSpec o", PersonnelSpec.class).getResultList();
    }
    
    public static PersonnelSpec PersonnelSpec.findPersonnelSpec(Long id) {
        if (id == null) return null;
        return entityManager().find(PersonnelSpec.class, id);
    }
    
    public static List<PersonnelSpec> PersonnelSpec.findPersonnelSpecEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PersonnelSpec o", PersonnelSpec.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public PersonnelSpec PersonnelSpec.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PersonnelSpec merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}