/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author ricar
 */
class Manufactura extends Empleados {
    
    public Manufactura() {
        super();
        setSalarioBase(40.0);
    }

    public Manufactura(String nombre, String apellido, double edad, double salarioBase) {
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 40;
    }
    
}
