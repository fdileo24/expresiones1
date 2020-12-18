import java.util.ArrayList;

public class Ej1 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(89);
        list.add(75);
        list.add(15);
        list.stream().filter(num ->num%3==0).forEach(num -> System.out.println(num));

    }
}
