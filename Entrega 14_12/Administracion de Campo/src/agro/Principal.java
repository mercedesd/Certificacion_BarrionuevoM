/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agro;

import Vistas.RegistrarCampo;
import javax.swing.UIManager;
/**
 *
 * @author Mercedes
 */
public class Principal {
    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            RegistrarCampo rc = new RegistrarCampo();
            rc.setVisible(true);
        }
        catch(Exception e){ e.printStackTrace();}
    }
}
