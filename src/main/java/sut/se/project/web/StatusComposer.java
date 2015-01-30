package sut.se.project.web;
import org.zkoss.zk.roo.annotations.ZKComposer;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.annotation.Listen;
import static org.zkoss.zk.ui.select.Selectors.find;
import org.zkoss.zul.*;
import sut.se.project.domain.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import org.zkoss.zul.Listbox;




@ZKComposer(zul = "StatusUI.zul")
public class StatusComposer {

    private static final long serialVersionUID = 3584909411612417580L;

    public void afterCompose(Component comp) {
    for(Status s: Status.findAllStatuses()){
  Evaluate ev = s.getEv();         
 //    TypedQuery<Status> status = Status.findStatusesByEv(ev);
  // Status st = status.getSingleResult();
            Row row =new Row();
            Label lbName= new Label(""+s.getPay());
            Label lbDay= new Label("" +s.getPos());
            Label lbSpecial= new Label(""+ev.getShipref());
           
           row.appendChild(lbSpecial);
             row.appendChild(lbName);
             row.appendChild(lbDay);
             rows.appendChild(row);
           }


    }
}