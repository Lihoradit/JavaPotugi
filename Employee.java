package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String phoneNumber;
    private int salary;
    private LocalDate age;
    private String[] tasks = new String[5];

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return (int) this.age.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(LocalDate age) {
        if (age == null || age.isAfter(LocalDate.now().minusYears(18))) {
            System.out.println("Employee " + getFullName() + " is too young!!!");
        }
        this.age = age;
    }

    public void setTasks(String task) {
        int temp=0;
        while (temp<tasks.length){
            if (tasks[temp]==null){
                tasks[temp]=task;
                break;
            }
        }
    }


    public String[] getTasks() {
        return tasks;
    }

    public Employee(String fullName, String jobTitle, String phoneNumber, LocalDate age, int salary) {
        setFullName(fullName);
        setJobTitle(jobTitle);
        setPhoneNumber(phoneNumber);
        setAge(age);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Сотрудник:\n" +
                "ФИО: " + getFullName() + "\n" +
                "  Должность: " + getJobTitle() + "\n" +
                "  Номер телефона: " + getPhoneNumber() + "\n" +
                "  Заработная плата: " + getSalary() + "\n" +
                "  Полных лет: " + getAge() + "\n" +
                "  Активные таски:" + Arrays.toString(getTasks()) + "\n";
    }

}
