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

@ZKComposer(zul = "EvaluateUI.zul")
public class EvaluateCompoer {

    private static final long serialVersionUID = -8928234827823892094L;
       
    public void afterCompose(Component comp) {
        
    }

    @Listen("onClick = #add")
    public void btnAdd_Clicked(Event event) {
       Contents contents = new Contents();
       PackagingType p = new PackagingType();
       Evaluate2 persen = Evaluate2.findEvaluate2(1L);
       Evaluate eva1 = new Evaluate();
       String s;
       int sum=0,sumw=0;
       
       s = "Please Select : ";

       if( contencts.getText()!="" && weight.getText()!="" && lcms.getText()!="" && wcms.getText()!="" && hcms.getText()!="" && sref.getText()!="" && pk.getText()!=""){
            pk.setDisabled(true);
            sref.setDisabled(true);
            eva1.setShipref(sref.getText());
            p.setPackagetype(pk.getText());
            p.getCt().add(contents);
            contents.setCo(contencts.getText());
            contents.setWe(weight.getText());
            contents.setLc(lcms.getText());
            contents.setWc(wcms.getText());
            contents.setHc(hcms.getText());

            int we=0,l=0,wi=0,h=0,pr;

            we = Integer.parseInt(weight.getText());
            l = Integer.parseInt(lcms.getText());
            wi = Integer.parseInt(wcms.getText());
            h = Integer.parseInt(hcms.getText());

            if(pk.getText().equals("Regular")){
                pr=((l*wi*h)*we)*(persen.getRegular());
            }else{
                pr=((l*wi*h)*we)*(persen.getExpress());
            }

            eva1.persist();
            p.persist();
            contents.setPr(pr);
            contents.persist();
            contencts.setText("");
            weight.setText("");
            lcms.setText("");
            wcms.setText("");
            hcms.setText("");

       }else{
            if(pk.getSelectedItem()==null){
                s = s + " PackagingType";
            }
            if(sref.getText().equals("")){
                s = s + " Shipment reference";
            }
            if(contencts.getText().equals("")){
                s = s + " Contents";
            }
            if(weight.getText().equals("")){
                s = s + " Weight";
            }
            if(lcms.getText().equals("")){
                s = s + " Length(cm)";
            }
            if(wcms.getText().equals("")){
                s = s + " Width(cm)";
            }
            if(hcms.getText().equals("")){
                s = s + " High(cm)";
            }

            alert(s);
       }
      
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > grid > rows > row > #lstno > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > grid > rows > row > #lstco > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > grid > rows > row > #lstwe > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > grid > rows > row > #lstlc > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > grid > rows > row > #lstwc > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > grid > rows > row > #lsthc > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > grid > rows > row > #lstpi > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > hbox > #ptotal > listitem")){
                c.detach();
            }
            for(Component c: find(this.getPage(), "borderlayout > center > vlayout > hbox > #wtotal > listitem")){
                c.detach();
            }

            for(Contents e: Contents.findAllContentses()){
                Listitem item = new Listitem();
                Listitem item1 = new Listitem();
                Listitem item2 = new Listitem();
                Listitem item3 = new Listitem();
                Listitem item4 = new Listitem();
                Listitem item5 = new Listitem();
                Listitem item6 = new Listitem();

                item6.setLabel(""+e.getId()+".");
                lstno.appendChild(item6);
                
                item.setLabel(e.getCo());
                lstco.appendChild(item);
                item1.setLabel(e.getWe()+" kg");
                lstwe.appendChild(item1);
                item2.setLabel(e.getLc()+ " cm");
                lstlc.appendChild(item2);
                item3.setLabel(e.getWc()+ " cm");
                lstwc.appendChild(item3);
                item4.setLabel(e.getHc()+ " cm");
                lsthc.appendChild(item4);
                item5.setLabel("$ "+e.getPr());
                lstpi.appendChild(item5);
            }

            for(Contents a: Contents.findAllContentses()){
                sum = sum + a.getPr();
            }

            Listitem item = new Listitem();
                item.setLabel(""+sum);
                ptotal.appendChild(item);

           for(Contents a: Contents.findAllContentses()){
                int ss=0;
                ss = Integer.parseInt(a.getWe());
                sumw = sumw + ss;
            }

            Listitem item1 = new Listitem();
                item1.setLabel(""+sumw);
                wtotal.appendChild(item1);

    }

    @Listen("onClick = #confirm")
    public void btnConfirm_Clicked(Event event) {int s=0;
        for (Contents a : Contents.findAllContentses()) {
            s = s + a.getPr();
        }
        alert("Total Prices $"+s);
        Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
        Ptype.setSrc("TypsTsUI.zul");
    }
}
