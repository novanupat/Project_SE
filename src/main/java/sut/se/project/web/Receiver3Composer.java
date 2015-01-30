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

@ZKComposer(zul = "ReceiverUI3.zul")
public class Receiver3Composer {

    private static final long serialVersionUID = -5631812639565886561L;

    public void afterCompose(Component comp) {
    }

    @Listen("onClick = #old")
    public void btnold(Event event) {
    	Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
        Ptype.setSrc("ReceiverUI2.zul");
       
    }

    @Listen("onClick = #ne")
    public void btnne(Event event) {
    	Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
        Ptype.setSrc("ReceiverUI.zul");
        
    }
}
