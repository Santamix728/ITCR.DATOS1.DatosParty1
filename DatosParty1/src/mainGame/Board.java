package mainGame;

import Lists.Cell;
import Lists.PhaseA;
import Lists.PhaseB;
import Lists.PhaseC;
import Lists.PhaseD;
import Lists.Principal;
import Stack.StackEvents;
import Stack.StackMinigames;
import static mainGame.Window.player1Active;
import static mainGame.Window.player2Active;
import static mainGame.Window.player3Active;
import static mainGame.Window.player4Active;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * This class is in charge of all the graphic configuration of the components
 * and other functions found on the board.
 */
public class Board extends javax.swing.JFrame {

    private int rightDice;
    private int leftDice;
    public static int playerPlaying = 0;
    private static int activePlayers;
    public static int round = 1;
    private static int pointer1 = 0;
    private static boolean pointer2 = false;
    public static boolean teleportation = false;
    public static boolean changePositions = false;    
    public static boolean mingameFinished = false;

    public static ArrayList<Player> players = new ArrayList<Player>();

    static Principal principal = new Principal();
    static PhaseA phaseA = new PhaseA();
    static PhaseB phaseB = new PhaseB();
    static PhaseC phaseC = new PhaseC();
    static PhaseD phaseD = new PhaseD();

    static StackEvents stackEvents = new StackEvents();
    static StackMinigames stackMinigames = new StackMinigames();

    static Star star;

    /**
     * This is the constructor of the board class, where the initial
     * configuration of the components is made.
     */
    public Board() {

        initComponents();
        configComponents();

        principalBuilder(principal);
        phaseABuilder(phaseA);
        phaseBBuilder(phaseB);
        phaseCBuilder(phaseC);
        phaseDBuilder(phaseD);

        playersCreation();
        playersInformation();

        activePlayers = players.size() - 1;
        stackEvents.shuffle();
        stackMinigames.shuffle();

        txtRound.setText("Ronda 1");
        txtTurn.setText("Turno de " + players.get(0).getName());

    }

    /**
     * Method in charge of the basic configuration of the graphic components of
     * the board.
     */
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

    /**
     * Creation of the chosen players, with their respective attributes.
     */
    private void playersCreation() {

        String name1 = Window.name1Txt.getText();
        String name2 = Window.name2Txt.getText();
        String name3 = Window.name3Txt.getText();
        String name4 = Window.name4Txt.getText();

        if (player1Active == true && player2Active == true && player3Active == false && player4Active == false) {

            Player player1 = new Player(0, name1);
            players.add(player1);
            Player player2 = new Player(1, name2);
            players.add(player2);

        } else if (player1Active == true && player2Active == true && player3Active == true && player4Active == false) {

            Player player1 = new Player(0, name1);
            players.add(player1);
            Player player2 = new Player(1, name2);
            players.add(player2);
            Player player3 = new Player(2, name3);
            players.add(player3);

        } else {

            Player player1 = new Player(0, name1);
            players.add(player1);
            Player player2 = new Player(1, name2);
            players.add(player2);
            Player player3 = new Player(2, name3);
            players.add(player3);
            Player player4 = new Player(3, name4);
            players.add(player4);

        }

    }

    /**
     * Place the information of the created players in the leaderboard.
     */
    private void playersInformation() {

        switch (players.size()) {

            case 2:

                namePlayer1.setText(players.get(0).getName());
                namePlayer2.setText(players.get(1).getName());
                updateLeaderboard();

                break;

            case 3:

                namePlayer1.setText(players.get(0).getName());
                namePlayer2.setText(players.get(1).getName());
                namePlayer3.setText(players.get(2).getName());
                updateLeaderboard();

                break;

            case 4:

                namePlayer1.setText(players.get(0).getName());
                namePlayer2.setText(players.get(1).getName());
                namePlayer3.setText(players.get(2).getName());
                namePlayer4.setText(players.get(3).getName());
                updateLeaderboard();

                break;

            default:

                break;
        }

    }

