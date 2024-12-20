/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago Sandre
 */
public class hrapp_case_study {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee employ1 = new Employee(1, "Thiago", 23456);
        Employee employ2 = new Employee(2, "Joao", 34566);
        Employee employ3 = new Employee(3, "Vitin", 87394);
        
        Departament depa = new Departament("Tec");
        
        depa.addEmp(employ1);
        depa.addEmp(employ2);
        depa.addEmp(employ3);
        
        Employee[] emps = depa.getEmployee();
        
        for (Employee emp: emps){
            System.out.println("Funcionarios: " + emp);
        }
        System.out.println("Total: " + depa.getTotalSalary());
        System.out.println("Media: " + depa.getAvarageSalary());
        
        System.out.println("Funcionario tal: " + depa.getEmployeeById(2));
        System.out.println(depa.toString());
    }
    
}
