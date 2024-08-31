public class SuperKeyUse {
 public static void main(String[] args) {
    // parent p=new parent();
    // parent p=new parent(10);
    child c=new child(20);

 }
}

class parent{
    parent(){
        System.out.println("non-para const. of parent");
    }
    parent(int x){
        System.out.println("para const. of parent");
    }
}

class child extends parent{
    child(){
        System.out.println("non-para const. of child");
    }
    child(int x){
        //super keyword is used to call constructor of parent class
        //it is used just before println/print method neither above nor lower
        super(x); 
        System.out.println("para const. of child");
    }
    
    // child(int x,int y){
    //     super(x);
    //     System.out.println("2 para const. of child");
    // }
}
