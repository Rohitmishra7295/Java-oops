public class Oops{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColour("blue");
        System.out.println(p1.Colour);
        p1.setPrice(45);
        System.out.println(p1.Price);
        //properties can be changed whenever we want
        p1.setColour("red");
        p1.setPrice(30);
        System.out.println(p1.Colour);
        System.out.println(p1.Price);
        //we can also get access without using set method
        p1.Colour="black";
        p1.Price=34;
        System.out.println(p1.Colour);
        System.out.println(p1.Price);


    }
}
class Pen{
    String Colour;
    int Price;   
    void setColour(String newColour){
        Colour=newColour;
    } 
    void setPrice(int newPrice){
        Price=newPrice;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calpercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }

}