    /**
     * Update the graphic information of the current players in the leaderboard.
     */
    private static void updateLeaderboard() {

        switch (players.size()) {

            case 2:

                activeCoinsPlayer1.setText(String.valueOf(players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(players.get(1).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(players.get(1).getStars()));

                break;

            case 3:

                activeCoinsPlayer1.setText(String.valueOf(players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(players.get(1).getCoins()));
                activeCoinsPlayer3.setText(String.valueOf(players.get(2).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(players.get(1).getStars()));
                activeStarsPlayer3.setText(String.valueOf(players.get(2).getStars()));

                break;

            case 4:

                activeCoinsPlayer1.setText(String.valueOf(players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(players.get(1).getCoins()));
                activeCoinsPlayer3.setText(String.valueOf(players.get(2).getCoins()));
                activeCoinsPlayer4.setText(String.valueOf(players.get(3).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(players.get(1).getStars()));
                activeStarsPlayer3.setText(String.valueOf(players.get(2).getStars()));
                activeStarsPlayer4.setText(String.valueOf(players.get(3).getStars()));

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
        lblStar = new javax.swing.JLabel();
        lblTokenPlayer1 = new javax.swing.JLabel();
        lblTokenPlayer2 = new javax.swing.JLabel();
        lblTokenPlayer3 = new javax.swing.JLabel();
        lblTokenPlayer4 = new javax.swing.JLabel();
        namePlayer1 = new javax.swing.JLabel();
        namePlayer2 = new javax.swing.JLabel();
        namePlayer3 = new javax.swing.JLabel();
        namePlayer4 = new javax.swing.JLabel();
        coinImage1 = new javax.swing.JLabel();
        coinImage2 = new javax.swing.JLabel();
        coinImage3 = new javax.swing.JLabel();
        coinImage4 = new javax.swing.JLabel();
        activeCoinsPlayer1 = new javax.swing.JTextField();
        activeCoinsPlayer2 = new javax.swing.JTextField();
        activeCoinsPlayer3 = new javax.swing.JTextField();
        activeCoinsPlayer4 = new javax.swing.JTextField();
        startImage1 = new javax.swing.JLabel();
        startImage2 = new javax.swing.JLabel();
        startImage3 = new javax.swing.JLabel();
        startImage4 = new javax.swing.JLabel();
        activeStarsPlayer1 = new javax.swing.JTextField();
        activeStarsPlayer2 = new javax.swing.JTextField();
        activeStarsPlayer3 = new javax.swing.JTextField();
        activeStarsPlayer4 = new javax.swing.JTextField();
        txtRound = new javax.swing.JTextField();
        txtTurn = new javax.swing.JTextField();
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

        lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice1.png")));
        panel.add(lblRightDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, -1, -1));

        lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice2.png")));
        panel.add(lblLeftDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, -1, -1));

        diceBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/rollDices.png"))); // NOI18N
        panel.add(diceBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 390, 180));

        lblStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star2.png"))); // NOI18N
        panel.add(lblStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, -1));

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

        coinImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        coinImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, -1));

        coinImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        coinImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, -1));

