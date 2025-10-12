/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
/**
 *
 * @author Rocka
 */
public class ConjuntoBits {// atributos
    Bitwase c[];// vector de bitwase   
    int cant;//cantidad de elementos
    public ConjuntoBits(int NEle){//constructor 
        int Nbw = NEle/32;//Nbw numero de vectores 
        if(NEle%32!=0){// si falta espacio aumenta un vector mas
           Nbw++;//incrementa           
        }
        this.c= new Bitwase[Nbw];// crea bitwase en el vector
        cant=NEle;//cantidad de elementos 
        for(int i=0;i<=Nbw-1;i++){
            c[i]=new Bitwase();
        }
    }
    private int CalcNbw(int ele){//devuelve vector
        return((ele-1)/32);//calcula en que vector esta el elemento
    }
    private int CalcNbit(int ele){//posicion del vector que este
        return ((ele-1)%32+1);//devuelve la`posicion del respecto vector
    }
    public boolean Pertenece(int ele){
        int Nbw=CalcNbw(ele);//ubicacion en que vector esta
        int Nbit=CalcNbit(ele);//ubicacion del elemento en el vector
        return(c[Nbw].getbit(Nbit)==1);//return segun si esta activo es true
    }
    public void insertar(int ele){
        if(ele<=cant){
            int Nbw=CalcNbw(ele);
            int Nbit=CalcNbit(ele);
            //System.out.println(c[Nbw].toString());
            c[Nbw].setbit1(Nbit);
             System.out.println(c[Nbw].toString());
            //System.out.println("");
        }else{
            System.out.println("Fuera de rango");
            System.exit(1);
        }
    }
    public void eliminar(int ele){
        if(ele<=cant){
            int Nbw = CalcNbw(ele);
            int Nbit =CalcNbit(ele);
            c[Nbw].setbit0(Nbit);
        }else{
            System.out.println("fuera de rango");
            System.exit(1);
        }        
    }
    public void Union(ConjuntoBits A,ConjuntoBits B){
        for(int i=0;i<=A.cant;i++){
            if(A.Pertenece(i)){
                insertar(i);
            }
        }
        for(int j=0;j<=B.cant;j++){
            if(B.Pertenece(j))
                insertar(j);
        }
    }
    public void interseccion(ConjuntoBits A,ConjuntoBits B){
        for(int i=0;i<=A.cant;i++)
            if(B.Pertenece(i)&&A.Pertenece(i)){
                insertar(i);
            }
    }
    @Override
    public String toString(){
        int Nbw = 0;
        String s ="c={";
        for (int i=0 ;i<=cant ;i++){
            if(Pertenece(i)){
                s=s+i+"";                    
                      
            }  
        }
        s=s+"}....";               
        return s;
    }
}
