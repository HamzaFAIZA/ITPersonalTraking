/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import view.ViewMenu;
import view.ViewRessource;

/**
 *
 * @author faiza
 */
public class ControllerMenu implements ActionListener{
    private ViewMenu vm;

    public ControllerMenu(ViewMenu v) {
        vm=v;
        Addlistener();
    }
    public void Addlistener(){
        vm.getjButtonPresonnel().addActionListener(this);
    }
    
     public void close(){
        WindowEvent winClosingEvent = new WindowEvent(vm,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Gestion du personnel")){
            close();
        ViewRessource p=new ViewRessource();
        p.setVisible(true);
        }
    }
    
}
