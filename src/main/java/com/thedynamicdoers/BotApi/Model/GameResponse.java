package com.thedynamicdoers.BotApi.Model;
/**
 * Represents a game response with information about the board, game status, winner and draw.
 */
public class GameResponse {
    private Board board;     // the updated game board
    private String status;   // the current game status
    private String winner;   // the winner of the game
    private String draw;     // the message for a draw
    /**
     * Creates a new game response object.
     *
     * @param board  the updated game board
     * @param status the current game status
     * @param winner the winner of the game
     * @param draw   the message for a draw
     */
    public GameResponse(Board board, String status, String winner, String draw) {
        this.board = board;
        this.status = status;
        this.winner = winner;
        this.draw = draw;
    }
    /**
     * Returns the game board.
     *
     * @return the game board
     */
    public Board getBoard() {
        return board;
    }
    /**
     * Sets the game board.
     *
     * @param board the game board
     */
    public void setBoard(Board board) {
        this.board = board;
    }
    /**
     * Returns the current game status.
     *
     * @return the current game status
     */
    public String getStatus() {
        return status;
    }
    /**
     * Sets the current game status.
     *
     * @param status the current game status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * Returns the winner of the game.
     *
     * @return the winner of the game
     */
    public String getWinner() {
        return winner;
    }
    /**
     * Sets the winner of the game.
     *
     * @param winner the winner of the game
     */
    public void setWinner(String winner) {
        this.winner = winner;
    }
    /**
     * Returns the message for a draw.
     *
     * @return the message for a draw
     */
    public String getDraw() {
        return draw;
    }
    /**
     * Sets the message for a draw.
     *
     * @param draw the message for a draw
     */
    public void setDraw(String draw) {
        this.draw = draw;
    }
}
