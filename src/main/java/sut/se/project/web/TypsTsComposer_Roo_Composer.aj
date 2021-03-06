// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Window;
import sut.se.project.web.TypsTsComposer;
import zk.roo.Composer;

privileged aspect TypsTsComposer_Roo_Composer {
    
    declare parents: TypsTsComposer extends Composer;
    
    declare @type: TypsTsComposer: @Component;
    
    declare @type: TypsTsComposer: @Scope("prototype");
    
    @Wire
    public Window TypsTsComposer.wndMain;
    
    @Wire
    public Radiogroup TypsTsComposer.sv;
    
    @Wire
    public Label TypsTsComposer.choice;
    
    @Wire
    public Label TypsTsComposer.exprice;
    
    @Wire
    public Label TypsTsComposer.name;
    
    @Wire
    public Label TypsTsComposer.cpN;
    
    @Wire
    public Label TypsTsComposer.price;
    
    @Wire
    public Button TypsTsComposer.save;
    
}
