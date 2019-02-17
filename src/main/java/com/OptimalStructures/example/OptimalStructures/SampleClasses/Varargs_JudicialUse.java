package com.OptimalStructures.example.OptimalStructures.SampleClasses;

/**
 * Varargs are used when we don't know number of arguments
 *  Internal implementation using 1D array
 * */

public class Varargs_JudicialUse {

    /**
     *Here if 0 parameter list is passed, it will also get handled.
     * */
    void method(int firstArg, int ...remainingArgs){
        System.out.println(firstArg);
        for (int i:remainingArgs){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Varargs_JudicialUse x = new Varargs_JudicialUse();
        x.method(1, new int[]{2, 3, 4, 5});
    }
}
