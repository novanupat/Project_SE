// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;
import sut.se.project.web.LoginComposer;
import zk.roo.Composer;

privileged aspect LoginComposer_Roo_Composer {
    
    declare parents: LoginComposer extends Composer;
    
    declare @type: LoginComposer: @Component;
    
    declare @type: LoginComposer: @Scope("prototype");
    
    @Wire
    public Window LoginComposer.wndMain;
    
}
