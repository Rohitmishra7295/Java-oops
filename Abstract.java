class  Abstract{
    public static void main(String args[]) { 
     
        Animal dog = new Dog();
        Animal cow = new Cow();
        
        dog.say();
        cow.say();
        Animal.play(); //can be called without creating objects
    }
}
abstract class Animal {
  abstract void say();

    static void play(){
        System.out.println("you can play with animals");
    }
}



class Dog extends Animal {
	@override
    void say() { System.out.println("Dog barks."); }
}

class Cow extends Animal {
    @override
    void say() { System.out.println("Cow moos."); }
}

