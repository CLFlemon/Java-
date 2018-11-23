import InterfaceClass.Calculate;
import InterfaceClass.Reduce;
import InterfaceClass.StandardCount;
import InterfaceClass.StandardInterval;

public class AssemblyMachine {

    private Calculate calculate;
    private StandardCount standardCount; //写接口 不写具体的接口 方便改写
    private Reduce reduce;
    private StandardInterval standardInterval;

    public void setStandardInterval(StandardInterval standardInterval) {
        this.standardInterval = standardInterval;
        standardInterval.find();
    }

    public void setStandardCount(StandardCount standardCount) {
        this.standardCount = standardCount;
        standardCount.StandardCount();
    }


    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
        calculate.calculate();
    }

    public void setReduce(Reduce reduce,double eps) {
        this.reduce = reduce;
        reduce.reduce(eps);
    }
}
