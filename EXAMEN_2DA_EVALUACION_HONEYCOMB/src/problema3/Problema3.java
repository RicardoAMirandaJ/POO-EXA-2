/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author ricar
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoTiempoCompleto ETC = new EmpleadoTiempoCompleto(22550339, "Ricardo Miranda", 10000.00);
        
        System.out.println("Empleado Tiempo Completo: " + ETC.getNombre());
        System.out.println("ID: " + ETC.getID());
        System.out.println("Salario: " + ETC.calcularSalario());
                
        EmpleadoTiempoParcial ETP = new EmpleadoTiempoParcial(22550351, "Ivan Vargas", 7000.0, 150, 45);
        
        System.out.println("Empleado Tiempo Parcial: " + ETP.getNombre());
        System.out.println("ID: " + ETP.getID());
        System.out.println("Salario: " + ETP.calcularSalario());
        
        Administrador A = new Administrador(22550328, "Axel Hernandez", 15000.0, 60.0);
        
        System.out.println("Administrador: " + A.getNombre());
        System.out.println("ID: " + A.getID());
        System.out.println("Salario: " + A.calcularSalario());
    }
}
    
 
