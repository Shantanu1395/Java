package com.OptimalStructures.example.OptimalStructures.SampleClasses;

/**
 * Execution Process
 *  1.JVM Start
 *  2.Create main thread
 *  3.Locate class(with main method)
 *  4.Load class(with main method) - Static variable creation
 *  5.Execute main method of the class
 *  6.Unload class
 *  7.Destroy main thread
 *  8.ShutDown JVM
 * */


/**
 * #Types of Variables
 *  1.On the basis of datatype
 *      1.1 Primitive - Call by value
 *      2.2 Reference - Call by reference
 *
 *  2.On the basis of where it is declared
 *      2.1 Instance
 *      2.2 Static - Static is evil, dont use
 *      2.3 Local
 *          *Only final allowed
 *-------------------------------------------------------
 * #The main method
 *  Modifiers allowed -
 *      1.final
 *      2.synchronized - Only 1 thread can accessed at a time
 *          Only for blocks and methods
 *          *Use locks instead of this
 *      3.strictfp
 *
 *  Overloading - Applicable but JVM always call method with String[] parameter
 *  In case of inheritance, if base class has PSVM, it will get called
 *-------------------------------------------------------
 *#System.out.println
 *
 * class Test{                                      class System{
 *     static String name = "Shantanu";                 static PrintStream out;
 *     psvm{                                   ->       psvm{
 *      Test.name.length()                                  System.out.println();
 *     }                                                }
 * }                                                }
 * --------------------------------------------------------
* */



/**
 * Applicable modifiers - (P, D, F, Ab, S)
 *  1.public
 *  2.default
 *  3.final
 *  4.abstract
 *      method abstract -> class should be abstract
 *      class abstract -> all methods need not to be abstract
 *      Can't be used with final(means can't be overridden), strictfp(talks about implementation)
 *  5.strictfp - All floating point calculations must follow IEEE754 standard
 *      Only for methods and classes
 * */
public class PartsOfAClass {

    /**
     * First
     * */
    static {
        System.out.println("Static block");
    }

    /**
     * Second
     * */
    public static void main(String[] args) {
        System.out.println("Main");
        System.out.println();

        PartsOfAClass obj = new PartsOfAClass();
    }

    /**
     * Third
     *  Before object creation
     * */
    {
        System.out.println("Initializer block");
    }

    /**
     * Fourth
     *  Only at time of object creation
     * */
    PartsOfAClass(){
        System.out.println("Constructor");
    }


    /**
     * Applicable Modifiers - (P, D, F, Ab, S, P, P, F)
     * 1-5 for top level class
     * 6.private
     * 7.protected
     * 8.static
     * */
    class Innerclass{

    }
}