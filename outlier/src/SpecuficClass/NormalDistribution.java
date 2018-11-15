package SpecuficClass;

import InterfaceClass.AfterCalculate;
import Model.DistancePoint;
import Model.DistancePointList;

import java.util.ArrayList;

public class NormalDistribution implements AfterCalculate {

    private static double average;
    private static double variance; //方差
    @Override
    public void analyes() {
        ArrayList<DistancePoint> distancePointArrayList = DistancePointList.getDistancepointlist();
        CalculateAverage(distancePointArrayList);
        CalculateVariance(distancePointArrayList);
    }

    public void CalculateAverage(ArrayList<DistancePoint> distancePointArrayList){
        double sum = 0;
        for(int i = 0;i<distancePointArrayList.size();i++){
            sum += distancePointArrayList.get(i).getDistance();
        }
        average = sum/distancePointArrayList.size();
        System.out.println("平均值为="+average);
    }

    public void CalculateVariance(ArrayList<DistancePoint> distancePointArrayList){
        double sum=0;
        for (int i = 0 ; i<distancePointArrayList.size();i++){
            sum += (distancePointArrayList.get(i).getDistance()-average)*(distancePointArrayList.get(i).getDistance()-average);
        }
        System.out.println("未改变前"+sum/distancePointArrayList.size());
        variance = Math.sqrt(sum/distancePointArrayList.size());
        System.out.println("方差为"+variance);
    }

    public static double getVariance() {
        return variance;
    }


    public static double getAverage() {
        return average;
    }
}
