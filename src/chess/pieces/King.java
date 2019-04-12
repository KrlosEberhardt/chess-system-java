package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board boad, Color color) {
		super(boad, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
