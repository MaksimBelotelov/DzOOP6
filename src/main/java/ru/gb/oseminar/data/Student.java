package ru.gb.oseminar.data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{

    // Так как у всех наследников класса User есть поле Id, оно перенесено в базовый класс User.

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.setId(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + super.getId() +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
