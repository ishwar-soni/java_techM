package com.upGrad;

import com.sun.xml.internal.ws.api.model.CheckedException;
import com.sun.xml.internal.ws.model.CheckedExceptionImpl;

class Rectangle {
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea() {
        return this.length * this.breadth;
    }
}
 class Square extends Rectangle {
     public void setBreadth(int breadth) {
         super.setBreadth(breadth);
         super.setLength(breadth);
     }

     public void setLength(int length) {
         super.setLength(length);
         super.setBreadth(length);
     }

 }
     public class LSP  {
         public void calculateArea(Rectangle r) {
             r.setBreadth(2);
             r.setLength(3);
             if(r.getArea() != 6)
                 printError("area",r);
             if(r.getBreadth() != 2)
                 printError("breadth",r);
             if(r.getLength() != 3)
                 printError("breadth" , r);
         }
         private void printError(String errorIdentifer, Rectangle r) {
             System.out.println("Unexpected value of " + errorIdentifer + " for instance of " + r.getClass().getName());
         }
         public static void main(String[] args)
         {
             printName5Times("Sandeep");
             /*LSP lsp = new LSP();
            // An instance of Rectangle is passed
            lsp.calculateArea(new Rectangle());
            // An instance of Square is passed
            lsp.calculateArea(new Square());*/
         }

         public static void printName5Times(String name){
             for(int i=0 ;i <=5 ;i ++){
                 System.out.println(i+ " " + "Print name : " + name );
             }
         }


     }
