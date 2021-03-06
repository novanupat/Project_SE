// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;
import sut.se.project.web.AddTypeComposer;
import zk.roo.Composer;

privileged aspect AddTypeComposer_Roo_Composer {
    
    declare parents: AddTypeComposer extends Composer;
    
    declare @type: AddTypeComposer: @Component;
    
    declare @type: AddTypeComposer: @Scope("prototype");
    
    @Wire
    public Window AddTypeComposer.wndMain;
    
    @Wire
    public Textbox AddTypeComposer.nameTs;
    
    @Wire
    public Textbox AddTypeComposer.priceTs;
    
    @Wire
    public Button AddTypeComposer.addT;
    
    @Wire
    public Combobox AddTypeComposer.nameAll;
    
    @Wire
    public Button AddTypeComposer.deleteT;
    
}
