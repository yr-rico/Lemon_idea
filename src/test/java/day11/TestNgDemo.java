package day11;

import org.testng.annotations.*;

public class TestNgDemo {
//
// 顺序   @BeforeSuite ->@BeforeTest->@BeforeClass->@BeforeMethod->@Test->@AfterMethod->@AfterSuite
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite 第一个执行");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeSuite之后，BeforeTest执行");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeTest之后，BeforeClass执行");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeClass之后，BeforeMethod执行");
    }
    @Test
    public void Test(){
        System.out.println("BeforeMethod之后，执行Test");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("test之后，执行AfterMethod");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterMethod之后，执行AfterSuite，最后一个执行");
    }
}
