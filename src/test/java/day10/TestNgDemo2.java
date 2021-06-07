package day10;

import org.testng.annotations.*;

public class TestNgDemo2 {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("..........TestNgDemo2.beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("..........TestNgDemo2.afterSuite");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("..........TestNgDemo2.BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("..........TestNgDemo2.AfterTest");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("..........TestNgDemo2.BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("..........TestNgDemo2.AfterClass");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("..........TestNgDemo2.BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("..........TestNgDemo2.AfterMethod");
    }
    @Test
    public void test2(){
        System.out.println("test2执行=--=-=-=-=-=-=-=-=--=-=-=-");
    }



}
