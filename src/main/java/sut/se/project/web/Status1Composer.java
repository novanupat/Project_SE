package sut.se.project.web;

import org.zkoss.zk.roo.annotations.ZKComposer;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.annotation.Listen;

import java.lang.Exception;
import java.lang.Object;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.zkoss.zk.ui.event.EventListener;
import static org.zkoss.zk.ui.select.Selectors.find;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Timer;
import java.lang.*;
import java.io.*;
import java.util.*;
import javax.persistence.*;
import org.zkoss.zk.ui.*;
import sut.se.project.domain.*;
import sut.se.project.domain.Status;
import org.zkoss.zul.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


@ZKComposer(zul = "Status1UI.zul")
public class Status1Composer {

    private static final long serialVersionUID = -2839044962397898935L;

    public void afterCompose(Component comp) {
    for(Status s: Status.findAllStatuses()){
  Evaluate ev = s.getEv();         
 try{

  TypedQuery<Status> status = Status.findStatusesByEv(ev);
   Status st = status.getSingleResult();
  
  }catch(Exception e){
     alert("หาข้อมูลไม่เจอ");
  }
            Row row =new Row();
            Label lbName= new Label(""+s.getPay());
            Label lbDay= new Label("" +s.getPos());
            Label lbSpecial= new Label(""+ev.getShipref());
           
           Button button = new Button("Edit");
           button.setId(""+s.getId());
           button.setParent(row);

             row.appendChild(lbSpecial);
             row.appendChild(lbName);
             row.appendChild(lbDay);
            row.appendChild(button);
             rows.appendChild(row);

             final Long stsId = s.getId();
            
           button.addEventListener("onClick",new EventListener() {
     public void onEvent(Event ee) throws Exception {
             Grid g1 = (Grid) find(getPage(), "#grid1").get(0);
             Grid g2 = (Grid) find(getPage(), "#grid2").get(0);
                    passId.setValue(stsId+"");
                    g1.setVisible(false);
                    g2.setVisible(true);
                 //alert("แก้ไขจ้าาา");
                  
            }});
       
        }
       }

        @Listen("onClick = #btnSave")
    public void AddNewMat_Clicked(Event event) {
       try{
      Status ss = Status.findStatus(Long.parseLong(passId.getValue(),10));
        ss.setPay(sos1.getValue());
        ss.setPos(sos2.getValue());
       
        ss.persist();
        ss.flush();
alert("Save");
Grid g1 = (Grid) find(getPage(), "#grid1").get(0);
             Grid g2 = (Grid) find(getPage(), "#grid2").get(0);
                    g2.setVisible(false);
                    g1.setVisible(true);

}catch(Exception e){
  alert("ใส่ข้อมูลไม่ครบ");

}

}
 @Listen("onClick = #btnCancel")
    public void EditCancel_Clicked(Event event){
        Grid g1 = (Grid) find(getPage(), "#grid1").get(0);
             Grid g2 = (Grid) find(getPage(), "#grid2").get(0);
                    g2.setVisible(false);
                    g1.setVisible(true);
      }
    @Listen("onClick = #btnEdit")
public void btnEdit_Clicked(Event event) {
    
    }
}