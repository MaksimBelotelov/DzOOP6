package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;
public interface UserView<T extends User>{
    Logger logger = Logger.getLogger(UserView.class.getName());
    default void sendOnConsole(List<T> list){
        for(var user: list)
            logger.info(user.toString());
    }
}
