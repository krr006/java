package package1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args){
        List<User> users = App.produce();
        SortBylastName(users);
        SortByAge(users);
        IsAgegreaterthan7(users);
        AverageAge(users);
        Countries(users);
    }
    public static void SortBylastName(List<User> users) {
        List<User> SortedBylastName = users.stream()
                .sorted(Comparator.comparing(User::getLastName)).toList();
        System.out.println("Users sorted bu lastName: " + SortedBylastName);

    }

    public static void SortByAge(List<User> users){
        List<User> SortedByAge = App.produce().stream()
                .sorted(Comparator.comparing(User::getAge)).toList();
        System.out.println("Users sorted by age: " + SortedByAge);
    }

    public static void IsAgegreaterthan7(List<User> users){
        boolean IsAge7 = App.produce().stream()
                .allMatch(user -> user.getAge() > 7);
        System.out.println("Statement that age of all users is greater than 7 is " + IsAge7);
    }

    public static void AverageAge(List<User> users){
        double AvAge = users.stream()
                .collect(Collectors.averagingDouble(User::getAge));
        System.out.println("The average age of users is " + AvAge);
    }

    public static void Countries(List<User> users){
        long UniqueCountries = users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
        System.out.println("Numbers of unique countries among users is " + UniqueCountries);
    }

}
