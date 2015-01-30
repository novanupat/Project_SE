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

@ZKComposer(zul = "Evaluate2UI.zul")
public class Evaluater2Composer {

    private static final long serialVersionUID = 8288551063776571556L;

    public void afterCompose(Component comp) {
       Evaluate2 show = Evaluate2.findEvaluate2(1L);
            reg.setValue(""+show.getRegular());
            exp.setValue(""+show.getExpress());
    }

    @Listen("onClick = #update")
    public void btnUpdate_Clicked(Event event) {
        Include Pprofile = (Include) find(getPage(), "#inner > #changepage").get(0);
        Pprofile.setSrc("Evaluate3UI.zul");
                    
    }
}
