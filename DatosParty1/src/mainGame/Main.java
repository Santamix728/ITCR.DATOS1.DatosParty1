package mainGame;

/**
 *  Main class for program execution.
 *hola prueba
 */
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window().setVisible(true);
            }
        });

    }

}
