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


@ZKComposer(zul = "Evaluate3UI.zul")
public class Evaluate3Composer {

    private static final long serialVersionUID = 3191488476494780892L;

    public void afterCompose(Component comp) {
    }

    @Listen("onClick = #update1")
    public void btnUpdate_Clicked(Event event) {
    	Evaluate2 e1 = Evaluate2.findEvaluate2(1L);
        int re=0,ex=0;
        String s;
        s = "Please Select : ";
        
        if(reginput.getText()!="" && expinput.getText()!=""){

            re = Integer.parseInt(reginput.getText());
            ex = Integer.parseInt(expinput.getText()); 
            try{
                e1.setRegular(re);
                e1.setExpress(ex);
                e1.persist();
            }catch(Exception e){
                Evaluate2 e2 = new Evaluate2();
                e2.setRegular(re);
                e2.setExpress(ex);
                e2.persist();
            }
            alert("Update Successful");
            Include Pprofile = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pprofile.setSrc("Evaluate2UI.zul");
        }else{
            if(reginput.getText().equals("")){
                s = s + " Regular";
            }
            if(expinput.getText().equals("")){
                s = s + " Express";
            }
            alert(s);
        }

        
    }
}
