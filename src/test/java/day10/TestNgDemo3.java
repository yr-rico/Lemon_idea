package day10;

import org.testng.annotations.*;

public class TestNgDemo3 {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("..........TestNgDemo3.beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("..........TestNgDemo3.afterSuite");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("..........TestNgDemo3.BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("..........TestNgDemo3.AfterTest");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("..........TestNgDemo3.BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("..........TestNgDemo3.AfterClass");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("..........TestNgDemo3.BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("..........TestNgDemo3.AfterMethod");
    }
    @Test
    public void test1(){
        System.out.println("test3执行=--=-=-=-=-=-=-=-=--=-=-=-");
    }
}
