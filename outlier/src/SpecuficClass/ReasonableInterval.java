package SpecuficClass;
import InterfaceClass.Check;
import Model.DistancePoint;
import Model.DistancePointList;
import Model.OriginalPointList;
import Model.OriginalPoint;

import java.util.ArrayList;

/**
 * 由数学知识 合理点：平均值-3方差<=distance<= 平均值+3方差
 */
public class ReasonableInterval implements Check {


    @Override
    public void isReason() {
        ArrayList<DistancePoint> distancePointArrayList = DistancePointList.getDistancepointlist();
        double left = NormalDistribution.getAverage()-3*NormalDistribution.getAverage(); //左边界
        double right = NormalDistribution.getAverage()+3*NormalDistribution.getVariance(); //右边界
        System.out.println("左边界是："+left+"有边界是： "+right);
        for(int i = 0;i<distancePointArrayList.size();i++){ // 下面是不符合的
            System.out.println("当前距离点："+distancePointArrayList.get(i).getDistance());
            if(distancePointArrayList.get(i).getDistance()<left || right< distancePointArrayList.get(i).getDistance()){
                  Tag(distancePointArrayList.get(i));
            }
        }
    }

    public  void Tag(DistancePoint distancePoint){
        ArrayList<OriginalPoint> ListPoint = OriginalPointList.getListPoint();

        for(int i = 0;i<ListPoint.size();i++){
            if(ListPoint.get(i).getId() == distancePoint.getFirstId() || ListPoint.get(i).getId()== distancePoint.getSecondId()){
                System.out.print("不合理拉");
                ListPoint.get(i).setUnreasonCount(ListPoint.get(i).getUnreasonCount()+1);//不合理次数+1；
            }
        }
    }
}
