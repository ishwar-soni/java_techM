package com.upGrad;

import java.util.List;

/*class DeprecatedDemo {
    *//* @deprecated This field is replaced by
     * MAX_NUM field
     *//*
    @Deprecated
    int num=10;
    final int MAX_NUM=10;
    *//* @deprecated As of release 1.5, replaced
     * by myMsg2(String printMyMsg, String printMyMsg2)
     *//*
    @Deprecated
    public void printMyMsg(){
        System.out.println("This method is marked as deprecated");
    }

    public void printMyMsg2(String msg, String msg2){
        System.out.println(msg+msg2);
    }

    public static void main(String a[]){
        DeprecatedDemo obj = new DeprecatedDemo();
        obj.printMyMsg();
        System.out.println(obj.num);

    }
}*/
 class Machine {
    private List versions;
    @SuppressWarnings("unchecked")
    public void addVersion(String version) {
        versions.add(version);
    }

    public static void main(String a[]){
        Machine m = new Machine();
        m.addVersion("Ram");
    }
}