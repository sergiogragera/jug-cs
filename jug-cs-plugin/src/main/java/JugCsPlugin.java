import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by sergio on 15/03/17.
 */
public class JugCsPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getExtensions().create("jugcs", JugCsExtension.class);
        project.getTasks().create("jugcs", JugCsTask.class);
    }
}
