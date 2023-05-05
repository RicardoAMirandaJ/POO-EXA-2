/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author ricar
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manufactura m1 = new Manufactura("Ricardo", "Miranda", 18, 40);
        System.out.println("El salario de Manufactura: " + m1.getNombre() + " " + m1.getApellido() + " es de " + m1.calcularSalario());
        Apoyo a1 = new Apoyo("Ivan", "Vargas", 18, 50);
        System.out.println("El salario de Apoyo: " + a1.getNombre() + " " + a1.getApellido() + " es de " + a1.calcularSalario());
        Jefe j1 = new Jefe("Axel", "Hernandez", 18, 40000);
        System.out.println("El salario del Jefe: " + j1.getNombre() + " " + j1.getApellido() + " es de " + j1.calcularSalario());
    }
}
