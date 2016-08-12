package Demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * Created by smq on 16/6/30.
 */
public class common {
    //返回默认属性文件的属性值
    public static String GetConfigValue(String propName) throws IOException {
        String  propValue="";
        InputStream path1 =Thread.currentThread().getContextClassLoader().getResourceAsStream("datasource1-context.properties");
        Properties pro = new Properties();//属性集合对象
        pro.load(path1);
        propValue = pro.getProperty(propName);
        return  propValue;
    }
    public static String GetCurrentDateTime(){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式

        String str = dateFormat.format( now );
        return str;
    }
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式


        String hehe = dateFormat.format( now );
        System.out.println(hehe);

        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改




        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println(year + "/" + month + "/" + date + " " +hour + ":" +minute + ":" + second);
    }
}
