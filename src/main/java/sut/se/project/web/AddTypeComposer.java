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


@ZKComposer(zul = "AddType.zul")
public class AddTypeComposer {

    private static final long serialVersionUID = 3868084581062159497L;

    public void afterCompose(Component comp) {

    	 for (AddTs r : AddTs.findAllAddTses()) {
            Comboitem item = new Comboitem();
            item.setLabel(r.getTypeN());
            nameAll.appendChild(item);
        }

    }

    @Listen("onClick = #addT")
    public void addT_Clicked(Event event) {
    	try{
        AddTs aa = new AddTs();
    	String nameS = nameTs.getText();
    	String priceS = priceTs.getText();
		aa.setTypeN(nameS);
		aa.setPriceT(priceS);    	
    	
    	if(nameS.equals("")||priceS.equals("")){
    		alert("Can't Add");
    	}else{
    		aa.persist();
            Include Pprofile = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pprofile.setSrc("AddType2.zul");
    	}
    	nameTs.setText("");
    	priceTs.setText("");
        }catch(Exception e){
            nameTs.setText("");
            priceTs.setText("");
            alert("Can't Add");
        }
    }

    @Listen("onClick = #deleteT")
    public void deleteT_Clicked(Event event) {
        // AddTs rec = AddTs.findAddTs(1L);
        AddTs aa = new AddTs();
        String nameDl = nameAll.getSelectedItem().getLabel();
        for (AddTs rr : AddTs.findAllAddTses()) {       
            if(rr.getTypeN().equals(nameAll.getSelectedItem().getLabel())){
                Long Id = rr.getId();             
                AddTs y = AddTs.findAddTs(Id);
                y.remove();
                Include Pprofile = (Include) find(getPage(), "#inner > #changepage").get(0);
                Pprofile.setSrc("AddType2.zul");
                }
        }
    }
}
