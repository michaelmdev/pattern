package gof.structural.bridge.abstraction;

import gof.structural.bridge.platform.CuttingMachine;

import java.util.Arrays;

/**
 * @author michael.malevannyy@gmail.com, 03.04.2017
 */

public class OptimizedCuttingManufacture extends BasicCuttingManufacture {
    public OptimizedCuttingManufacture(CuttingMachine machine) {
        super(machine);
    }

    @Override
    protected void cut(int[] lengths) {
        Arrays.sort(lengths);
        super.cut(lengths);
    }
}
