/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author ricar
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Formula 1
        PrimerFormula F1 = new PrimerFormula (5, 4, 2, 7);
        System.out.println("Distancia con formula 1: " + F1.CalcularDistancia());
        
        //Formula 2
        SegundaFormula F2 = new SegundaFormula (5, 4, 2, 7);
        System.out.println("Distancia con formula 2: " + F2.CalcularDistancia());
        
        //Formula 3
        TercerFormula F3 = new TercerFormula (5, 4, 2, 7);
        System.out.println("Distancia con formula 3: " + F3.CalcularDistancia());
    }
    
}
