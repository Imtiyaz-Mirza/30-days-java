public class day6strings {
    public static void main(String args[]) {
        String name = "Java";

        System.out.println(name.length());
        String Capital = "welcome";
        System.out.println(Capital.toUpperCase());
        String small = "GOOD BYE";
        System.out.println(small.toLowerCase());
        System.out.println(Capital.equals(small));
        String a = "Java";
        System.out.println(name.equals(a));
        String exists = "Learn java today !";
        System.out.println(exists.contains("java"));
        System.out.println(exists.charAt(6));
    }
}
