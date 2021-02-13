/*
Nombre: Serafin Rodriguez
Matricula: 2022745
 */
package mx.edu.cesba.model;

/**
 *
 * @author HP
 */
public class Employee {

    public int id;
    public String firsName;
    public String lastName;
    public int age;
    public String mail;
    public int phoneNumber;
    public double salary;
    public String hiredate;

      // Metodo
    public void getDetails() {
        System.out.println(" id"+ id);
        System.out.println("firsName" + firsName);
        System.out.println("lastNam" + lastName);
        System.out.println("age" + age);
        System.out.println("mail" + mail);
        System.out.println("phoneNumber" + phoneNumber);
        System.out.println("salary" + salary);
        System.out.println("hiredate" + hiredate);
   
    }
}
