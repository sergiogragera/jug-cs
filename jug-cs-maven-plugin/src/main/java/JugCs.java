import java.io.File;

/**
 * Created by sergio on 15/03/17.
 */
public class JugCs {
    private String directory;

    JugCs(String directory) {
        this.directory = directory;
    }

    public void listFiles() {
        File root = new File(directory);
        if (root.exists()) {
            listFiles(root);
        } else {
            System.out.println(String.format("No existe el directorio %s", directory));
        }
    }

    public void listFiles(File root) {
        if (root.exists()) {
            for (File file : root.listFiles()) {
                if (file.isFile()) {
                    System.out.println(String.format("Detectado archivo %s", file.getName()));
                }
                else if (file.isDirectory()) {
                    listFiles(file);
                }
            }
        } else {
            System.out.println(String.format("No existe el directorio %s", root.getName()));
        }
    }
}
