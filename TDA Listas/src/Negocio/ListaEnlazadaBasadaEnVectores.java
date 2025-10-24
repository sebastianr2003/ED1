/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */
class Nodos1{
    int valor;//VALOR
    int siguiente;//SIGUIENTE DIRRECCION
    public Nodos1(int valor,int siguiente){//MANDAMOS VALOR Y SIGUIENTE
        this.valor=valor;
        this.siguiente=siguiente;
    }
}
    
public class ListaEnlazadaBasadaEnVectores {//lista de nodos
    private ArrayList<Nodos1>nodos;//nueva arraylist atributo ndod
    private int primerelemento;//primer elemento
    private int ultimoelemento;//ultimo elemento
    public ListaEnlazadaBasadaEnVectores (){//constructor
        nodos=new ArrayList<>();//nodo inical 
        nodos.add(new Nodos1(0,-1));//es como el P
        primerelemento=-1;
        ultimoelemento=-1;        
    } 
    publi void agregarelemento(int valor){
        
    }
}
