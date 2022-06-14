/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author ce.christian
 */
public class Motor implements Observador{
   
    public Motor(){
        
    }
    
    @Override
    public void update() {
        //accion a realizar despues que el acelerador se activa
        System.out.println("Subir potencia, velocidad, revolucion");    }
    
}
