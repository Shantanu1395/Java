package com.OptimalStructures.example.OptimalStructures.SampleClasses.OOPS;


/**
 * Generally used as a contract between client & service provider
 * Used as type identifier for a reference variable
 * */
public interface Interfaces {

    /**
     * By default public static final
     * */
    int x = 0;

    /**
     * By default public abstract
     * */
    void method();
}

/**
 * Marker interfaces - By implementing these types of interfaces, class gets the ability(provided by JVM) of that interface
 *  eg - Clonable, Serializable, RandomAccess
 * */

/**
 * Adapter classes - If a class implements an interface with empty implementation
 *  Benifit is that we can use this class and there is no need to implement all methods(if we implement an interface)
 * */