package com.teachmeskills.lesson7HW.task2.methods;

import com.teachmeskills.lesson7HW.task2.student.Student;

public class Methods {
    public static void showInfo(Student Student){
        System.out.println("Name: " + Student.name);
        System.out.println("Surname: " + Student.surname);
        System.out.println("Group: " + Student.groupName);
        System.out.println("Age: " + Student.age);
        System.out.println("Passport Number: " + Student.passNumber);
    }
}
