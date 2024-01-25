package com.teachmeskills.lesson7HW.task2.runner;

import com.teachmeskills.lesson7HW.task2.methods.Methods;
import com.teachmeskills.lesson7HW.task2.student.Student;

public class Runner {

    public static void main(String[] args) {
        String groupName = "TMS_C27_Online";
        Student s1 = new Student("Artyom", "Astapchyk", groupName, 22, "#12684932");
        Student s2 = new Student("Alina", "Ilkevich", groupName, 21, "#22386970");
        Student s3 = new Student("Anastasiya", "Irgalevich", groupName, 20, "#422015937");
        Student s4 = new Student("Artyom", "Karalchuk", groupName, 21, "#62585930");
        Student s5 = new Student("Nikita", "Kraiko", groupName, 19, "#72585930");
        Student s6 = new Student("Oleg", "Maneev", groupName, 25, "#92585930");
        Student s7 = new Student("Ivan", "Michnovecki", groupName, 22, "#22585930");
        Student s8 = new Student("Kirill", "Palyanica", groupName, 23, "#52585930");
        Student s9 = new Student("Ruslan", "Ryabuchin", groupName, 24, "#72585930");
        Student s10 = new Student("Eugene", "Sarkisov", groupName, 24, "#82585930");
        Student[] tmsC27Onl = new Student[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        for(Student student : tmsC27Onl){
            Methods.showInfo(student);
            System.out.println();
        }
    }
}
