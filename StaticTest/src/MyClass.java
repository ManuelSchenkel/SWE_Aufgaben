public class MyClass {
    private String name;
    //dynamische Membervariable count pro Objekt
    //private int count;
    //statische Membervariable count, gültig für ganze Klasse, nicht pro Objekt
    //statische Membervariable soll nicht über Objekt ausgegeben werden
    //Wir vom IDE auch nicht mehr vorgeschlagen (Alt + INS => toString())
    //private static int count;

    //public static Membervariable kann über Klassenname aufgerufen werden
    public static int count;

    //private static int count;

    public MyClass(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    //Um aus einer static Methode eine Mehode aufrufen zu können, muss diese ebenfalls static sein
    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                '}';
    }
}

