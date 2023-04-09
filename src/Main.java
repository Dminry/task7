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

        Collections.sort(people,
                (person1, person2) -> {
                    int wordCount1 = person1.getSurName().split("-").length;
                    int wordCount2 = person2.getSurName().split("-").length;
                    if (wordCount1 > wordCount2) {
                        return - 1;
                    } else if (wordCount1 < wordCount2) {
                        return 1;
                    } else {
                        if (person1.getAge() > person2.getAge()) {
                            return -1;
                        } else if (person1.getAge() < person2.getAge()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                }
        ) ;
        people.forEach(System.out::println);
    }

}
