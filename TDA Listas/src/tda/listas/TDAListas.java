/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tda.listas;
import Negocio.ListaEnlazadaBasadaEnVectores;
/**
 *
 * @author Rocka
 */
public class TDAListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazadaBasadaEnVectores lista = new ListaEnlazadaBasadaEnVectores();//crea objeto
        lista.agregarelemento(5); 
        System.out.println(lista.imprimirlista());            
        //nodo
    }
}
