// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sut.se.project.domain.Registerform;

privileged aspect Registerform_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Registerform.entityManager;
    
    public static final EntityManager Registerform.entityManager() {
        EntityManager em = new Registerform().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Registerform.countRegisterforms() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Registerform o", Long.class).getSingleResult();
    }
    
    public static List<Registerform> Registerform.findAllRegisterforms() {
        return entityManager().createQuery("SELECT o FROM Registerform o", Registerform.class).getResultList();
    }
    
    public static Registerform Registerform.findRegisterform(Long id) {
        if (id == null) return null;
        return entityManager().find(Registerform.class, id);
    }
    
    public static List<Registerform> Registerform.findRegisterformEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Registerform o", Registerform.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Registerform.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Registerform.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Registerform attached = Registerform.findRegisterform(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Registerform.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Registerform.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Registerform Registerform.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Registerform merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}