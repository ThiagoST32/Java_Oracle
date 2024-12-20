/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago Sandre
 */
public class Departament {

    private String name;

    private final Employee[] emps = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    public Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmp(Employee anEmployee) {
        if (lastAddedEmployeeIndex < emps.length) {
            lastAddedEmployeeIndex++;
            emps[lastAddedEmployeeIndex] = anEmployee;
        }
    }

    public Employee[] getEmployee() {
        Employee[] actualEmployeers = new Employee[lastAddedEmployeeIndex + 1];
        for (int i = 0; i < actualEmployeers.length; i++) {
            actualEmployeers[i] = emps[i];
        }
        return actualEmployeers;
    }

    public int getEmployeeCount() {
        return lastAddedEmployeeIndex + 1;
    }

    public Employee getEmployeeById(int empId) {
        for (Employee emp : emps) {
            if (emp != null) {
                if (emp.getId() == empId) {
                    return emp;
                }
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < lastAddedEmployeeIndex; i++) {
            totalSalary += emps[i].getSalary();
        }
        return totalSalary;
    }

    public double getAvarageSalary() {
        if (lastAddedEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddedEmployeeIndex + 1);
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return name;
    }
}
