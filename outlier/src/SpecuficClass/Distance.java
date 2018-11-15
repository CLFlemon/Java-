package SpecuficClass;

import InterfaceClass.Calculate;
import Model.DistancePoint;
import Model.DistancePointList;
import Model.List;
import Model.originalPoint;

import java.util.ArrayList;

public class Distance  implements Calculate {

    @Override
    /**
     * 将原始的OriginalPointList的每一个与别的点计算出距离
     * 并将结点Add入DistancePointList里面
     */
    public  void calculate(Object c) {
        ArrayList<originalPoint> OriginalPointList = (ArrayList<originalPoint>) c;
        for(int i = 0;i<OriginalPointList.size();i++){
            for(int j = i+1;j<OriginalPointList.size();j++){
                double result = CalculateDistance(OriginalPointList.get(i),OriginalPointList.get(j));
                DistancePointList.Add(new DistancePoint(result,OriginalPointList.get(i).getId(),OriginalPointList.get(j).getId()));

            }

        }
    }

    //距离公式
    public double CalculateDistance(originalPoint first,originalPoint second){
        double temp = first.getX()*second.getX() + first.getY()*second.getY() +  first.getZ()*second.getZ();
        return Math.sqrt(temp);
    }


}
