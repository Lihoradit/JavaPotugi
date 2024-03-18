package org.example;

import java.time.LocalDate;

public class Manager extends Employee{
    private static int id=0;
    public Manager(String fullName, String jobTitle, String phoneNumber, LocalDate age, int salary) {
        super(fullName, jobTitle, phoneNumber, age, salary);
    }
    public static void giveTaskForBurgers(Employee empl) {
        String taskId = String.valueOf(id);
        if (empl != null) {
            empl.setTasks(taskId);
        }
        id++;
    }
    public static void upSalaryForOlds(int age, int salry, Employee empl){
        if(empl != null){
            if (empl.getAge()>=age){
                empl.setSalary(empl.getSalary()+salry);
            }
        }
    }

}
