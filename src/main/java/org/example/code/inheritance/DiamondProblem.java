package org.example.code.inheritance;

public class DiamondProblem {
}

// Hypothetical Java code illustrating the diamond problem
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C");
    }
}

//class D extends B, C { // This is not allowed in Java
//    // Which show() method should D inherit?
//}


//solution for the multiple inheritance
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document");
    }

    public void show() {
        System.out.println("Showing document");
    }
}


//todo: relationship between interfaces and classes, abstract classes



