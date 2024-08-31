public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.OuterDisplay();
    }
}

class Outer{
    int x=10;

    class Inner{  // here Inner is Nested class 
        int y=20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
            Outer.Inner i=new Outer().new Inner();
        }
    }
    void OuterDisplay(){
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println(i.y);

        //conclusion:inner class can access the members of outerclass directly
        //But, outer class cannot access the members of inner class directly unless or untill we create an object of inner class
    }

}
