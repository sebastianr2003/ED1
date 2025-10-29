/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author Rockass
 */
public class Nodo {// el nodo contiene (dato,otro nodo)
    int dato;
    Nodo enlace;
    public Nodo(){
        this.enlace=null;//empieza apuntado null
    }
    public Nodo(int dato,Nodo enlace){//constructor sobrecargado
        this.dato=dato;//dato
        this.enlace=enlace;//otro nodo
    }
    public void setdato(int dato){//mete dato al nodo
        this.dato=dato;
    }
    public int getdato(){//saca dato del nodo
        return dato;
    }
    public void setenlace(Nodo enlace){//actualizar nodo siguiente
        this.enlace=enlace;
    }
    public Nodo getenlace(){//nodo al que apunta
        return enlace;
    }            
}
