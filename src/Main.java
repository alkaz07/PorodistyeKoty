import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exemple2();
        exemple3();
    }

    static void exemple3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введи-ка породу");
        String s = sc.nextLine();
        Poroda p = fromString(s);
        Kotik test = new Kotik("Test", p);
        System.out.println(test);
    }

    static void exemple1() {
        Kotik k = new Kotik("Персик", Poroda.PERSIAN);
        System.out.println(k);
    }

    static void exemple2(){
        ArrayList<Kotik> spisok = new ArrayList<>();
        spisok.add(new Kotik("Артур", Poroda.BRITISH_BLUE));
        spisok.add(new Kotik("Robert", Poroda.SCOTTISH));

        System.out.println(spisok);
    }

    static Poroda fromString(String por)
    {

        Poroda res = Poroda.valueOf(por);
        return res;
    }
}