package com.OptimalStructures.example.OptimalStructures.SampleClasses;


import java.util.List;

/**
 * Arrays are always type safe i.e int[] will always contain int elements
 * Collections are not safe wrt type
 *      ArrayList al = new ArrayList(); - We can add different elements to arraylist
 *      While retrival, type casting was necessary
 *
 * To overcome all there problems, Generics were launched in 1.5
 *      1.Provide type safety to generics
 *      2.List<String> l = new ArrayList();
 *
 * ----------------------------------
 *  1.method(List<? extends X> list); => This method can be called by passing List of type X or it's "subclasses/implementation classes"
 *  2.method(List<? super X> list);   => This method can be called by passing List of type X or it's "super classes"
 *  X = Any datatype
 *
 *      eg - List<? extends String> list = new ArrayList();
 *
 * ------------------------------------
 *  Generic parameter in class
 *
 *  class Test<T>{
 *      T obj;
 *      T get(){
 *          return obj;
 *      }
 *  }
 *
 *
 * */
public class Generics<T> {
    List<? extends String> list1;
    List<? super String> list2;

    T obj;

    T get(){
        return obj;
    }
}
