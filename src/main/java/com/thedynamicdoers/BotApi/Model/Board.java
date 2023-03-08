package com.thedynamicdoers.BotApi.Model;

import java.util.ArrayList;

public class Board {

    // grid holds the current state of the tic-tac-toe board
    public ArrayList<ArrayList<Character>> grid = new ArrayList<>();

    // Constructor initializes a new, empty board
    public Board() {
        for (int i = 0; i < 3; i++) {
            ArrayList<Character> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add('-');
            }
            grid.add(row);
        }
    }

    // Check if there is a winner on the board
    public Character checkWinner() {
        // Check for horizontal win
        for (int i = 0; i < 3; i++) {
            if (grid.get(i).get(0) == grid.get(i).get(1) && grid.get(i).get(1) == grid.get(i).get(2)) {
                return grid.get(i).get(0);
            }
        }

        // Check for vertical win
        for (int j = 0; j < 3; j++) {
            if (grid.get(0).get(j) == grid.get(1).get(j) && grid.get(1).get(j) == grid.get(2).get(j)) {
                return grid.get(0).get(j);
            }
        }

        // Check for diagonal win
        if (grid.get(0).get(0) == grid.get(1).get(1) && grid.get(1).get(1) == grid.get(2).get(2)) {
            return grid.get(0).get(0);
        }
        if (grid.get(0).get(2) == grid.get(1).get(1) && grid.get(1).get(1) == grid.get(2).get(0)) {
            return grid.get(0).get(2);
        }
        // If there is no winner, return null
        return null;
    }
    // Check if the board is full and there are no more moves left
    public boolean isFull() {
        for (ArrayList<Character> row : grid) {
            for (Character slot : row) {
                if (slot == '-') {
                    return false;
                }
            }
        }
        return true;
    }

}
