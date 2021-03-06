package mainGame;

import javax.swing.ButtonGroup;

/**
 * Class responsible for configuring the graphic components of the main window
 * and other functions.
 */
public class Window extends javax.swing.JFrame {

    private boolean validNames = false;
    private boolean emptyFields = true;
    public static boolean player1Active = true;
    public static boolean player2Active = true;
    public static boolean player3Active = false;
    public static boolean player4Active = false;

    public Window() {

        initComponents();
        configComponents();

    }

    /**  
     * Method for configuring window components.
     */
    public void configComponents() {

        ButtonGroup group = new ButtonGroup();
        group.add(button2Players);
        group.add(button3Players);
        group.add(button4Players);
        setLocationRelativeTo(null);
        name1Txt.setVisible(true);
        name2Txt.setVisible(true);
        name3Label.setVisible(false);
        name3Txt.setVisible(false);
        name4Label.setVisible(false);
        name4Txt.setVisible(false);
        errorSameName.setVisible(false);
        errorWithoutName.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowPanel = new javax.swing.JPanel();
        datosPartyImage = new javax.swing.JLabel();
        playersNumber = new javax.swing.JLabel();
        button2Players = new javax.swing.JRadioButton();
        button3Players = new javax.swing.JRadioButton();
        button4Players = new javax.swing.JRadioButton();
        name1Label = new javax.swing.JLabel();
        name2Label = new javax.swing.JLabel();
        name3Label = new javax.swing.JLabel();
        name4Label = new javax.swing.JLabel();
        name1Txt = new javax.swing.JTextField();
        name2Txt = new javax.swing.JTextField();
        name3Txt = new javax.swing.JTextField();
        name4Txt = new javax.swing.JTextField();
        windowImage2 = new javax.swing.JLabel();
        windowImage1 = new javax.swing.JLabel();
        startGameButton = new javax.swing.JLabel();
        errorSameName = new javax.swing.JLabel();
        errorWithoutName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Party 1");
        setResizable(false);

        windowPanel.setBackground(new java.awt.Color(47, 82, 245));
        windowPanel.setToolTipText("");
        windowPanel.setMinimumSize(new java.awt.Dimension(774, 592));
        windowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datosPartyImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosPartyImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Window/DatosParty.png"))); // NOI18N
        windowPanel.add(datosPartyImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 780, 70));

