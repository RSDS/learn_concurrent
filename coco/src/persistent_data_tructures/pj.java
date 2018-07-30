package persistent_data_tructures;

public class pj {

    public static void main(String[] args) {
        String a = new String("xxxxxxxxx");
        System.out.println(a);

        String b = new StringBuilder("ja").append("va").toString();
        System.out.println(b.intern() == b);


    }
}
