package SpecuficClass;

import InterfaceClass.StandardCount;
import Model.OriginalPoint;
import Model.OriginalPointList;

import java.util.ArrayList;

public class UnreasonCount implements StandardCount {

    @Override
    public void StandardCount() {
        ArrayList<OriginalPoint> originalPointArrayList = OriginalPointList.getListPoint();
        int count = OriginalPointList.getListPoint().size()/2;
        System.out.println("原始点有多少个："+OriginalPointList.getListPoint().size());
        System.out.println("不合理次数定义为 ："+count);
        for(int i = 0;i<originalPointArrayList.size();i++){
              System.out.println("当前点不合理次数是："+originalPointArrayList.get(i).getUnreasonCount());
              if(count<=originalPointArrayList.get(i).getUnreasonCount()){ //不符合
                  originalPointArrayList.remove(i); //移除
                  i--;
              }
        }
    }
}
