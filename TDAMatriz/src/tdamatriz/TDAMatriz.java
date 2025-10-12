/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tdamatriz;

/**
 *
 * @author sebas
 */
public class TDAMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sparce m= new Sparce(5,6,1);
        for (int i=0;i<m.m;i++){//recorre fila a fila
            System.out.println(m.toStringfila(i));//imprime toda la coluna de i fila
        }
    }
    
}
