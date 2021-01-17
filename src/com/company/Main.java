package com.company;

import java.util.Arrays;
import java.util.Calendar;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Employee [] employees = new Employee[5];
        employees [0] = new Employee("Anna", "manager", "lol@gamil.com",
                1223, 30000, 40) ;
        employees [1] = new Employee("Oleg", "manager", "lol@gamil.com",
                1223, 30000, 30);
        employees [2] = new Employee("Valera", "manager", "lol@gamil.com",
                1223, 30000, 43);
        employees [3] = new Employee("Den", "manager", "lol@gamil.com",
               1223, 30000, 50);
        employees [4] = new Employee("Alex", "manager", "lol@gamil.com",
                1223, 30000, 20);


        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i]);
            int a = 1;
            int b = a - employees[i].getOldEmployee();
            if (b >= 40)
            System.out.println(employees[i]);

        }




    }

}
