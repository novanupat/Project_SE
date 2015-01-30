package sut.se.project.domain;

import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class BillUI {

    @NotNull
    private String finame;

    @NotNull
    private String laname;

    @NotNull
    private String addresss;

    @NotNull
    private String type;

    @NotNull
    private String charge;

    @NotNull
    private String discount;

    @NotNull
    private String totalcharge;
}
