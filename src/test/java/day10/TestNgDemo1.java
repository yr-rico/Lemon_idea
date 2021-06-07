package day10;

import org.testng.annotations.*;

public class TestNgDemo1 {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("..........TestNgDemo1.beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("..........TestNgDemo1.afterSuite");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("..........TestNgDemo1.BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("..........TestNgDemo1.AfterTest");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("..........TestNgDemo1.BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("..........TestNgDemo1.AfterClass");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("..........TestNgDemo1.BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("..........TestNgDemo1.AfterMethod");
    }
    @Test
    public void test1(){
        System.out.println("test1执行=--=-=-=-=-=-=-=-=--=-=-=-");
    }
    @Test
    public void test4(){
        System.out.println("test4执行=--=-=-=-=-=-=-=-=--=-=-=-");
    }
}
