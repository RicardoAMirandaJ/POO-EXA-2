/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author ricar
 */
abstract class Empleados implements Capturando {
    
    private String nombre;
    private String apellido;
    private double edad;
    private double salarioBase;
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public double getEdad() {
        return edad;
    }

    @Override
    public void setEdad(double edad) {
        this.edad = edad;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalario();
}


