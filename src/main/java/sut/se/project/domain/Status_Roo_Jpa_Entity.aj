// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import sut.se.project.domain.Status;

privileged aspect Status_Roo_Jpa_Entity {
    
    declare @type: Status: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Status.id;
    
    @Version
    @Column(name = "version")
    private Integer Status.version;
    
    public Long Status.getId() {
        return this.id;
    }
    
    public void Status.setId(Long id) {
        this.id = id;
    }
    
    public Integer Status.getVersion() {
        return this.version;
    }
    
    public void Status.setVersion(Integer version) {
        this.version = version;
    }
    
}
