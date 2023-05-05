/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author ricar
 */
public class Datos {
    public static void imprimirSalario(Empleados empleado) {
        System.out.println("El salario de " + empleado.getNombre() + " " + empleado.getApellido() + " es $" + empleado.calcularSalario());
    }
}
