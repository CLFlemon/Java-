package SpecuficClass;

import InterfaceClass.Standard;
import Model.OriginalPoint;
import Model.OriginalPointList;

import java.util.ArrayList;

public class UnreasonCount implements Standard {

    @Override
    public void StandardCount() {
        ArrayList<OriginalPoint> originalPointArrayList = OriginalPointList.getListPoint();
        int count = OriginalPointList.getListPoint().size()/4;//
        for(int i = 0;i<originalPointArrayList.size();i++){
              if(count<=originalPointArrayList.get(i).getUnreasonCount()){ //不符合
                  originalPointArrayList.remove(i); //移除
              }
        }
    }
}
