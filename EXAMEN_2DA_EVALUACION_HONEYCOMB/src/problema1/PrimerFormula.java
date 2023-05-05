/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author ricar
 */
public class PrimerFormula extends Movimiento {
    
    public PrimerFormula(){
        super();
    }
    
    public PrimerFormula(double v0, double vf, double a, double t){
        super(v0, vf, a, t);
    }
    
    @Override
    public double CalcularDistancia() {
        
        return (getV0()*getT()) + ((getA()*Math.pow(getT(), 2))/2);
        
    }
    
}
