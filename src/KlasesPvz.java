public class KlasesPvz {

    public static void main(String[] args){
        // objekto sukurimas, perduome parametra i  konstruktoriu
        SecondClassExample secondClassExample = new SecondClassExample(15);
        secondClassExample.testMethod();


    }
}
//klase be public, nes faile gali buti tik viena su public
class SecondClassExample{
    private int id; // klases lygio kintamasis
    public  SecondClassExample(){
        id = 10;
    }

    public SecondClassExample( int ids){
        //id = ids; ///galima, nes skiriasi vardai
        this.id = id; // priskiria nauja reiksme
    }

    //public metodas
    public void testMethod(){
        System.out.println("this is method :)" + id);
    }

}