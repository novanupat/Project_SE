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


@ZKComposer(zul = "BillUI.zul")
public class BillComposer {

    private static final long serialVersionUID = -4265264847199815742L;

    public void afterCompose(Component comp) {

        Double sum=0.0,Over1000=0.0,Over5000=0.0,Total=0.0,Discharge=0.0;


        Session CompanySess = Sessions.getCurrent();
        String idCompa = String.valueOf(CompanySess.getAttribute("UserId"));
        long idR;
        idR = Long.valueOf(idCompa);



        Registerform l = Registerform.findRegisterform(idR);
        fname.setValue(l.getFname());
        lname.setValue(l.getLname());
        phonenum.setValue(l.getCompanyphone());
        address.setValue(l.getCity());

        



      

        for (Contents a : Contents.findAllContentses()) {
            sum = sum + a.getPr();
        }  

             
        
        charge.setValue(""+sum);

        Label itemDischarge = new Label();
        Label itemTotal = new Label();

        if(sum >= 1000 && sum <=4999){
            Over1000 = ((0.1)*sum);
            Discharge = Over1000;
            Total = sum-Discharge;
            
             
        }
        else if(sum >= 5000){
            Over5000 = ((0.2)*sum);
            Discharge = Over5000;
            Total = sum-Discharge;
            
        }
        else{
            Discharge=0.0;
            Total=sum;
            

        }
        
        
        disc.setValue(""+Discharge);
        
        ttcharge.setValue(""+Total);

    }

    @Listen("onClick = #btnGoPro")
    public void btnGoPro_Clicked(Event event) {
        Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
        Ptype.setSrc("Register2UI.zul");
        
    }

}
