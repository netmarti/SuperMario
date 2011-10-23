

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.*;

/**
 * Clase Principal.
 * 
 * @author Mayra Sánchez
 * @author Luis Malpica
 * @version 23/10/2011
 */
public class SuperMario extends MIDlet {
    
    private Display display;
     private MarioCanvas canvas;
    private Command restartCommand =
            new Command("Juego Nuevo", Command.CANCEL, 8);
    private Command exitCommand =
            new Command("Salir", Command.EXIT, 11);
    private Command pauseCommand =
            new Command("Pause", Command.STOP, 10);
    private Command resumeCommand =
            new Command("Continuar", Command.STOP, 9);
    private Command okCommand =
            new Command("OK", Command.OK, 5);
    private Command guardarCommand =
            new Command("Guardar Juego", Command.OK, 7);
        private Command reanudarCommand =
            new Command("Reanudar Juego", Command.OK, 7);
    private Command helpCommand =
            new Command("Ayuda", Command.HELP, 6);

    public SuperMario() {
        display = Display.getDisplay(this);
        
         canvas = new MarioCanvas();
//        canvas.init();
//        canvas.start();
//        canvas.startGame();
        
        canvas = new MarioCanvas();
        canvas.addCommand(exitCommand);
        canvas.addCommand(pauseCommand);
        canvas.addCommand(restartCommand);
        canvas.addCommand(helpCommand);
        canvas.addCommand(guardarCommand);
        canvas.addCommand(reanudarCommand);
        //canvas.setCommandListener(this);
    }
    
    
    public void startApp() {
        display.setCurrent(canvas);
//        commandAction(resumeCommand, null);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
        display.setCurrent((Displayable) null);
    }
}
