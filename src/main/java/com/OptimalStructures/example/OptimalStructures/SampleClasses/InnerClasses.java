package com.OptimalStructures.example.OptimalStructures.SampleClasses;

/**
 * 4 types pf inner classes are there -
 *  1.Static(Nested Classes)
 *  2.Non Static(Inner class)
 *  3.Anonymous class
 *  4.Method Local class
 * */


/**
 * 1. Static(Nested Class)
 *  TODO - Check where it is used
 *  Used in builder pattern
 * */
class OuterStatic {
    private static void outerMethod() {
        System.out.println("inside outerMethod");
    }

    // A static inner class
    static class Inner {
        public static void main(String[] args) {
            System.out.println("inside inner class Method");
            outerMethod();
        }
    }
}


/**
 * 2. Non static inner class
 *  TODO - Check where it is used
 * */
class OuterClassNonStatic {

    class Inner {

    }
}



/**
 * 3.Anonymous class
 *  It has no name and it should override method of abstract class or interface
 *  Used in threads, defining callbacks for button listener
 * */
abstract class Person{
    abstract void eat();
}

interface Animal{
    void eat();
}

class AnonymousClass_Abstract{
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("I am eating");
            }
        };
        p.eat();
    }
}

class AnonymousClass_Interface{
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal is eating");
            }
        };
        a.eat();
    }
}




/**
 * 4.Method local classes
 *  Used to keep related parts of program together
 * */

class OuterLocal{
    void outermethod(){
        class Inner{
            void innerMethod(){
                System.out.println("Doing something..");
            }
        }
        Inner i = new Inner();
        i.innerMethod();
    }
}