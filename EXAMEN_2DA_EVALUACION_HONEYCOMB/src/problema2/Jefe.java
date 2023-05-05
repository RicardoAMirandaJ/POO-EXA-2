/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author ricar
 */
class Jefe extends Empleados {
    
    public Jefe() {
        super();
        setSalarioBase(5000.0);
    }

    public Jefe(String nombre, String apellido, double edad, double salarioBase) {
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
    
}
