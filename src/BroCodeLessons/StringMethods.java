package BroCodeLessons;

public class StringMethods {
    public static void main(String[] args){

        String name = "Lukasz Kundzicz";

        boolean x = name.equals("lukasz");
        boolean y = name.equalsIgnoreCase("lukasz");
        int z = name.length();
        char xx = name.charAt(3);
        int yy = name.indexOf("s");
        boolean zz = name.isEmpty();
        String xxx = name.toUpperCase();
        String yyy = name.toLowerCase();
        String zzz = name.trim();
        String replace = name.replace("z", "zz");


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(xx);
        System.out.println(yy);
        System.out.println(zz);
        System.out.println(xxx);
        System.out.println(yyy);
        System.out.println(replace);


    }
}
