public class NoArgsConst {
    public NoArgsConst() {
        System.out.println("No-arg constructor called");
    }

    public static void main(String[] args) {
        NoArgsConst p = new NoArgsConst();
        new NoArgsConst();
    }
}