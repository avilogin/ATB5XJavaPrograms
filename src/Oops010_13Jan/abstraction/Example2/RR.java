package src.Oops010_13Jan.abstraction.Example2;

public class RR {
    public static void main(String[] args) {
        TC1_CHROME ch = new TC1_CHROME();
        ch.openBrowser();
        ch.closeBrowser();
        ch.logs();

        System.out.println("--------------------------");
        TC2_firefox ff = new TC2_firefox();
        ff.openBrowser();
        ff.closeBrowser();
        ff.logs();


    }


}
