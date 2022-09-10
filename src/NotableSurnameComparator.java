import java.util.Comparator;

public class NotableSurnameComparator implements Comparator<Person> {

    private int maxWordsSurname;



    public NotableSurnameComparator(int maxWordsSurname) {
        this.maxWordsSurname = maxWordsSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int wordsSurname1 = o1.getSurname().split("(?U)\\W").length;
        int wordsSurname2 = o2.getSurname().split("(?U)\\W").length;
        if (wordsSurname1 > maxWordsSurname && wordsSurname2 > maxWordsSurname || wordsSurname1 == wordsSurname2) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        return Integer.compare(wordsSurname2, wordsSurname1);
    }
}