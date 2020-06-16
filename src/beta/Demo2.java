package beta;

import org.apache.logging.log4j.*;

public class Demo2 {

	private static Logger log = LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {

		log.debug("I have clicked on button. Debug message");

		log.error("Button is NOT displayed. Error message");

		log.info("Button is displayed. Info message");

		log.fatal("Button is missing. Fatal message");
	}
}