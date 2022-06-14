/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.observer;

/**
 *
 * @author ce.christian
 */
public class Observer {

    public static void main(String[] args) {
        // A Acelerador ---> B (motor)
        //motor observa ---> Acelerador, Observador y sujeto(Observable)
        //motor es observador
        //acelerador observador(sujeto)
        Motor v8 = new Motor();
        Acelerador x = new Acelerador();
        x.enlazarObservador(v8);
        x.pisarAcelerador();
    }
}
