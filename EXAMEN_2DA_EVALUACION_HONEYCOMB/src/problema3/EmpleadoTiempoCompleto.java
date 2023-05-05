/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author ricar
 */
public class EmpleadoTiempoCompleto extends Empleados {
    
    public EmpleadoTiempoCompleto(int ID, String nombre, double salario) {
        super(ID, nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }
}
