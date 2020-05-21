package com.upGrad;

public class HashCodeandEquals {
    public String name;
    public int id;
    HashCodeandEquals(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        // checking if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;
        // it checks if the argument is of the
        // type HashCodeandEquals by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        // type casting of the argument.
        HashCodeandEquals hashCodeandEquals = (HashCodeandEquals) obj;
        // comparing the state of argument with
        // the state of 'this' Object.
        return (hashCodeandEquals.name == this.name && hashCodeandEquals.id == this.id);
    }
    @Override
    public int hashCode() {
        // We are returning the id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.id;
    }
}

//Driver code
class GFG
{
    public static void main (String[] args) {
        // creating the Objects of Geek class.
        HashCodeandEquals h1 = new HashCodeandEquals("aa", 1);
        HashCodeandEquals h2 = new HashCodeandEquals("aa", 1);
        // comparing above created Objects.
        if(h1.hashCode() == h2.hashCode()) {
            if(h1.equals(h2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
        }
        else
            System.out.println("Both Objects are not equal. ");
    }
}