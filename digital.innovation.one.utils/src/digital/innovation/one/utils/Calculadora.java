package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.DivHelper;
import digital.innovation.one.utils.internal.SubHelper;
import digital.innovation.one.utils.internal.SumHelper;
import digital.innovation.one.utils.internal.MulHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MulHelper mulHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        mulHelper = new MulHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return mulHelper.execute(a, b);
    }

    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }
}