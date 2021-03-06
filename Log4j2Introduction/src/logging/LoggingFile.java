package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFile {
    private static final Logger log = LogManager.getLogger(LoggingFile.class.getName());

    public static void main(String[] args) {
        log.debug("Debug Message");
        log.error("Error Message");
        log.fatal("Fatal Message");
    }
}
