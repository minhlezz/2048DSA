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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private boolean winnerFlag = false;
    private Control game;
    private static JButton [][] Element = new JButton[4][4];
    MenuGUI MenuGUI = new MenuGUI();
//------------------------------------------------------------------------------
    public MainGUI() {
        initComponents();
        game = new Control();
        setValueForArrayButton();
        game.newGame();
        //game.testColor();
        Show(game);
    }
//------------------------------------------------------------------------------
    public void display() {
        this.setTitle("[2048 GAME] [SINGLE MOD]");
        this.setVisible(true);
        this.toFront();
        this.requestFocus();
    }
//------------------------------------------------------------------------------
    public void resetValueBT(){
        for(int i=0; i<4; i++) 
            for (int j = 0; j < 4; j++) 
                Element[i][j].setText(null);
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
                         
                            break;
                        }
                        case 4: {
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xEDE0C8));
                            Element[i][j].setForeground(Color.black);
                      
                            break;
                        }
                        case 8: {
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xF2B179));
                          
                            break;
                        }
                        case 16: {
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xf59563));
                            
                            break;
                        }
                        case 32: { 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xf67c5f));
                            
                            break;
                        }
                        case 64:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xf65e3b));
                            
                            break;
                        }
                        case 128:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedcf72));
                            Element[i][j].setOpaque(true);
                            break;
                        }
                        case 256:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedcc61));
                       
                            break;
                        }
                        case 512:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedc850));
                          
                            break;
                        }
                        case 1024:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedc53f));
                       
                            break;
                        }
                        case 2048:{ 
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setBackground(new Color(0xedc22e));
                        
                            break;
                        }
                        default:{
                            if(Obj.getValue(i,j) > 2048){
                                Element[i][j].setFont(new java.awt.Font("Tahoma", 1, 12));
                            }
                            Element[i][j].setText(""+Obj.getValue(i,j));
                            Element[i][j].setForeground(Color.white);
                            Element[i][j].setBackground(Color.black);
                     
                            break;
                        }
                    }
                }else{
                    Element[i][j].setBackground(Color.white);
                  
                }
            }
        }
        Score.setText("" + Obj.currentScore);
        highScore.setText("" + Obj.highScore);
    }
