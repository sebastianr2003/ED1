/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tdabitwase;
import negocio.Bitwase;
import negocio.ConjuntoBits;
/**
 *
 * @author Rocka
 */
public class TDABitwase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bitwase 
        Bitwase P=new Bitwase();
        P.setbit1(1);
        P.setbit1(10);
        //System.out.println(P.toString()); 
        //conjunto bit
        ConjuntoBits A= new ConjuntoBits(84);
        A.insertar(1);
        A.insertar(3);
        A.insertar(4);
        System.out.println(A);
        ConjuntoBits B= new ConjuntoBits(10);
        B.insertar(2);
        B.insertar(8);
        B.insertar(5);
        System.out.println(B);
        
    }
    
}
