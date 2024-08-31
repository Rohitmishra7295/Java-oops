//check given bit is even or odd
public class Bit {
    public static void main(String[] args) {
        OddOrEven(3);
        OddOrEven(5);
        OddOrEven(11);
        
    }
}

    class OddEven{
        public static void OddOrEven(int n){
            int bitMask=1;
            if((n&bitMask)==0) {
                System.out.println("even");
            }else{
                System.out.println("Odd");
            }
            
        }
    }

