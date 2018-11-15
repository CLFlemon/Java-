import InterfaceClass.AfterCalculate;
import InterfaceClass.Calculate;
import InterfaceClass.Check;
import InterfaceClass.Standard;

public class AssemblyMachine {

    private AfterCalculate afterCalculate;
    private Calculate calculate;
    private Check check;
    private Standard standard; //写接口 不写具体的接口 方便改写

    public void setAfterCalculate(AfterCalculate afterCalculate) {
        this.afterCalculate = afterCalculate;
        afterCalculate.analyes();
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
        standard.StandardCount();
    }

    public void setCheck(Check check) {
        this.check = check;
        check.isReason();
    }

    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
        calculate.calculate();
    }
}
