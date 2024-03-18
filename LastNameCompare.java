package org.example;

import java.util.Comparator;

public class LastNameCompare implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
