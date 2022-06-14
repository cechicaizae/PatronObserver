/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;
import java.util.ArrayList;

/**
 *
 * @author ce.christian
 */
public class Acelerador implements SujetoObservable{
    
    private ArrayList<Observador> observadores;
    
    public Acelerador() {
        observadores = new ArrayList<Observador>();
    }
    
    public void pisarAcelerador(){
        //subir potencia
        notificar();
    }
    
    public void enlazarObservador(Observador o){
        observadores.add(o); 
    }
    
    @Override
    public void notificar() {
        for(Observador o:observadores){o.update();}
    }
    
}
