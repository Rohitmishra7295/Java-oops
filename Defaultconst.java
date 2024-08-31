public class Defaultconst {
         private String color;
         private int year;
    
        // parameterized Constructor
        public Defaultconst(String color, int year) {
            this.color = color;
            this.year = year;
        }
    
        public void printInfo() {
            System.out.println("Color: " + color);
            System.out.println("Year: " + year);
        }
    
        public static void main(String[] args) {
            Defaultconst myCar = new Defaultconst("Red", 2022);
            myCar.printInfo();
        }
    }
