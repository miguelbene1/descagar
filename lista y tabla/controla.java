/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import vista.NewJFrame;
import array.lista;
import array.lista2;
import javax.swing.JTable;
import vista.vista2;

/**
 *
 * @author SENA
 */
public final class controla implements ActionListener{
    
    
    
    NewJFrame datos;
    
    vista2 vista2 = new vista2 ();
    
    ArrayList<lista> listas = new ArrayList<>();
    
    ArrayList<lista2> listas2 = new ArrayList<>();
    

    
   
    public controla(  NewJFrame datos){
        this.datos=datos;
        this.iniciar();
        this.datos.jButton1.addActionListener(this);
        this.datos.vista.addActionListener(this);
        this.vista2.vista.addActionListener(this);
        
    }
    
    
    
    //inicio  
    
    public void iniciar(){
        datos.setVisible(true);    
    }
    
    //dasfsdfsaf
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource()== this.datos.jButton1){
            
            String nombre = this.datos.nomb.getText();
            String  apellido = this.datos.ww.getText();
            limpiar();
            listas.add(new lista(nombre, apellido));
            llenar(this.datos.tabla,listas);
                  
                            
        }
        
        
        if (e.getSource()== this.datos.vista){
            vista2.setVisible(true);
            datos.dispose();
        }
        
        
            if (e.getSource()== this.vista2.vista){
            String nombres = this.vista2.nomb.getText();
            String apelldio = this.vista2.ww.getText();
            limpiar();
            listas2.add(new lista2(nombres, apelldio));
            llenarvista(this.vista2.tabla2, listas2);    
        
    }
    }
            
        
     public void llenar (JTable tabla , ArrayList<lista> list){
        for (int i = 0; i <listas.size(); i++) {
            tabla.setValueAt(list.get(i).getNombre(),i,0);
            tabla.setValueAt(list.get(i).getApellido(),i,1);
        
        
    }
     }
      public void llenarvista (JTable tabla2 , ArrayList<lista2> lista22){
        for (int i = 0; i <listas2.size(); i++) {
            tabla2.setValueAt(lista22.get(i).getNombre(),i,0);
            tabla2.setValueAt(lista22.get(i).getApellido(),i,1);   
     }
      }
      
      
      public void limpiar(){
          this.datos.nomb.setText("");
          this.datos.ww.setText("");
          this.vista2.nomb.setText("");
          this.vista2.ww.setText("");
      }
}

    
    

