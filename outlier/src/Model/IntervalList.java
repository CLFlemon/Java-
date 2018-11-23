package Model;

import java.util.ArrayList;

public class IntervalList {

    private  static ArrayList<Interval> intervalArrayList = new ArrayList<Interval>();

    public static ArrayList<Interval> getIntervalArrayList() {
        return intervalArrayList;
    }

    public static  void Add(Interval interval){
        intervalArrayList.add(interval);
    }

    public static  void Show(){
        for (int i = 0;i<intervalArrayList.size();i++) {
             System.out.println("左边界："+intervalArrayList.get(i).getLeft()+" 右边界"+intervalArrayList.get(i).getRight()+" 次数"+intervalArrayList.get(i).getThisIntervalCount());
        }
    }
}
