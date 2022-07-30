package com.swl.demossm.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    private String disTime; // 需要处理的参数
    private String format;
    private String value; // 需要的结果数值

    // [重载] 获取时间
    public String getTime() {
        String format = "YYYY-MM-dd HH:mm:ss";
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    // [重载] 获取时间
    public String getTime(String format) {
        if (format == null || !(format instanceof String) || format.length() == 0) {
            format = "YYYY-MM-dd HH:mm:ss";
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public String getTime(String format, String time) {
        if (format == null || !(format instanceof String) || format.length() == 0) {
            format = "YYYY-MM-dd HH:mm:ss";
        }
        if (time == null || !(time instanceof String) || time.length() == 0) {
            time = this.getTime();
        }
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            date = simpleDateFormat.parse(time);
        } catch (Exception e) {
            System.out.println("日志: 报错了");
        }
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) throws Exception {
        TimeUtils timeUtils = new TimeUtils();
//        String time1 = timeUtils.getTime();
//        System.out.println("YYYY-MM-dd HH:mm:ss===>>" + time1);
//
//        String time2 = timeUtils.getTime("YYYY-MM-dd");
//        System.out.println("YYYY-MM-dd===>>" + time2);
//
//        String time3 = timeUtils.getTime("HH:mm:ss");
//        System.out.println("HH:mm:ss===>>" + time3);

//        String time4 = timeUtils.getTime(null, "2022-01-01 18:00:30");
//        System.out.println("YYYY-MM-dd HH:mm:ss===>>" + time4);

//        String time5 = timeUtils.getTime("YYYY-MM-dd", "2022-01-01 18:00:30");
//        System.out.println("YYYY-MM-dd===>>" + time5);
//
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date parse = simpleDateFormat.parse("2022-01-01 18:00:30");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");
        String format = simpleDateFormat1.format(parse);
        System.out.println(format);
        String time6 = timeUtils.getTime("HH:mm:ss", "2022-01-01 18:00:30");
        System.out.println("HH:mm:ss===>>" + time6);
    }
}
