package games.TicTacToe.game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import mainGame.Board;

public class TicTacToe extends javax.swing.JFrame {

    public int pointsPlayer1, pointsPlayer2, pointsPlayer3, pointsPlayer4, round = 0;
    public ArrayList<Integer> playerPoints = new ArrayList<Integer>();
    private final int firstPlace = 100, secondPlace = 75, thirdPlace = 50, lastPlace = 25;
    public int option = Board.players.size();

    String turn = "X";
    String nextGame = "O";
    JLabel boxes[] = new JLabel[9];
    int victories[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};
    boolean available = true;

    public TicTacToe() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        configComponents();
        lblWinner.setVisible(false);

        boxes[0] = box1;
        boxes[1] = box2;
        boxes[2] = box3;
        boxes[3] = box4;
        boxes[4] = box5;
        boxes[5] = box6;
        boxes[6] = box7;
        boxes[7] = box8;
        boxes[8] = box9;

    }

    private void configComponents() {
        nextButton.setEnabled(false);
        switch (option) {
            case 2:
                playerPoints1.setVisible(true);
                activePoints1.setVisible(true);
                playerPoints2.setVisible(true);
                activePoints2.setVisible(true);
                playerPoints3.setVisible(false);
                activePoints3.setVisible(false);
                playerPoints4.setVisible(false);
                activePoints4.setVisible(false);
                break;
            case 3:
                playerPoints1.setVisible(true);
                activePoints1.setVisible(true);
                playerPoints2.setVisible(true);
                activePoints2.setVisible(true);
                playerPoints3.setVisible(true);
                activePoints3.setVisible(true);
                playerPoints4.setVisible(false);
                activePoints4.setVisible(false);
                break;
            case 4:
                playerPoints1.setVisible(true);
                activePoints1.setVisible(true);
                playerPoints2.setVisible(true);
                activePoints2.setVisible(true);
                playerPoints3.setVisible(true);
                activePoints3.setVisible(true);
                playerPoints4.setVisible(true);
                activePoints4.setVisible(true);
                break;
            default:
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        box1 = new javax.swing.JLabel();
        box2 = new javax.swing.JLabel();
        box3 = new javax.swing.JLabel();
        box4 = new javax.swing.JLabel();
        box5 = new javax.swing.JLabel();
        box6 = new javax.swing.JLabel();
        box7 = new javax.swing.JLabel();
        box8 = new javax.swing.JLabel();
        box9 = new javax.swing.JLabel();
        btnNextGame = new javax.swing.JButton();
        btnInstructions = new javax.swing.JButton();
        lblTurn = new javax.swing.JLabel();
        lblScoreX = new javax.swing.JLabel();
        lblPointsX = new javax.swing.JLabel();
        lblScoreO = new javax.swing.JLabel();
        lblPointsO = new javax.swing.JLabel();
        lblWinner = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        playerPoints1 = new javax.swing.JLabel();
        activePoints1 = new javax.swing.JLabel();
        playerPoints2 = new javax.swing.JLabel();
        activePoints2 = new javax.swing.JLabel();
        playerPoints3 = new javax.swing.JLabel();
        activePoints3 = new javax.swing.JLabel();
        playerPoints4 = new javax.swing.JLabel();
        activePoints4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(353, 605));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        box1.setBackground(new java.awt.Color(255, 255, 255));
        box1.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box1.setOpaque(true);
        box1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box1MousePressed(evt);
            }
        });

        box2.setBackground(new java.awt.Color(255, 255, 255));
        box2.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box2.setOpaque(true);
        box2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box2MousePressed(evt);
            }
        });

        box3.setBackground(new java.awt.Color(255, 255, 255));
        box3.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box3.setOpaque(true);
        box3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box3MousePressed(evt);
            }
        });

        box4.setBackground(new java.awt.Color(255, 255, 255));
        box4.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box4.setOpaque(true);
        box4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box4MousePressed(evt);
            }
        });

        box5.setBackground(new java.awt.Color(255, 255, 255));
        box5.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box5.setOpaque(true);
        box5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box5MousePressed(evt);
            }
        });

        box6.setBackground(new java.awt.Color(255, 255, 255));
        box6.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box6.setOpaque(true);
        box6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box6MousePressed(evt);
            }
        });

        box7.setBackground(new java.awt.Color(255, 255, 255));
        box7.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box7.setToolTipText("");
        box7.setOpaque(true);
        box7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box7MousePressed(evt);
            }
        });

        box8.setBackground(new java.awt.Color(255, 255, 255));
        box8.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box8.setOpaque(true);
        box8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box8MousePressed(evt);
            }
        });

        box9.setBackground(new java.awt.Color(255, 255, 255));
        box9.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        box9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box9.setOpaque(true);
        box9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                box9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(111, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 123, 305, -1));

        btnNextGame.setBackground(new java.awt.Color(0, 255, 204));
        btnNextGame.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnNextGame.setText(" Check player ");
        btnNextGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnNextGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 350, -1));

        btnInstructions.setBackground(new java.awt.Color(0, 255, 204));
        btnInstructions.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnInstructions.setText("Instrucciones");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });
        jPanel1.add(btnInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, 40));

        lblTurn.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        lblTurn.setText("Turno de X");
        jPanel1.add(lblTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, -1, -1));

        lblScoreX.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblScoreX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreX.setText("X = ");
        jPanel1.add(lblScoreX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        lblPointsX.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPointsX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointsX.setText("0");
        jPanel1.add(lblPointsX, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, -1, -1));

        lblScoreO.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblScoreO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreO.setText("O = ");
        jPanel1.add(lblScoreO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, -1, -1));

        lblPointsO.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPointsO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointsO.setText("0");
        jPanel1.add(lblPointsO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, -1, -1));

        lblWinner.setFont(new java.awt.Font("Dialog", 1, 39)); // NOI18N
        lblWinner.setText("El ganador es: X");
        jPanel1.add(lblWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, -1));

        startButton.setBackground(new java.awt.Color(0, 255, 204));
        startButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel1.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        nextButton.setBackground(new java.awt.Color(0, 255, 204));
        nextButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        nextButton.setText("Next Player");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 40));

        exitButton.setBackground(new java.awt.Color(0, 255, 204));
        exitButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 180, 40));

        playerPoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints1.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints1.setText("Puntos jugador 1:");
        jPanel1.add(playerPoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, 20));

        activePoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activePoints1.setForeground(new java.awt.Color(0, 0, 0));
        activePoints1.setText("0");
        jPanel1.add(activePoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 50, -1));

        playerPoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints2.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints2.setText("Puntos jugador 2:");
        jPanel1.add(playerPoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 180, 20));

        activePoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activePoints2.setForeground(new java.awt.Color(0, 0, 0));
        activePoints2.setText("0");
        jPanel1.add(activePoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 50, -1));

        playerPoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints3.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints3.setText("Puntos jugador 3:");
        jPanel1.add(playerPoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 180, 30));

        activePoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activePoints3.setForeground(new java.awt.Color(0, 0, 0));
        activePoints3.setText("0");
        jPanel1.add(activePoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 50, 20));

        playerPoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints4.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints4.setText("Puntos jugador 4:");
        jPanel1.add(playerPoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 180, -1));

        activePoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activePoints4.setForeground(new java.awt.Color(0, 0, 0));
        activePoints4.setText("0");
        jPanel1.add(activePoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void updatePlayersPoints() {
        switch (option) {
            case 2:

                if (round == 1) {

                    pointsPlayer1++;
                    activePoints1.setText("" + pointsPlayer1);

                } else if (round == 2) {

                    pointsPlayer2++;
                    activePoints2.setText("" + pointsPlayer2);

                }
                break;
            case 3:
                switch (round) {
                    case 1:
                        pointsPlayer1++;
                        activePoints1.setText("" + pointsPlayer1);
                        break;
                    case 2:
                        pointsPlayer2++;
                        activePoints2.setText("" + pointsPlayer2);
                        break;
                    case 3:
                        pointsPlayer3++;
                        activePoints3.setText("" + pointsPlayer3);
                        break;
                    default:
                        break;
                }
                break;

            case 4:
                switch (round) {
                    case 1:
                        pointsPlayer1++;
                        activePoints1.setText("" + pointsPlayer1);
                        break;
                    case 2:
                        pointsPlayer2++;
                        activePoints2.setText("" + pointsPlayer2);
                        break;
                    case 3:
                        pointsPlayer3++;
                        activePoints3.setText("" + pointsPlayer3);
                        break;
                    case 4:
                        pointsPlayer4++;
                        activePoints4.setText("" + pointsPlayer4);
                        break;
                    default:
                        break;
                }
                break;

            default:
                break;
        }

    }

    public int getPlayer1Place() {
        int index = 0;
        if (playerPoints.get(0) == (Integer.parseInt(activePoints1.getText()))) {

            index = 0;
        } else if (playerPoints.get(1) == (Integer.parseInt(activePoints1.getText()))) {

            index = 1;
        } else if (playerPoints.get(2) == (Integer.parseInt(activePoints1.getText()))) {

            index = 2;
        } else if (playerPoints.get(3) == (Integer.parseInt(activePoints1.getText()))) {

            index = 3;
        }

        return index;
    }

    public int getPlayer2Place() {
        int index = 0;
        if (playerPoints.get(0) == (Integer.parseInt(activePoints2.getText()))) {

            index = 0;
        } else if (playerPoints.get(1) == (Integer.parseInt(activePoints2.getText()))) {

            index = 1;
        } else if (playerPoints.get(2) == (Integer.parseInt(activePoints2.getText()))) {

            index = 2;
        } else if (playerPoints.get(3) == (Integer.parseInt(activePoints2.getText()))) {

            index = 3;
        }

        return index;

    }

    public int getPlayer3Place() {
        int index = 0;

        if (playerPoints.get(0) == (Integer.parseInt(activePoints3.getText()))) {

            index = 0;
        } else if (playerPoints.get(1) == (Integer.parseInt(activePoints3.getText()))) {

            index = 1;
        } else if (playerPoints.get(2) == (Integer.parseInt(activePoints3.getText()))) {

            index = 2;
        } else if (playerPoints.get(3) == (Integer.parseInt(activePoints3.getText()))) {

            index = 3;
        }

        return index;

    }

    public int getPlayer4Place() {
        int index = 0;

        if (playerPoints.get(0) == (Integer.parseInt(activePoints4.getText()))) {

            index = 0;
        } else if (playerPoints.get(1) == (Integer.parseInt(activePoints4.getText()))) {

            index = 1;
        } else if (playerPoints.get(2) == (Integer.parseInt(activePoints4.getText()))) {

            index = 2;
        } else if (playerPoints.get(3) == (Integer.parseInt(activePoints4.getText()))) {

            index = 3;
        }

        return index;
    }

    public void sendPlayer1Coins() {
        switch (getPlayer1Place()) {
            case 0:
                Board.players.get(0).setCoins((Board.players.get(0).getCoins()) + firstPlace);
                break;
            case 1:
                Board.players.get(0).setCoins(Board.players.get(0).getCoins() + secondPlace);
                break;
            case 2:
                Board.players.get(0).setCoins(Board.players.get(0).getCoins() + thirdPlace);
                break;
            case 3:
                Board.players.get(0).setCoins(Board.players.get(0).getCoins() + lastPlace);
                break;
            default:
                break;
        }

    }

    public void sendPlayer2Coins() {
        switch (getPlayer2Place()) {
            case 0:
                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + firstPlace);
                break;
            case 1:
                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + secondPlace);
                break;
            case 2:
                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + thirdPlace);
                break;
            case 3:
                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + lastPlace);
                break;
            default:
                break;
        }

    }

    public void sendPlayer3Coins() {
        switch (getPlayer3Place()) {
            case 0:
                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + firstPlace);
                break;
            case 1:
                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + secondPlace);
                break;
            case 2:
                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + thirdPlace);
                break;
            case 3:
                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + lastPlace);
                break;
            default:
                break;
        }

    }

    public void sendPlayer4Coins() {
        switch (getPlayer4Place()) {
            case 0:
                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + firstPlace);
                break;
            case 1:
                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + secondPlace);
                break;
            case 2:
                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + thirdPlace);
                break;
            case 3:
                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + lastPlace);
                break;
            default:
                break;
        }

    }
    private void box1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1MousePressed

        press(1);

    }//GEN-LAST:event_box1MousePressed

    private void box2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2MousePressed

        press(2);

    }//GEN-LAST:event_box2MousePressed

    private void box4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box4MousePressed

        press(4);

    }//GEN-LAST:event_box4MousePressed

    private void box3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box3MousePressed

        press(3);

    }//GEN-LAST:event_box3MousePressed

    private void box5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box5MousePressed

        press(5);

    }//GEN-LAST:event_box5MousePressed

    private void box6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box6MousePressed

        press(6);

    }//GEN-LAST:event_box6MousePressed

    private void box8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box8MousePressed

        press(8);

    }//GEN-LAST:event_box8MousePressed

    private void box7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box7MousePressed

        press(7);

    }//GEN-LAST:event_box7MousePressed

    private void box9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box9MousePressed

        press(9);

    }//GEN-LAST:event_box9MousePressed

    private void btnNextGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextGameActionPerformed

        if (Integer.parseInt(lblPointsX.getText()) != 3 && Integer.parseInt(lblPointsO.getText()) != 3) {

            for (int i = 0; i < boxes.length; i++) {

                boxes[i].setText("");
                boxes[i].setBackground(Color.WHITE);

            }

            turn = nextGame;

            if (nextGame == "O") {

                nextGame = "X";

            } else {

                nextGame = "O";

            }

            lblTurn.setText("Turno de " + turn);
            available = true;

        }

    }//GEN-LAST:event_btnNextGameActionPerformed

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed

        String instructions = "El objetivo consiste en vencer al oponente seleccionando la mejor estrategia, según las siguientes reglas:\n"
                + "\n"
                + "   * Cada jugador solo debe colocar su símbolo una vez por turno y no debe ser sobre una casilla ya jugada.\n"
                + "   * Se debe conseguir realizar una línea horizontal, vertical o inclinada por símbolo.\n"
                + "   * Se puede realizar movimientos horizontales, verticales y diagonales.\n"
                + "\n"
                + "En caso de empate (no se ha conseguido formar una línea horizontal, vertical o inclinada por símbolo), se juega otra vez.\n"
                + "Esto se repite hasta que uno de los jugadores obtenga tres puntos, y será entonces el vencedor del juego.\n"
                + "\n";

        JOptionPane.showMessageDialog(null, instructions);

    }//GEN-LAST:event_btnInstructionsActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed


        startButton.setEnabled(false);
        startButton.setText("START");
        round++;

    }//GEN-LAST:event_startButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        switch (option) {
            case 2:
                if (round == 1) {
                    playerPoints.add(pointsPlayer1);

                    configComponents();
                   
                    startButton.setEnabled(true);
                } else if (round == 2) {
                    playerPoints.add(pointsPlayer2);
                    Collections.sort(playerPoints, Collections.reverseOrder());

                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    configComponents();
                    
                    startButton.setEnabled(false);

                }
                break;

            case 3:
                if (round == 1) {
                    playerPoints.add(pointsPlayer1);
                    configComponents();
                  
                    startButton.setEnabled(true);
                } else if (round == 2) {
                    playerPoints.add(pointsPlayer2);
                    configComponents();
                  
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    configComponents();
                   
                    startButton.setEnabled(false);

                }
                break;

            case 4:

                if (round == 1) {
                    playerPoints.add(pointsPlayer1);
                    configComponents();
                  
                    startButton.setEnabled(true);
                } else if (round == 2) {
                    playerPoints.add(pointsPlayer2);
                    configComponents();
                   
                    startButton.setEnabled(true);

                } else if (round == 3) {
                    playerPoints.add(pointsPlayer3);
                    configComponents();
                   
                    startButton.setEnabled(true);
                } else if (round == 4) {
                    playerPoints.add(pointsPlayer4);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    sendPlayer4Coins();
                    configComponents();
                    
                    startButton.setEnabled(false);

                }
                break;

            default:
                break;

        }

    }//GEN-LAST:event_nextButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        switch (option) {
            case 2:
                if (round == 2) {
                    round = 0;
                    pointsPlayer1 = 0;
                    pointsPlayer2 = 0;
                    dispose();

                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
                break;
            case 3:
                if (round == 3) {
                    round = 0;
                    pointsPlayer1 = 0;
                    pointsPlayer2 = 0;
                    pointsPlayer3 = 0;
                    dispose();
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
                break;
            case 4:
                if (round == 4) {
                    round = 0;
                    pointsPlayer1 = 0;
                    pointsPlayer2 = 0;
                    pointsPlayer3 = 0;
                    pointsPlayer4 = 0;
                    dispose();

                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    public void press(int cell) {

        if (boxes[cell - 1].getText() == "" && available == true) {

            boxes[cell - 1].setText(turn);
            changeTurn();
            if (checkGame() == false && tie() == true) {

                lblTurn.setText("Empate");

            }

        }

    }

    public void changeTurn() {

        if (turn == "X") {

            turn = "O";

        } else {

            turn = "X";

        }

        lblTurn.setText("Turno de " + turn);

    }

    public boolean checkGame() {

        for (int i = 0; i < victories.length; i++) {

            if (boxes[victories[i][0] - 1].getText() == "X" && boxes[victories[i][1] - 1].getText() == "X" && boxes[victories[i][2] - 1].getText() == "X") {

                boxes[victories[i][0] - 1].setBackground(Color.GREEN);
                boxes[victories[i][1] - 1].setBackground(Color.GREEN);
                boxes[victories[i][2] - 1].setBackground(Color.GREEN);

                lblTurn.setText("Ha ganado X");
                lblPointsX.setText(Integer.toString(Integer.parseInt(lblPointsX.getText()) + 1));
                available = false;

                if (Integer.parseInt(lblPointsX.getText()) == 3) {

                    lblWinner.setVisible(true);
                    lblWinner.setText("El ganador es X");

                }

                return true;

            } else if (boxes[victories[i][0] - 1].getText() == "O" && boxes[victories[i][1] - 1].getText() == "O" && boxes[victories[i][2] - 1].getText() == "O") {

                boxes[victories[i][0] - 1].setBackground(Color.GREEN);
                boxes[victories[i][1] - 1].setBackground(Color.GREEN);
                boxes[victories[i][2] - 1].setBackground(Color.GREEN);

                lblTurn.setText("Ha ganado O");
                lblPointsO.setText(Integer.toString(Integer.parseInt(lblPointsO.getText()) + 1));
                available = false;

                if (Integer.parseInt(lblPointsO.getText()) == 3) {

                    lblWinner.setVisible(true);
                    lblWinner.setText("El ganador es O");

                }

                return true;

            }

        }

        return false;

    }

    public boolean tie() {

        for (int i = 0; i < boxes.length; i++) {

            if (boxes[i].getText() == "") {

                return false;

            }

        }

        return true;

    }

    public static void main() {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new TicTacToe().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activePoints1;
    private javax.swing.JLabel activePoints2;
    private javax.swing.JLabel activePoints3;
    private javax.swing.JLabel activePoints4;
    private javax.swing.JLabel box1;
    private javax.swing.JLabel box2;
    private javax.swing.JLabel box3;
    private javax.swing.JLabel box4;
    private javax.swing.JLabel box5;
    private javax.swing.JLabel box6;
    private javax.swing.JLabel box7;
    private javax.swing.JLabel box8;
    private javax.swing.JLabel box9;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JButton btnNextGame;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPointsO;
    private javax.swing.JLabel lblPointsX;
    private javax.swing.JLabel lblScoreO;
    private javax.swing.JLabel lblScoreX;
    private javax.swing.JLabel lblTurn;
    private javax.swing.JLabel lblWinner;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel playerPoints1;
    private javax.swing.JLabel playerPoints2;
    private javax.swing.JLabel playerPoints3;
    private javax.swing.JLabel playerPoints4;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

}
