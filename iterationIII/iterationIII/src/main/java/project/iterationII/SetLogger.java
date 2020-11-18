package project.iterationII;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.SimpleFormatter;

public class SetLogger {
    //private static final Logger LOGGER = Logger.getLogger("");
	static Logger LOGGER;
    static private SimpleFormatter formatterTxt;
    static private FileHandler fileTxt;

    public static Logger setUp() throws IOException {

        Logger rootLogger = Logger.getLogger("");

        LogManager.getLogManager().reset();

        //set level of logger
        LOGGER.setLevel(Level.INFO);
        
        fileTxt = new FileHandler("project.log");
        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        LOGGER.addHandler(fileTxt);
        return LOGGER;
	
    }
}
