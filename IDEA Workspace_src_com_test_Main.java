package com.test;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import com.pojo.DailyCost;
import com.pojo.DailyEvent;
import com.pojo.FinalTotalAnalyse;
import com.pojo.TotalAnalyse;
import com.util.Util;

/**
 * Created by Caesar on 2016/9/11.
 */
public class Main {
    public static Stack<DailyEvent> dailyCostStack = new Stack<DailyEvent>();
    public static Stack<TotalAnalyse> totalAnalyseStack = new Stack<TotalAnalyse>();
    public static List<FinalTotalAnalyse> finalTotalAnalyseList = new LinkedList<FinalTotalAnalyse>();
}
