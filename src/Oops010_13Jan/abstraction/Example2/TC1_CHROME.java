package src.Oops010_13Jan.abstraction.Example2;

public class TC1_CHROME extends browsers{

    @Override
    void openBrowser() {
        System.out.println("Chrome is starting");

    }

    @Override
    void closeBrowser() {

        System.out.println("Chrome is closing");
    }
}
