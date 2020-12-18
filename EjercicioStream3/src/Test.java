import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);
        int sum=list.stream().collect(Collectors.summingInt(n->n*2));
        Long quantity=list.stream().collect(Collectors.counting());
        System.out.println("la suma de todos los numeros * 2 es " + sum);
        System.out.println("se ingresaron "+quantity+" numeros");;


    }
}
