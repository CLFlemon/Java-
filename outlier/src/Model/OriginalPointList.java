package Model;

import java.util.*;

public class OriginalPointList {
      private static ArrayList<OriginalPoint> ListPoint = new ArrayList<OriginalPoint>();
      private static OriginalPoint originalpoint;

      public static void Add(OriginalPoint originalpoint){
          OriginalPointList.originalpoint = originalpoint;
          ListPoint.add(originalpoint);
      }

     public static ArrayList<OriginalPoint> getListPoint() {
        return ListPoint;
     }

     // 输出List的具体信息 方便调试
     public static void Show(){
          for(int i = 0;i<ListPoint.size();i++){
              System.out.println(ListPoint.get(i).x+" "+ListPoint.get(i).y+" "+ ListPoint.get(i).z+" "+ListPoint.get(i).id+" "+ListPoint.get(i).unreasonCount);
          }
     }
}