        activeCoinsPlayer1.setEditable(false);
        activeCoinsPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer1.setText("100");
        activeCoinsPlayer1.setBorder(null);
        panel.add(activeCoinsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, -1));

        activeCoinsPlayer2.setEditable(false);
        activeCoinsPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer2.setText("100");
        activeCoinsPlayer2.setBorder(null);
        panel.add(activeCoinsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));

        activeCoinsPlayer3.setEditable(false);
        activeCoinsPlayer3.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer3.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer3.setText("100");
        activeCoinsPlayer3.setBorder(null);
        panel.add(activeCoinsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, -1));

        activeCoinsPlayer4.setEditable(false);
        activeCoinsPlayer4.setBackground(new java.awt.Color(255, 255, 255));
        activeCoinsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeCoinsPlayer4.setForeground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeCoinsPlayer4.setText("100");
        activeCoinsPlayer4.setBorder(null);
        panel.add(activeCoinsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, -1));

        startImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 30, 30));

        startImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 30, 30));

        startImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 30, 30));

        startImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 30, 30));

        activeStarsPlayer1.setEditable(false);
        activeStarsPlayer1.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer1.setText("100");
        activeStarsPlayer1.setBorder(null);
        panel.add(activeStarsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, -1, -1));

        activeStarsPlayer2.setEditable(false);
        activeStarsPlayer2.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer2.setText("100");
        activeStarsPlayer2.setBorder(null);
        panel.add(activeStarsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, -1, -1));

        activeStarsPlayer3.setEditable(false);
        activeStarsPlayer3.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer3.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer3.setText("100");
        activeStarsPlayer3.setBorder(null);
        panel.add(activeStarsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, -1, -1));

        activeStarsPlayer4.setEditable(false);
        activeStarsPlayer4.setBackground(new java.awt.Color(255, 255, 255));
        activeStarsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        activeStarsPlayer4.setForeground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        activeStarsPlayer4.setText("100");
        activeStarsPlayer4.setBorder(null);
        panel.add(activeStarsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, -1, -1));

        txtRound.setEditable(false);
        txtRound.setBackground(new java.awt.Color(255, 255, 255));
        txtRound.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        txtRound.setForeground(new java.awt.Color(0, 0, 0));
        txtRound.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRound.setText("Ronda");
        txtRound.setBorder(null);
        panel.add(txtRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 200, 370, -1));

        txtTurn.setEditable(false);
        txtTurn.setBackground(new java.awt.Color(255, 255, 255));
        txtTurn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        txtTurn.setForeground(new java.awt.Color(0, 0, 0));
        txtTurn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTurn.setText("Turno de");
        txtTurn.setBorder(null);
        panel.add(txtTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 680, 390, -1));

        leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/leaderboard2.png"))); // NOI18N
        panel.add(leaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method for the movement of the player's token with the information of the
     * dice.
     *
     */
    private void btnRollDicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollDicesActionPerformed

        rightDice = new Random().nextInt(6) + 1;
        leftDice = new Random().nextInt(6) + 1;

        randomRightDice(rightDice);
        randomLeftDice(leftDice);

        Player actualPlayer = players.get(playerPlaying);

        int previousCell = actualPlayer.getCell();

        int nextCell = 0;

        int moveToCell;

        if (actualPlayer.getDirection() == "next") {

            moveToCell = actualPlayer.getCell() + rightDice + leftDice;

        } else {

            moveToCell = actualPlayer.getCell() - rightDice - leftDice;

        }

        String actualPhase = actualPlayer.getPhase();

        int x = 0;
        int y = 0;

        if (null != actualPhase) {
            switch (actualPhase) {

                case "principal":

                    if (moveToCell > 37) {

                        moveToCell -= 38;

                    }

                    switch (moveToCell) {

                        case 0:

                            moveToCell = 69;
                            actualPlayer.setPhase("phaseD");
                            actualPlayer.setDirection("next");
                            x = phaseD.findXLocation(69);
                            y = phaseD.findYLocation(69);

                            break;

                        case 9:

                            moveToCell = 72;
                            actualPlayer.setPhase("phaseD");
                            actualPlayer.setDirection("next");
                            x = phaseD.findXLocation(72);
                            y = phaseD.findYLocation(72);

                            break;

                        case 19:

                            moveToCell = 76;
                            actualPlayer.setPhase("phaseD");
                            actualPlayer.setDirection("previous");
                            x = phaseD.findXLocation(76);
                            y = phaseD.findYLocation(76);

                            break;

                        case 28:

                            moveToCell = 80;
                            actualPlayer.setPhase("phaseD");
                            actualPlayer.setDirection("previous");
                            x = phaseD.findXLocation(80);
                            y = phaseD.findYLocation(80);

                            break;

                        case 7:

                            pointer1 = 7;
                            actualPlayer.setPhase("phaseA");
                            x = principal.findXLocation(7);
                            y = principal.findYLocation(7);

                            break;

                        case 17:

                            pointer1 = 17;
                            actualPlayer.setPhase("phaseC");
                            actualPlayer.setDirection("next");
                            x = principal.findXLocation(17);
                            y = principal.findYLocation(17);

                            break;

                        case 23:

                            pointer1 = 23;
                            actualPlayer.setPhase("phaseB");
                            actualPlayer.setDirection("next");
                            x = principal.findXLocation(23);
                            y = principal.findYLocation(23);

                            break;

                        case 36:

                            pointer1 = 36;
                            actualPlayer.setPhase("phaseC");
                            actualPlayer.setDirection("previous");
                            x = principal.findXLocation(36);
                            y = principal.findYLocation(36);

                            break;

                        default:

                            actualPlayer.setDirection("next");
                            x = principal.findXLocation(moveToCell);
                            y = principal.findYLocation(moveToCell);

                            break;

                    }

                    break;

                case "phaseA":

                    if (actualPlayer.getCell() == 7) {

                        moveToCell = 37 + rightDice + leftDice;
                        x = phaseA.findXLocation(moveToCell);
                        y = phaseA.findYLocation(moveToCell);

                    }

                    if (moveToCell > 48) {

                        moveToCell = moveToCell - 49 + 13;
                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(moveToCell);
                        y = principal.findYLocation(moveToCell);

                    } else {

                        x = phaseA.findXLocation(moveToCell);
                        y = phaseA.findYLocation(moveToCell);

                    }

                    break;

                case "phaseB":

                    if (actualPlayer.getCell() == 23) {

                        moveToCell = 48 + rightDice + leftDice;
                        x = phaseB.findXLocation(moveToCell);
                        y = phaseB.findYLocation(moveToCell);

                    }

                    if (moveToCell > 54) {

                        moveToCell = moveToCell - 55 + 30;
                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(moveToCell);
                        y = principal.findYLocation(moveToCell);

                    } else {

                        x = phaseB.findXLocation(moveToCell);
                        y = phaseB.findYLocation(moveToCell);

                    }

                    break;

                case "phaseC":

                    if (actualPlayer.getCell() == 17) {

                        moveToCell = 54 + rightDice + leftDice;
                        x = phaseC.findXLocation(moveToCell);
                        y = phaseC.findYLocation(moveToCell);

                    } else if (actualPlayer.getCell() == 36) {

                        moveToCell = 69 - rightDice - leftDice;
                        x = phaseC.findXLocation(moveToCell);
                        y = phaseC.findYLocation(moveToCell);

                    } else if (moveToCell > 68) {

                        moveToCell = moveToCell - 69 + 36;

                        if (moveToCell > 37) {

                            moveToCell -= 38;

                        }

                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(moveToCell);
                        y = principal.findYLocation(moveToCell);

                    } else if (moveToCell < 55) {

                        moveToCell = 54 - moveToCell + 17;
                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(moveToCell);
                        y = principal.findYLocation(moveToCell);

                    } else if (actualPlayer.getDirection() == "next") {
                    
                    x = phaseC.findXLocation(moveToCell);
                    y = phaseC.findYLocation(moveToCell);
                    
                    } else if (actualPlayer.getDirection() == "previous") {

                        x = phaseC.findXLocationPrevious(moveToCell);
                        y = phaseC.findYLocationPrevious(moveToCell);

                    }

                    break;

                case "phaseD":

                    if (moveToCell > 82) {

                        moveToCell = moveToCell - 83 + 69;

                    } else if (moveToCell < 69) {

                        moveToCell = 82 - (68 - moveToCell);

                    }

                    if (moveToCell == 69) {

                        moveToCell = 0;
                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(0);
                        y = principal.findYLocation(0);

                    } else if (moveToCell == 72) {

                        moveToCell = 9;
                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(9);
                        y = principal.findYLocation(9);

                    } else if (moveToCell == 76) {

                        moveToCell = 19;
                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(19);
                        y = principal.findYLocation(19);

                    } else if (moveToCell == 80) {

                        moveToCell = 28;
                        actualPlayer.setPhase("principal");
                        actualPlayer.setDirection("next");
                        x = principal.findXLocation(28);
                        y = principal.findYLocation(28);

                        if (moveToCell > 37) {

                            moveToCell -= 38;

                        }

                    } else if (actualPlayer.getDirection() == "next") {

                        x = phaseD.findXLocation(moveToCell);
                        y = phaseD.findYLocation(moveToCell);

                    } else if (actualPlayer.getDirection() == "previous") {

                        x = phaseD.findXLocationPrevious(moveToCell);
                        y = phaseD.findYLocationPrevious(moveToCell);

                    }

                    break;

                default:

                    break;

            }
        }

        actualPlayer.setCell(moveToCell);

        nextCell = moveToCell;

        switch (playerPlaying) {

            case 0:

                moveToken(0, x, y);

                break;

            case 1:

                moveToken(1, x, y);

                break;

            case 2:

                moveToken(2, x, y);

                break;

            default:

                moveToken(3, x, y);

                break;
        }

        actionCell(moveToCell);

        checkDuel();

        teleportation = false;

        changePositions = false;

        pointer1 = 0;

        checkStar(previousCell, nextCell);
        
        playerPlaying ++;

        try {

            checkPlayerPlaying();

        } catch (InterruptedException ex) {

            Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);

        }

        if (round != 13) {

            txtTurn.setText("Turno de " + players.get(playerPlaying).getName());

        }

        checkEndGame();

    }//GEN-LAST:event_btnRollDicesActionPerformed

    /**
     * Perform the animation of the right dice graphically.
     *
     * @param dice It is an integer type ramdom number
     */
    public void randomRightDice(int dice) {

        switch (dice) {

            case 1:

                lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice1.png")));

                break;

            case 2:

                lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice2.png")));

                break;

            case 3:

                lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice3.png")));

                break;

            case 4:

                lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice4.png")));

                break;

            case 5:

                lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice5.png")));

                break;

            case 6:

                lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice6.png")));

                break;

            default:

                break;

        }

    }

    /**
     * Perform the animation of the left dice graphically.
     *
     * @param dice It is an integer type ramdom number
     */
    public void randomLeftDice(int dice) {

        switch (dice) {

            case 1:

                lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice1.png")));

                break;

            case 2:

                lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice2.png")));

                break;

            case 3:

                lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice3.png")));

                break;

            case 4:

                lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice4.png")));

                break;

            case 5:

                lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice5.png")));

                break;

            case 6:

                lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice6.png")));

                break;

            default:

                break;

        }

    }

    /**
     * Method to check which player token has to be moved.
     *
     * @param playerToken Identifier of each player's token.
     * @param x position x where the token is located.
     * @param y position y where the token is located.
     */
    public static void moveToken(int playerToken, int x, int y) {

        if (x != -1 && y != -1) {

            switch (playerToken) {
                
                case 0:
                    
                    lblTokenPlayer1.setLocation(x, y);
                    
                    break;
                    
                case 1:
                    
                    lblTokenPlayer2.setLocation(x + 29, y);
                    
                    break;
                    
                case 2:
                    
                    lblTokenPlayer3.setLocation(x, y + 28);
                    
                    break;
                    
                default:
                    
                    lblTokenPlayer4.setLocation(x + 29, y + 29);
                    
                    break;
                    
            }

        } else {

            System.out.println("X y Y son iguales a -1");

            System.out.println("player token " + players.get(playerToken).getPhase() + "   " + players.get(playerToken).getCell());

        }

    }

    /**
     * Method to check the correct functioning of the players' turns.
     */
    public void checkPlayerPlaying() throws InterruptedException {

        if (round > 1 && playerPlaying > activePlayers) {

            Minigames newMinigame = new Minigames(stackMinigames.pop());

            String message = "El minijuego será " + newMinigame.name;

            JOptionPane.showMessageDialog(null, message, "Minijuego", 1);

            newMinigame.start();

            playerPlaying = 0;
            round++;

            txtRound.setText("Ronda " + round);

        } else if (playerPlaying > activePlayers) {

            playerPlaying = 0;
            round++;

            Minigames newMinigame = new Minigames(stackMinigames.pop());

            String message = "El minijuego será " + newMinigame.name;

            JOptionPane.showMessageDialog(null, message, "Minijuego", 1);

            newMinigame.start();

            txtRound.setText("Ronda " + round);

        }

        if (round == 2 && pointer2 == false) {

            lblStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star1.png")));

            newStar();

            pointer2 = true;

        }

        if (round == 13) {

            txtRound.setText("Ronda 12");

        }

    }

    /**
     * Method in charge of creating the random stars on the board.
     */
    private void newStar() {

        star.setCell();

        int starCell = star.getCell();
        int newX = principal.findXLocation(starCell);
        int newY = principal.findYLocation(starCell);

        lblStar.setLocation(newX, newY);

    }

    private void checkStar(int previousCell, int nextCell) {

        Player player = players.get(playerPlaying);

        star = Star.getStar();

        int starCell = star.getCell();

        if (round > 1 && player.getCell() < 38) {

            if (previousCell < 38 && nextCell < 38) {

                if (previousCell < nextCell) {

                    if ((starCell > previousCell && starCell <= nextCell)) {

                        buyStar();

                    }

                } else if (previousCell > 26 && nextCell < 12) {

                    nextCell += 38;

                    if (starCell < 12) {

                        starCell += 38;

                    }

                    if (starCell > previousCell && starCell <= nextCell) {

                        buyStar();

                    }

                }

            } else if ((previousCell == 7 || (previousCell >= 38 && previousCell <= 48)) && nextCell < 38) {

                previousCell = 13;

                if ((starCell >= previousCell && starCell <= nextCell)) {

                    buyStar();

                }

            } else if ((previousCell == 23 || (previousCell >= 49 && previousCell <= 54)) && nextCell < 38) {

                previousCell = 30;

                if (nextCell < 12) {

                    nextCell += 38;

                }

                if ((starCell >= previousCell && starCell <= nextCell)) {

                    buyStar();

                }

            } else if ((previousCell >= 55 && previousCell <= 68) && nextCell <= 28) {

                previousCell = 17;

                if ((starCell >= previousCell && starCell <= nextCell)) {

                    buyStar();

                }

            } else if ((previousCell >= 55 && previousCell <= 68) && nextCell < 38) {

                previousCell = 36;

                if (nextCell < 10) {

                    nextCell += 38;

                }

                if ((starCell >= previousCell && starCell <= nextCell)) {

                    buyStar();

                }

            } else if (previousCell < 38 && nextCell >= 69) {

                switch (nextCell) {

                    case 69:

                        nextCell = 38;

                        break;

                    case 72:

                        nextCell = 9;

                        break;

                    case 76:

                        nextCell = 19;

                        break;

                    case 80:

                        nextCell = 28;

                        break;

                    default:

                        break;

                }

                if ((starCell >= previousCell && starCell <= nextCell)) {

                    buyStar();

                }

            } else if (nextCell == starCell) {

                buyStar();

            }

        }

    }

    private void buyStar() {

        Player player = players.get(playerPlaying);

        String message = "Has pasado por una casilla donde se encuentra la estrella" + "\n"
                + "¿Deseas comprarla?";

        int option = JOptionPane.showConfirmDialog(null, message, "Comprar estrella", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            if (player.getCoins() >= 100) {

                player.setStars(player.getStars() + 1);

                player.setCoins(player.getCoins() - 100);

                newStar();

                updateStarsEvent();

                updateCoinsEvent();

            } else {

                message = player.getName() + " no posee suficientes monedas para comprar la estrella.";

                JOptionPane.showMessageDialog(null, message, "Comprar estrella", 1);

            }

        }

    }

    /**
     * Check if the players fall in the same square and create a duel between
     * them.
     */
    private void checkDuel() {

        if (teleportation == false && changePositions == false) {

            Player actualPlayer = players.get(playerPlaying);

            Events newEvent = new Events("duelSameCell");

            if (activePlayers == 1) {

                for (int i = 0; i <= activePlayers; i++) {

                    if (actualPlayer.getCell() == players.get(i).getCell() && playerPlaying != i) {

                        newEvent.start(0, 1);

                    }

                }

            } else {

                for (int i = 0; i <= activePlayers; i++) {

                    if (actualPlayer.getCell() == players.get(i).getCell() && playerPlaying != i) {

                        newEvent.start(playerPlaying, i);
                        
                        break;

                    }

                }

            }

        }

        // reocordar retroceder una casilla al jugador que perdio 
    }

    /**
     * Method in charge of checking the rounds to end the game when the
     * established amount is reached.It also compares the stars and coins of the
     * players to select the winning player.
     */
    public static void checkEndGame() {

        updateLeaderboard();

        if (round == 13 && mingameFinished == true) {

            int starsArray[] = new int[players.size()];

            for (int i = 0; i <= activePlayers; i++) {

                starsArray[i] = players.get(i).getStars();

            }

            int maxIndex = getMaxIndexStars(starsArray);

            String winnerName = players.get(maxIndex).getName();

            int repeated = checkRepeated(starsArray, maxIndex);

            switch (repeated) {

                case 1: {

                    Player[] arrayPlayers = checkRepeatedPlayers(starsArray[maxIndex], 2);
                    maxIndex = getMaxIndexPlayers(arrayPlayers, 2);
                    winnerName = arrayPlayers[maxIndex].getName();

                    break;

                }

                case 2: {

                    Player[] arrayPlayers = checkRepeatedPlayers(starsArray[maxIndex], 3);
                    maxIndex = getMaxIndexPlayers(arrayPlayers, 3);
                    winnerName = arrayPlayers[maxIndex].getName();

                    break;

                }

                case 3: {

                    Player[] arrayPlayers = checkRepeatedPlayers(starsArray[maxIndex], 4);
                    maxIndex = getMaxIndexPlayers(arrayPlayers, 4);
                    winnerName = arrayPlayers[maxIndex].getName();

                    break;

                }

                default:

                    break;

            }

            String message = winnerName + " ha ganado el juego";

            JOptionPane.showMessageDialog(null, message, "Ganador del juego", 1);

            btnRollDices.setEnabled(false);

        }

    }

    /**
     * Method that checks for players with the same number of stars.
     *
     * @param array Array with the stars of the players.
     * @param max The position of the player with the highest stars.
     * @return If there are players with the same number of stars.
     */
    private static int checkRepeated(int[] array, int max) {

        int repeated = 0;
        int number = array[max];

        for (int i = 0; i <= activePlayers; i++) {

            if (array[i] == number && i != max) {

                repeated++;

            }

        }

        return repeated;

    }

    /**
     * Method that creates an array with repeated players.
     *
     * @param max The position of the player with the highest stars.
     * @param size Number of players that the array will contain.
     * @return The array with players who have the same number of stars.
     */
    private static Player[] checkRepeatedPlayers(int max, int size) {

        Player arrayPlayers[] = new Player[size];

        int counter = 0;

        for (int i = 0; i <= activePlayers; i++) {

            if (players.get(i).getStars() == max) {

                arrayPlayers[counter] = players.get(i);
                counter++;

            }

        }

        return arrayPlayers;

    }

    /**
     * Method to extract the position with the largest number of stars.
     *
     * @param array Array with the stars of the players.
     * @return The position of the player with the highest stars.
     */
    private static int getMaxIndexStars(int[] array) {

        int max = array[0];
        int index = 0;

        for (int i = 1; i <= activePlayers; i++) {

            if (array[i] > max) {

                max = array[i];
                index = i;

            }

        }

        return index;

    }

    /**
     * Method that extracts the amount of coins from the players who had the
     * repeated stars to be able to select the one with the most.
     *
     * @param array Array with players with repeated stars.
     * @param size Number of players that the array will contain.
     * @return The position with the largest amount of coins.
     */
    private static int getMaxIndexPlayers(Player[] array, int size) {

        int max = array[0].getCoins();
        int index = 0;

        for (int i = 1; i < size; i++) {

            if (array[i].getCoins() > max) {

                max = array[i].getCoins();
                index = i;

            }

        }

        return index;

    }

    /**
     * Method to assign an action to each square of the board.
     *
     * @param cellNumber Cell number to assign different types of events.
     */
    private void actionCell(int cellNumber) {

        Player player = players.get(playerPlaying);
        int actualCoins = player.getCoins();
        String phase = player.getPhase();
        String color = "";

        if (phase == "principal") {

            color = principal.findColor(cellNumber);

        } else if (phase == "phaseA" && pointer1 == 7) {

            color = "yellow";

        } else if (phase == "phaseA") {

            color = phaseA.findColor(cellNumber);

        } else if (phase == "phaseB" && pointer1 == 23) {

            color = "blue";

        } else if (phase == "phaseB") {

            color = phaseB.findColor(cellNumber);

        } else if (phase == "phaseC" && pointer1 == 17) {

            color = "blue";

        } else if (phase == "phaseC" && pointer1 == 36) {

            color = "yellow";

        } else if (phase == "phaseC") {

            color = phaseC.findColor(cellNumber);

        } else if (phase == "phaseD") {

            color = phaseD.findColor(cellNumber);

        }

        if (color == "green") {

            player.setCoins(actualCoins + 10);
            updateCoins();

        } else if (color == "red") {

            if (actualCoins > 10) {

                player.setCoins(actualCoins - 10);
                updateCoins();

            }

        } else if (color == "yellow") {

            eventCellAction();

        }

    }

    /**
     * Method to update players' coins.
     */
    public static void updateCoins() {

        String actualCoins = String.valueOf(players.get(playerPlaying).getCoins());

        switch (playerPlaying) {

            case 0:

                activeCoinsPlayer1.setText(actualCoins);

                break;

            case 1:

                activeCoinsPlayer2.setText(actualCoins);

                break;

            case 2:

                activeCoinsPlayer3.setText(actualCoins);

                break;

            case 3:

                activeCoinsPlayer4.setText(actualCoins);

                break;

            default:

                break;

        }

    }

    /**
     * Update the coins earned in the events depending on the number of players.
     */
    public static void updateCoinsEvent() {

        String actualCoins1 = String.valueOf(players.get(0).getCoins());
        String actualCoins2 = String.valueOf(players.get(1).getCoins());

        switch (activePlayers) {

            case 1:

                activeCoinsPlayer1.setText(actualCoins1);
                activeCoinsPlayer2.setText(actualCoins2);

                break;

            case 2: {

                String actualCoins3 = String.valueOf(players.get(2).getCoins());
                activeCoinsPlayer1.setText(actualCoins1);
                activeCoinsPlayer2.setText(actualCoins2);
                activeCoinsPlayer3.setText(actualCoins3);

                break;

            }

            case 3: {

                String actualCoins3 = String.valueOf(players.get(2).getCoins());
                String actualCoins4 = String.valueOf(players.get(3).getCoins());
                activeCoinsPlayer1.setText(actualCoins1);
                activeCoinsPlayer2.setText(actualCoins2);
                activeCoinsPlayer3.setText(actualCoins3);
                activeCoinsPlayer4.setText(actualCoins4);

                break;

            }

            default:

                break;

        }

    }

    /**
     * Update the stars earned in the events depending on the number of players.
     */
    public static void updateStarsEvent() {

        String actualStars1 = String.valueOf(players.get(0).getStars());
        String actualStars2 = String.valueOf(players.get(1).getStars());

        switch (activePlayers) {

            case 1:

                activeStarsPlayer1.setText(actualStars1);
                activeStarsPlayer2.setText(actualStars2);

                break;

            case 2: {

                String actualStars3 = String.valueOf(players.get(2).getStars());
                activeStarsPlayer1.setText(actualStars1);
                activeStarsPlayer2.setText(actualStars2);
                activeStarsPlayer3.setText(actualStars3);

                break;

            }

            case 3: {

                String actualStars3 = String.valueOf(players.get(2).getStars());
                String actualStars4 = String.valueOf(players.get(3).getStars());
                activeStarsPlayer1.setText(actualStars1);
                activeStarsPlayer2.setText(actualStars2);
                activeStarsPlayer3.setText(actualStars3);
                activeStarsPlayer4.setText(actualStars4);

                break;

            }

            default:

                break;

        }

    }

    /**
     * Method for cell events, if the stack is empty the mix and if not then it
     * outputs an event.
     */
    private void eventCellAction() {

        if (stackEvents.empty() == true) {

            stackEvents.shuffle();

        }

        Events newEvent = new Events(stackEvents.pop());

        newEvent.start(playerPlaying, 0);

    }

    /**
     * Creation of the cells depending on the phase in which it is.
     *
     * @param phaseA You receive a phase A list type object
     */
    private void phaseABuilder(PhaseA phaseA) {

        int x = 131;
        int y = 552;

        Cell newCell;

        for (int i = 38; i < 49; i++) {

            if (i == 40 || i == 42) {

                x += 60;

            } else if (i == 41) {

                x += 62;

            } else if (i == 45 || i == 47 || i == 48) {

                x -= 60;

            } else if (i == 46) {

                x -= 62;

            } else if (i == 39 || i == 43 || i == 44) {

                y -= 60;

            }

            if (i == 38 || i == 42 || i == 45) {

                newCell = new Cell(i, x, y, "blue", "neutral");
                phaseA.addNode(newCell);

            } else if (i == 40 || i == 46) {

                newCell = new Cell(i, x, y, "yellow", "events");
                phaseA.addNode(newCell);

            } else if (i == 39 || i == 41 || i == 44 || i == 47) {

                newCell = new Cell(i, x, y, "red", "loseCoins");
                phaseA.addNode(newCell);

            } else if (i == 43 || i == 48) {

                newCell = new Cell(i, x, y, "green", "winCoins");
                phaseA.addNode(newCell);

            }

        }

    }

    /**
     * Creation of the cells depending on the phase in which it is.
     *
     * @param phaseB You receive a phase B list type object.
     */
    private void phaseBBuilder(PhaseB phaseB) {

        int x = 253;
        int y = 72;

        Cell newCell;

        for (int i = 49; i < 55; i++) {

            if (i == 51) {

                x += 60;

            } else if (i == 52 || i == 53 || i == 54) {

                x += 62;

            } else if (i == 50) {

                y += 60;

            }

            newCell = new Cell(i, x, y, "yellow", "events");
            phaseB.addNode(newCell);

        }

    }

    /**
     * Creation of the cells depending on the phase in which it is.
     *
     * @param phaseC You receive a phase C list type object.
     */
    private void phaseCBuilder(PhaseC phaseC) {

        int x = 71;
        int y = 132;

        Cell newCell;

        for (int i = 55; i < 69; i++) {

            if (i == 56 || i == 59 || i == 61) {

                x += 60;

            } else if (i == 60 || i == 62 || i == 63 || i == 68) {

                x += 62;

            } else if (i == 57 || i == 58 || i == 64 || i == 65 || i == 66 || i == 67) {

                y += 60;

            }

            if (i == 57 || i == 63 || i == 65) {

                newCell = new Cell(i, x, y, "blue", "neutral");
                phaseC.addNode(newCell);

            } else if (i == 60 || i == 66) {

                newCell = new Cell(i, x, y, "yellow", "events");
                phaseC.addNode(newCell);

            } else if (i == 56 || i == 58 || i == 61 || i == 68) {

                newCell = new Cell(i, x, y, "red", "loseCoins");
                phaseC.addNode(newCell);

            } else if (i == 55 || i == 59 || i == 62 || i == 64 || i == 67) {

                newCell = new Cell(i, x, y, "green", "winCoins");
                phaseC.addNode(newCell);

            }

        }

    }

    /**
     * Creation of the cells depending on the phase in which it is.
     *
     * @param phaseD You receive a phase D list type object.
     */
    private void phaseDBuilder(PhaseD phaseD) {

        int x = 680;
        int y = 12;

        Cell newCell;

        for (int i = 69; i < 83; i++) {

            if (i == 70 || i == 72 || i == 73) {

                x += 60;

            } else if (i == 71 || i == 74) {

                x += 62;

            } else if (i == 78 || i == 79 || i == 81) {

                x -= 60;

            } else if (i == 77 || i == 80) {

                x -= 62;

            } else if (i == 75 || i == 76) {

                y += 60;

            } else if (i == 82) {

                y -= 60;

            }

            if (i == 69 || i == 72 || i == 76 || i == 80) {

                newCell = new Cell(i, x, y, "gray", "getOut");
                phaseD.addNode(newCell);

            } else if (i == 70 || i == 71 || i == 73 || i == 74 || i == 75 || i == 77 || i == 78 || i == 79 || i == 81 || i == 82) {

                newCell = new Cell(i, x, y, "yellow", "events");
                phaseD.addNode(newCell);

            }

        }

    }

    /**
     * Creation of the cells depending on the phase in which it is.
     *
     * @param principal You receive a main list type object.
     */
    private void principalBuilder(Principal principal) {

        int x = 557;
        int y = 612;

        Cell newCell;

        for (int i = 0; i < 38; i++) {

            if (i == 21 || i == 22 || i == 24 || i == 28) {

                x += 60;

            } else if (i == 20 || i == 23 || i == 25 || i == 26 || i == 27) {

                x += 62;

            } else if (i == 1 || i == 4 || i == 5 || i == 7 || i == 8) {

                x -= 60;

            } else if (i == 2 || i == 3 || i == 6 || i == 9) {

                x -= 62;

            } else if (i == 29 || i == 30 || i == 31 || i == 32 || i == 33 || i == 34 || i == 35 || i == 36 || i == 37) {

                y += 60;

            } else if (i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 18 || i == 19) {

                y -= 60;

            }

            if (i == 0) {

                newCell = new Cell(i, x, y, "gray", "neutral");
                principal.addNode(newCell);

            } else if (i == 1 || i == 5 || i == 9 || i == 13 || i == 17 || i == 19 || i == 23 || i == 25 || i == 28 || i == 31 || i == 34 || i == 37) {

                newCell = new Cell(i, x, y, "blue", "neutral");
                principal.addNode(newCell);

            } else if (i == 2 || i == 7 || i == 11 || i == 16 || i == 22 || i == 27 || i == 32 || i == 36) {

                newCell = new Cell(i, x, y, "yellow", "events");
                principal.addNode(newCell);

            } else if (i == 3 || i == 6 || i == 12 || i == 15 || i == 21 || i == 26 || i == 29 || i == 35) {

                newCell = new Cell(i, x, y, "red", "loseCoins");
                principal.addNode(newCell);

            } else if (i == 4 || i == 8 || i == 10 || i == 14 || i == 18 || i == 20 || i == 24 || i == 30 || i == 33) {

                newCell = new Cell(i, x, y, "green", "winCoins");
                principal.addNode(newCell);

            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField activeCoinsPlayer1;
    public static javax.swing.JTextField activeCoinsPlayer2;
    public static javax.swing.JTextField activeCoinsPlayer3;
    public static javax.swing.JTextField activeCoinsPlayer4;
    public static javax.swing.JTextField activeStarsPlayer1;
    public static javax.swing.JTextField activeStarsPlayer2;
    public static javax.swing.JTextField activeStarsPlayer3;
    public static javax.swing.JTextField activeStarsPlayer4;
    private static javax.swing.JButton btnRollDices;
    private javax.swing.JLabel coinImage1;
    private javax.swing.JLabel coinImage2;
    private javax.swing.JLabel coinImage3;
    private javax.swing.JLabel coinImage4;
    private javax.swing.JLabel diceBackground;
    private javax.swing.JLabel lblLeftDice;
    private javax.swing.JLabel lblRightDice;
    public static javax.swing.JLabel lblStar;
    public static javax.swing.JLabel lblTokenPlayer1;
    public static javax.swing.JLabel lblTokenPlayer2;
    public static javax.swing.JLabel lblTokenPlayer3;
    public static javax.swing.JLabel lblTokenPlayer4;
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
    private static javax.swing.JTextField txtRound;
    private static javax.swing.JTextField txtTurn;
    // End of variables declaration//GEN-END:variables
}
