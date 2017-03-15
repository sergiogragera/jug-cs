import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by sergio on 15/03/17.
 */
public class JugCsTask extends DefaultTask {
    @TaskAction
    public void jugcs() {
        JugCsExtension extension = getProject().getExtensions().findByType(JugCsExtension.class);
        if (extension == null) {
            extension = new JugCsExtension();
        }

        String directory = extension.getDirectory();

        JugCs jugCs = new JugCs(directory);
        jugCs.listFiles();
    }
}
