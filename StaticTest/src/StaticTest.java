public class StaticTest {
    public static void main(String[] args) {
        /*
        System.out.println("Objekte: " + MyClass.count);
        MyClass object1 = new MyClass("Object 1");
        System.out.println("Objekte: " + MyClass.count);
        MyClass object2 = new MyClass("Object 2");
        System.out.println("Objekte: " + MyClass.count);
        */
        System.out.println("Objekte: " + MyClass.getCount());
        MyClass object1 = new MyClass("Object 1");
        System.out.println("Objekte: " + MyClass.getCount());
        MyClass object2 = new MyClass("Object 2");
        System.out.println("Objekte: " + MyClass.getCount());
    }
}
