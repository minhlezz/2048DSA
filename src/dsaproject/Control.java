package DSAProject;

import java.io.*;
import java.util.*;
import javax.swing.JLabel;

public class Control {
    private int [][] gameBoard = new int[4][4];
    private Random r = new Random();
    private Stack EStack = new Stack();
    private Stack SStack = new Stack();
    private ArrayList<Integer> spaceX = new ArrayList<Integer>();
    private ArrayList<Integer> spaceY = new ArrayList<Integer>();
    protected int x,y;
    public String playerName;
    private boolean movedFlag = true;
    protected double highScore, currentScore, playerScore = 0;
//------------------------------------------------------------------------------
    public Control() {
        
    }
//------------------------------------------------------------------------------
    public Control(String name){
        this.playerName = name;
    }
//------------------------------------------------------------------------------	
    public void random() {
        if (!checkEmptySlot()) return;
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
        if(movedFlag == true) updateStack();
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
                    }
                
                    else if (gameBoard[preX][y] != value) {
                        gameBoard[preX+1][y] = value;
                        if (preX+1==x) {
                            gameBoard[x][y] = value;
                            
                        }   
                        else if (preX+1!= x) {
                            gameBoard[x][y]= 0;
                            movedFlag = true;
                        }
                    }
                    else {
                        if (plusalready==true) {
                            gameBoard[preX+1][y]= value;
                            gameBoard[x][y]=0;
                            plusalready=false;
                            movedFlag = true;
                        }
                        else {
                            gameBoard[preX][y]*= 2;
                            gameBoard[x][y]	= 0;
                            plusalready=true;
                            currentScore+=gameBoard[preX][y];
                            movedFlag = true;
                        }
                    }
                }
            }
        }
    }
//------------------------------------------------------------------------------   
    public void pushDown() {
        if(movedFlag == true) updateStack();
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
        if(movedFlag == true) updateStack();
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
        if(movedFlag == true) updateStack();
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
    public void newGame() throws IOException {
        for(int i = 0; i < 4; i++) 
            for (int j = 0; j < 4; j++) {
                gameBoard[i][j] = 0;
            }
        random();
        random();
        updateHighScore();
        setCurrentScore(0);
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
    public void setMovedFlag() {
        movedFlag = false;
    }
//------------------------------------------------------------------------------
    public boolean checkEmptySlot() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (gameBoard[i][j] == 0) return true;
        return false;
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
        return(canMove() == false && checkEmptySlot() == false);
    }
//------------------------------------------------------------------------------
    public boolean checkAbilityMoving(){
        if(x + 1 < 4 && gameBoard[x][y] == gameBoard[x+1][y]) return true; //Moving Up Case
        else if(x - 1 >= 0 && gameBoard[x][y] == gameBoard[x-1][y]) return true; //Moving Down Case
        else if(y + 1 < 4 && gameBoard[x][y] == gameBoard[x][y+1]) return true; //Moving Right Case
        else if(y - 1 >= 0 && gameBoard[x][y] == gameBoard[x][y-1]) return true; //Moving Left Case
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
        currentScore = (double) SStack.pop();
        for (int i = 0; i < 16; i++) {
            int tempV = (int) EStack.pop();
            int tempY = (int) EStack.pop();
            int tempX = (int) EStack.pop();
            gameBoard[tempX][tempY] = tempV; 
        }
    }
//------------------------------------------------------------------------------    
    public double getHighScore() {
        return highScore;
    }
//------------------------------------------------------------------------------   
    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }
//------------------------------------------------------------------------------    
    public double getCurrentScore() {
        return currentScore;
    }
//------------------------------------------------------------------------------    
    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }
//------------------------------------------------------------------------------
    public void updateHighScore() throws IOException {
        String[] store = new String[10];
        FileReader fr = new FileReader ("LeaderBoard.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int index=0;
        while((line = br.readLine())!= null) {
             String[] words = line.split("\\s");
             for (int i=0;i < words.length;i++) store[index++] = words[i];
	}
        setHighScore(Double.parseDouble(store[1]));
        fr.close();
        br.close();
    }
//------------------------------------------------------------------------------
    public void updateLeaderBoard() {
        int maxSize = 5;
        try {
            String[] store = new String[maxSize*2];
            String[] Name = new String[maxSize];
            double[] Score = new double[maxSize];
            FileReader fr = new FileReader ("LeaderBoard.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int index=0;
            
                while((line = br.readLine())!= null) {
                    String[] words = line.split("\\s");
                    for (int i=0;i < words.length;i++) store[index++] = words[i];
		}
                int indexName = 0, indexScore = 0;
                for (int i = 0;i < store.length;i++) {
                    if(i == 0) Name[indexName++] = store[0];
                    else {
                        if(i%2==0) Name[indexName++] = store[i];
			else Score[indexScore++] = Double.parseDouble(store[i]);
                    }
                }
                double playerScore = getCurrentScore();
                for (int i =0;i<Score.length;i++) {
                    if (playerScore >Score[i] && i+1 <Score.length) {	
			Score[i+1]=Score[i];
			Name[i+1]=Name[i];
			Score[i]=playerScore;
			Name[i]=playerName;
			playerScore=i;
                    }
                    if (playerScore < Score[i]) continue;
                    else {
			Score[i]=playerScore;
			Name[i]=playerName;
                    }
                }
		FileOutputStream out = new FileOutputStream("LeaderBoard.txt");
		PrintWriter pw = new PrintWriter(out);
		for(int i=0;i<Name.length;i++) pw.println(Name[i]+" " + Score[i]);
		pw.close();
		out.close();
            
        }
        catch (IOException e) {
            e.printStackTrace();
	}
    }
//------------------------------------------------------------------------------
    public void showLeaderBoard(JLabel top1, JLabel top2, JLabel top3, JLabel top4, JLabel top5) {
        try {
            String[] store = new String[10];
            FileReader fr = new FileReader ("LeaderBoard.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int index = 0;
            while((line=br.readLine())!=null) {
                String[] words=line.split("\\s");
                for (int i=0;i<words.length;i++) store[index++]=words[i];
            }
            top1.setText(store[0] + " " + store[1]);
            top2.setText(store[2] + " " + store[3]);
            top3.setText(store[4] + " " + store[5]);
            top4.setText(store[6] + " " + store[7]);
            top5.setText(store[8] + " " + store[9]);
        }
        catch (IOException e) {
            e.printStackTrace();
	}
    }
//------------------------------------------------------------------------------
    public void updateResumeData() throws FileNotFoundException, IOException {
        FileOutputStream out = new FileOutputStream("ResumeData.txt");
        PrintWriter pw = new PrintWriter(out);
        pw.print(playerName + " " + getCurrentScore() + " " );
        pw.println();
        for( int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                pw.print(gameBoard[i][j]+" ");
            }
            pw.println();
        }
        pw.close();
        out.close();
    }
//------------------------------------------------------------------------------
    public void resume() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader ("ResumeData.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int newmatrix[] = new int[16];
        int index=0;
        boolean flagName = false, flagScore = false;
        while((line=br.readLine())!=null) {
            String[] number=line.split("\\s");
            for(int j=0;j<number.length;j++) {
            if (!flagName) {
                playerName = number[0];
                flagName = true;
            }
            else if(!flagScore) {
                setCurrentScore(Double.parseDouble(number[1]));
                flagScore = true;
            }
            else newmatrix[index++]=Integer.parseInt(number[j]);
            }
        }
        int newindex=0;
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                gameBoard[i][j]=newmatrix[newindex++];
            }
        }
    }
//------------------------------------------------------------------------------    
}
