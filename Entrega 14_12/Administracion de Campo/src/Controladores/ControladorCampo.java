/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Campo;
import Entidades.Lote;
import Hibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Mercedes
 */
public class ControladorCampo {
    
    public void registrarCampo(Campo unCampo){
        SessionFactory factoria = HibernateUtil.getSessionFactory();
        Session sesion = factoria.openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.save(unCampo);
        transaccion.commit();
        sesion.close();
        JOptionPane.showMessageDialog(null,"Campo Registrado Exitosamente !!!");
    }
    
    public boolean buscarCampoPorNombre (String nombreCampo){
        
        SessionFactory factoria = HibernateUtil.getSessionFactory();
        Session sesion = factoria.openSession();
        Query query = sesion.createQuery("FROM Campo c WHERE c.nombreCampo = :parametro ");
        query.setParameter("parametro", nombreCampo);
        //System.out.println(query.getQueryString());
        //List<Campo> campos = query.list();
        //if(campos.iterator().hasNext())
        //System.out.println("EL NOMBRE ES:" + ((Campo)campos.iterator().next()).getNombreCampo());
        return query.list().size()>0;
    }
    
    public boolean validarCampo(Campo campo){
        Double tamanioTotal=0.0;          
        
        if(campo.getLotes().size()>0){
            Iterator it = campo.getLotes().iterator();
            while (it.hasNext()) {
                tamanioTotal+= ((Lote)it.next()).getSuperficieLote();
            }
            if (tamanioTotal==campo.getSuperficieCampo()){
                return true;
            }    
        }     
        JOptionPane.showMessageDialog(null,"Un campo debe tener lotes y la suma de sus superficies debe ser igual a la superficie del campo","Imposible Registrar",JOptionPane.ERROR_MESSAGE);
        return false;
    }
  
}
