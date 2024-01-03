/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productor_Consumidor;

/**
 *
 * @author mfer-
 */
public class Consumidor extends Thread {
    private Contenedor contenedor;

        public Consumidor(Contenedor c){
    contenedor = c;
    }

    public void run(){
        int value =0;
        for(int i = 1; i < 10; i++){
            value = contenedor.get();
            System.out.println("Consumidor. get: " + value);
            
        
            
            }
}
}
