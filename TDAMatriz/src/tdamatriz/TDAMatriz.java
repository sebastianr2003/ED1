/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tdamatriz;

/**
 *
 * @author sebas
 * git add . todo la carpeta
 * git commit -m ""
 * git push sube
 * git pull baja
 */
public class TDAMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sparce m= new Sparce(3,3,3); 
        m.setdato(1,1,62);
        m.mostrarvector();
        System.out.println(m);
    }
    
}
