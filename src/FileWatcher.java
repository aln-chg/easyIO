import java.io.IOException;
import java.nio.file.*;

public class FileWatcher {

    public void watchDirectory(String directoryPath) {
        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();

            Path path = Paths.get(directoryPath);

        } catch (IOException e) {
                System.err.println("IOExecption: " + e.getMessage());
        }

    }

}
