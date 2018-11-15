package SpecuficClass;

import InterfaceClass.AfterCalculate;
import Model.DistancePoint;
import Model.DistancePointList;

import java.util.ArrayList;

public class NormalDistribution implements AfterCalculate {

    private static double average;
    private static double variance; //方差
    @Override
    public void analyes(Object c) {
        ArrayList<DistancePoint> distancePointsList = (ArrayList<DistancePoint>) c;
        CalculateAverage(distancePointsList);
        CalculateVariance(distancePointsList);
    }

    public void CalculateAverage(ArrayList<DistancePoint> distancePointList){
        double sum = 0;
        for(int i = 0;i<distancePointList.size();i++){
            sum += distancePointList.get(i).getDistance();
        }
        average = sum/distancePointList.size();
        System.out.println("平均值为="+average);
    }

    public void CalculateVariance(ArrayList<DistancePoint> distancePointList){
        double sum=0;
        for (int i = 0 ; i<distancePointList.size();i++){
            sum += (distancePointList.get(i).getDistance()-average)*(distancePointList.get(i).getDistance()-average);
        }
        System.out.println("未改变前"+sum/distancePointList.size());
        variance = Math.sqrt(sum/distancePointList.size());
        System.out.println("方差为"+variance);
    }

    public static double getVariance() {
        return variance;
    }


    public static double getAverage() {
        return average;
    }
}
