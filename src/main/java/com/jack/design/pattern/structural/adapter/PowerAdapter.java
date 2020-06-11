package com.jack.design.pattern.structural.adapter;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-11-06 11:54
 **/
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220V();
        //变压器
        int adapterOutput = adapterInput / 44;
        System.out.println("使用电源适配器输入AC:" + adapterInput + "V" + "输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
