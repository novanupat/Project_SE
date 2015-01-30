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


@ZKComposer(zul = "ReceiverUI.zul")
public class ReceiverComposer {

    private static final long serialVersionUID = 2772008189910325397L;

    public void afterCompose(Component comp) {
        next.setVisible(false);
    }

    @Listen("onClick = #save")
    public void save_Clicked(Event event) {
      
       try{        

        Receiver r = Receiver.findReceiver(1L);
        Country c = Country.findCountry(1L);
        
        String st;
        st = "Please fill up : ";

        if (firstname.getText() != "" && lastname.getText() != "" && phonenumber.getText() != "" && building.getText() != "" && street.getText() != "" && district.getText() != "" && province.getText() != "" && postcode.getText() != "" && countryname.getText() != "") {
            
            r.setFirstname(firstname.getText());
            r.setLastname(lastname.getText());
            r.setPhonenumber(phonenumber.getText());
            r.setBuilding(building.getText());
            r.setStreet(street.getText());
            r.setDistrict(district.getText());
            r.setProvince(province.getText());
            r.setPostcode(postcode.getText());
            c.setCountryname(countryname.getText());

            c.persist();
            r.persist();
            
            String recId1 = String.valueOf(r.getId());

            Session recUserId1 =  Sessions.getCurrent();
            recUserId1.setAttribute("receId",recId1);

            r.getFirstname();
            r.getLastname();
            r.getPhonenumber();
            r.getBuilding();
            r.getStreet();
            r.getDistrict();
            r.getProvince();
            r.getPostcode();
            c.getCountryname();

            alert("Save Successful");
            
            save.setVisible(false);
            next.setVisible(true);

        }
        else {
            if (firstname.getText().equals("")) {
                st = st + "Firstname ";
            }
            if (lastname.getText().equals("")) {
                st = st + "Lastname ";
            }
            if (phonenumber.getText().equals("")) {
                st = st + "Phonenumber ";
            }
            if (building.getText().equals("")) {
                st = st + "Building name ";
            }
            if (street.getText().equals("")) {
                st = st + "Street/Road name ";
            }
            if (district.getText().equals("")) {
                st = st + "District ";
            }
            if (province.getText().equals("")) {
                st = st + "Province ";
            }
            if (postcode.getText().equals("")) {
                st = st + "Postcode ";
            }
            if (countryname.getText().equals("")) {
                st = st + "Country";
            }
            alert(st);
        }
        }catch(Exception e){
            Receiver r1 = new Receiver();
            Country c1 = new Country();   
            String st;
            st = "Please fill up : ";

        if (firstname.getText() != "" && lastname.getText() != "" && phonenumber.getText() != "" && building.getText() != "" && street.getText() != "" && district.getText() != "" && province.getText() != "" && postcode.getText() != "" && countryname.getText() != "") {
            
            r1.setFirstname(firstname.getText());
            r1.setLastname(lastname.getText());
            r1.setPhonenumber(phonenumber.getText());
            r1.setBuilding(building.getText());
            r1.setStreet(street.getText());
            r1.setDistrict(district.getText());
            r1.setProvince(province.getText());
            r1.setPostcode(postcode.getText());
            c1.setCountryname(countryname.getText());

            c1.persist();
            r1.persist();
            
            String recId = String.valueOf(r1.getId());

            Session recUserId =  Sessions.getCurrent();
            recUserId.setAttribute("receId",recId);

            r1.getFirstname();
            r1.getLastname();
            r1.getPhonenumber();
            r1.getBuilding();
            r1.getStreet();
            r1.getDistrict();
            r1.getProvince();
            r1.getPostcode();
            c1.getCountryname();

            alert("Save Successful");
            
            save.setVisible(false);
            next.setVisible(true);

        }
        else {
            if (firstname.getText().equals("")) {
                st = st + "Firstname ";
            }
            if (lastname.getText().equals("")) {
                st = st + "Lastname ";
            }
            if (phonenumber.getText().equals("")) {
                st = st + "Phonenumber ";
            }
            if (building.getText().equals("")) {
                st = st + "Building name ";
            }
            if (street.getText().equals("")) {
                st = st + "Street/Road name ";
            }
            if (district.getText().equals("")) {
                st = st + "District ";
            }
            if (province.getText().equals("")) {
                st = st + "Province ";
            }
            if (postcode.getText().equals("")) {
                st = st + "Postcode ";
            }
            if (countryname.getText().equals("")) {
                st = st + "Country";
            }
            alert(st);
        }
        }
    }
    
    @Listen("onClick = #next")
    public void next_Clicked(Event event) {
        Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
        Ptype.setSrc("EvaluateUI.zul");
    	
    }
}
