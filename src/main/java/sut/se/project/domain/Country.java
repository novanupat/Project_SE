package sut.se.project.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Country {

    @Size(min = 1)
    private String countryname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "co")
    private Set<Receiver> re = new HashSet<Receiver>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "co")
    private Set<Registerform> reg = new HashSet<Registerform>();
}
