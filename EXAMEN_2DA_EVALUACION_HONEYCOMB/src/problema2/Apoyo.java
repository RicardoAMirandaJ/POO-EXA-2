/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author ricar
 */
class Apoyo extends Empleados {
    
    public Apoyo() {
        super();
        setSalarioBase(50.0);
    }

    public Apoyo(String nombre, String apellido, double edad, double salarioBase) {
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salarioSemanal = getSalarioBase() * 40;
        return salarioSemanal + (salarioSemanal * 0.5);
    }
    
}

