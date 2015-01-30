package sut.se.project.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PackagingType {

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pt")
    private Set<Contents> ct = new HashSet<Contents>();

    /**
     */
    private String packagetype;
}
