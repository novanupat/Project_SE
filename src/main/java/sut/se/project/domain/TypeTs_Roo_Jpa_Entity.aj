// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import sut.se.project.domain.TypeTs;

privileged aspect TypeTs_Roo_Jpa_Entity {
    
    declare @type: TypeTs: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long TypeTs.id;
    
    @Version
    @Column(name = "version")
    private Integer TypeTs.version;
    
    public Long TypeTs.getId() {
        return this.id;
    }
    
    public void TypeTs.setId(Long id) {
        this.id = id;
    }
    
    public Integer TypeTs.getVersion() {
        return this.version;
    }
    
    public void TypeTs.setVersion(Integer version) {
        this.version = version;
    }
    
}
