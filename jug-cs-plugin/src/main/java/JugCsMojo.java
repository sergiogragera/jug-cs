import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by sergio on 15/03/17.
 */
@Mojo(name = "jugcs", defaultPhase = LifecyclePhase.COMPILE)
public class JugCsMojo extends AbstractMojo {
    @Parameter(property = "directory", defaultValue = "src/main/webapp")
    private String directory;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        JugCs jugCs = new JugCs(directory);
        jugCs.listFiles();
    }
}
