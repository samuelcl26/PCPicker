/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpickerdesktop;
import javax.naming.PartialResultException;
import pcpickerdesktop.parts.*;

/**
 *
 * @author appbenigno
 */
public class PCPickerDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WinForms.MainForm().setVisible(true);
        
        Mouse myKeyboard = new Mouse(0, "Dell Keyboard Standard", "nothing out of ordinary", "Dell", "Makati", 30);
        System.out.println(myKeyboard.ID());
        System.out.println(myKeyboard.Name());
        System.out.println(myKeyboard.Type());
        System.out.println(myKeyboard.Description());
        System.out.println(myKeyboard.Manufacturer());
        System.out.println(myKeyboard.Branch());
        System.out.println(myKeyboard.Quantity());
    }
    
}
