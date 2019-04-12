package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board boad, Color color) {
		super(boad, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
