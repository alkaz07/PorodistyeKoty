public class Kotik {
    String name;
    Poroda breed;

    public Kotik(String s, Poroda poroda) {
        name=s;
        breed = poroda;
    }

    public String toString()
    {
        return "Kotik "+name+" - "+breed;
    }
}
