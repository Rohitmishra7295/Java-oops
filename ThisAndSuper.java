public class ThisAndSuper {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(5,2,3);
        c.display();
    }
}


class Rectangle{
    int length=5;
    int breadth=2;
    int x=length*breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

class Cuboid extends Rectangle{
    int height=3;
    int x=height;

    Cuboid(int l, int b,int h) {
        super(l,b);
        height=h;
    }
    void display(){
        System.out.println(super.x);
        System.out.println(x);    
    }  
}
