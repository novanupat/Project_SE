package sut.se.project.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Receiver {

    @Size(min = 1)
    private String firstname;

    @Size(min = 1)
    private String lastname;

    @Pattern(regexp = "[0][89]\\d{8}")
    @Size(min = 1)
    private String phonenumber;

    @Size(min = 1)
    private String building;

    @Size(min = 1)
    private String street;

    @Size(min = 1)
    private String district;

    @Size(min = 1)
    private String province;

    @ManyToOne
    private Country co;

    @Pattern(regexp = "\\d{5}")
    private String postcode;
}
