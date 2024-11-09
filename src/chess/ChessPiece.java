package chess;

import application.boardgame.Board;
import application.boardgame.Piece;
import application.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board bord, Color color) {
        super(bord);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != this.getColor();
    }

}
