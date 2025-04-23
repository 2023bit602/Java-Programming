/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudokuinnetbeans;

import java.awt.Color;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author parth-patil
 */

public class SudokuSolved {
    private String[][] layout;
    private int size;
    private int[] rowEmpty, columnEmpty;
    private int[] solutionArray;

    public SudokuSolved(int size, JTextField[][] grid) {
        this.size = size;
        this.layout = new String[size][size];
        int blanks = (size * size) / 3;
        this.rowEmpty = new int[blanks];
        this.columnEmpty = new int[blanks];
        this.solutionArray = new int[blanks];

        // Generate base layout (shifted Latin square)
        for (int row = 0; row < size; row++) {
            int val = (row % size) + 1;
            for (int col = 0; col < size; col++) {
                layout[row][col] = String.valueOf((val + col - 1) % size + 1);
            }
        }

        // Randomly blank out cells
        Random rand = new Random();
        int count = 0;
        while (count < blanks) {
            int r = rand.nextInt(size);
            int c = rand.nextInt(size);
            if (!layout[r][c].equals(" ")) {
                solutionArray[count] = Integer.parseInt(layout[r][c]);
                rowEmpty[count] = r;
                columnEmpty[count] = c;
                layout[r][c] = " ";
                count++;
            }
        }

        // Populate the GUI grid
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (layout[i][j].equals(" ")) {
                    grid[i][j].setText("");
                    grid[i][j].setEditable(true);
                } else {
                    grid[i][j].setText(layout[i][j]);
                    grid[i][j].setEditable(false);
                }
            }
        }
    }

    public int checkSolution(JTextField[][] grid) {
        int wrong = 0;
        for (int i = 0; i < solutionArray.length; i++) {
            int r = rowEmpty[i];
            int c = columnEmpty[i];
            try {
                int userVal = Integer.parseInt(grid[r][c].getText());
                if (userVal != solutionArray[i]) {
                    wrong++;
                    grid[r][c].setBackground(Color.PINK);
                } else {
                    grid[r][c].setBackground(Color.GREEN);
                }
            } catch (NumberFormatException e) {
                wrong++;
                grid[r][c].setBackground(Color.PINK);
            }
        }
        return wrong;
    }
}
