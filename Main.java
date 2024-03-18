package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee[] megafon = new Employee[5];

        megafon[0]=new Employee("LENIN", "Vojd", "79995552211", LocalDate.of(1999, 01, 01), 10);
        megafon[1]=new Employee("Shmenko", "tester","01", LocalDate.of(1970,02,11), 9);
        megafon[2]=new Employee("Aibulat","DevOps","02", LocalDate.of(1920,02,11),12);
        megafon[3]=new Employee("Gomer","Memolog","6122212",LocalDate.of(2015,01,01), 5);
        megafon[4]=new Manager("Shushara", "Boss", "111", LocalDate.of(2000,01,01),100);

        List<Employee> megafonList = Arrays.asList(megafon);
        middleSalary(megafonList);
        middleAge(megafonList);

        megafonList.sort(new LastNameCompare());
        System.out.println(Arrays.toString(megafon));

        for (Employee employee : megafon) {
            Manager.giveTaskForBurgers(employee);
            Manager.upSalaryForOlds(24, 10, employee);
        }


        System.out.println(Arrays.toString(megafon));
    }

    public static void middleAge(List<Employee> empl) {
        int average = 0;
        for (Employee employees : empl) {
            average += employees.getAge();
        }
        average = average / empl.size();

        System.out.println("Средний возраст сотрудников: " + average);
    }

    public static void middleSalary(List<Employee> empl) {
        int average = 0;
        for (Employee employee : empl) {
            average += employee.getSalary();
        }
        average = average / empl.size();
        System.out.println("Средняя зп: " + average);
    }
}