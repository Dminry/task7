import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Дмитрий", "Дмитриев", 30));
        people.add(new Person("Иван", "Иванов-Петров", 25));
        people.add(new Person("Вероника", "Сергеева", 40));
        people.add(new Person("Том", "Ли", 35));
        people.add(new Person("Борис", "Джонсон", 60));

        Collections.sort(people, new MyComparator());


        for (Person person : people) {
            System.out.println(person);
        }
    }
}