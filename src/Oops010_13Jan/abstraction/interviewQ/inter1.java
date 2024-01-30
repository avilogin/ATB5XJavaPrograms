package src.Oops010_13Jan.abstraction.interviewQ;

public interface inter1 {

    void hello();

    default void world()
    {
        System.out.println("World of interface");
    }
}
