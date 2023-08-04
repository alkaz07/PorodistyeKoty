import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // exemple2();
       // exemple3();
        exemple4();
    }

    static void exemple4()
    {
        int n = 4;
        ArrayList<Kotik> kotiki = getCatsFromUser(n);
        System.out.println(kotiki);

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

        //System.out.println(spisok);
        System.out.println(catsToStr(spisok));
        String s2 = spisok.toString().replace(", ", "\n  ").replace("[", "[\n  ").replace("]", "\n]");
        System.out.println(s2);


    }

    public static ArrayList<Kotik> getCatsFromUser(int kolvo)
    {
        System.out.println("вводите данные "+kolvo+" котиков");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Kotik> result = new ArrayList<>(kolvo);
        for (int i = 0; i < kolvo; i++) {
            System.out.println("введите имя");
            String s1 = scanner.nextLine();
            System.out.println("введите породу");
            String s2 = scanner.nextLine();     //прочитали строку
            Poroda p = fromString(s2);          //конвертировали в породу
            Kotik cat = new Kotik(s1, p);       //создали экземпляр котика
            result.add(cat);                    //добавили его в список
        }
        return result;
    }

    static Poroda fromString(String por)
    {

        Poroda res = Poroda.valueOf(por);
        return res;
    }

    static String catsToStr(ArrayList<Kotik> cats)
    {
        String result = "{{";
        for (Kotik k: cats) {
            result += "\n  "+k;
        }
        result +="\n}}";
        return result;
    }
}