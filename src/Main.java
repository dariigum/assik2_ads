import classes.MyArrayList;
import classes.MyList;




public class Main {
    public static void main(String[] args) {
        MyArrayList MyArrayList = new MyArrayList<>();

        MyArrayList.addElement(1, 2);
        MyArrayList.addElement(2, 1);
        MyArrayList.addElement(3, 4);
        MyArrayList.addElement(4,4);
        MyArrayList.addElement(5, 0);

        System.out.println(MyArrayList);

        MyArrayList.remove(0);
        System.out.println(MyArrayList);

        System.out.println(MyArrayList.getElement(2));

    }
}