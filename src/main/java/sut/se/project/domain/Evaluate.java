package sut.se.project.domain;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Evaluate {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ev")
    private Set<Contents> ct = new HashSet<Contents>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ev")
    private Set<Status> st = new HashSet<Status>();

    /**
     */
    @Size(max = 8)
    private String shipref;
}
