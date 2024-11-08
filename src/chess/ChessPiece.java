package chess;

import application.boardgame.Board;
import application.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board bord, Color color) {
        super(bord);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
