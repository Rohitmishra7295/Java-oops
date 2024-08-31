public class Interface {
 public static void main(String[] args) {
   // kfc kc=new kfc(); //Cannot instantiate the type kfc
    kfc kc=new kfcOutlet();
    kc.permit();
    kc.offer();
    kc.foodItems();
    kc.billing();
    //kc.costomerSupport(); //The method costomerSupport() is undefined for the type kfc 
    //Additional added method is not recognized by parent class reference
    kfcOutlet kc1=new kfcOutlet();
    kc1.costomerSupport();
    kc1.permit();
    kc1.offer();
    kc1.foodItems();
    kc1.billing();
 }
}

interface  kfc{
    void permit();
    void foodItems();
    void offer();
    void billing();
}
class kfcOutlet implements kfc{
    public void permit(){
        System.out.println("I have kfc permited outlet");
    }
    public void foodItems(){
        System.out.println("All the kfc items are available here also");
    }
    public void offer(){
    System.out.println("offer are also available like festive offer,new user offer,buy two items get 20% extra off and many more");
    }
    public void billing(){
        System.err.println("billing service is very easy online as well as cash both method is available");
    }
    public void costomerSupport(){
        System.err.println("we also provides costomer care support for your ever queries");
    }
}



