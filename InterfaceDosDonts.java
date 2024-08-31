public class InterfaceDosDonts {
    public static void main(String[] args) {
        System.out.println(Test.X); // we can directly access static members just by using interface name without creating object 
        Test.meth3();
    }
}


interface Test{
    //by default var is final and static
    final static int X=19; //Reference of Var in interface class is Upperclass always
    public abstract void meth1(); //by default methods are public and abstract
    public abstract void meth2(); //we can not use private as it assume to be implemented
    // public void meth3(){
        //Abstract methods do not specify a body
    // }
    default void meth4(){
        //default method is implemented to avoid error in child classes which implements parent class
    }

    public static void meth3(){
        System.out.println("Any interface can have static method also with body");
    }
}

interface Test2 extends Test{
    //interfaces can be extended also
    void meth4();
}
class My implements Test2{
    @Override
    public void meth1(){}
    public void meth2(){}
    public void meth3(){}
}