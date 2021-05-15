package Testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestNgMavenTest {

    private static final Logger LOGGER= LogManager.getLogger(TestNgMavenTest.class);


    @Test

    public void run(){
        LOGGER.info("This is info");
        LOGGER.debug("This is debug");
        LOGGER.warn("This is warn");
        LOGGER.error("This is info");
        LOGGER.fatal("This is info");
    }

}
