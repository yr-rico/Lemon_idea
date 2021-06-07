package day11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPar {

//    @Test
////    @Parameters({"username","password","type","sex"})
////    public void register(String username,String password,String type,String sex){
////        System.out.println("username = [" + username + "], password = [" + password + "], type = [" + type + "], sex = [" + sex + "]");
////    }
    @Test(dataProvider = "dataSet")
    public void register1(String username,String password,String type,String sex){
        System.out.println("username = [" + username + "], password = [" + password + "], type = [" + type + "], sex = [" + sex + "]");
    }
    @Test(dataProvider = "datas")
    public void register(Students students){
//        System.out.println("username = [" + username + "], password = [" + password + "], type = [" + type + "], sex = [" + sex + "]");
        System.out.println(students);
    }
    @DataProvider
    public Object[] datas(){
        Students s1 =new Students("张三","123456","work","boy");
        Students s2 =new Students("张三","123456","work","boy");
        Students s3 =new Students("张三","123456","work","boy");
        Students s4 =new Students("张三","123456","work","boy");
        Students s5 =new Students("张三","123456","work","boy");
        Object[] arr = {s1,s2,s3,s4,s5};
        return  arr;
    }

    @DataProvider
    public Object[] dataSet(){
        Object[][] arr ={
                {"张三","123456","work","boy"},
                {"李四","123456","work","girl"},
                {"王五","123456","work","boy"},
                {"小六","123456","work","girl"},
                {"老七","123456","work","boy"},
        };
        return arr;
    }
}
