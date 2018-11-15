package SpecuficClass;

import InterfaceClass.Calculate;
import Model.DistancePoint;
import Model.DistancePointList;
import Model.OriginalPointList;
import Model.OriginalPoint;

import java.util.ArrayList;

public class Distance  implements Calculate {

    @Override
    /**
     * 将原始的OriginalPointList的每一个与别的点计算出距离
     * 并将结点Add入DistancePointList里面
     */
    public  void calculate() {
        ArrayList<OriginalPoint> originalPointArrayList = OriginalPointList.getListPoint();
        for(int i = 0;i<originalPointArrayList.size();i++){
            for(int j = i+1;j<originalPointArrayList.size();j++){
                double result = CalculateDistance(originalPointArrayList.get(i),originalPointArrayList.get(j));
                System.out.println("result= "+result);
                DistancePointList.Add(new DistancePoint(result,originalPointArrayList.get(i).getId(),originalPointArrayList.get(j).getId()));
            }

        }
    }

    //距离公式
    public double CalculateDistance(OriginalPoint first, OriginalPoint second){

        double temp = Math.pow(first.getX()-second.getX(),2) + Math.pow(first.getY()-second.getY(),2)+Math.pow(first.getZ()-second.getZ(),2);
        return Math.sqrt(temp);
    }


}
