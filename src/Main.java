import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Дмитрий", "Дмитриев", 30));
        people.add(new Person("Иван", "Иванов-Петров", 25));
        people.add(new Person("Вероника", "Сергеева", 40));
        people.add(new Person("Том", "Ли", 8));
        people.add(new Person("Борис", "Джонсон", 17));

        people.removeIf(person -> person.getAge() < 18);
        people.forEach(System.out::println);


    }
}