package src.Oops009_07Jan.Inheritance.single;

public class Programming {

    int version;
    String author;
    String use;


    Programming()
    {
        System.out.println("Default Constructor");
    }
    Programming(String usage)
    {
        this.use = usage;
    }

    Programming(int ver, String auth)
    {
        this.version = ver;
        this.author = auth;

    }

    void PrintValues()
    {
        System.out.println("Version = "+ version);
        System.out.println("Author = "+ author);
        System.out.println("Use = "+ use);
    }

    void  car()
    {
        System.out.println("New Car");
    }

    void  house()
    {
        System.out.println("New House");
    }
}
