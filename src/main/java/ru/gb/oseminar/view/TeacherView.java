package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
    // метод SendOnConsole повторяется в классах TeacherView и UserView, поэтому вынесен как default
    // в интерфейс UserView. При этом метод может принимать как Teacher, так и Student, т. е. реализуется
    // принцип Liskov Substitution
}
