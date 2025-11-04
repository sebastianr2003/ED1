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
            L=p;// nueva cabeza  L->P
            cant ++;// incrementa de 0->1
            return;
        }
        //SI NO ESTA VACIO
        //nodo donde quiere insertar
        Nodo Aux=L;
        Nodo Ant=null; 
        while ((Aux !=null)&&(Aux.getdato()<=ele)){//aux no apunte a  null y el eleemento sea menor  o igual a ele
            Ant=Aux;
            Aux=Aux.getenlace();            
        }
        if(Ant==null){//si es menor al de la cabeza
            Nodo p=new Nodo();//nodo nuevo  
            p.setdato(ele);//dato
            p.setenlace(L);//apunta a la cabeza
            L=p;//el nuevo l es p para que el menor se ala nueva cabezz
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
    public void eliminar(int ele){
        if(!vacia()){//si no esta vacia
            //crea punteros
            Nodo Aux=L;
            Nodo  Ant=null;
            while ((Aux !=null)&&(Aux.getdato()!=ele)){//se detiene cuando deja de buscar o cuando encuentra
                Ant =Aux;
                Aux=Aux.getenlace();
            }
            if(Aux!=null){//cuando no lo pillo
                if(Ant==null){// elimina la cabeza 
                    L=L.getenlace();
                    return;
                }//cuando esta en el cuerpo 
                Ant.setenlace(Aux.getenlace());
                cant --;               
            }
            
        }
    }
}
