import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import org.junit.runner.notification.Failure;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestRunner {
    public static void main(String[] args) {

        Logger logger
                = Logger.getLogger(
                TestRunner.class.getName());

        Result result = JUnitCore.runClasses(Dec2HexTest.class);
        int fails = 0;
        try {
            for (Failure failure : result.getFailures()) {
                logger.log(Level.WARNING,failure.toString());
                fails++;
            }
            if (fails > 0)
                throw new Exception();
            logger.log(Level.INFO,"all tests have passed: {0} ", result.wasSuccessful());
        } catch (Exception e) {
            logger.log(Level.WARNING,"{0} tests failed", fails);
            System.exit(1);
        }
        System.exit(0);
    }
}
