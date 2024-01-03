/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productor_Consumidor;

/**
 *
 * @author mfer-
 */
public class Productor extends Thread{
    private Contenedor contenedor;
    public Productor(Contenedor c){
    contenedor = c;
}
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Productor. put: " + i);
        contenedor.put(i);
        
        
        
        
            try{
                sleep((int)(Math.random() * 100));
               } catch(InterruptedException e) { }
    }
    }
        }
