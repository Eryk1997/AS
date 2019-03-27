import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by student on 27.03.2019.
 */
public class Main {
    public static void main(String[] argv){
        ArrayList<Animals> animal = new ArrayList<Animals>();
        animal.add(new Dog());
        animal.add(new Cat());
        for (Animals x: animal)
            x.glos();
        animal.get(0).glos();
    }
}
