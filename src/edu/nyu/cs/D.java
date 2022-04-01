package edu.nyu.cs;

public class D {

    private C cObj;

    /**
     * Each D object contains a C object, presumably because there is something useful that C objects do that D objects would like access to.
     * This is not inheritance, but rather composition.
     */
    public D() {
        System.out.println("D object created");
        C cObj = new C("Goodbye");
        this.cObj = cObj;
    }

    public C getCObj() {
        return this.cObj;
    }
    
}
