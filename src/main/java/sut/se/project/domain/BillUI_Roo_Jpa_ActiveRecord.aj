// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sut.se.project.domain.BillUI;

privileged aspect BillUI_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager BillUI.entityManager;
    
    public static final EntityManager BillUI.entityManager() {
        EntityManager em = new BillUI().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long BillUI.countBillUIs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM BillUI o", Long.class).getSingleResult();
    }
    
    public static List<BillUI> BillUI.findAllBillUIs() {
        return entityManager().createQuery("SELECT o FROM BillUI o", BillUI.class).getResultList();
    }
    
    public static BillUI BillUI.findBillUI(Long id) {
        if (id == null) return null;
        return entityManager().find(BillUI.class, id);
    }
    
    public static List<BillUI> BillUI.findBillUIEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM BillUI o", BillUI.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void BillUI.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void BillUI.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            BillUI attached = BillUI.findBillUI(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void BillUI.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void BillUI.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public BillUI BillUI.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        BillUI merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
