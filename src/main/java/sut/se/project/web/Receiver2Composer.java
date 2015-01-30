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

@ZKComposer(zul = "ReceiverUI2.zul")
public class Receiver2Composer {

    private static final long serialVersionUID = 2175628886963933557L;

    public void afterCompose(Component comp) {
        Receiver rec = Receiver.findReceiver(1L);
        Country c = Country.findCountry(1L);
        
        sa.setVisible(false);

        fsname.setDisabled(true);
        lsname.setDisabled(true);
        phnumber.setDisabled(true);
        build.setDisabled(true);
        str.setDisabled(true);
        dis.setDisabled(true);
        pro.setDisabled(true);
        post.setDisabled(true);
        count.setDisabled(true);
        fsname.setText(rec.getFirstname());
        lsname.setText(rec.getLastname());
        phnumber.setText(rec.getPhonenumber());
        build.setText(rec.getBuilding());
        str.setText(rec.getStreet());
        dis.setText(rec.getDistrict());
        pro.setText(rec.getProvince());
        post.setText(rec.getPostcode());
        count.setText(c.getCountryname());
        rec.setFirstname(fsname.getText());
    }

    @Listen("onClick = #sa")
    public void btn(Event event) {
        Receiver rr = Receiver.findReceiver(1L);
        Country cc = Country.findCountry(1L);
        String ss;
        ss = "Please fill up : ";
        conti.setVisible(true);

        if (fsname.getText() != "" && lsname.getText() != "" && phnumber.getText() != "" && build.getText() != "" && str.getText() != "" && dis.getText() != "" && pro.getText() != "" && post.getText() != "" && count.getText() != "") {
            rr.setFirstname(fsname.getText());
            rr.setLastname(lsname.getText());
            rr.setPhonenumber(phnumber.getText());
            rr.setBuilding(build.getText());
            rr.setStreet(str.getText());
            rr.setDistrict(dis.getText());
            rr.setProvince(pro.getText());
            rr.setPostcode(post.getText());
            cc.setCountryname(count.getText());
            rr.persist();
            cc.persist();
            alert("Save Successful");
            
        } else {
            if (fsname.getText().equals("")) {
                ss = ss + "Firstname ";
            }
            if (lsname.getText().equals("")) {
                ss = ss + "Lastname ";
            }
            if (phnumber.getText().equals("")) {
                ss = ss + "Phonenumber ";
            }
            if (build.getText().equals("")) {
                ss = ss + "Building name ";
            }
            if (str.getText().equals("")) {
                ss = ss + "Street/Road name ";
            }
            if (dis.getText().equals("")) {
                ss = ss + "District ";
            }
            if (pro.getText().equals("")) {
                ss = ss + "Province ";
            }
            if (post.getText().equals("")) {
                ss = ss + "Postcode ";
            }
            if (count.getText().equals("")) {
                ss = ss + "Country";
            }
            alert(ss);
        }

    }

    @Listen("onClick = #edit")
    public void btnedit(Event event) {
        fsname.setDisabled(false);
        lsname.setDisabled(false);
        phnumber.setDisabled(false);
        build.setDisabled(false);
        str.setDisabled(false);
        dis.setDisabled(false);
        pro.setDisabled(false);
        post.setDisabled(false);
        count.setDisabled(false);
        sa.setVisible(true);
        edit.setVisible(false);

        conti.setVisible(false);
    }

    @Listen("onClick = #conti")
    public void btnconti(Event event) {
        Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
        Ptype.setSrc("EvaluateUI.zul");
      
    }
}
