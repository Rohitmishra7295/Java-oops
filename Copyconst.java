public class Copyconst {
    private String name;
    private int age;

    public Copyconst(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Copyconst(Copyconst p) {
        this.name = p.name;
        this.age = p.age;
        System.out.println("Copy constructor called");
    }

    public static void main(String[] args) {
        Copyconst p1 = new Copyconst("John", 30);
        Copyconst p2 = new Copyconst(p1);
    }
}