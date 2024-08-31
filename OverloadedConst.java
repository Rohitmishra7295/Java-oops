public class OverloadedConst {
        public String name;
        public int age;
    
        public OverloadedConst(String name) {
            this.name = name;
            System.out.println("Overloaded constructor 1 called");
        }
    
        public OverloadedConst(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Overloaded constructor 2 called");
        }
    
        public static void main(String[] args) {
            OverloadedConst p1 = new OverloadedConst("John");
            System.out.println(p1.name);
            OverloadedConst p2 = new OverloadedConst("John", 30);
            System.out.println(p2.name);
            System.out.println(p2.age);
        }
    }

