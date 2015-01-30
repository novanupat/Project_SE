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
public class Registerform {

    @Size(min = 1)
    private String companyname;

    @Size(min = 1)
    private String vat;

    @Size(min = 1)
    private String companyphone;

    @Size(min = 1)
    private String streetname;

    @Size(min = 1)
    private String streetnumber;

    @Pattern(regexp = "\\d{5}")
    private String postcode;

    @Size(min = 1)
    private String city;

    @Size(min = 1)
    private String province;

    @Size(min = 1)
    private String fname;

    @Size(min = 1)
    private String lname;

    @Size(min = 1)
    private String salulate;

    @Size(min = 1)
    private String email;

    @Size(min = 1)
    private String pass;

    @Size(min = 1)
    private String conpass;

    @ManyToOne
    private Country co;
}
