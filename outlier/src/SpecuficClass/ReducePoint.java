package SpecuficClass;
import InterfaceClass.Reduce;
import Model.*;

import java.util.ArrayList;

/**
 * 手动输入合理区间
 */
public class ReducePoint implements Reduce {

    @Override
    public void reduce(double eps){
        ArrayList<DistancePoint> distancePointArrayList = DistancePointList.getDistancepointlist();

        for(int i = 0;i<distancePointArrayList.size();i++){
             isExit(distancePointArrayList.get(i),eps);
        }
    }



    public void isExit(DistancePoint distancePoint,double eps){
        int i;
        ArrayList<Interval> intervalArrayList = IntervalList.getIntervalArrayList();
        for(i = 0;i<intervalArrayList.size();i++){
             double distance = distancePoint.getDistance();
             double left = intervalArrayList.get(i).getLeft();
             double right = intervalArrayList.get(i).getRight();
             if( left <= distance && distance<= right){
                 intervalArrayList.get(i).setThisIntervalCount(intervalArrayList.get(i).getThisIntervalCount()+1);
                 break;
             }
        }
        if(i == intervalArrayList.size()){ //不存在 添加新点
            IntervalList.Add(new Interval(distancePoint.getDistance()-eps,distancePoint.getDistance()+eps));
        }
    }
}
