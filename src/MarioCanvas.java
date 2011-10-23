
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/**
 * Area de Dibujo del Juego.
 * 
 * @author Mayra Sánchez
 * @author Luis Malpica
 * @version 23/10/2011
 */
public class MarioCanvas extends Canvas {

    private int ancho = this.getWidth();
    private int alto = this.getHeight();
    private int tam= 20;
//    private int ca
    

    protected void paint(Graphics g) {
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, ancho, alto);
        g.setColor(0, 0, 0);
        g.fillRect(10, 10, 100, 100);
    }
}
