package SpecuficClass;
import InterfaceClass.Check;
import Model.DistancePoint;
import Model.DistancePointList;
import Model.List;
import Model.originalPoint;

import java.util.ArrayList;

/**
 * 由数学知识 合理点：平均值-3方差<=distance<= 平均值+3方差
 */
public class ReasonableInterval implements Check {


    @Override
    public void isReason(Object c) {
        ArrayList<DistancePoint> distancePointArrayList = (ArrayList<DistancePoint>) c;
        double left = NormalDistribution.getAverage()-3*NormalDistribution.getAverage(); //左边界
        double right = NormalDistribution.getAverage()+3*NormalDistribution.getVariance(); //右边界
        for(int i = 0;i<=distancePointArrayList.size();i++){ // 下面是不符合的
            if(distancePointArrayList.get(i).getDistance()<left || right< distancePointArrayList.get(i).getDistance()){
                  Tag(distancePointArrayList.get(i));
            }
        }
    }

    public  void Tag(DistancePoint distancePoint){
        ArrayList<originalPoint> ListPoint = List.getListPoint();

        for(int i = 0;i<ListPoint.size();i++){
            if(ListPoint.get(i).getId() == distancePoint.getFirstId() || ListPoint.get(i).getId()== distancePoint.getSecondId()){
                ListPoint.get(i).setUnreasonCount(ListPoint.get(i).getUnreasonCount()+1);//不合理次数+1；
            }
        }
    }
}
