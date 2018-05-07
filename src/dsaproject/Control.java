package DSAProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Control {
    private int [][] gameBoard = new int[4][4];
    private Random r = new Random();
    private Stack EStack = new Stack();
    private Stack SStack = new Stack();
    private ArrayList<Integer> spaceX = new ArrayList<Integer>();
    private ArrayList<Integer> spaceY = new ArrayList<Integer>();
    protected int x,y;
    public String playerName;
    private boolean movedFlag;
    protected int highScore, currentScore, playerScore = 0;
//------------------------------------------------------------------------------
    public Control(){
        this.highScore = 0;
    }
//------------------------------------------------------------------------------
    public Control(String name){
        this.playerName = name;
    }
//------------------------------------------------------------------------------	
    public void random() {
        if (checkEmptySlot() == true ) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameBoard[i][j] == 0) {
                    spaceX.add(i);
                    spaceY.add(j);
                }
            }
        }	
        int randomnumber = r.nextInt(spaceX.size());
        int numberchoose = r.nextInt(10);
        int newNumber = 2;
        if (numberchoose == 0) {
            newNumber = 4;
        }
        int X = spaceX.get(randomnumber);
        int Y = spaceY.get(randomnumber);
        if(gameBoard[X][Y] == 0) {
            gameBoard[X][Y] = newNumber;
        }
        else {
            random();
        }
    }
//------------------------------------------------------------------------------    
    public void pushUp() {
        updateStack();
        movedFlag = false;
        for (int y=0;y<4;y++) {
            boolean plusalready=false;
            for (int x=1;x<4;x++) {
                int value = gameBoard[x][y];
                if(value!=0) {
                    int preX=x-1;
                    while((preX>=0) && (gameBoard[preX][y]==0)) {
                        preX--;
                    }
                    
                    if (preX==-1) {
                        gameBoard[0][y]=value;
                        gameBoard[x][y]=0;
                        movedFlag = true;
                        System.out.print("Case 1 Push up \n");
                    }
                        
                    else if (gameBoard[preX][y] != value) {
                        gameBoard[preX+1][y] = value;
                        if (preX+1==x) {
                            gameBoard[x][y] = value;
                            System.out.print("#value \n");
                        }   
                        else if (preX+1!= x) {
                            gameBoard[x][y]= 0;
                            movedFlag = true;
                            System.out.print("ww \n");
                        }
                    }
                    else {
                        if (plusalready==true) {
                            gameBoard[preX+1][y]= value;
                            gameBoard[x][y]=0;
                           plusalready=false;
                            movedFlag = true;
                            System.out.print("plus true");
                        }
                        else {
                            gameBoard[preX][y]*= 2;
                            gameBoard[x][y]= 0;
                            plusalready=true;
                            currentScore+=gameBoard[preX][y];
                            movedFlag = true;
                            System.out.print("plus false");
                        }
                    }
                }
            }
        }
    }
//------------------------------------------------------------------------------   
    public void pushDown() {
        updateStack();
        movedFlag = false;
        for (int y=0;y<4;y++) {
            boolean plusalready=false;
            for (int x=2;x>-1;x--) {
                int value = gameBoard[x][y];
                if(value!=0) {
                    int behiX=x+1;
                    while((behiX<=3) && (gameBoard[behiX][y]==0)) {
                        behiX++;
                    }
                    if(behiX==4) {
                        gameBoard[3][y]=value;
                        gameBoard[x][y]=0;
                        movedFlag = true;
                    }
                    else if (gameBoard[behiX][y]!=value) {
                        gameBoard[behiX-1][y]=value;
                        if (behiX-1!=x) {
                            gameBoard[x][y]=0;
                            movedFlag = true;
                        }
                        else if (behiX-1==x) {
                            gameBoard[x][y] = value;
                        }
                    }
                    else {
                        if (plusalready==true) {
                            gameBoard[behiX-1][y]=value;
                            gameBoard[x][y]=0;
                            plusalready=false;
                            movedFlag = true;
                        }
                        else {
                            gameBoard[behiX][y] *= 2;
                            gameBoard[x][y] = 0;
                            plusalready=true;
                            currentScore+=gameBoard[behiX][y];
                            movedFlag = true;
                        }
                    }
                }	
            }
        }
    }
//------------------------------------------------------------------------------   
    public void pushRight() {
        updateStack();
        movedFlag = false;
        for (int x=0;x<4;x++) {
            boolean plusalready=false;
            for (int y=2;y>-1;y--) {
                int value = gameBoard[x][y];
                if(value!=0) {
                    int behiY= y+1;
                    while(behiY<=3 && gameBoard[x][behiY]==0) {
                        behiY++;
                    }
                    if (behiY==4) {
                        gameBoard[x][3]=value;
                        gameBoard[x][y]=0;
                        movedFlag = true;
                    }
                    else if (gameBoard[x][behiY]!=value) {
                        gameBoard[x][behiY-1]=value;
                        if(behiY-1!=y) {
                            gameBoard[x][y]=0;
                            movedFlag = true;
                        }
                        else if (behiY-1==y) {
                        gameBoard[x][y]=value;
                        }
                    }
                    else {
                        if(plusalready==true) {
                            gameBoard[x][behiY-1]=value;
                            gameBoard[x][y]=0;
                            plusalready=false;
                            movedFlag = true;
                        }
                        else {
                            gameBoard[x][behiY]*=2;
                            gameBoard[x][y]=0;
                            plusalready=true;
                            currentScore+=gameBoard[x][behiY];
                            movedFlag = true;
                        }
                    }
                }
            }
        }
    }
