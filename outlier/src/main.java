import InterfaceClass.AfterCalculate;
import InterfaceClass.Calculate;
import InterfaceClass.Check;
import InterfaceClass.Standard;
import Model.OriginalPoint;
import Model.OriginalPointList;
import SpecuficClass.Distance;
import SpecuficClass.NormalDistribution;
import SpecuficClass.ReasonableInterval;
import SpecuficClass.UnreasonCount;

public class main {
    public static void main(String[] args) {
        OriginalPoint a = new OriginalPoint(1,1,1);
        OriginalPoint b = new OriginalPoint(0,0,0);
        OriginalPoint c = new OriginalPoint(0.5,0.5,0);
        OriginalPoint d = new OriginalPoint(0.3,0.3,0);
        OriginalPoint e = new OriginalPoint(0.4,0.4,1);
        OriginalPoint f = new OriginalPoint(100000,100000,10000); //异常点
        OriginalPoint g = new OriginalPoint(2,2,0.2);
        OriginalPoint h = new OriginalPoint(1.5,2,0.3);
        OriginalPoint i = new OriginalPoint(1.1,1.2,0.3);
        OriginalPoint j = new OriginalPoint(1.2,1.3,0.4); // 10个
        OriginalPoint a1 = new OriginalPoint(1.3,1.4,0.5);
        OriginalPoint a2 = new OriginalPoint(1.4,1.5,0.5);
        OriginalPoint a3 = new OriginalPoint(1.7,1.6,0.5);
        OriginalPoint a4 = new OriginalPoint(1.8,1.9,0.5);
        OriginalPoint a5 = new OriginalPoint(1.3,2.0,0.5);
        OriginalPoint a6 = new OriginalPoint(1.2,1.5,0.5);
        OriginalPoint a7 = new OriginalPoint(1.4,1.7,0.5);
        OriginalPoint a8 = new OriginalPoint(1.25,1.34,0.5);
        OriginalPoint a9 = new OriginalPoint(1.23,1.44,0.5);
        OriginalPoint a10 = new OriginalPoint(1.43,1.54,0.5);





        AssemblyMachine assemblyMachine = new AssemblyMachine();

        OriginalPointList.Add(a);
        OriginalPointList.Add(b);
        OriginalPointList.Add(c);
        OriginalPointList.Add(d);
        OriginalPointList.Add(e);
        OriginalPointList.Add(f);
        OriginalPointList.Add(g);
        OriginalPointList.Add(h);
        OriginalPointList.Add(i);
        OriginalPointList.Add(j);
        OriginalPointList.Add(a1);
        OriginalPointList.Add(a2);
        OriginalPointList.Add(a3);
        OriginalPointList.Add(a4);
        OriginalPointList.Add(a5);
        OriginalPointList.Add(a6);
        OriginalPointList.Add(a7);
        OriginalPointList.Add(a8);
        OriginalPointList.Add(a9);
        OriginalPointList.Add(a10);
        OriginalPointList.Show();
        Calculate calculate = new Distance();
        assemblyMachine.setCalculate(calculate); // 计算距离


        AfterCalculate afterCalculate = new NormalDistribution();
        assemblyMachine.setAfterCalculate(afterCalculate); // 得到平均值和方差

        Check check = new ReasonableInterval();
        assemblyMachine.setCheck(check); // 判断在合理区间

        Standard standard = new UnreasonCount();
        assemblyMachine.setStandard(standard); // 判断原始点是否为异常

        OriginalPointList.Show();
    }
}
