package day8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import day9.JsonValidate;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsonDemo {
    public static void main(String[] args) {
        String json = " {\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"}";
        Students s1=JSONObject.parseObject(json,Students.class);
        System.out.println(s1);


        String json2=" [{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"},{\"name\": \"李四\", \"age\": \"16\", \"score\":\"100\"}]";
        List list=JSONObject.parseArray(json2,Students.class);
        System.out.println(list);


        String json3 = "{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, { \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }\n" +
                "\n";
        /*扩展题*/
        System.out.println("********************方式一************************");

        JSONObject js = JSONObject.parseObject(json3);
        String  str = js.get("provinces").toString();
        List<Space> s = JSONObject.parseArray(str,Space.class);
        for (int i = 0; i <s.size(); i++) {
            Space space = s.get(i);
            System.out.println(space);
        }

        System.out.println("********************方式二************************");
        JSONObject jsonObject = JSONObject.parseObject(json3);
        JSONArray jsonArray = jsonObject.getJSONArray("provinces");
        for (int i = 0; i <jsonArray.size() ; i++) {
            JSONObject object = jsonArray.getJSONObject(i);
            Space space = JSONObject.toJavaObject(object,Space.class);
            System.out.println(space);
        }
        System.out.println("********************方式三************************");
        City city = JSONObject.parseObject(json3,City.class);
        System.out.println(city.toString());




    }


}
