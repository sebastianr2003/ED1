/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Rocka
 */
public class Bitwase {
    int x;//atributos
    public Bitwase(){//constructor
        this.x = 0;
    }
    public void setbit1(int  pos){
        if(pos<=32){//tamaño de un entero 32bits
            int mask = 1;//posicion inicial
            mask = mask <<pos-1;// se desplaza desde su posicion inicial 0 a pos moviendose pos-1
            x= x | mask;//or modifica x sin afectar los demas bits
        }
    }
    public void setbit0(int pos){
       if(pos<=32){//tamaño de un entero 32bits
            int mask = 1;//posicion inicial
            mask = mask <<pos-1;// se desplaza desde su posicion inicial 0 a pos moviendose pos-1
            mask = ~mask;//complemento 1
            x= x & mask;//or modifica x sin afectar los demas bits.mask  todos tiene 1 excepto la posicion buscada
        } 
    }
    public int getbit(int pos){
        int mask = 1;//posicion inicial
        mask = mask <<pos-1;//se desplaza a su posicion preguntada
        mask =mask & x;// compara su dato de esa posicion 
        mask = mask>>>pos-1;//devuelve a la poscion inicial
        return mask;//return el valor de la posicion
    }
    @Override
    public String toString(){
        String s = "x=";
        for (int i=32 ; i>=1; i--){
         s=s+" "+getbit(i);//concatena bit a bit desde la posicion 32 a la 1   
        }                  
       // System.out.println(x);//imprime decimal 
        return s;// devuelve la cadena de bit
    }
}
