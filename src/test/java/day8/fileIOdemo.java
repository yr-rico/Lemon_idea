package day8;



import java.io.*;
import java.util.Properties;

public class fileIOdemo {
    public static void main(String[] args) throws Exception {
//        Properties prop =new Properties();
////        prop.setProperty("url","sshhs");
////        FileOutputStream fos = new FileOutputStream("D:\\LemonClass\\code\\java29_maven_base\\src\\test\\resources\\config.porperties");
////        prop.store(fos,"备注");
//        FileInputStream fis = new FileInputStream("D:\\LemonClass\\code\\java29_maven_base\\src\\test\\resources\\config.porperties");
//        prop.load(fis);
//        System.out.println(prop);



//        String str = "D:\\CSVData\\iodemo.txt";
        File file =new File(String.format("D:\\CSVData\\%s.txt","iodemo"));
        FileInputStream fot = new FileInputStream(file);
//        fot.
//        FileWriter fw = new FileWriter(file);
//        fw.write("wewqer");
//        fw.flush();
//        fw.close();
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        System.out.println(br.readLine());
////        System.out.println(file.exists());

    }




}
