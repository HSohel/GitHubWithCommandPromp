package runner;

import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    @Test
    public void executeFailedTestCase(){
        TestNG runner=new TestNG();
        List<String> list=new ArrayList<>();
        list.add("Path for the testing-failed.xml");
        runner.setTestSuites(list);
        runner.run();
    }
}
