public class ParaConst {
        public  String name;
        public int age;
    
        public ParaConst(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Parameterized constructor called");
        }
    
        public static void main(String[] args) {
            ParaConst p = new ParaConst("John", 30);
            System.out.println(p.age);
            System.out.println(p.name);
        }
    }

