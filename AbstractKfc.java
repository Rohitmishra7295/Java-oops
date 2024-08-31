public class AbstractKfc {
    public static void main(String[] args) {
        Mykfcfranchise kfc= new Mykfcfranchise();
        System.out.println("this notification is privided by kfc Authorities");
        kfc.kfc();
        kfc.PermitTeam();
        System.out.println("This notification is provided by kfc outlet");
        kfc.makeitem();
        kfc.billing();
        kfc.offer();
        kfc.festiveoffer();
        /*kfcAuthorities kfa=new kfcAuthorities();
        kfc.kfc(); // Cannot instantiate the type kfcAuthorities */
        System.out.println("******************");
       kfcAuthorities kfca= new Mykfcfranchise();
       kfca.kfc();
       kfca.PermitTeam();
       kfca.makeitem();
       
       kfca.billing();
       kfc.offer();
       kfc.festiveoffer();
       System.out.println("*****************");
        

    }
}
 abstract class kfcAuthorities  {
    void kfc(){
        System.out.println("hey this is kfc authorities office");
    }
    void PermitTeam(){
        System.out.println("You are required to get permission to open kfc outlet in your area");
    }
   void makeitem(){
          System.out.println("We provide you food item lists itself");
    }
    abstract void billing();
    abstract void offer();
 }

class Mykfcfranchise extends kfcAuthorities{
    void kfc(){
        System.out.println("hey this is kfc outlet");
    }
    void PermitTeam(){
        System.out.println("This outlet is permited by kfc Authorities");
    }
    void makeitem(){
        System.out.println("We make chicken korma,chicken kabab,chicken biryani,fry chicken,egg curry,fry egg,chicken curry");
    }
    void billing(){
        System.out.println("my outlet has easy and userfriendly billing options.we accept online transaction as well as cash also");
    }
    void offer(){
        System.out.println("We provide many offers while you purchase any item");
    }
    // additional method
    void festiveoffer(){
        System.out.println("We provide attractive festive offer on every festival");
    }
 }
