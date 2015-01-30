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

@ZKComposer(zul = "RegisterUI.zul")
public class RegisterComposer {

    private static final long serialVersionUID = -3793600453805097050L;

    public void afterCompose(Component comp) {
    }

    @Listen("onClick = #btnSave")
    public void btnSave_Clicked(Event event) {
    	
      try{

      Registerform reg = new Registerform();
      Country cc = new Country();

      reg.setCompanyname(txtCompanyName.getText());
      reg.setVat(txtVAT.getText());
      reg.setCompanyphone(txtCompanyPhone.getText());

      reg.setStreetname(txtStreetname.getText());
      reg.setStreetnumber(txtStreetnumber.getText());
      reg.setPostcode(intPostcode.getText());
      reg.setCity(txtCity.getText());
      reg.setProvince(txtProvince.getText());

      reg.setFname(txtFName.getText());
      reg.setLname(txtLName.getText());
      reg.setSalulate(salulate.getText());
      reg.setEmail(txtEmail.getText());
      reg.setPass(txtPass.getText());

      cc.setCountryname(countryname.getText());

       if (reg.getCompanyname() != "" && reg.getCompanyphone() != "" 
            && reg.getStreetname() != "" && reg.getPostcode() != "" 
            && reg.getCity() != "" && reg.getFname() != "" && reg.getLname() != "" 
            && reg.getSalulate() != "" && reg.getEmail() != "" && reg.getPass() != "" && cc.getCountryname() != "") {

           reg.persist();
           cc.persist();

           reg.getCompanyname();
           reg.getCompanyphone();
           reg.getStreetname();
           reg.getPostcode();
           reg.getCity();
           reg.getFname();
           reg.getLname();
           reg.getSalulate();
           reg.getEmail();
           reg.getPass();
           cc.getCountryname();
           alert("Save Successful");
           Include Pshi = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pshi.setSrc("LoginUI.zul");

        } else {
            alert("Please enter your information to complete");
        }

    }catch(Exception e){
      Registerform reg1 = new Registerform();
      Country cc1 = new Country();

      reg1.setCompanyname(txtCompanyName.getText());
      reg1.setVat(txtVAT.getText());
      reg1.setCompanyphone(txtCompanyPhone.getText());

      reg1.setStreetname(txtStreetname.getText());
      reg1.setStreetnumber(txtStreetnumber.getText());
      reg1.setPostcode(intPostcode.getText());
      reg1.setCity(txtCity.getText());
      reg1.setProvince(txtProvince.getText());

      reg1.setFname(txtFName.getText());
      reg1.setLname(txtLName.getText());
      reg1.setSalulate(salulate.getText());
      reg1.setEmail(txtEmail.getText());
      reg1.setPass(txtPass.getText());

      cc1.setCountryname(countryname.getText());

       if (reg1.getCompanyname() != "" && reg1.getCompanyphone() != "" 
            && reg1.getStreetname() != "" && reg1.getPostcode() != "" 
            && reg1.getCity() != "" && reg1.getFname() != "" && reg1.getLname() != "" 
            && reg1.getSalulate() != "" && reg1.getEmail() != "" && reg1.getPass() != "" && cc1.getCountryname() != "") {

           reg1.persist();
           cc1.persist();

           reg1.getCompanyname();
           reg1.getCompanyphone();
           reg1.getStreetname();
           reg1.getPostcode();
           reg1.getCity();
           reg1.getFname();
           reg1.getLname();
           reg1.getSalulate();
           reg1.getEmail();
           reg1.getPass();
           cc1.getCountryname();
           alert("Save Successful");
           Include Pshi = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pshi.setSrc("LoginUI.zul");

        } else {
            alert("Please enter your information to complete");
        }


    }

    }

    @Listen("onClick = #btnClear")
    public void btnClear_Clicked(Event event) {

    	Registerform reg = new Registerform();

    	reg.flush();

    	txtCompanyName.setText("");
    	txtVAT.setText("");
    	txtCompanyPhone.setText("");

    	txtStreetname.setText("");
    	txtStreetnumber.setText("");
    	intPostcode.setText("");
    	txtCity.setText("");
    	txtProvince.setText("");

    	txtFName.setText("");
    	txtLName.setText("");
    	salulate.setText("");
    	txtEmail.setText("");
    	txtPass.setText("");

    	countryname.setText("");


    	alert("Clear All");

    }
}
