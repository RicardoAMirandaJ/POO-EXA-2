/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author ricar
 */
public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono{
    
    private double porcentajeDelBono;
    
    public Administrador(int ID, String nombre, double salario, double porcentajeDelBono) {
        super(ID, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

    public Administrador(int ID, String nombre, double salario) {
        super(ID, nombre, salario);
    }

    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }
    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }
    
    @Override
    public double calcularBono() {
        return getSalario() * porcentajeDelBono;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double bono = calcularBono();
        return salarioBase + bono;
    }
    
}
