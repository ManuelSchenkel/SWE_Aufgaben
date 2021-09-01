import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        // Position:   01234567
        String text = "ABCDABCD";

        System.out.println("Länge: " + text.length() + " Zeichen");
        System.out.println("Position von Buchstabe A: " + text.indexOf("A"));
        System.out.println("Nächste Position von Buchstabe A: " + text.indexOf("A", 2));
        System.out.println("Letzte Position von Buchstabe A: " + text.lastIndexOf("A"));

        String text2 = "ABCDEFG";
        System.out.println("Beinhaltet \"CD\": " + text2.contains("CD"));
        System.out.println("Beinhaltet \"DC\": " + text2.contains("DC"));
        //Substring Anfang inklusiv, Ende exklusiv (gibt Char 3 + 4 aus, 5 nicht)
        System.out.println("Teilkette: " + text2.substring(3, 5));

        String text3 = "Dies ist ein Test Satz";
        String[] worte = text3.split("es");
        System.out.println(worte[0] + worte[1]);
        for (String wort:
             worte) {
            System.out.println(wort);
        }

        StringTokenizer tokens = new StringTokenizer(text3, " ", false);
        while(tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }

        System.out.println(text3.toLowerCase());
        System.out.println(text3.toUpperCase());
        System.out.println('a' - 'A');
        System.out.println('b' - 'B');
        System.out.println((char)('b'-32));

        System.out.println(text3.replace('i', 'e'));

        String eingabe = " Eins zwei ";
        eingabe = eingabe.trim();
        System.out.println(eingabe.equals("Eins zwei"));

        System.out.println("Ruck" + "sack");
        System.out.println("Ruck".concat("! Sack!"));

        String t1 = "Java ist cool!";
        String t2 = "JAVA ist cool!";
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equalsIgnoreCase(t2));

        String fileName = "Text.txt";
        System.out.println(fileName.endsWith(".txt"));
        System.out.println(fileName.startsWith("Text"));
        System.out.println(fileName.startsWith("text"));

        String text5 = "xABy";
        String text6 = "xyzABxyz";
        System.out.println(text5.regionMatches(1, text6, 3, 2));

        String string1 = "test1234";
        System.out.println(string1);
        string1 = "1234test";
        System.out.println(string1);

    }


}
