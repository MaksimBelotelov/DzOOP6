package ru.gb.oseminar.data;

import java.time.LocalDate;

public class Teacher extends User{
    // Так как у всех наследников класса User есть поле Id, оно перенесено в базовый класс User.

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
       super(firstName, secondName, patronymic, dateOfBirth);
    }
}
