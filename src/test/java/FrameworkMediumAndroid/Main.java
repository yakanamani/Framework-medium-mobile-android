package FrameworkMediumAndroid;

import org.testng.TestNG;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<String> testFilesList = new ArrayList<>();
        testFilesList.add("testng.xml");
        TestNG testng = new TestNG();
        testng.setTestSuites(testFilesList);
        testng.run();

    }
}
