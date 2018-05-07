/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author MyPC
 */
import java.util.ArrayList;

public class Control {
    private int[][] gameBoard = new int[4][4];
    protected int x, y;

    public void pushUp() {
        for (int y = 0; y < 4; y++) {
            boolean plusalready = false;
            for (int x = 1; x < 4; x++) {
                int value = gameBoard[x][y];
                if (value != 0) {
                    int preX = x - 1;
                    while ((preX >= 0) && (gameBoard[preX][y] == 0)) {
                        preX--;
                    }
                    
                    if (preX == -1) {
                        gameBoard[0][y] = value;
                        gameBoard[x][y] = 0;
                        
                    } else if (gameBoard[preX][y] != value) {
                        gameBoard[preX + 1][y] = value; 
                        if (preX + 1 == x) {
                            gameBoard[x][y] = value;

                        } else if (preX + 1 != x) {
                            gameBoard[x][y] = 0;
                            
                        }
                    } else {
                        if (plusalready == true) {
                            gameBoard[preX + 1][y] = value;
                            gameBoard[x][y] = 0;
                            plusalready = false;
                            
                        } else {
                            gameBoard[preX][y] *= 2;
                            gameBoard[x][y] = 0;
                            plusalready = true;
                            
                        }
                    }
                }
            }
        }
    }

    public int getValue(int x, int y) {
        return (gameBoard[x][y]);
    }
//------------------------------------------------------------------------------

    public void setValue(int x, int y, int value) {
        gameBoard[x][y] = value;
    }
//------------------------------------------------------------------------------    
   

    public static void main(String args[]) {
        Control con = new Control();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                con.gameBoard[i][j] = 0;
            }
        }
        con.gameBoard[1][1] = 2;
        con.gameBoard[0][1] = 2;
        con.gameBoard[2][1] = 2;
        con.gameBoard[0][3] = 4;
        con.gameBoard[1][3] = 2;
        con.gameBoard[2][3] = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(con.getValue(i, j));
            }
            System.out.println();
        }
        System.out.println();
        con.pushUp();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(con.getValue(i, j));
            }
            System.out.println();
        }
    }
}
//------------------------------------------------------------------------------	

