package com.itheima.web.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTask {
    public void cs(){
        System.out.println("现在的时间是："+new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss").format(new Date()));
    }
}
