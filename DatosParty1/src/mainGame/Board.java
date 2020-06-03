package mainGame;

import java.util.Random;

public class Board extends javax.swing.JFrame {

    private int rightDice;
    private int leftDice;
    private int playerPlaying = 0;

    public Board() {

        initComponents();
        configComponents();
        playersInformation();
        
    }

    private void configComponents() {
        
        this.setLocationRelativeTo(null);
        
        lblTokenPlayer3.setVisible(false);
        lblTokenPlayer4.setVisible(false);
        
        coinImage3.setVisible(false);
        coinImage4.setVisible(false);
        startImage3.setVisible(false);
        startImage4.setVisible(false);
        
        activeCoinsPlayer3.setVisible(false);
        activeCoinsPlayer4.setVisible(false);
        activeStarsPlayer3.setVisible(false);
        activeStarsPlayer4.setVisible(false);
        
        if (Window.player3Active == true && Window.player4Active == false) {
        
            lblTokenPlayer3.setVisible(true);
            coinImage3.setVisible(true);
            startImage3.setVisible(true);
            leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/leaderboard3.png")));
            
            activeCoinsPlayer3.setVisible(true);
            activeStarsPlayer3.setVisible(true);
        
        } else if (Window.player3Active == true && Window.player4Active == true) {
            
            lblTokenPlayer3.setVisible(true);
            coinImage3.setVisible(true);
            startImage3.setVisible(true);
            
            lblTokenPlayer4.setVisible(true);
            coinImage4.setVisible(true);
            startImage4.setVisible(true);
            leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/leaderboard4.png")));
            
            activeCoinsPlayer3.setVisible(true);
            activeCoinsPlayer4.setVisible(true);
            activeStarsPlayer3.setVisible(true);
            activeStarsPlayer4.setVisible(true);
            
        }
        
    }

    private void playersInformation() {

        switch (Window.players.size()) {
            
            case 2:

                namePlayer1.setText(Window.players.get(0).getName());
                namePlayer2.setText(Window.players.get(1).getName());
                updateLeaderboard();

                break;
                
            case 3:
                
                namePlayer1.setText(Window.players.get(0).getName());
                namePlayer2.setText(Window.players.get(1).getName());
                namePlayer3.setText(Window.players.get(2).getName());
                updateLeaderboard();

                break;
                
            case 4:
                
                namePlayer1.setText(Window.players.get(0).getName());
                namePlayer2.setText(Window.players.get(1).getName());
                namePlayer3.setText(Window.players.get(2).getName());
                namePlayer4.setText(Window.players.get(3).getName());
                updateLeaderboard();

                break;
                
            default:
                
                break;
        }
        
    }

    private void updateLeaderboard() {

        switch (Window.players.size()) {
                                    
            case 2:

                activeCoinsPlayer1.setText(String.valueOf(Window.players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(Window.players.get(1).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(Window.players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(Window.players.get(1).getStars()));

                break;
                
            case 3:

                activeCoinsPlayer1.setText(String.valueOf(Window.players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(Window.players.get(1).getCoins()));
                activeCoinsPlayer3.setText(String.valueOf(Window.players.get(2).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(Window.players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(Window.players.get(1).getStars()));
                activeStarsPlayer3.setText(String.valueOf(Window.players.get(2).getStars()));
                
                break;
                
            case 4:

                activeCoinsPlayer1.setText(String.valueOf(Window.players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(Window.players.get(1).getCoins()));
                activeCoinsPlayer3.setText(String.valueOf(Window.players.get(2).getCoins()));
                activeCoinsPlayer4.setText(String.valueOf(Window.players.get(3).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(Window.players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(Window.players.get(1).getStars()));
                activeStarsPlayer3.setText(String.valueOf(Window.players.get(2).getStars()));
                activeStarsPlayer4.setText(String.valueOf(Window.players.get(3).getStars()));
                
                break;
                
            default:
                
                break;
                
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new mainGame.BoardBackground();
        btnRollDices = new javax.swing.JButton();
        lblRightDice = new javax.swing.JLabel();
        lblLeftDice = new javax.swing.JLabel();
        diceBackground = new javax.swing.JLabel();
        lblTokenPlayer1 = new javax.swing.JLabel();
        lblTokenPlayer2 = new javax.swing.JLabel();
        lblTokenPlayer3 = new javax.swing.JLabel();
        lblTokenPlayer4 = new javax.swing.JLabel();
        namePlayer1 = new javax.swing.JLabel();
        namePlayer2 = new javax.swing.JLabel();
        namePlayer3 = new javax.swing.JLabel();
        namePlayer4 = new javax.swing.JLabel();
        startImage1 = new javax.swing.JLabel();
        startImage2 = new javax.swing.JLabel();
        startImage3 = new javax.swing.JLabel();
        startImage4 = new javax.swing.JLabel();
        coinImage1 = new javax.swing.JLabel();
        coinImage2 = new javax.swing.JLabel();
        coinImage3 = new javax.swing.JLabel();
        coinImage4 = new javax.swing.JLabel();
        activeCoinsPlayer1 = new javax.swing.JTextField();
        activeCoinsPlayer4 = new javax.swing.JTextField();
        activeCoinsPlayer3 = new javax.swing.JTextField();
        activeCoinsPlayer2 = new javax.swing.JTextField();
        activeStarsPlayer1 = new javax.swing.JTextField();
        activeStarsPlayer2 = new javax.swing.JTextField();
        activeStarsPlayer3 = new javax.swing.JTextField();
        activeStarsPlayer4 = new javax.swing.JTextField();
        leaderboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Party 1");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRollDices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/clickhere.png"))); // NOI18N
        btnRollDices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollDicesActionPerformed(evt);
            }
        });
        panel.add(btnRollDices, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, -1));

        lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 1.png"))); // NOI18N
        panel.add(lblRightDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, -1, -1));

        lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 1.png"))); // NOI18N
        panel.add(lblLeftDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, -1, -1));

        diceBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/rollDices.png"))); // NOI18N
        panel.add(diceBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 390, 180));

        lblTokenPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player1.png"))); // NOI18N
        panel.add(lblTokenPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 612, -1, -1));

        lblTokenPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player2.png"))); // NOI18N
        panel.add(lblTokenPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 612, -1, -1));

        lblTokenPlayer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player3.png"))); // NOI18N
        panel.add(lblTokenPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 640, -1, -1));

        lblTokenPlayer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player4.png"))); // NOI18N
        panel.add(lblTokenPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 640, -1, -1));

        namePlayer1.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer1.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 100, 30));

        namePlayer2.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer2.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 100, 30));

        namePlayer3.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer3.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 100, 30));

        namePlayer4.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer4.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 100, 30));

        startImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 30, 30));

        startImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 30, 30));

        startImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, 30, 30));

        startImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 30, 30));

        coinImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        coinImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        coinImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, -1));

        coinImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, -1, -1));

        activeCoinsPlayer1.setEditable(false);
        activeCoinsPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer1.setText("100");
        activeCoinsPlayer1.setBorder(null);
        panel.add(activeCoinsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        activeCoinsPlayer4.setEditable(false);
        activeCoinsPlayer4.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer4.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer4.setText("100");
        activeCoinsPlayer4.setBorder(null);
        panel.add(activeCoinsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, -1, -1));

        activeCoinsPlayer3.setEditable(false);
        activeCoinsPlayer3.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer3.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer3.setText("100");
        activeCoinsPlayer3.setBorder(null);
        panel.add(activeCoinsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        activeCoinsPlayer2.setEditable(false);
        activeCoinsPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer2.setText("100");
        activeCoinsPlayer2.setBorder(null);
        panel.add(activeCoinsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        activeStarsPlayer1.setEditable(false);
        activeStarsPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer1.setText("0");
        activeStarsPlayer1.setBorder(null);
        panel.add(activeStarsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, -1, -1));

        activeStarsPlayer2.setEditable(false);
        activeStarsPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer2.setText("0");
        activeStarsPlayer2.setBorder(null);
        panel.add(activeStarsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, -1, -1));

        activeStarsPlayer3.setEditable(false);
        activeStarsPlayer3.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer3.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer3.setText("0");
        activeStarsPlayer3.setBorder(null);
        panel.add(activeStarsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, -1, -1));

        activeStarsPlayer4.setEditable(false);
        activeStarsPlayer4.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer4.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer4.setText("0");
        activeStarsPlayer4.setBorder(null);
        panel.add(activeStarsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, -1, -1));

        leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/leaderboard4.png"))); // NOI18N
        panel.add(leaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRollDicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollDicesActionPerformed
        
        checkPlayerPlaying();
        
        rightDice = new Random().nextInt(6) + 1;
        leftDice = new Random().nextInt(6) + 1;
                
        randomRightDice(rightDice);
        randomLeftDice(leftDice);
        
        Player actualPlayer = Window.players.get(playerPlaying);
        
        int moveToCell = actualPlayer.getCell() + rightDice + leftDice;
        
        if (moveToCell > 37) {
            
            moveToCell -= 38;
                        
        }
        
        actualPlayer.setCell(moveToCell);
        
        int x = Window.principal.findXLocation(moveToCell);
        int y = Window.principal.findYLocation(moveToCell);
                        
        if (playerPlaying == 0) {       
                        
            moveToken(0, x, y);        
                                              
        } else if (playerPlaying == 1) {
        
            moveToken(1, x, y);
            
        } else if (playerPlaying == 2) {
            
            moveToken(2, x, y);
            
        } else {
            
            moveToken(3, x, y);
            
        }
        
        actionCell(moveToCell);
        
        playerPlaying++;
                
    }//GEN-LAST:event_btnRollDicesActionPerformed

    private void randomRightDice(int dice) {
                
        if (dice == 1) {
            
            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice1.png")));
            
        } else if (dice == 2) {
            
            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice2.png")));

        } else if (dice == 3) {
            
            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice3.png")));

        } else if (dice == 4) {
            
            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice4.png")));

        } else if (dice == 5) {
            
            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice5.png")));

        } else if (dice == 6) {
            
            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice6.png")));
            
        }
        
    }
    
    public void randomLeftDice(int dice) {
                
        if (dice == 1) {
            
            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice1.png")));
            
        } else if (dice == 2) {
            
            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice2.png")));

        } else if (dice == 3) {
            
            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice3.png")));

        } else if (dice == 4) {
            
            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice4.png")));

        } else if (dice == 5) {
            
            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice5.png")));

        } else if (dice == 6) {
            
            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice6.png")));

        }
                
    }
    
    private void moveToken(int playerToken, int x, int y) {
        
        if (x != -1 && y != -1) {
    
            if (playerToken == 0) {

                lblTokenPlayer1.setLocation(x, y);

            } else if (playerToken == 1) {
            
                lblTokenPlayer2.setLocation(x + 29, y);
                
            } else if (playerToken == 2) {
            
                lblTokenPlayer3.setLocation(x, y + 28);
                
            } else {
            
                lblTokenPlayer4.setLocation(x + 29, y + 29);
            
            }

        } else {
                               
            // validar caso en el que la ficha no esté en el board principal
            // Recordar que si el metodo retorna un -1, quiere decir que el jugador no esta en ese tablero especifico
                
        }
        
    }
    
    private void checkPlayerPlaying() {
        
        if (Window.player3Active == false && Window.player4Active == false) {
            
            if (playerPlaying > 1) {
            
            playerPlaying = 0;
            
            }
            
        } else if(Window.player3Active == true && Window.player4Active == false) {
            
            if (playerPlaying > 2) {
            
            playerPlaying = 0;
            
            }
            
        } else if(Window.player3Active == true && Window.player4Active == true) {
            
            if (playerPlaying > 3) {
            
            playerPlaying = 0;
            
            }
            
        }
              
    }
    
    private void actionCell(int cellNumber) {
        
        Player player = Window.players.get(playerPlaying);
        String color = Window.principal.findColor(cellNumber);
        int actualCoins = player.getCoins(); 
                
        if (color == "green") {
                           
            player.setCoins(actualCoins + 10);
            updateCoins();
                                    
        } else if (color == "red") {
                    
            player.setCoins(actualCoins - 10);
            updateCoins();
            
        } else if (color == "yellow") {
            
            eventCellAction();
            
        }       
        
    }    
    
    private void updateCoins() {
        
        String actualCoins = String.valueOf(Window.players.get(playerPlaying).getCoins());
        
        if (playerPlaying == 0) {
            
            activeCoinsPlayer1.setText(actualCoins);
            
        } else if (playerPlaying == 1) {
            
            activeCoinsPlayer2.setText(actualCoins);
            
        } else if (playerPlaying == 2) {
            
            activeCoinsPlayer3.setText(actualCoins);
            
        } else if (playerPlaying == 3) {
            
            activeCoinsPlayer4.setText(actualCoins);
            
        }               
        
    }
    
    private void eventCellAction() {
        
        System.out.println("event");
                
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeCoinsPlayer1;
    private javax.swing.JTextField activeCoinsPlayer2;
    private javax.swing.JTextField activeCoinsPlayer3;
    private javax.swing.JTextField activeCoinsPlayer4;
    private javax.swing.JTextField activeStarsPlayer1;
    private javax.swing.JTextField activeStarsPlayer2;
    private javax.swing.JTextField activeStarsPlayer3;
    private javax.swing.JTextField activeStarsPlayer4;
    private javax.swing.JButton btnRollDices;
    private javax.swing.JLabel coinImage1;
    private javax.swing.JLabel coinImage2;
    private javax.swing.JLabel coinImage3;
    private javax.swing.JLabel coinImage4;
    private javax.swing.JLabel diceBackground;
    private javax.swing.JLabel lblLeftDice;
    private javax.swing.JLabel lblRightDice;
    private javax.swing.JLabel lblTokenPlayer1;
    private javax.swing.JLabel lblTokenPlayer2;
    private javax.swing.JLabel lblTokenPlayer3;
    private javax.swing.JLabel lblTokenPlayer4;
    private javax.swing.JLabel leaderboard;
    private javax.swing.JLabel namePlayer1;
    private javax.swing.JLabel namePlayer2;
    private javax.swing.JLabel namePlayer3;
    private javax.swing.JLabel namePlayer4;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel startImage1;
    private javax.swing.JLabel startImage2;
    private javax.swing.JLabel startImage3;
    private javax.swing.JLabel startImage4;
    // End of variables declaration//GEN-END:variables
}
