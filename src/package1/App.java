package package1;

import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String[] args){

    }

    public static List<User> produce(){
        List<User> users = new ArrayList<>();
        users.add(User.builder()
                        .id(1)
                        .firstName("Ivan")
                        .lastName("Ivanov")
                        .age(18)
                        .country("Russia")
                .build());

        users.add(User.builder()
                        .id(2)
                        .firstName("Vladimir")
                        .lastName("Fedorov")
                        .age(20)
                        .country("Belarus")
                .build());


        users.add(User.builder()
                        .id(3)
                        .firstName("Jack")
                        .lastName("Peterson")
                        .age(25)
                        .country("USA")
                .build());

        return users;

    }
}
