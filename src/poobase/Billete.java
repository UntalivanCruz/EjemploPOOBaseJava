/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poobase;

/**
 *
 * @author Developer
 */
//ESTRUCTURA DE UN OBJETO
public class Billete {
//Propiedades, atruibutos, caracteristicas
private String nombre;
private int valor;
//Eventos, metodos, acciones

public void setBillete(String _nombre,int _valor){
    nombre=_nombre;
    valor=_valor;
}

public void MostrarInformacion(){
    System.out.println("Moneda: " + nombre);
    System.out.println("Valor: " + valor);
} 
}
