package ru.gb.oseminar.service;

import ru.gb.oseminar.data.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T extends User> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

    /**
     * Метод находит следующий Id для создаваемого студента или преподавателя
     * @param listOfUsers список юзеров
     * @return ID для нового юзера
     */
    default Long getNextId(List<T> listOfUsers) {
        long countMaxId = 0L;
        for (T user: listOfUsers){
            if (user.getId() > countMaxId){
                countMaxId = user.getId();
            }
        }
        return ++countMaxId;
    }
}

