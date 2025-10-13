/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdamatriz;

/**
 *
 * @author sebas
 */
public class Sparce {//atributos
    float VD[];//vector de datos
    int VFC[];//vector de posicion lineal
    int dim;//poscion en el vecot 
    int m;//num fila
    int n;//num columna
    int e;//valor dominante
    public Sparce(int nf,int nc,int ele){//constructor sobrecargado
        VFC= new int[10];//tamaño inicial
        VD= new float[10];//tamaño inicial
        n=nc;//numero de columnas
        m=nf;//numero de filas
        dim=-1;//posicion en el vector vfc,vd
        e=ele;//elemento dominante     
    }
    public void setdat(int f,int c,float dato){
        if((f>0)&&(c>0)&&(f<=m)&&(c<=n)){//dentro del rango de la matriz fmax,cmax
            int fc=(f-1)*n+c;// posicion lineal
            int pos=buscar(fc);//busca la posicion lineal en vd
            if(pos != -1){//si no lo encontro
                if(dato==e){//si es igual el dato a el elemnto dominante
                    dim--;//reduce la cantidad de datos
                    for (int i = pos;i < dim;i++){//recorre el vfc y vd a la izquierda
                        VFC[i]=VFC[i+1];
                        VD[i]=VD[i+1];                        
                    }
                }else{//no lo encontro
                    VD[pos]=dato;//mete el dato
                }
            }else{//si encontro el dato
                if(dato!=e){//si es distinto a el dato dominante
                    Redimencionar();//agranda el vfc,vd
                    dim++;//aumenta la cantidad e datos
                    VD[dim]=dato;//mete dato
                    VFC[dim]=(f-1)*n*c;//mete poscion               
                }                
            }
        }else{
            System.out.println("error dato fuera de rango fila columna");
        }
        
    }
    private int buscar(int fc){// busca la pos lineal vd y de vuelve el pos de vd
        int i=0;
        while ((i<=dim)&&(VFC[i]!=fc)){// revisa desde pos 0 hasta dim compara la poscion lineal
            i++;
        }
        if(i>dim){//si sale de rango
            return -1;
        }else{//si no sale de rango
            return i;
        }        
    }
    private  void Redimencionar(){//
        if((dim%9==0)&&(dim!=0)){//dim esta en su poscion final y es distinta de 0 agranda los vectores
            float  vaux[]=new float[dim+10];
            System.arraycopy(VD,0,vaux,0,dim+1);
            VD=new float[dim+10];
            System.arraycopy(vaux,0,VD,0,dim+1);
            int vfc2[]=new int [dim+10];
            System.arraycopy(VFC,0,vfc2,0,dim+1);
            VFC=new int[dim+10];
            System.arraycopy(vfc2,0,VFC,0, dim+1);            
        }
    }
    public float getDato(int f,int c){
        float valor = e;
      if ((f>0)&&(c>0)&&(f<=m)&&(c<=n)){//dentro del rango
            int pos= buscar((f-1)*n+c);// dentro vfc busca la posicion y devuelve la pos en vfc
            if (pos!=-1){//si no lo encuentra
                valor=VD[pos];//lo coloca el dato
            }
        }else{
            System.out.println("Error: Fila y columna fuera de rango");
        }
        return valor;
    }
    public String ToStringFila(int fila){
        String s="";//cadena vacia
        if((fila>0)&&(fila<=m)){//imprime desde fila 1 a la ultima m
            for (int i=0;i<n;i++){//imprime toda la columna de fila
                s=s+"["+getDato(fila,i+1)+"]";//extrae el dato de cada columna
            }
        }
        return s;

    }

    

}