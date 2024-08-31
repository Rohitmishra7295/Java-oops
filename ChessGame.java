public class ChessGame {

    public static void main(String[] args) {
        ChessPlayer queen = new Queen();
        ChessPlayer king = new King();

        queen.moves();
        king.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen: Up, down, left, right, diagonal (all directions)");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("King: Up, down, left, right, diagonal (one step only)");
    }
}
