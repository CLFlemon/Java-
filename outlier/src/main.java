
import InterfaceClass.AfterCalculate;
import InterfaceClass.Calculate;
import Model.DistancePointList;
import Model.List;
import Model.originalPoint;
import SpecuficClass.Distance;
import SpecuficClass.NormalDistribution;

public class main {
    public static void main(String[] args) {
        //
        originalPoint  a = new originalPoint(1,1,2,0,0);
        originalPoint  b = new originalPoint(2,2,0,1,0);
        originalPoint  c = new originalPoint(3,3,4,2,0);
        originalPoint  d = new originalPoint(10,10,5,3,0);
        originalPoint  e = new originalPoint(20,20,10,4,0);
        List.Add(a);
        List.Add(b);
        List.Add(c);
        List.Add(d);
        List.Add(e);
        Calculate distance = new Distance();
        distance.calculate(List.getListPoint());
        DistancePointList.Show();
        AfterCalculate abb = new NormalDistribution();
        abb.analyes(DistancePointList.getDistancepointlist());
    }
}
