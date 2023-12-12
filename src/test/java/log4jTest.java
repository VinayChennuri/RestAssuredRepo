import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4jTest {

	private static final Logger logger = LogManager.getLogger(log4jTest.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		logger.info("Test Start");
		logger.warn("Test Fail");
		logger.error("Error Message");
		logger.debug("Debugging");

	}

}
