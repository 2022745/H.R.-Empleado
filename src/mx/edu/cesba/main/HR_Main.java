/*
 
Nombre: Serafin Rodriguez
Matricula: 2022745
 */
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

/**
 *
 * @author HP
 */
public class HR_Main {
    public static void main (String[] args){
        Employee e1= new Employee();
        Employee e2= new Employee();
        e1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de empleado"));
        e1.firsName = JOptionPane.showInputDialog("Ingrese el nombre");
        e1.lastName = JOptionPane.showInputDialog("Ingrese el apellido");
        e1.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        e1.mail = JOptionPane.showInputDialog("Ingrese el correo");
        e1.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero telefonico"));
        e1.salary = Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario"));
        e1.hiredate = JOptionPane.showInputDialog("Ingrese la fecha de contratacion");
        
        e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de empleado"));
        e2.firsName = JOptionPane.showInputDialog("Ingrese el nombre");
        e2.lastName = JOptionPane.showInputDialog("Ingrese el apellido");
        e2.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        e2.mail = JOptionPane.showInputDialog("Ingrese el Correo");
        e2.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero telefonico"));
        e2.salary = Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario"));
        e2.hiredate = JOptionPane.showInputDialog("Ingrese la fecha de contratacion");
        
        e1.getDetails();
        System.out.println("-------------------------------------");
        e2.getDetails();
        
    }
}