//------------------------------------------------------------------------------
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
        BestPanel = new javax.swing.JPanel();
        TextBest = new javax.swing.JLabel();
        highScore = new javax.swing.JLabel();
        ScorePanel = new javax.swing.JPanel();
        TextScore = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        TipLabel = new javax.swing.JLabel();
        LogoPanel = new javax.swing.JPanel();
        Text2048 = new javax.swing.JLabel();
        MenuBT = new javax.swing.JButton();
        LeaderBT = new javax.swing.JButton();
        UndoBT = new javax.swing.JButton();
        restartBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        BGPanel.setBackground(new java.awt.Color(236, 240, 241));
        BGPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        Control.setBackground(new java.awt.Color(102, 102, 102));
        Control.setForeground(new java.awt.Color(255, 255, 255));

        Elem00.setBackground(new java.awt.Color(255, 255, 255));
        Elem00.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem00.setForeground(new java.awt.Color(255, 255, 255));
        Elem00.setPreferredSize(new java.awt.Dimension(73, 23));
        Elem00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elem00ActionPerformed(evt);
            }
        });

        Elem01.setBackground(new java.awt.Color(255, 255, 255));
        Elem01.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem01.setForeground(new java.awt.Color(255, 255, 255));
        Elem01.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem02.setBackground(new java.awt.Color(255, 255, 255));
        Elem02.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem02.setForeground(new java.awt.Color(255, 255, 255));
        Elem02.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem03.setBackground(new java.awt.Color(255, 255, 255));
        Elem03.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem03.setForeground(new java.awt.Color(255, 255, 255));
        Elem03.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem10.setBackground(new java.awt.Color(255, 255, 255));
        Elem10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem10.setForeground(new java.awt.Color(255, 255, 255));
        Elem10.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem11.setBackground(new java.awt.Color(255, 255, 255));
        Elem11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem11.setForeground(new java.awt.Color(255, 255, 255));
        Elem11.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem12.setBackground(new java.awt.Color(255, 255, 255));
        Elem12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem12.setForeground(new java.awt.Color(255, 255, 255));
        Elem12.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem13.setBackground(new java.awt.Color(255, 255, 255));
        Elem13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem13.setForeground(new java.awt.Color(255, 255, 255));
        Elem13.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem20.setBackground(new java.awt.Color(255, 255, 255));
        Elem20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem20.setForeground(new java.awt.Color(255, 255, 255));
        Elem20.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem21.setBackground(new java.awt.Color(255, 255, 255));
        Elem21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem21.setForeground(new java.awt.Color(255, 255, 255));
        Elem21.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem22.setBackground(new java.awt.Color(255, 255, 255));
        Elem22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem22.setForeground(new java.awt.Color(255, 255, 255));
        Elem22.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem23.setBackground(new java.awt.Color(255, 255, 255));
        Elem23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem23.setForeground(new java.awt.Color(255, 255, 255));
        Elem23.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem30.setBackground(new java.awt.Color(255, 255, 255));
        Elem30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem30.setForeground(new java.awt.Color(255, 255, 255));
        Elem30.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem31.setBackground(new java.awt.Color(255, 255, 255));
        Elem31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem31.setForeground(new java.awt.Color(255, 255, 255));
        Elem31.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem32.setBackground(new java.awt.Color(255, 255, 255));
        Elem32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Elem32.setForeground(new java.awt.Color(255, 255, 255));
        Elem32.setPreferredSize(new java.awt.Dimension(73, 23));

        Elem33.setBackground(new java.awt.Color(255, 255, 255));
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

        BestPanel.setBackground(new java.awt.Color(239, 83, 80));
        BestPanel.setPreferredSize(new java.awt.Dimension(89, 75));

        TextBest.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TextBest.setForeground(new java.awt.Color(255, 255, 255));
        TextBest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextBest.setText("BEST");
        TextBest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        highScore.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        highScore.setForeground(new java.awt.Color(255, 255, 255));
        highScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highScore.setText("0");
        highScore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BestPanelLayout = new javax.swing.GroupLayout(BestPanel);
        BestPanel.setLayout(BestPanelLayout);
        BestPanelLayout.setHorizontalGroup(
            BestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BestPanelLayout.createSequentialGroup()
                .addGroup(BestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(highScore, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextBest, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BestPanelLayout.setVerticalGroup(
            BestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BestPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextBest, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highScore)
                .addGap(16, 16, 16))
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

        javax.swing.GroupLayout ScorePanelLayout = new javax.swing.GroupLayout(ScorePanel);
        ScorePanel.setLayout(ScorePanelLayout);
        ScorePanelLayout.setHorizontalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ScorePanelLayout.setVerticalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextScore, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TipLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TipLabel.setForeground(new java.awt.Color(102, 102, 102));
        TipLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TipLabel.setText("Button to move. 2 + 2 = 4. Reach 2048.");
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
            .addComponent(Text2048, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
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

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                        .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(MenuBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LeaderBT, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(BestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                                .addComponent(restartBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UndoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(ScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MenuBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LeaderBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UndoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restartBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(Control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            game.pushUp();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            game.pushDown();
        }else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            game.pushRight();
        }else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            game.pushLeft();
            
        }
        if (game.checkMoved()) game.random();
        resetValueBT();
        Show(game);
//------------------------------------------------------------------------------
        if(game.currentScore > 18432 && game.Winner() && !winnerFlag) {
            JOptionPane.showMessageDialog(this,"Winner!!!");
            if(JOptionPane.showConfirmDialog(this, "Do you want to continue ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                MenuGUI.display();
                this.dispose();
            }
            else {
                winnerFlag = true;
            }
        }
//------------------------------------------------------------------------------        
        if(game.Loser()) {
            JOptionPane.showMessageDialog(this, "Loser!!!");
            if(JOptionPane.showConfirmDialog(this, "Do you want to play again ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                winnerFlag = false;
                game.newGame();
                resetValueBT();
                Show(game);
            }
            else {
                MenuGUI.display();
                this.dispose();
            }
        }
    }//GEN-LAST:event_formKeyPressed
//------------------------------------------------------------------------------
    private void LeaderBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderBTActionPerformed
        LeaderBoardGUI LeaderBoardGUI = new LeaderBoardGUI();
        LeaderBoardGUI.display();
        this.setVisible(false);
    }//GEN-LAST:event_LeaderBTActionPerformed
//------------------------------------------------------------------------------
    private void MenuBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBTActionPerformed
        MenuGUI.display();
        this.dispose();
    }//GEN-LAST:event_MenuBTActionPerformed

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

    private void restartBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBTActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Start a new game ??? \nAre You Sure ???", "Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            game.newGame();
            resetValueBT();
            Show(game);
            this.requestFocus();
        }
    }//GEN-LAST:event_restartBTActionPerformed

    private void Elem00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elem00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Elem00ActionPerformed
//------------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JPanel BestPanel;
    private javax.swing.JPanel Control;
    private javax.swing.JButton Elem00;
    private javax.swing.JButton Elem01;
    private javax.swing.JButton Elem02;
    private javax.swing.JButton Elem03;
    private javax.swing.JButton Elem10;
    private javax.swing.JButton Elem11;
    private javax.swing.JButton Elem12;
    private javax.swing.JButton Elem13;
    private javax.swing.JButton Elem20;
    private javax.swing.JButton Elem21;
    private javax.swing.JButton Elem22;
    private javax.swing.JButton Elem23;
    private javax.swing.JButton Elem30;
    private javax.swing.JButton Elem31;
    private javax.swing.JButton Elem32;
    private javax.swing.JButton Elem33;
    private javax.swing.JButton LeaderBT;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JButton MenuBT;
    private javax.swing.JLabel Score;
    private javax.swing.JPanel ScorePanel;
    private javax.swing.JLabel Text2048;
    private javax.swing.JLabel TextBest;
    private javax.swing.JLabel TextScore;
    private javax.swing.JLabel TipLabel;
    private javax.swing.JButton UndoBT;
    private javax.swing.JLabel highScore;
    private javax.swing.JButton restartBT;
    // End of variables declaration//GEN-END:variables
}
