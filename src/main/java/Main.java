import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList<String> strings = new MyList<String>(new String[]{"As", "fd", "sd", "Af"});
        ArrayList<String> arrayList = new ArrayList<>();

        Iterator iterator = strings.iterator();
        while (iterator.hasNext())
        {
            arrayList.add((String) iterator.next());

        }
        System.out.println(arrayList);
    }
}
