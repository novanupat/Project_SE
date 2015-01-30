// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sut.se.project.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Window;
import sut.se.project.web.StatusComposer;
import zk.roo.Composer;

privileged aspect StatusComposer_Roo_Composer {
    
    declare parents: StatusComposer extends Composer;
    
    declare @type: StatusComposer: @Component;
    
    declare @type: StatusComposer: @Scope("prototype");
    
    @Wire
    public Window StatusComposer.wndMain;
    
    @Wire
    public Rows StatusComposer.rows;
    
    @Wire
    public Row StatusComposer.row;
    
}
