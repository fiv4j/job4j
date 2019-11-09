package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Borisov");
        student.setGroup("GR-12");
        student.setAdmissionDate("01/01/2018");

        System.out.println(student.getName() + " | " + student.getGroup() + " | " + student.getAdmissionDate());
    }
}
