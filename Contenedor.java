/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productor_Consumidor;

/**
 *
 * @author mfer-
 */
public class Contenedor {
    private int dato;
    private boolean hayDato = false;
    
  public synchronized int get(){
        while(hayDato == false){
            try{
// espera a que el productor coloque un valor
            wait();
        } catch(InterruptedException e){ }
     }
    hayDato = false;
// notificar que el valor ha sido consumido
    notifyAll();
       return dato;

}
public synchronized void put(int valor){
while(hayDato == true){
try{
// espera a que se consuma el dato
wait();
}catch(InterruptedException e){ }
}
dato = valor;
hayDato = true;
// notificar que ya hay dato.

notifyAll();
}

}
