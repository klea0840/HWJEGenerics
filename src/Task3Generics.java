import java.util.HashMap;
import java.util.Map;

class MyDictionary<TKey, TValue> {

    Map<TKey, TValue> dictionary = new HashMap<>();

    void addToDictionary(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    int getSize() {
        return dictionary.size();
    }

    TValue getIndex(TKey key) {
        return dictionary.get(key);
    }
}

public class Task3Generics {

    public static void main(String[] args) {

    MyDictionary<Integer, String> dictionary = new MyDictionary<>();

    dictionary.addToDictionary(5, "Booo");
    dictionary.addToDictionary(4, "Beee");
    dictionary.addToDictionary(3, "Baaa");
    dictionary.addToDictionary(0, "Byyy");
    dictionary.addToDictionary(1, "Bobo");

        System.out.println("The size: " + dictionary.getSize());
        System.out.println("The index: " + dictionary.getIndex(0));

    }
}
