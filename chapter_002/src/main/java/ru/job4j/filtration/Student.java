package ru.job4j.filtration;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return getScore() == student.getScore()
                && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getScore());
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.score, student.score);
    }
}
