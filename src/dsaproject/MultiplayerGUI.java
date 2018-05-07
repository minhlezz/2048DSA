/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSAProject;

/**
 *
 * @author myPC
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MultiplayerGUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private boolean winnerFlag, winnerFlag2 = false;
    private Control game, game2;
    private static JButton [][] Element = new JButton[8][4];
    private String playerNameA, playerNameB;
    private int bo3 = 1;
    MenuGUI MenuGUI = new MenuGUI();
//------------------------------------------------------------------------------
    public MultiplayerGUI() {
        initComponents();
        playerNameA = "Minh";
        playerNameB = "Tin";
        game = new Control(playerNameA);
        game2 = new Control(playerNameB);
        setValueForArrayButton();
        game.newGame();
        //game.testColor();
        game2.newGame();
        //game2.testColor();
        Show(game);
        Show2(game2);
    }
//------------------------------------------------------------------------------
    public void display() {
        this.setTitle("[2048 GAME] [MULTIPLAYER MOD]");
        this.setVisible(true);
        this.toFront();
        this.requestFocus();
    }
//------------------------------------------------------------------------------
    public void resetValueBT(){
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                Element[i][j].setText(null);
                Element[i][j].setOpaque(false);
            }
        }    
    }
//------------------------------------------------------------------------------
    public void setValueForArrayButton(){
        Element[0][0] = Elem00;
        Element[0][1] = Elem01;
        Element[0][2] = Elem02;
        Element[0][3] = Elem03;
        Element[1][0] = Elem10;
        Element[1][1] = Elem11;
        Element[1][2] = Elem12;
        Element[1][3] = Elem13;
        Element[2][0] = Elem20;
        Element[2][1] = Elem21;
        Element[2][2] = Elem22;
        Element[2][3] = Elem23;
        Element[3][0] = Elem30;
        Element[3][1] = Elem31;
        Element[3][2] = Elem32;
        Element[3][3] = Elem33;
        Element[4][0] = Elem002;
        Element[4][1] = Elem012;
        Element[4][2] = Elem022;
        Element[4][3] = Elem032;
        Element[5][0] = Elem102;
        Element[5][1] = Elem112;
        Element[5][2] = Elem122;
        Element[5][3] = Elem132;
        Element[6][0] = Elem202;
        Element[6][1] = Elem212;
        Element[6][2] = Elem222;
        Element[6][3] = Elem232;
        Element[7][0] = Elem302;
        Element[7][1] = Elem312;
        Element[7][2] = Elem322;
        Element[7][3] = Elem332;
    }
//------------------------------------------------------------------------------
     public void Show(Control Obj){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(Obj.getValue(i,j) != 0 ){
                    switch (Obj.getValue(i,j)) {
                        case 2: { 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xEEE4DA));
                            Element[i][j].setForeground(Color.black);
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 4: {
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xEDE0C8));
                            Element[i][j].setForeground(Color.black);
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 8: {
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xF2B179));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 16: {
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xf59563));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 32: { 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xf67c5f));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 64:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xf65e3b));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 128:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedcf72));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 256:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedcc61));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 512:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedc850));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 1024:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedc53f));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 2048:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedc22e));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        default:{
                            if(Obj.getValue(i,j) > 2048){
                                Element[i][j].setFont(new java.awt.Font("Tahoma", 1, 12));
                            }
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setForeground(Color.white);
                            Element[i][j].setBackground(Color.black);
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                    }
                }else{
                    Element[i][j].setBackground(Color.white);
                    Element[i][j].setOpaque(true);
                    Element[i][j].setBorderPainted(false);
                }
            }
        }
        Score.setText("" + Obj.playerScore);
        nameA.setText("" + Obj.playerName);
    }
     
    public void Show2(Control Obj){
        for (int i = 4; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if(Obj.getValue(i-4,j) != 0 ){
                    switch (Obj.getValue(i-4,j)) {
                        case 2: { 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xEEE4DA));
                            Element[i][j].setForeground(Color.black);
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 4: {
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xEDE0C8));
                            Element[i][j].setForeground(Color.black);
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 8: {
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xF2B179));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 16: {
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xf59563));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 32: { 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xf67c5f));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 64:{ 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xf65e3b));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 128:{ 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xedcf72));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 256:{ 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xedcc61));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 512:{ 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xedc850));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 1024:{ 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xedc53f));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        case 2048:{ 
                            Element[i][j].setText(""+Obj.getValue(i-4,j));
                            Element[i][j].setBackground(new Color(0xedc22e));
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                        default:{
                            if(Obj.getValue(i-4,j) > 2048){
                                Element[i][j].setFont(new java.awt.Font("Tahoma", 1, 12));
                            }
                            Element[i][j].setText(""+ Obj.getValue(i-4,j));
                            Element[i][j].setForeground(Color.white);
                            Element[i][j].setBackground(Color.black);
                            Element[i][j].setOpaque(true);
                            Element[i][j].setBorderPainted(false);
                            break;
                        }
                    }
                }else{
                    Element[i][j].setBackground(Color.white);
                    Element[i][j].setOpaque(true);
                    Element[i][j].setBorderPainted(false);
                }
            }
        }
        Score2.setText("" + Obj.playerScore);
        nameB.setText("" + Obj.playerName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        Control = new javax.swing.JPanel();
        Elem00 = new javax.swing.JButton();
        Elem01 = new javax.swing.JButton();
        Elem02 = new javax.swing.JButton();
        Elem03 = new javax.swing.JButton();
        Elem10 = new javax.swing.JButton();
        Elem11 = new javax.swing.JButton();
        Elem12 = new javax.swing.JButton();
        Elem13 = new javax.swing.JButton();
        Elem20 = new javax.swing.JButton();
        Elem21 = new javax.swing.JButton();
        Elem22 = new javax.swing.JButton();
        Elem23 = new javax.swing.JButton();
        Elem30 = new javax.swing.JButton();
        Elem31 = new javax.swing.JButton();
        Elem32 = new javax.swing.JButton();
        Elem33 = new javax.swing.JButton();
        ScorePanel = new javax.swing.JPanel();
        TextScore = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        Score2 = new javax.swing.JLabel();
        nameA = new javax.swing.JLabel();
        nameB = new javax.swing.JLabel();
        TextVS = new javax.swing.JLabel();
        TipLabel = new javax.swing.JLabel();
        LogoPanel = new javax.swing.JPanel();
        Text2048 = new javax.swing.JLabel();
        MenuBT = new javax.swing.JButton();
        LeaderBT = new javax.swing.JButton();
        UndoBT = new javax.swing.JButton();
        restartBT = new javax.swing.JButton();
        Control2 = new javax.swing.JPanel();
        Elem002 = new javax.swing.JButton();
        Elem012 = new javax.swing.JButton();
        Elem022 = new javax.swing.JButton();
        Elem032 = new javax.swing.JButton();
        Elem102 = new javax.swing.JButton();
        Elem112 = new javax.swing.JButton();
        Elem122 = new javax.swing.JButton();
        Elem132 = new javax.swing.JButton();
        Elem202 = new javax.swing.JButton();
        Elem212 = new javax.swing.JButton();
        Elem222 = new javax.swing.JButton();
        Elem232 = new javax.swing.JButton();
        Elem302 = new javax.swing.JButton();
        Elem312 = new javax.swing.JButton();
        Elem322 = new javax.swing.JButton();
        Elem332 = new javax.swing.JButton();
        UndoBT2 = new javax.swing.JButton();
        restartBT2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        BGPanel.setBackground(new java.awt.Color(255, 255, 255));

        Control.setBackground(new java.awt.Color(102, 102, 102));
        Control.setForeground(new java.awt.Color(255, 255, 255));
        Control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ControlKeyPressed(evt);
            }
        });

        Elem00.setBackground(new java.awt.Color(204, 204, 204));
        Elem00.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem00.setForeground(new java.awt.Color(255, 255, 255));
        Elem00.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem01.setBackground(new java.awt.Color(204, 204, 204));
        Elem01.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem01.setForeground(new java.awt.Color(255, 255, 255));
        Elem01.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem02.setBackground(new java.awt.Color(204, 204, 204));
        Elem02.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem02.setForeground(new java.awt.Color(255, 255, 255));
        Elem02.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem03.setBackground(new java.awt.Color(204, 204, 204));
        Elem03.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem03.setForeground(new java.awt.Color(255, 255, 255));
        Elem03.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem10.setBackground(new java.awt.Color(204, 204, 204));
        Elem10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem10.setForeground(new java.awt.Color(255, 255, 255));
        Elem10.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem11.setBackground(new java.awt.Color(204, 204, 204));
        Elem11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem11.setForeground(new java.awt.Color(255, 255, 255));
        Elem11.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem12.setBackground(new java.awt.Color(204, 204, 204));
        Elem12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem12.setForeground(new java.awt.Color(255, 255, 255));
        Elem12.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem13.setBackground(new java.awt.Color(204, 204, 204));
        Elem13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem13.setForeground(new java.awt.Color(255, 255, 255));
        Elem13.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem20.setBackground(new java.awt.Color(204, 204, 204));
        Elem20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem20.setForeground(new java.awt.Color(255, 255, 255));
        Elem20.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem21.setBackground(new java.awt.Color(204, 204, 204));
        Elem21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem21.setForeground(new java.awt.Color(255, 255, 255));
        Elem21.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem22.setBackground(new java.awt.Color(204, 204, 204));
        Elem22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem22.setForeground(new java.awt.Color(255, 255, 255));
        Elem22.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem23.setBackground(new java.awt.Color(204, 204, 204));
        Elem23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem23.setForeground(new java.awt.Color(255, 255, 255));
        Elem23.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem30.setBackground(new java.awt.Color(204, 204, 204));
        Elem30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem30.setForeground(new java.awt.Color(255, 255, 255));
        Elem30.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem31.setBackground(new java.awt.Color(204, 204, 204));
        Elem31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem31.setForeground(new java.awt.Color(255, 255, 255));
        Elem31.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem32.setBackground(new java.awt.Color(204, 204, 204));
        Elem32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem32.setForeground(new java.awt.Color(255, 255, 255));
        Elem32.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem33.setBackground(new java.awt.Color(204, 204, 204));
        Elem33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem33.setForeground(new java.awt.Color(255, 255, 255));
        Elem33.setPreferredSize(new java.awt.Dimension(73, 23));

        javax.swing.GroupLayout ControlLayout = new javax.swing.GroupLayout(Control);
        Control.setLayout(ControlLayout);
        ControlLayout.setHorizontalGroup(
            ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem30, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem01, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem32, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem33, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ControlLayout.setVerticalGroup(
            ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlLayout.createSequentialGroup()
                        .addComponent(Elem03, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elem13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elem23, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elem33, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ControlLayout.createSequentialGroup()
                            .addComponent(Elem02, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Elem12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Elem22, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Elem32, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ControlLayout.createSequentialGroup()
                                .addComponent(Elem01, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem31, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ControlLayout.createSequentialGroup()
                                .addComponent(Elem00, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem30, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ScorePanel.setBackground(new java.awt.Color(239, 83, 80));
        ScorePanel.setPreferredSize(new java.awt.Dimension(86, 75));

        TextScore.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TextScore.setForeground(new java.awt.Color(255, 255, 255));
        TextScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextScore.setText("SCORE");
        TextScore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Score.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score.setText("0");
        Score.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Score2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Score2.setForeground(new java.awt.Color(255, 255, 255));
        Score2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score2.setText("0");
        Score2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameA.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        nameA.setForeground(new java.awt.Color(255, 255, 255));
        nameA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameA.setText("PlayerA");

        nameB.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        nameB.setForeground(new java.awt.Color(255, 255, 255));
        nameB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameB.setText("PlayerB");

        TextVS.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        TextVS.setForeground(new java.awt.Color(255, 255, 255));
        TextVS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextVS.setText("VS");

        javax.swing.GroupLayout ScorePanelLayout = new javax.swing.GroupLayout(ScorePanel);
        ScorePanel.setLayout(ScorePanelLayout);
        ScorePanelLayout.setHorizontalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ScorePanelLayout.createSequentialGroup()
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Score2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ScorePanelLayout.createSequentialGroup()
                .addComponent(nameA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextVS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(TextScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ScorePanelLayout.setVerticalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextScore, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Score2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TipLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TipLabel.setForeground(new java.awt.Color(102, 102, 102));
        TipLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TipLabel.setText("Button to move. 2 + 2 = 4. Reach 2048 first and You will win the match.");
        TipLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LogoPanel.setBackground(new java.awt.Color(231, 231, 9));

        Text2048.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        Text2048.setForeground(new java.awt.Color(255, 255, 255));
        Text2048.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text2048.setText("2048");
        Text2048.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout LogoPanelLayout = new javax.swing.GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Text2048, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        LogoPanelLayout.setVerticalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Text2048, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuBT.setBackground(new java.awt.Color(239, 83, 80));
        MenuBT.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        MenuBT.setText("MENU");
        MenuBT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBTActionPerformed(evt);
            }
        });

        LeaderBT.setBackground(new java.awt.Color(239, 83, 80));
        LeaderBT.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LeaderBT.setText("LEADER");
        LeaderBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderBTActionPerformed(evt);
            }
        });

        UndoBT.setBackground(new java.awt.Color(153, 153, 153));
        UndoBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DSAProject/undo-512.png"))); // NOI18N
        UndoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoBTActionPerformed(evt);
            }
        });

        restartBT.setBackground(new java.awt.Color(153, 153, 153));
        restartBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DSAProject/recycle-512.png"))); // NOI18N
        restartBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBTActionPerformed(evt);
            }
        });

        Control2.setBackground(new java.awt.Color(102, 102, 102));
        Control2.setForeground(new java.awt.Color(255, 255, 255));
        Control2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Control2KeyPressed(evt);
            }
        });

        Elem002.setBackground(new java.awt.Color(204, 204, 204));
        Elem002.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem002.setForeground(new java.awt.Color(255, 255, 255));
        Elem002.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem012.setBackground(new java.awt.Color(204, 204, 204));
        Elem012.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem012.setForeground(new java.awt.Color(255, 255, 255));
        Elem012.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem022.setBackground(new java.awt.Color(204, 204, 204));
        Elem022.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem022.setForeground(new java.awt.Color(255, 255, 255));
        Elem022.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem032.setBackground(new java.awt.Color(204, 204, 204));
        Elem032.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem032.setForeground(new java.awt.Color(255, 255, 255));
        Elem032.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem102.setBackground(new java.awt.Color(204, 204, 204));
        Elem102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem102.setForeground(new java.awt.Color(255, 255, 255));
        Elem102.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem112.setBackground(new java.awt.Color(204, 204, 204));
        Elem112.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem112.setForeground(new java.awt.Color(255, 255, 255));
        Elem112.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem122.setBackground(new java.awt.Color(204, 204, 204));
        Elem122.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem122.setForeground(new java.awt.Color(255, 255, 255));
        Elem122.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem132.setBackground(new java.awt.Color(204, 204, 204));
        Elem132.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem132.setForeground(new java.awt.Color(255, 255, 255));
        Elem132.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem202.setBackground(new java.awt.Color(204, 204, 204));
        Elem202.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem202.setForeground(new java.awt.Color(255, 255, 255));
        Elem202.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem212.setBackground(new java.awt.Color(204, 204, 204));
        Elem212.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem212.setForeground(new java.awt.Color(255, 255, 255));
        Elem212.setPreferredSize(new java.awt.Dimension(73, 23));
        Elem212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elem212ActionPerformed(evt);
            }
        });

        Elem222.setBackground(new java.awt.Color(204, 204, 204));
        Elem222.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem222.setForeground(new java.awt.Color(255, 255, 255));
        Elem222.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem232.setBackground(new java.awt.Color(204, 204, 204));
        Elem232.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem232.setForeground(new java.awt.Color(255, 255, 255));
        Elem232.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem302.setBackground(new java.awt.Color(204, 204, 204));
        Elem302.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem302.setForeground(new java.awt.Color(255, 255, 255));
        Elem302.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem312.setBackground(new java.awt.Color(204, 204, 204));
        Elem312.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem312.setForeground(new java.awt.Color(255, 255, 255));
        Elem312.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem322.setBackground(new java.awt.Color(204, 204, 204));
        Elem322.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem322.setForeground(new java.awt.Color(255, 255, 255));
        Elem322.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem332.setBackground(new java.awt.Color(204, 204, 204));
        Elem332.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem332.setForeground(new java.awt.Color(255, 255, 255));
        Elem332.setPreferredSize(new java.awt.Dimension(73, 23));

        javax.swing.GroupLayout Control2Layout = new javax.swing.GroupLayout(Control2);
        Control2.setLayout(Control2Layout);
        Control2Layout.setHorizontalGroup(
            Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Control2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem302, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem012, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem312, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem322, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem222, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem022, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elem332, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Elem132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem232, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elem032, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Control2Layout.setVerticalGroup(
            Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Control2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Control2Layout.createSequentialGroup()
                        .addComponent(Elem032, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elem132, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elem232, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elem332, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Control2Layout.createSequentialGroup()
                            .addComponent(Elem022, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Elem122, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Elem222, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Elem322, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Control2Layout.createSequentialGroup()
                                .addComponent(Elem012, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem112, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem212, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem312, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Control2Layout.createSequentialGroup()
                                .addComponent(Elem002, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem102, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem202, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Elem302, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UndoBT2.setBackground(new java.awt.Color(153, 153, 153));
        UndoBT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DSAProject/undo-512.png"))); // NOI18N
        UndoBT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoBT2ActionPerformed(evt);
            }
        });

        restartBT2.setBackground(new java.awt.Color(153, 153, 153));
        restartBT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DSAProject/recycle-512.png"))); // NOI18N
        restartBT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBT2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TipLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addComponent(Control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Control2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BGPanelLayout.createSequentialGroup()
                                .addComponent(UndoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(restartBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGPanelLayout.createSequentialGroup()
                                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LeaderBT, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(MenuBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(ScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                            .addGroup(BGPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UndoBT2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(restartBT2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addComponent(MenuBT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LeaderBT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UndoBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restartBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UndoBT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restartBT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Control2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restartBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBTActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Start a new game ??? \nYou will be losed this match \nAre You Sure ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            game.newGame();
            game2.newGame();
            resetValueBT();
            game2.playerScore +=1;
            Show(game);
            Show2(game2);
            this.requestFocus();
        }
    }//GEN-LAST:event_restartBTActionPerformed

    private void UndoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoBTActionPerformed
        if (game.getStackSize() == 0) {
            JOptionPane.showMessageDialog(this, "You can't undo anymore!!!");
            this.requestFocus();
        }
        else {
            game.Undo();
            //game.updateStack();
            resetValueBT();
            Show(game);
            this.requestFocus();
        }
    }//GEN-LAST:event_UndoBTActionPerformed

    private void LeaderBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderBTActionPerformed
        LeaderBoardGUI LeaderBoardGUI = new LeaderBoardGUI();
        LeaderBoardGUI.display();
        this.setVisible(false);
    }//GEN-LAST:event_LeaderBTActionPerformed

    private void MenuBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBTActionPerformed
        MenuGUI.display();
        this.dispose();
    }//GEN-LAST:event_MenuBTActionPerformed

    private void Elem212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elem212ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Elem212ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_W){
            game.pushUp();
        }else if(evt.getKeyCode() == KeyEvent.VK_S){
            game.pushDown();
        }else if(evt.getKeyCode() == KeyEvent.VK_D){
            game.pushRight();
        }else if(evt.getKeyCode() == KeyEvent.VK_A){
            game.pushLeft();
        }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            game2.pushUp();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            game2.pushDown();
        }else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            game2.pushRight();
        }else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            game2.pushLeft();
        }
        if (game.checkMoved()) game.random();
        if (game2.checkMoved()) game2.random();
        resetValueBT();
        Show(game);
        Show2(game2);
//------------------------------------------------------------------------------
        if(game.currentScore > 18432 && game.Winner()) {
            JOptionPane.showMessageDialog(this,"Match " +bo3+ ": "+ game.playerName+ " is Winner!!!");
            if(JOptionPane.showConfirmDialog(this, "Do you want to continue ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                MenuGUI.display();
                this.dispose();
            }
            else {
                game.newGame();
                game2.newGame();
                bo3++;
                game.playerScore += 1;
                resetValueBT();
                Show(game);
                Show2(game2);
                this.requestFocus();
            }
        }
        else if(game2.currentScore > 18432 && game2.Winner()) {
            JOptionPane.showMessageDialog(this,"Match " +bo3+ ": "+ game2.playerName+ " is Winner!!!");
            if(JOptionPane.showConfirmDialog(this, "Do you want to continue ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                MenuGUI.display();
                this.dispose();
            }
            else {
                game.newGame();
                game2.newGame();
                bo3++;
                game2.playerScore += 1;
                resetValueBT();
                Show(game);
                Show2(game2);
                this.requestFocus();
            }
        }
//------------------------------------------------------------------------------
        if (game.playerScore == 2) {
            JOptionPane.showMessageDialog(this, game.playerName + " WIN GAME!!!");
            bo3 = 1;
        }
        else if (game2.playerScore == 2) {
            JOptionPane.showMessageDialog(this, game2.playerName + " WIN GAME!!!");
            bo3 = 1;
        }
//------------------------------------------------------------------------------
        if(game.Loser()) {
            JOptionPane.showMessageDialog(this, "Loser!!!");
            if(JOptionPane.showConfirmDialog(this, "Do you want to play again ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                winnerFlag = false;
                game.newGame();
                resetValueBT(); //Reset Button Display Value
                Show(game);
            }
            else {
                MenuGUI.display();
                this.dispose();
            }
        } 
    }//GEN-LAST:event_formKeyPressed

    private void UndoBT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoBT2ActionPerformed
        if (game2.getStackSize() == 0) {
            JOptionPane.showMessageDialog(this, "You can't undo anymore!!!");
            this.requestFocus();
        }
        else {
            game2.Undo();
            //game.updateStack();
            resetValueBT();
            Show2(game2);
            this.requestFocus();
        }
    }//GEN-LAST:event_UndoBT2ActionPerformed

    private void restartBT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBT2ActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Start a new game ??? \nYou will be losed this match \nAre You Sure, " + game.playerName + " ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            game.newGame();
            game2.newGame();
            resetValueBT();
            game.playerScore += 1;
            Show(game);
            Show2(game2);
            this.requestFocus();
        }
    }//GEN-LAST:event_restartBT2ActionPerformed

    private void ControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ControlKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ControlKeyPressed

    private void Control2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Control2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Control2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MultiplayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiplayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiplayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiplayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiplayerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JPanel Control;
    private javax.swing.JPanel Control2;
    private javax.swing.JButton Elem00;
    private javax.swing.JButton Elem002;
    private javax.swing.JButton Elem01;
    private javax.swing.JButton Elem012;
    private javax.swing.JButton Elem02;
    private javax.swing.JButton Elem022;
    private javax.swing.JButton Elem03;
    private javax.swing.JButton Elem032;
    private javax.swing.JButton Elem10;
    private javax.swing.JButton Elem102;
    private javax.swing.JButton Elem11;
    private javax.swing.JButton Elem112;
    private javax.swing.JButton Elem12;
    private javax.swing.JButton Elem122;
    private javax.swing.JButton Elem13;
    private javax.swing.JButton Elem132;
    private javax.swing.JButton Elem20;
    private javax.swing.JButton Elem202;
    private javax.swing.JButton Elem21;
    private javax.swing.JButton Elem212;
    private javax.swing.JButton Elem22;
    private javax.swing.JButton Elem222;
    private javax.swing.JButton Elem23;
    private javax.swing.JButton Elem232;
    private javax.swing.JButton Elem30;
    private javax.swing.JButton Elem302;
    private javax.swing.JButton Elem31;
    private javax.swing.JButton Elem312;
    private javax.swing.JButton Elem32;
    private javax.swing.JButton Elem322;
    private javax.swing.JButton Elem33;
    private javax.swing.JButton Elem332;
    private javax.swing.JButton LeaderBT;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JButton MenuBT;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel Score2;
    private javax.swing.JPanel ScorePanel;
    private javax.swing.JLabel Text2048;
    private javax.swing.JLabel TextScore;
    private javax.swing.JLabel TextVS;
    private javax.swing.JLabel TipLabel;
    private javax.swing.JButton UndoBT;
    private javax.swing.JButton UndoBT2;
    private javax.swing.JLabel nameA;
    private javax.swing.JLabel nameB;
    private javax.swing.JButton restartBT;
    private javax.swing.JButton restartBT2;
    // End of variables declaration//GEN-END:variables
}
