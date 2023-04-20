package ru.gb.oseminar.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Сортировки в соответствии с принципом Single responsibility  вынесены в отдельный класс.
// При этом добавление новых способов сортировки в класс не повлияет на код, который уже
// пользуется классом (принцип Open-closed).

public class UserSortings {
    public static List<Student> getSortedStudentGroup(List<Student> inputList){
        List<Student> students = new ArrayList<>(inputList);
        Collections.sort(students);
        return students;
    }

    public static List<Student> getSortedByFIOStudentGroup(List<Student> inputList){
        List<Student> students = new ArrayList<>(inputList);
        students.sort(new UserComparator<Student>());
        return students;
    }
}
