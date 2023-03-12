package com.thedynamicdoers.BotApi.Model;

import java.util.Random;

public class Bot {
    /**
     * Makes a move by randomly selecting an empty cell in the board and placing the specified symbol in it.
     * @param inputBoard The current state of the game board.
     * @param symbol The symbol that the bot will place on the board.
     * @return The updated game board with the bot's move.
     */
    public static Board makeMove(Board inputBoard, Character symbol) {
// Create a new Random object to generate random row and column indices.
        Random random = new Random();
        // Generate a random row and column index until an empty cell is found.
        int row = random.nextInt(inputBoard.grid.size());
        int column = random.nextInt(inputBoard.grid.get(row).size());
        while (inputBoard.grid.get(row).get(column) != '-') {
            row = random.nextInt(inputBoard.grid.size());
            column = random.nextInt(inputBoard.grid.get(row).size());
        }
        // Place the specified symbol in the empty cell.
        inputBoard.grid.get(row).set(column, symbol);

        // Return the updated game board.
        return inputBoard;
    }
}

