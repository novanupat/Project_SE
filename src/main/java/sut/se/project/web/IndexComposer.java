package sut.se.project.web;
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
import org.zkoss.zk.ui.event.*;
import org.zkoss.zk.ui.*;
import org.zkoss.zul.Listbox;
import org.zkoss.zk.ui.Sessions;
import java.lang.Exception;
import java.lang.*;
import org.zkoss.zk.ui.util.EventInterceptor;

@ZKComposer(zul = "index.zul")
public class IndexComposer {

    private static final long serialVersionUID = -1139045349421295850L;

    private int statuslogin = 0;

    public void afterCompose(Component comp) {
        profile.setVisible(false);
        shipment.setVisible(false);
        type.setVisible(false);
        receiver.setVisible(false);
        status.setVisible(false);
        logout.setVisible(false);
        neweva.setVisible(false);
        ttype.setVisible(false);
        estatus.setVisible(false);
    }

    @Listen("onClick = #regis")
    public void btnRegis_Clicked(Event event) {
        if (statuslogin == 0) {
            Include Preg = (Include) find(getPage(), "#inner > #changepage").get(0);
            Preg.setSrc("RegisterUI.zul");
        }
    }

    @Listen("onClick = #profile")
    public void btnProfile_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Pprofile = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pprofile.setSrc("BillUI.zul");
        }
    }

    @Listen("onClick = #shipment")
    public void btnShipment_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Pshipment = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pshipment.setSrc("EvaluateUI.zul");
        }
    }

    @Listen("onClick = #status")
    public void btnStatus_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Preg = (Include) find(getPage(), "#inner > #changepage").get(0);
            Preg.setSrc("StatusUI.zul");
        }
    }

    @Listen("onClick = #login")
    public void btnLog_Clicked(Event event) {
        if ((user.getText().equals("admin")) && (pass.getText().equals("1234"))) {
            alert("Welcome Adminisator");
            user.setText("");
            pass.setText("");
            statuslogin = 1;
            Include Pprofile = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pprofile.setSrc("Evaluate2UI.zul");
            login.setVisible(false);
            regis.setVisible(false);
            user.setVisible(false);
            pass.setVisible(false);
            profile.setVisible(false);
            shipment.setVisible(false);
            type.setVisible(false);
            receiver.setVisible(false);
            status.setVisible(false);
            neweva.setVisible(true);
            ttype.setVisible(true);
            estatus.setVisible(true);
            logout.setVisible(true);
        } else if (user.getText() != "" && pass.getText() != "") {
            for (Registerform r : Registerform.findAllRegisterforms()) {
                if ((user.getText().equals(r.getEmail())) && (pass.getText().equals(r.getPass()))) {
                    Long UserIdd = r.getId();
                    Session sessUserId = Sessions.getCurrent();
                    sessUserId.setAttribute("UserId", UserIdd);
                    alert("Welcome : " + r.getFname());
                    user.setText("");
                    pass.setText("");
                    statuslogin = 1;
                    Include Pprofile = (Include) find(getPage(), "#inner > #changepage").get(0);
                    Pprofile.setSrc("BillUI.zul");
                    login.setVisible(false);
                    regis.setVisible(false);
                    user.setVisible(false);
                    pass.setVisible(false);
                    profile.setVisible(true);
                    shipment.setVisible(true);
                    type.setVisible(true);
                    receiver.setVisible(true);
                    status.setVisible(true);
                    logout.setVisible(true);
                }
                if (!(user.getText().equals(r.getEmail())) && (pass.getText().equals(r.getPass()))) {
                    alert("Sorry try again");
                    user.setText("");
                    pass.setText("");
                }
                if ((user.getText().equals(r.getEmail())) && !(pass.getText().equals(r.getPass()))) {
                    alert("Sorry try again");
                    user.setText("");
                    pass.setText("");
                }
            }
        } else {
            alert("Sorry try again");
            user.setText("");
            pass.setText("");
        }
    }

    @Listen("onClick = #type")
    public void btnType_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Ptype = (Include) find(getPage(), "#inner > #changepage").get(0);
            Ptype.setSrc("TypsTsUI.zul");
        }
    }

    @Listen("onClick = #receiver")
    public void btnReceiver_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Prec = (Include) find(getPage(), "#inner > #changepage").get(0);
            Prec.setSrc("ReceiverUI3.zul");
        }
    }

    @Listen("onClick = #logout")
    public void btnLogout_Clicked(Event event) {
        if (statuslogin == 1) {
            alert("Thank you so much");
            statuslogin = 0;
            profile.setVisible(false);
            shipment.setVisible(false);
            type.setVisible(false);
            receiver.setVisible(false);
            status.setVisible(false);
            logout.setVisible(false);
            neweva.setVisible(false);
            ttype.setVisible(false);
            estatus.setVisible(false);
            Include Preg = (Include) find(getPage(), "#inner > #changepage").get(0);
            Preg.setSrc("LoginUI.zul");
            login.setVisible(true);
            regis.setVisible(true);
            user.setVisible(true);
            pass.setVisible(true);
        }
    }

    @Listen("onClick = #neweva")
    public void btnNew_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Prec = (Include) find(getPage(), "#inner > #changepage").get(0);
            Prec.setSrc("Evaluate2UI.zul");
        }
    }

    @Listen("onClick = #ttype")
    public void btnAdd_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Ptt = (Include) find(getPage(), "#inner > #changepage").get(0);
            Ptt.setSrc("AddType.zul");
        }
    }

    @Listen("onClick = #estatus")
    public void btnStatus1_Clicked(Event event) {
        if (statuslogin == 1) {
            Include Pst1 = (Include) find(getPage(), "#inner > #changepage").get(0);
            Pst1.setSrc("Status1UI.zul");
        }
    }
}
