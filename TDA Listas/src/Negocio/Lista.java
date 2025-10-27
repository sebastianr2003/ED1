/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/** 
 * @author Rocka
 */
public class Lista {//atributos
    Nodo L;
    int cant;
    public Lista(){//construcor L->null cabeza
        this.L=null;
        this.cant=0;
    }
    public boolean vacia(){
        return (L==null);// vacio si L=null
    }
    public void insertar(int ele){
        if(vacia()){//verifica si esta vacia 
            //inserta cabeza
            Nodo p=new Nodo();
            p.setdato(ele);
            L=p;// nueva cabeza
            cant ++;// incrementa de 0->1
            return;
        }
        Nodo Aux=L;
        Nodo Ant=null; 
        while ((Aux !=null)&&(Aux.getdato()<=ele)){//aux no apunte a  null y el eleemento sea menor  o igual a ele
            Ant=Aux;
            Aux=Aux.getenlace();            
        }
        if(Ant==null){//si es menor al de la cabeza
            Nodo p=new Nodo();
            p.setdato(ele);
            p.setenlace(L);
            L=p;
            cant++;
            return;
        }
        if(Ant.getdato()!=ele){//si es el ultimo elemento y distinto al ultimo
            Nodo p=new Nodo();//crea nodo p->
            p.setdato(ele);//p->ele->null
            Ant.setenlace(p);//el nuevo actual ant->p
            p.setenlace(Aux);//p->aux o p->null
            cant++;
        }
    }
    
}
