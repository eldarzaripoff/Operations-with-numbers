import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>(List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intlist.removeIf(a -> a <= 0);
        intlist.removeIf(a -> a % 2 != 0);
        intlist.sort(Integer::compareTo);
        for (int i : intlist) {
            System.out.println(i);
        }
    }
}