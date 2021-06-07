package day9;

import com.alibaba.fastjson.JSONObject;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.security.PublicKey;
import java.util.List;

public class JsonDemo {
    public static void main(String[] args) {
        String s1 ="[{\"value\":0,\"expression\":\"$.code\"},{\"value\":\"OK\",\"expression\":\"$.msg\"},{\"value\":\"OK\",\"expression\":\"OK\"}]";
        String s2 =" [{\"value\":\"OK\",\"expression\":\"OK\"},{\"value\":\"OK\",\"expression\":\"OK\"},{\"value\":\"OK\",\"expression\":\"OK\"}]";
//        List<JsonValidate> JsonValidate = JSONObject.parseArray(s1,JsonValidate.class);
        jsonDemo(s1);
        jsonDemo(s2);

    }

    public static void jsonDemo(String json){
        List<JsonValidate> JsonValidate = JSONObject.parseArray(json,JsonValidate.class);
        for (JsonValidate j : JsonValidate){
            System.out.print(j+":");
            if (j.getValue().equals(j.getExpression())){
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }
    }


}
