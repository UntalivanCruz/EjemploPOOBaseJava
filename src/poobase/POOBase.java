/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poobase;

/**
 *
 * @author Developer
 */
public class POOBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //ESTRUCTURAS BASICAS
    int numero=0;
    //ESTRUCTURAS POO
    Billete quinientosLPS = new Billete();
/*
    quinientosLPS.nombre = "Lempira";
    quinientosLPS.valor = 500;
*/
    quinientosLPS.setBillete("Lempira",500);
    quinientosLPS.MostrarInformacion();
    }   
}
