package com.OptimalStructures.example.OptimalStructures.SampleClasses.Concepts;

/**
 * TODO
 * 1. Notify vs notifyAll
 * 2. Comparator_Comparable vs Comparable
 * 3. String v/s StringBuffer v/s StringBuilder
 * 4. Throw v/s Throws v/s Throwm
 * 5. enum v/s Enum v/s Enumeration
 * 6. final v/s finally v/s finalizer
 *
 * 7. transient v/s volatile
 *      transient - At time of serialization if we don't want to save the value of the variable(for security reasons)
 *      The default value will be serialized
 *      For variables only
 *
 *      volitile - If value of a variable keeps on changing
 *      For each thread a local copy will be created, just before termination of thread, master copy will be updated with stable value
 *      For variables only
 *      *Don't use as it decreases performance
 * */