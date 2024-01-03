/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productor_Consumidor;


/**
 *
 * @author mfer-
 */
public class ProductorConsumidorTest {
    public static void main(String[] args){
        Contenedor c = new Contenedor();
        Productor produce = new Productor(c);
        Consumidor consume = new Consumidor(c);
        
        produce.start();
        consume.start();
}
}