//------------------------------------------------------------------------------    
    public void pushLeft() {
        updateStack();
        movedFlag = false;
        for (int x=0;x<4;x++) {
            boolean plusalready=false;
            for (int y=1;y<4;y++) {
                int value = gameBoard[x][y];
                if(value!=0) {
                    int prevY = y-1;
                    while(prevY>=0 && gameBoard[x][prevY]==0) {
                        prevY--;
                    }
                    if (prevY==-1) {
                        gameBoard[x][0]=value;
                        gameBoard[x][y]=0;
                        movedFlag = true;
                    }
                    else if (gameBoard[x][prevY]!=value) {
                        gameBoard[x][prevY+1]=value;
                        if (prevY+1!=y) {
                            gameBoard[x][y]=0;
                            movedFlag = true;
                        }
                        else if (prevY+1==y) {
                            gameBoard[x][y]=value;
                        }
                    }
                    else {
                        if(plusalready==true) {
                            gameBoard[x][prevY+1]=value;
                            gameBoard[x][y]=0;
                            plusalready=false;
                            movedFlag = true;
                        }
                        else {
                            gameBoard[x][prevY]*=2;
                            gameBoard[x][y]=0;
                            plusalready=true;
                            currentScore+=gameBoard[x][prevY];
                            movedFlag = true;
                        }
                    }
                }
            }
        }
    }
//------------------------------------------------------------------------------
    public void newGame() {
        for(int i = 0; i < 4; i++) 
            for (int j = 0; j < 4; j++) {
                gameBoard[i][j] = 0;
            }
        random();
        random();
        setHighScore();
        setCurrentScore(0);
    }
//------------------------------------------------------------------------------
    public void testColor() {
        int value = 2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameBoard[i][j] = value;
                value *=2;
            }
        }
    }
//------------------------------------------------------------------------------
    public int getStackSize() {
        return(EStack.size());
    }
//------------------------------------------------------------------------------
    public int getValue(int x, int y) {
        return(gameBoard[x][y]);
    }
//------------------------------------------------------------------------------
    public void setValue(int x, int y, int value) {
        gameBoard[x][y] = value;
    }
//------------------------------------------------------------------------------    
    public boolean checkMoved() {
        return (movedFlag);
    }
//------------------------------------------------------------------------------
    public boolean checkEmptySlot() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (gameBoard[i][j] == 0) return false;
        return true;
    }
//------------------------------------------------------------------------------    
    public boolean Winner() {
        for(int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if(gameBoard[i][j] == 2048 && canMove()) return true; 
        return false;
    }
//------------------------------------------------------------------------------    
    public boolean Loser() {
        return(canMove() == false && checkEmptySlot() == true);
    }
//------------------------------------------------------------------------------
    public boolean checkAbilityMoving(){
        if(x + 1 < 4 && gameBoard[x][y] == gameBoard[x+1][y]) return true; //Moving Up
        else if(x - 1 >= 0 && gameBoard[x][y] == gameBoard[x-1][y]) return true; //Moving Down
        else if(y + 1 < 4 && gameBoard[x][y] == gameBoard[x][y+1]) return true; //Moving Right
        else if(y - 1 >= 0 && gameBoard[x][y] == gameBoard[x][y-1]) return true; //Moving Left
        return false;
    }
//------------------------------------------------------------------------------   
    public boolean canMove() {
        for (x = 0; x < 4; x++)
            for (y = 0; y < 4; y++)
                if(checkAbilityMoving()) return true;
        return false;
    }
//------------------------------------------------------------------------------
        public void updateStack() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                EStack.push(i);
                EStack.push(j);
                EStack.push(gameBoard[i][j]);
            }
        }
        SStack.push(currentScore);
    }
//------------------------------------------------------------------------------    
    public void Undo() {
        currentScore = (int) SStack.pop();
        for (int i = 0; i < 16; i++) {
            int tempV = (int) EStack.pop();
            int tempY = (int) EStack.pop();
            int tempX = (int) EStack.pop();
            gameBoard[tempX][tempY] = tempV; 
        }
    }
//------------------------------------------------------------------------------    
    public void setHighScore(){
        highScore = (currentScore > highScore) ? currentScore : highScore;
	}
//------------------------------------------------------------------------------    
    public long getHighScore() {
        return highScore;
    }
//------------------------------------------------------------------------------   
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
//------------------------------------------------------------------------------    
    public long getCurrentScore() {
        return currentScore;
    }
//------------------------------------------------------------------------------    
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
}
//------------------------------------------------------------------------------	
