package ru.gb.oseminar;

import ru.gb.oseminar.controller.StudentController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("Максим", "Белотелов", "Сергеевич",
                LocalDate.of(1989,04,16));
        studentController.create("Петр", "Петров", "Петрович",
                LocalDate.of(1990,05,17));

    }
}
