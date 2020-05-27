package com.upGrad;
/*

class Singleton {
    private static Singleton obj;
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {}
    public static Singleton getInstance() {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}
*/

class Singleton {
    private static Singleton obj;
    private Singleton() {}
    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance() {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}
