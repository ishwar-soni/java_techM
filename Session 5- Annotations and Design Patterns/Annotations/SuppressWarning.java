package com.upGrad;

import java.util.List;

class Machine{
    private List versions;
    @SuppressWarnings("unchecked")
    public void addVersion(String version){
        versions.add(version);
    }
    public static void main(String[] args){
        Machine m = new Machine();
        m.addVersion("New version");
    }
}
public class SuppressWarning {

}
