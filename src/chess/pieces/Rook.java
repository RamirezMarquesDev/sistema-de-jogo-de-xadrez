package chess.pieces;

import application.boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board bord, Color color) {
        super(bord, color);
    }

    @Override
    public String toString() {
        return "R";
    }

}
