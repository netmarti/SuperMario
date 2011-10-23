
import java.io.IOException;
import java.io.InputStream;

/**
 * Realiza la lectura del archivo de datos y lo representa en una matriz.
 * 
 * @author Mayra Sánchez
 * @author Luis Malpica
 * @version 23/10/2011
 */
public class Tablero {
    public char[][] matriz;
    public int width,  height;

    public Tablero() {
    }
    
    void read(InputStream is, int lev) {
//        int i = 0, j = 0;
//        try {
//            int c;
//            String row = "", col = "";
//            for (int k = 0; k < 2; k++) {
//                if ((c = is.read()) == -1) {
//                    break;
//                }
//                row += (char) c;
//            }
//            is.read();
//            for (int k = 0; k < 2; k++) {
//                if ((c = is.read()) == -1) {
//                    break;
//                }
//                col += (char) c;
//            }
//            is.read();
//            try {
//                height = Integer.parseInt(row);
//                width = Integer.parseInt(col);
//                //System.out.println(width+" "+height);
//                matriz = new char[height][width];
//            } catch (Exception exception) {
//                System.out.println("Error al crear matriz col el tamano: " + row + " " + col);
//                exception.printStackTrace();
//                return;
//            }
//            //int i = 0, j = 0;
            int i = 0, j = 0;
            
            while ((c = is.read()) != -1) {
                if ((char) c == '\n') {
                    i++;
                    j = 0;
                    if (matriz.length == i) {
                        break;
                    }
                    continue;
                }
                matriz[i][j] = (char) c;
                j++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
