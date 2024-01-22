package src.Basics_16Dec;

public class Lab013 {
    public static void main(String[] args) {
        int a = 92;
        int b = 92;
        int c = 92;

        int max = (a>b) ? ((a>c) ? a:c):((b>c) ? b:c);
        System.out.println(max);
    }
}
