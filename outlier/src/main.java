import InterfaceClass.Calculate;
import InterfaceClass.Reduce;
import InterfaceClass.StandardCount;
import InterfaceClass.StandardInterval;
import Model.DistancePointList;
import Model.IntervalList;
import Model.OriginalPoint;
import Model.OriginalPointList;
import SpecuficClass.Distance;
import SpecuficClass.ReducePoint;
import SpecuficClass.StandardIntervalPoint;
import SpecuficClass.UnreasonCount;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        OriginalPoint a = new OriginalPoint(1,1,1);
        OriginalPoint b = new OriginalPoint(0,0,0);
        OriginalPoint c = new OriginalPoint(0.5,0.5,0);
        OriginalPoint d = new OriginalPoint(0.3,0.3,0);
        OriginalPoint e = new OriginalPoint(0.4,0.4,1);
        OriginalPoint f = new OriginalPoint(10,10,10); //异常点
        OriginalPoint g = new OriginalPoint(5,5,10);



        AssemblyMachine assemblyMachine = new AssemblyMachine();

        OriginalPointList.Add(a);
        OriginalPointList.Add(b);
        OriginalPointList.Add(c);
        OriginalPointList.Add(d);
        OriginalPointList.Add(e);
        OriginalPointList.Add(f);
        OriginalPointList.Add(g);

        Calculate calculate = new Distance();
        assemblyMachine.setCalculate(calculate);//计算出距离

        System.out.println("请输入阈值：");
        Scanner in = new Scanner(System.in);
        double eps = in.nextDouble();
        Reduce reduce = new ReducePoint();
        assemblyMachine.setReduce(reduce,eps);
        IntervalList.Show();

        StandardInterval standardInterval = new StandardIntervalPoint();
        assemblyMachine.setStandardInterval(standardInterval);

        StandardCount standardCount = new UnreasonCount();
        assemblyMachine.setStandardCount(standardCount);


        OriginalPointList.Show();

    }
}
