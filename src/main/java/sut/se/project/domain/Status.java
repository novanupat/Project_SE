package sut.se.project.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findStatusesByEv" })
public class Status {

    @NotNull
    @Size(min = 2)
    private String pay;

    @NotNull
    @Size(min = 2)
    private String pos;

    @NotNull
    @ManyToOne
    private Evaluate ev;

    private String StatusShipref;
}
