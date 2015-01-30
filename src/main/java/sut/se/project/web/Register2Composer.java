package sut.se.project.web;

import org.*;
import org.zkoss.*;
import org.zkoss.zk.roo.annotations.ZKComposer;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.annotation.Listen;
import sut.se.*;
import sut.se.project.*;
import static org.zkoss.zk.ui.select.Selectors.find;
import org.zkoss.zul.*;
import sut.se.project.domain.*;

import java.util.Date;
import org.zkoss.zul.*;
import org.zkoss.zk.ui.event.*;
import org.zkoss.zk.ui.*;
import org.zkoss.zul.Listbox;
import org.zkoss.zk.ui.Sessions;
import java.lang.Exception;
import java.lang.*;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.EventInterceptor;

@ZKComposer(zul = "Register2UI.zul")
public class Register2Composer {

    private static final long serialVersionUID = -3746282238427144552L;

    public void afterCompose(Component comp) {
    	Registerform regi = Registerform.findRegisterform(1L);

    	streetname.setDisabled(true);
    	streetnumber.setDisabled(true);
    	postcode.setDisabled(true);
    	city.setDisabled(true);
    	province.setDisabled(true);

    	fname.setDisabled(true);
    	lname.setDisabled(true);
    	email.setDisabled(true);
    	pass.setDisabled(true);



    	streetname.setText(regi.getStreetname());
    	streetnumber.setText(regi.getStreetnumber());
    	postcode.setText(regi.getPostcode());
    	city.setText(regi.getCity());
    	province.setText(regi.getProvince());

    	fname.setText(regi.getFname());
    	lname.setText(regi.getLname());
    	email.setText(regi.getEmail());
    	pass.setText(regi.getPass());
    }

    @Listen("onClick = #btnEdit")
    public void btnEdit_Cliked(Event event) {

        streetname.setDisabled(false);
        streetnumber.setDisabled(false);
        postcode.setDisabled(false);
        city.setDisabled(false);
        province.setDisabled(false);

        fname.setDisabled(false);
        lname.setDisabled(false);
        email.setDisabled(false);
        pass.setDisabled(false);

    }

    @Listen("onClick = #btnSave")
    public void btnSave_Clicked(Event event) {
    	
    	Registerform reg = Registerform.findRegisterform(1L);

    	reg.setStreetname(streetname.getText());
    	reg.setStreetnumber(streetnumber.getText());
    	reg.setPostcode(postcode.getText());
    	reg.setCity(city.getText());
    	reg.setProvince(province.getText());

    	reg.setFname(fname.getText());
    	reg.setLname(lname.getText());
    	reg.setEmail(email.getText());
    	reg.setPass(pass.getText());
    	
        if (reg.getStreetname() != "" && reg.getPostcode() != "" 
            && reg.getCity() != "" && reg.getFname() != "" && reg.getLname() != "" 
            && reg.getEmail() != "" && reg.getPass() != "" ) {

    	   reg.persist();

           reg.getStreetname();
           reg.getPostcode();
           reg.getCity();

           reg.getFname();
           reg.getLname();
           reg.getEmail();
           reg.getPass();

           alert("Save Successful");
           Include Pshi = (Include) find(getPage(), "#inner > #changepage").get(0);
        	Pshi.setSrc("LoginUI.zul");

        } else {
            alert("Please enter your information to complete");
        }

    }
}
