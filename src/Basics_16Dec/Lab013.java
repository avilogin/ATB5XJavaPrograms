package src.Basics_16Dec;

public class Lab013 {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        int c = 92;

        int max = (a>b) ? ((a>c) ? a:c):((b>c) ? b:c);
        System.out.println(max);
    }
}
