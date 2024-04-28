
import classes.MyList;
import classes.MyArrayList;

public class Main {
    /**
     * The main method is the entry point of the program.
     * adding elements to the list, removing elements, getting elements, and retrieving elements by index..
     */
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(0, Integer.valueOf(2));
        myArrayList.add(Integer.valueOf(1), 1);
        myArrayList.add(Integer.valueOf(2), 4);
        myArrayList.add(Integer.valueOf(3), 4);
        myArrayList.add(0, Integer.valueOf(5));

        System.out.println(myArrayList);

        myArrayList.remove(1);
        System.out.println(myArrayList);

        System.out.println(myArrayList.getElement(2));
    }
}


