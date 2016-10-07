package com.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

import com.pojo.DailyCost;
import com.pojo.DailyEvent;
import com.pojo.FinalTotalAnalyse;
import com.pojo.TotalAnalyse;
import com.test.Main;

/**
 * Created by Caesar on 2016/9/11.
 */


/**
 * 工具类，包含添加数据
 * 三个集合的保存与读取
 * 以及根据月份查询返回日消费列表，根据确切日期返回日消费列表
 * @author Caesar
 *
 */
public class Util {
    public static Calendar calendar = Calendar.getInstance();
    public static int month = calendar.get(Calendar.MONTH)+1;//月份
    public static int day = calendar.get(Calendar.DAY_OF_MONTH);//这个月的第几天
    public static int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);//这个星期的第几天，从个星期天开始算
    public static  int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);//属于这个星期的星期几，从星期天开始数，星期天为1


    /**
     * 保存日常消费或者活动消费
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void saveDate() throws FileNotFoundException, IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
        out.writeObject(Main.dailyCostStack);
        out.close();
    }

    /**
     * 读取DailyEvent类集合
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void readDate() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
        Main.dailyCostStack = (Stack<DailyEvent>) in.readObject();
        in.close();
    }

    /**
     * 保存TotalAnalyse类集合
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void saveTotalDate() throws FileNotFoundException, IOException{

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("testTotal.txt"));
        out.writeObject(Main.totalAnalyseStack);
        out.close();
    }

    /**
     * 读取TotalAnalyse类集合
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void readTotalDate() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("testTotal.txt"));
        Main.totalAnalyseStack = (Stack<TotalAnalyse>) in.readObject();
        in.close();
    }

    /**
     * 保存FinalTotalAnalyse类集合
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void saveFinalTotalDate() throws FileNotFoundException, IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("testFinalTotal.txt"));
        out.writeObject(Main.finalTotalAnalyseList);
        out.close();
    }

    /**
     * 读取FinalTotalAnalyse类集合
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void readFinalTotalDate() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("testFinalTotal.txt"));
        Main.finalTotalAnalyseList = (List<FinalTotalAnalyse>) in.readObject();
        in.close();

    }




}


