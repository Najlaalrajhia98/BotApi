/**
 The BotController class is responsible for handling requests related to the Tic Tac Toe game.
 It contains a single endpoint that receives a Board object and a symbol character as input,
 and returns a GameResponse object containing information about the game state after making a move.
 */
package com.thedynamicdoers.BotApi.Controller;

import com.thedynamicdoers.BotApi.Model.Board;
import com.thedynamicdoers.BotApi.Model.Bot;
import com.thedynamicdoers.BotApi.Model.GameResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api")
public class BotController {
    /**
     * This method handles the POST request to play a move in the game.
     * It takes in a Board object and a symbol character as input,
     * and returns a GameResponse object containing information about the game state after making the move.
     * If the game has been won, the response will include the winner's symbol and a "wins!" message.
     * If the game has resulted in a draw, the response will include a "Draw!" message.
     * Otherwise, the response will indicate that the game is still in progress.
     *
     * @param inputBoard the current state of the game board
     * @param symbol the symbol character representing the player making the move
     * @return a GameResponse object containing information about the game state after making the move
     */
    @PostMapping
    public GameResponse getBoard(@RequestBody Board inputBoard, @RequestParam("symbol") Character symbol) {
        Board updatedBoard = Bot.makeMove(inputBoard, symbol);
        Character winner = updatedBoard.checkWinner();
        boolean boardFull = updatedBoard.isFull();

        if (winner != null) {
            return new GameResponse(updatedBoard, HttpStatus.OK.toString(), winner + " wins!", null);
        } else if (boardFull) {
            return new GameResponse(updatedBoard, HttpStatus.OK.toString(), null, "Draw!");
        } else {
            return new GameResponse(updatedBoard, "Game in progress", null, null);
        }
    }


}
