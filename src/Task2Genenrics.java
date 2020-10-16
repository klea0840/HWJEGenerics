import java.util.ArrayList;
import java.util.List;

class T {}

class MyList<T>{

    List<T> list = new ArrayList<>();

    void addition(T t) {
        list.add(t);
    }

    int getIndex(T t) {
        return list.indexOf(t);
    }

    int getSize() {
        return list.size();
    }
}
public class Task2Genenrics {

    public static void main(String[] args) {

        MyList<String> myList = new MyList<>();

        myList.addition("Your");
        myList.addition("name is");
        myList.addition("WhoAmI");

        System.out.println("Index of 1 element: " + myList.getIndex("Your"));
        System.out.println("Index of 1 elemment: " + myList.getIndex("WhoAmI"));
        System.out.println("Size: " + myList.getSize());



    }
}
