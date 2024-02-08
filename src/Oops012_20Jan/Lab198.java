package src.Oops012_20Jan;

public class Lab198 {
    public static void main(String[] args) throws CustomException {


        Bank jpchase = new Bank("USD", 100);

        Bank hdfc = new Bank("INR", 100);
        Bank icici = new Bank("INR",100);

        System.out.println(hdfc.add(jpchase));
        //System.out.println(hdfc.add(icici));
        // Custom Exception



    }
}
