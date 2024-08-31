//INHERITANCE 
public class Solution {
    public static void main(String[] args) {
        // Creation of Animal object 
        Animal animal=new Animal();
        //new keyword helps to allocate the memory for class animal
        animal.walk();
        animal.Eat();

        // creation of Bird object 
        Bird bird=new Bird(); /*bird object that can have both property 
        animal class property as well as bird class propert*/
        bird.walk();//inherited property
        bird.Eat();//inherited property
        bird.fly(); //unique property of bird class
        bird.Sing();//unique property of bird class
   
    }

}

class Animal{ //class animal
    void walk(){   //Animal class has only one method walk
        //using inheritance one class can acquire the property of other class
        System.out.println("I can walk");
    }
    void Eat(){
        System.out.println("i can eat");
    }
}

class Bird extends Animal{ //extends keyword is used to inherit the property of previous class for current class 
     //class bird inherit all the property of animal class
    //as well as Bird class can have some additional unique properties

    //Additional properties of Bird class
    void fly(){ 
        System.out.println("I can fly");
    }
    void Sing(){
        System.out.println("i can sing");
    }
}
