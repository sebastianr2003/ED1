/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.lista.generica;
import java.io.Serializable;
/**
 *
 * @author Rocka
 */

public class NodoGP<ele> implements Serializable{//tipo de dato <(tipo de dato)>
    ele Dato;
    NodoGP<ele> Enlace;
    
    public NodoGP(){
        Enlace=null;
    }
    public NodoGP(ele Dato){
        this.Dato=Dato;
        Enlace=null;
    }
    public void setDato(ele Dato){
        this.Dato=Dato;
    }
    public ele getDato(){
        return Dato;
    }
    public void setEnlace(NodoGP<ele> P){
        Enlace=P;
    }
    public NodoGP<ele> GetEnlace(){
        return Enlace;
    }
    
}
