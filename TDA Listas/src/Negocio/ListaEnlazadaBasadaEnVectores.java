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
class Nodos1{//atributos de nodos1
    int valor;//VALOR
    int siguiente;//SIGUIENTE DIRRECCION
    public Nodos1(int valor,int siguiente){//constructor de nodos1
        this.valor=valor;//asigna a atributos de la clase
        this.siguiente=siguiente;
    }
}
    
public class ListaEnlazadaBasadaEnVectores {//lista de nodos atributos
    private ArrayList<Nodos1> nodos;//nueva arraylist atributo ndod
    private int primerelemento;//primer elemento
    private int ultimoelemento;//ultimo elemento
    public  ListaEnlazadaBasadaEnVectores (){//constructor de lista de  nodos
        nodos=new ArrayList<>();//nodo inical 
        nodos.add(new Nodos1(0,-1));//es como el P
        primerelemento=-1;
        ultimoelemento=-1;        
    } 
    public void agregarelemento(int valor){
        int nuevoindice=nodos.size();//inicia en posicion+ a la actual no hay pos=0 1234
        nodos.add(new Nodos1(valor,-1));//P-> creado
        if(ultimoelemento==-1){//si no hay ningun elemento
            primerelemento=nuevoindice;
            ultimoelemento=nuevoindice;
            return;
        } 
        nodos.get(ultimoelemento).siguiente=nuevoindice;// nodo del ultimo elemento  y el siguiente nodo es nuevo indice
        ultimoelemento=nuevoindice;//el ultimo nodo es el nuevo indice
        
    }
    public String imprimirlista(){
        String s=" ";
        int actual = primerelemento;//posicion nodo inicial
        while(actual!=-1){//hasta el ultimo nodo
            s=s+nodos.get(actual).valor+"->";//del nodo actual saca su valor
            actual= nodos.get(actual).siguiente;
        }            
        s=s+"null";
        return s;
    }
}
