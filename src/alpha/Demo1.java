package alpha;

import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {

		log.debug("I have clicked on button. Debug message");

		log.error("Button is NOT displayed. Error message");

		log.info("Button is displayed. Info message");

		log.fatal("Button is missing. Fatal message");
	}
}