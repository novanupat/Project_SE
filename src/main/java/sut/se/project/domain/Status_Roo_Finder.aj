// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.domain;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import sut.se.project.domain.Evaluate;
import sut.se.project.domain.Status;

privileged aspect Status_Roo_Finder {
    
    public static TypedQuery<Status> Status.findStatusesByEv(Evaluate ev) {
        if (ev == null) throw new IllegalArgumentException("The ev argument is required");
        EntityManager em = Status.entityManager();
        TypedQuery<Status> q = em.createQuery("SELECT o FROM Status AS o WHERE o.ev = :ev", Status.class);
        q.setParameter("ev", ev);
        return q;
    }
    
}
