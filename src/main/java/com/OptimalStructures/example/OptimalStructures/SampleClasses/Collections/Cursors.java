package com.OptimalStructures.example.OptimalStructures.SampleClasses.Collections;

/**
 * Cursors - Are needed to iterate over a collection
 *      1.Enumeration - Generally used for legacy classes + can't perform  remove operation
 *
 *          Enumeration e = v.elements();
 *          while(e.hasMoreElements()){
 *              Integer i = e.nextElement();
 *          }
 *
 *      2.Iterator(Use this) - Universal cursor, we can perform remove, add and read
 *
 *          Iterator itr = c.iterator();
 *          while(itr.hasNext()){
 *              Integer i = itr.next();
 *              if(i%2 == 0)
 *                  itr.remove();
 *          }
 *
 *      3.ListIterator - Bidirectional Cursor ONLY for list
 *          ListIterator l = list.listIterator();
 *              Forward -
 *                  hasNext()
 *                  next()
 *                  nextIndex()
 *
 *              Backward -
 *                  hasPrevious()
 *                  previous()
 *                  previousIndex()
 *
 *              remove()
 *              set(Object new)
 *              add(Object new)
 * */
public class Cursors {
}
