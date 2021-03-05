package main;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }
}
