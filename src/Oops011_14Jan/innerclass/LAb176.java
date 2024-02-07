package src.Oops011_14Jan.innerclass;

public class LAb176 {
    public static void main(String[] args) {
        OOC ooc = new OOC();
        OOC.SNCI icref= new OOC.SNCI();//as snci is static class then we do not need the ooc reference
        icref.show();

    }

}

class OOC{
    static  int o =100; //static variable
    int a = 900; //instance variable

    static class SNCI{
        void show(){
            //System.out.println(a);
            System.out.println(o);
        }
    }



}