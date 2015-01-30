package sut.se.project.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Contents {

    /**
     */
    @ManyToOne
    private PackagingType pt;

    /**
     */
    @ManyToOne
    private Evaluate ev;

    /**
     */
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]+$")
    private String lc;

    /**
     */
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]+$")
    private String hc;

    /**
     */
    @Size(max = 20)
    private String co;
    
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]+$")
    private String wc;

    /**
     */
    private int pr;

    /**
     */
    private String sendname;

    /**
     */
    
    private String recname;

    /**
     */
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]+$")
    private String we;
}
