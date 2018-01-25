package sk.akademiasovy.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by host on 23.1.2018.
 */
public class MyDate {
    public void today(){
        Date date =new Date();
        System.out.println(date);
    }
    public void today2(){
        Date date =new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy , HH:mm:ss EEEE");
        System.out.println(sdf.format(date));
    }
}
