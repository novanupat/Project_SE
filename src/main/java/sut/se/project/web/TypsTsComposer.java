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




@ZKComposer(zul = "TypsTsUI.zul")
public class TypsTsComposer {

    private static final long serialVersionUID = -1339864635203667392L;

    public void afterCompose(Component comp) {

        for (AddTs r : AddTs.findAllAddTses()) {
            Radio radio = new Radio();
            radio.setLabel(r.getTypeN());
            sv.appendChild(radio);
        }


        int sum = 0;

        Session CompanySess = Sessions.getCurrent();
        String idCompa = String.valueOf(CompanySess.getAttribute("UserId"));
        long idR;
        idR = Long.valueOf(idCompa);

        Registerform rec = Registerform.findRegisterform(idR);

        name.setValue(rec.getFname());
        cpN.setValue(rec.getCompanyname());

        for (Contents a : Contents.findAllContentses()) {
            sum = sum + a.getPr();
        }        
        price.setValue(""+sum);
    }

    @Listen("onClick = #save")
    public void save__Clicked(Event event) {

        try{
        TypeTs t = new TypeTs();
        String a = sv.getSelectedItem().getLabel();
        
        for (AddTs rr : AddTs.findAllAddTses()) {   
            if(rr.getTypeN().equals(sv.getSelectedItem().getLabel())){
                String  pp = rr.getPriceT();
                t.setExPrice(pp);
            }
        }
        t.setType(a);
        t.persist();
        String sa = "You Choose " + a;
        alert(sa);
        Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
        Ptype.setSrc("StatusUI.zul");
        }catch(Exception e){
            //
        }
    }

    @Listen("onCheck = #sv")
    public void btnsv_Check(Event event) {

        String a = sv.getSelectedItem().getLabel();       
            choice.setValue(a);
        for (AddTs rr : AddTs.findAllAddTses()) {   
            if(rr.getTypeN().equals(sv.getSelectedItem().getLabel())){
                String  pp = rr.getPriceT();
                exprice.setValue(pp);
            }
        }
    }
}
