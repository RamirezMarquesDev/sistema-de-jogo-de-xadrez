package application.boardgame;

public class Piece {

    protected Position position;
    private Board bord;

    public Piece(Board bord) {
        this.bord = bord;
        // opcional didático
        position = null;
    }

    protected Board getBord() {
        return bord;
    }

}
