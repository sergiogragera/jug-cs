import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sergio on 15/03/17.
 */
public class JugCs {
    private static final Logger logger = Logger.getLogger("JugCs");

    private String directory;

    JugCs(String directory) {
        this.directory = directory;
    }

    public void listFiles() {
        File root = new File(directory);
        if (root.exists()) {
            listFiles(root);
        } else {
            logger.log(Level.SEVERE, String.format("No existe el directorio %s", directory));
        }
    }

    public void listFiles(File root) {
        if (root.exists()) {
            logger.log(Level.INFO, String.format("Recorremos directorio %s", root.getName()));

            for (File file : root.listFiles()) {
                if (file.isFile()) {
                    logger.log(Level.INFO, String.format("Detectado archivo %s", file.getName()));
                }
                else if (file.isDirectory()) {
                    listFiles(file);
                }
            }
        } else {
            logger.log(Level.SEVERE, String.format("No existe el directorio %s", root.getName()));
        }
    }
}
