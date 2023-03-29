
import java.util.Comparator;

public class MyComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int wordCount1 = person1.getSurName().split("-").length;
        int wordCount2 = person2.getSurName().split("-").length;
        if (wordCount1 > wordCount2) {
            return -1;
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
}





