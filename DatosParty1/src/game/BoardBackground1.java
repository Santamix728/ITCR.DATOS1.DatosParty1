
package game;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class BoardBackground1 extends JPanel{
    
        private Image background1;
        @Override
        public void paint(Graphics g){
            background1 = new ImageIcon(getClass().getResource("/images/Board/board.png")).getImage();
            g.drawImage(background1,0,0,getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
        }
    }
    
