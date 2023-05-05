/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author ricar
 */
public class SegundaFormula extends Movimiento {
    
    public SegundaFormula(){
        super();
    }
    
    public SegundaFormula(double v0, double vf, double a, double t){
        super(v0, vf, a, t);
    }
    
    @Override
    public double CalcularDistancia() {
        
        return (getVf() - getV0())/(2*getA());
        
    }
    
}
