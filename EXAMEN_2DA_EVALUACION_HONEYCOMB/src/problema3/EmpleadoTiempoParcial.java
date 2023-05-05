/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author ricar
 */
public class EmpleadoTiempoParcial extends Empleados {
    
    private double pagoPorHora;
    private double horasTrabajadas;
    
    public EmpleadoTiempoParcial() {
        
    }

    public EmpleadoTiempoParcial(int ID, String nombre, double salario, double pagoPorHora, double horasTrabajadas) {
        
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
        
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }
    
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getPagoPorHora() * getHorasTrabajadas();
    }
}
