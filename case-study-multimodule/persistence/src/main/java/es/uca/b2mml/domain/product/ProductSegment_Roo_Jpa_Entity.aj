// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package es.uca.b2mml.domain.product;

import es.uca.b2mml.domain.product.ProductSegment;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect ProductSegment_Roo_Jpa_Entity {
    
    declare @type: ProductSegment: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ProductSegment.id;
    
    @Version
    @Column(name = "version")
    private Integer ProductSegment.version;
    
    public Long ProductSegment.getId() {
        return this.id;
    }
    
    public void ProductSegment.setId(Long id) {
        this.id = id;
    }
    
    public Integer ProductSegment.getVersion() {
        return this.version;
    }
    
    public void ProductSegment.setVersion(Integer version) {
        this.version = version;
    }
    
}
