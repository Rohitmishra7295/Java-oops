public class Main {

    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.name="cat";
        a1.voice="mew-mew";
        System.out.println(a1.name);
        System.out.println(a1.voice);

        person p1=new person();
        p1.name="aman";
        p1.age=30;
        System.out.println(p1.name);
        System.out.println(p1.age);

        person p2=new person(); //person object
        p2.name="raj";
        p2.age=21;
        System.out.println(p2.name);
        System.out.println(p2.age);
        p2.walk();
        p2.eat();
        p2.drink();
    }
    
}

class Animal{
    String name; 
    String voice;
}

class person{ //person class
    String name;
    int age;

    void walk(){ //methods or behaviour
        System.out.println(name+" is walking in garden");
    }

    void eat(){
        System.out.println(name+" is eating food");
    }

    void drink(){
        System.out.println(name +" is drinking wine");
    }
}

