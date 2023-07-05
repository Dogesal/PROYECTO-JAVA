/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoconversormonedas;


import javax.swing.JOptionPane;

/**
 *
 * @author Alan Ñacari Elescano
 */
public class ProyectoConversorMonedas {
    
    public static float cantidad;
    public static String[] conversion = new String[]{"Soles a Dolar","Soles a Euro","Soles a Pesos Mexicanos","Soles a Yen"};
    public static int confirmacion ;
    
    
    
    public static void menu(){
        
        String seleccion1 = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion" ,"Conversor de dinero",1,null,
                new Object[] {"Conversor de Moneda","Conversor de Temperatura"},"");
        
        if(seleccion1==null) {
            JOptionPane.showMessageDialog(null,"Programa Finalizado");
            return ;
        }
        
        try{
       
        cantidad = Float.parseFloat((String)JOptionPane.showInputDialog(null,"Ingrese cantidad a tranformar :" ,"Conversor de dinero",3));
        
        }catch(NumberFormatException ex){
                
        	JOptionPane.showMessageDialog(null,ex);
                throw ex;
    	}
        
        String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion" ,"Conversor de dinero",
                1,null,conversion,"");
        
        if(seleccion==null) {
            JOptionPane.showMessageDialog(null,"Programa Finalizado");
            return ;
        }
        
        switch(seleccion){
            case "Soles a Dolar" -> JOptionPane.showMessageDialog(null,String.format("%.2f", cantidad / 0.28)+ " Dolares") ;
            case "Soles a Euro" -> JOptionPane.showMessageDialog(null,String.format("%.2f", cantidad * 0.25) + " Euros") ;
            case "Soles a Pesos Mexicanos" -> JOptionPane.showMessageDialog(null,String.format("%.2f", cantidad * 4.68)+ " Pesos") ;
            case "Soles a Yen" -> JOptionPane.showMessageDialog(null,String.format("%.2f", cantidad * 39.80)+ " Yens") ;
            default -> {
            }
            
        }
        
        
        confirmacion = JOptionPane.showConfirmDialog(null, "Desea continuar?");
        
        if(confirmacion==0){
            menu();
        }else if(confirmacion==1){
            JOptionPane.showMessageDialog(null,"Programa Finalizado");
            return ;
        }else{
            JOptionPane.showMessageDialog(null,"Programa Finalizado");
            return ;
        }
        
        
    }
    
    public static void main(String[] args) throws  Throwable  {      
        
      
        menu();

        
    }
        
    
}
