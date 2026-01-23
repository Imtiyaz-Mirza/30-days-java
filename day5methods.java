public class day5methods {
    static void withOutArguments() {
        System.out.println("This method represent with out arguments !!");
    }

    static void withArguments(String name) {
        System.out.println("Your name is : " + name);
    }

    static int returnValue(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        withOutArguments();
        withArguments("imtiyaz");
        int result = returnValue(5, 9);
        System.out.println(result);
    }
}