import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Test {
    public static void main(String[] args){
        Person Fer = new Person ("Fernando",21);
        Person Adrian = new Person("Adrian",32);
        Person Alan = new Person("Alan",18);
        List<Person> personsList = Arrays.asList(Fer,Adrian,Alan);
        List<Person> streamPerson= personsList.stream().filter(person -> person.getName().toUpperCase().startsWith("A")).collect(Collectors.toList());
        streamPerson.stream().forEach(person -> System.out.println(person.getName().toUpperCase()));
    }
}
