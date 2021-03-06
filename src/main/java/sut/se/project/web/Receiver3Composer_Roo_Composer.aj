// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;
import sut.se.project.web.Receiver3Composer;
import zk.roo.Composer;

privileged aspect Receiver3Composer_Roo_Composer {
    
    declare parents: Receiver3Composer extends Composer;
    
    declare @type: Receiver3Composer: @Component;
    
    declare @type: Receiver3Composer: @Scope("prototype");
    
    @Wire
    public Window Receiver3Composer.wndMain;
    
    @Wire
    public Button Receiver3Composer.old;
    
    @Wire
    public Button Receiver3Composer.ne;
    
}
