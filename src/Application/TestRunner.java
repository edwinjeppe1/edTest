package Application;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import Tests.ApplicationTests;


public class TestRunner{
  public static void main(String args[]){
    Result result = JUnitCore.runClasses(ApplicationTests.class);
    int errorCtr = 0;
    for (Failure failure : result.getFailures()) {
      errorCtr++;
      System.out.println("Error #:"+ errorCtr);
      System.out.println(failure.toString());
      System.out.println();
    }

    if (errorCtr == 0)
      System.out.println("All tests passed");
  }
} 