package Model;

import java.util.*;

public class List {
      private static ArrayList<originalPoint> ListPoint = new ArrayList<originalPoint>();
      private static originalPoint originalpoint;

      public static void Add(originalPoint originalpoint){
          List.originalpoint = originalpoint;
          ListPoint.add(originalpoint);
      }

     public static ArrayList<originalPoint> getListPoint() {
        return ListPoint;
     }

     // 输出List的具体信息 方便调试
     public static void Show(){
          for(int i = 0;i<ListPoint.size();i++){
              System.out.println(ListPoint.get(i).x+" "+ListPoint.get(i).y+" "+ ListPoint.get(i).z+" "+ListPoint.get(i).id+" "+ListPoint.get(i).unreasonCount);
          }
     }
}