        playersNumber.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        playersNumber.setText("Ingrese la cantidad de jugadores:");
        windowPanel.add(playersNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        button2Players.setBackground(new java.awt.Color(47, 82, 245));
        button2Players.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button2Players.setSelected(true);
        button2Players.setText("2");
        button2Players.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2PlayersMouseClicked(evt);
            }
        });
        windowPanel.add(button2Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 60, 30));

        button3Players.setBackground(new java.awt.Color(47, 82, 245));
        button3Players.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button3Players.setText("3");
        button3Players.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3PlayersMouseClicked(evt);
            }
        });
        windowPanel.add(button3Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 60, 30));

        button4Players.setBackground(new java.awt.Color(47, 82, 245));
        button4Players.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button4Players.setText("4");
        button4Players.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4PlayersMouseClicked(evt);
            }
        });
        windowPanel.add(button4Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 60, 30));

        name1Label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        name1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1Label.setText("Nombre Jugador 1:");
        windowPanel.add(name1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 770, -1));

        name2Label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        name2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2Label.setText("Nombre Jugador 2:");
        windowPanel.add(name2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 770, -1));

        name3Label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        name3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3Label.setText("Nombre Jugador 3:");
        windowPanel.add(name3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 770, -1));

        name4Label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        name4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4Label.setText("Nombre Jugador 4:");
        windowPanel.add(name4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 770, -1));

        name1Txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name1Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name1Txt.setToolTipText("");
        name1Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name1TxtKeyTyped(evt);
            }
        });
        windowPanel.add(name1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 180, -1));

        name2Txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name2Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name2Txt.setToolTipText("");
        name2Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name2TxtKeyTyped(evt);
            }
        });
        windowPanel.add(name2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 180, -1));

        name3Txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name3Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name3Txt.setToolTipText("");
        name3Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name3TxtKeyTyped(evt);
            }
        });
        windowPanel.add(name3Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 180, -1));

        name4Txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name4Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name4Txt.setToolTipText("");
        name4Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name4TxtKeyTyped(evt);
            }
        });
        windowPanel.add(name4Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 180, -1));

        windowImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Window/imagen2.png"))); // NOI18N
        windowPanel.add(windowImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        windowImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Window/imagen1.png"))); // NOI18N
        windowPanel.add(windowImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 270, 270));

        startGameButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Window/start.png"))); // NOI18N
        startGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startGameButtonMouseClicked(evt);
            }
        });
        windowPanel.add(startGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 680, 60));

        errorSameName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        errorSameName.setForeground(new java.awt.Color(255, 255, 255));
        errorSameName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorSameName.setText("Error: Se agregaron nombres iguales.");
        windowPanel.add(errorSameName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 780, 30));

        errorWithoutName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        errorWithoutName.setForeground(new java.awt.Color(255, 255, 255));
        errorWithoutName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorWithoutName.setText("Error: Se encontraron nombres sin llenar.");
        windowPanel.add(errorWithoutName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 780, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method for choosing the number of players.
     * @param evt 
     */
    private void button2PlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2PlayersMouseClicked

        name1Label.setVisible(true);
        name2Label.setVisible(true);
        name3Label.setVisible(false);
        name4Label.setVisible(false);

        name1Txt.setVisible(true);
        name2Txt.setVisible(true);
        name3Txt.setVisible(false);
        name4Txt.setVisible(false);

    }//GEN-LAST:event_button2PlayersMouseClicked

    /**
     * Method for choosing the number of players.
     * @param evt 
     */
    private void button3PlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3PlayersMouseClicked

        name1Label.setVisible(true);
        name2Label.setVisible(true);
        name3Label.setVisible(true);
        name4Label.setVisible(false);

        name1Txt.setVisible(true);
        name2Txt.setVisible(true);
        name3Txt.setVisible(true);
        name4Txt.setVisible(false);

    }//GEN-LAST:event_button3PlayersMouseClicked

    /**
     * Method for choosing the number of players.
     * @param evt 
     */
    private void button4PlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4PlayersMouseClicked

        name1Label.setVisible(true);
        name2Label.setVisible(true);
        name3Label.setVisible(true);
        name4Label.setVisible(true);

        name1Txt.setVisible(true);
        name2Txt.setVisible(true);
        name3Txt.setVisible(true);
        name4Txt.setVisible(true);

    }//GEN-LAST:event_button4PlayersMouseClicked

    private void startGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameButtonMouseClicked

        checkNames();

    }//GEN-LAST:event_startGameButtonMouseClicked

    /**
     * Checking valid characters in names.
     * @param evt 
     */
    private void name1TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1TxtKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {

            name1Txt.setEditable(true);

        } else {

            name1Txt.setEditable(false);

        }

    }//GEN-LAST:event_name1TxtKeyTyped

    /**
     * Checking valid characters in names.
     * @param evt 
     */
    private void name2TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name2TxtKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {

            name2Txt.setEditable(true);

        } else {

            name2Txt.setEditable(false);

        }

    }//GEN-LAST:event_name2TxtKeyTyped

    /**
     * Checking valid characters in names.
     * @param evt 
     */
    private void name3TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name3TxtKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {

            name3Txt.setEditable(true);

        } else {

            name3Txt.setEditable(false);

        }

    }//GEN-LAST:event_name3TxtKeyTyped

    /**
     * Checking valid characters in names.
     * @param evt 
     */
    private void name4TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name4TxtKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {

            name4Txt.setEditable(true);

        } else {

            name4Txt.setEditable(false);

        }

    }//GEN-LAST:event_name4TxtKeyTyped

    /**
     * Method for comparing equal names and empty fields.
     */
    public void checkNames() {

        if (validNames == true && emptyFields == false) {

            Board board = new Board();
            board.setVisible(true);
            dispose();

        }

        if (name1Txt.isVisible() && name2Txt.isVisible() && name3Txt.isVisible() == false && name4Txt.isVisible() == false) {

            if (errorSameName.isVisible()) {

                errorSameName.setVisible(false);

            }

            if (errorWithoutName.isVisible()) {

                errorWithoutName.setVisible(false);

            }

            if (name1Txt.getText().isEmpty() || name2Txt.getText().isEmpty()) {

                errorWithoutName.setVisible(true);
                emptyFields = true;
                validNames = false;

            } else if (name1Txt.getText().equals(name2Txt.getText())) {

                errorSameName.setVisible(true);
                validNames = false;
                emptyFields = false;

            } else {

                validNames = true;
                emptyFields = false;

                player1Active = true;
                player2Active = true;

            }

        } else if (name1Txt.isVisible() && name2Txt.isVisible() && name3Txt.isVisible() && name4Txt.isVisible() == false) {

            if (errorSameName.isVisible()) {

                errorSameName.setVisible(false);

            }

            if (errorWithoutName.isVisible()) {

                errorWithoutName.setVisible(false);

            }

            if (name1Txt.getText().isEmpty() || name2Txt.getText().isEmpty() || name3Txt.getText().isEmpty()) {

                errorWithoutName.setVisible(true);
                emptyFields = true;
                validNames = false;

            } else if (name1Txt.getText().equals(name2Txt.getText())
                    || name1Txt.getText().equals(name3Txt.getText())
                    || name2Txt.getText().equals(name3Txt.getText())) {

                errorSameName.setVisible(true);

                validNames = false;
                emptyFields = false;

            } else {

                validNames = true;
                emptyFields = false;
                player1Active = true;
                player2Active = true;
                player3Active = true;

            }

        } else if (name1Txt.isVisible() && name2Txt.isVisible() && name3Txt.isVisible() && name4Txt.isVisible()) {

            if (errorSameName.isVisible()) {

                errorSameName.setVisible(false);

            }
            if (errorWithoutName.isVisible()) {

                errorWithoutName.setVisible(false);

            }

            if (name1Txt.getText().isEmpty() || name2Txt.getText().isEmpty() || name3Txt.getText().isEmpty() || name4Txt.getText().isEmpty()) {

                errorWithoutName.setVisible(true);
                emptyFields = true;
                validNames = false;

            } else if (name1Txt.getText().equals(name2Txt.getText())
                    || name1Txt.getText().equals(name3Txt.getText())
                    || name1Txt.getText().equals(name4Txt.getText())
                    || name2Txt.getText().equals(name3Txt.getText())
                    || name2Txt.getText().equals(name4Txt.getText())
                    || name3Txt.getText().equals(name4Txt.getText())) {

                errorSameName.setVisible(true);
                validNames = false;
                emptyFields = false;

            } else {

                validNames = true;
                emptyFields = false;
                player1Active = true;
                player2Active = true;
                player3Active = true;
                player4Active = true;

            }

        }

    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton button2Players;
    private javax.swing.JRadioButton button3Players;
    private javax.swing.JRadioButton button4Players;
    private javax.swing.JLabel datosPartyImage;
    private javax.swing.JLabel errorSameName;
    private javax.swing.JLabel errorWithoutName;
    private javax.swing.JLabel name1Label;
    public static javax.swing.JTextField name1Txt;
    private javax.swing.JLabel name2Label;
    public static javax.swing.JTextField name2Txt;
    private javax.swing.JLabel name3Label;
    public static javax.swing.JTextField name3Txt;
    private javax.swing.JLabel name4Label;
    public static javax.swing.JTextField name4Txt;
    private javax.swing.JLabel playersNumber;
    private javax.swing.JLabel startGameButton;
    private javax.swing.JLabel windowImage1;
    private javax.swing.JLabel windowImage2;
    private javax.swing.JPanel windowPanel;
    // End of variables declaration//GEN-END:variables
}
