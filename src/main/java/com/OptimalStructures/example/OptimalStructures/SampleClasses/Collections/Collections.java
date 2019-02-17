package com.OptimalStructures.example.OptimalStructures.SampleClasses.Collections;

/**
 * ---Collections---
 *  Meant to scale
 *  Every Collection is based on some data-structure
 *
 *  Note - Main disadvantage - Performance issues
 *  ----------------------------------------------------------------
 *                              Collections
 *  -----------------------------------------------------------------
 *  #9 Main interfaces of Collection framework -
 *
 *                                                    1.ArrayList(C)
 *                      Collections(I) -> List(I) ->  2.LinkedList(C)[Faster in add and remove, slow in get] <--|
 *                                     |              3.VectorList(C) -> Stack(C)                               |
 *                                     |                                                                        |
 *                                     |-> Set(I) ->  1.HashSet(C) -> LinkedHashSet(C)                          |
 *                                     |              2.SortedSet(I) -> NavigableSet(I) -> TreeSet(C)           |
 *                                     |                                                                        |
 *                                     |-> Queue(I)-> 1.---------------------------------------------------------
 *                                                    2.PriorityQueue(C)
 *                                                    3.BlockingQueue(C)
 *
 *
 *                                        1.HashMap(C)     -> LinkedHashMap(C)
 *                                        2.IdentiyHashMap
 *                          Map(I)  ->    3.WeakHashMap(C)
 *                                 |      4.HashTable      -> Properties(C)
 *                                 |           ^
 *                                 |           |
 *                                 |    Dictionary(Abstract Class)
 *                                 |
 *                                 |-> SortedMap(I) -> NavigableMap(I) -> TreeMap(C)
 *
 *     1.Collection - Root interface for all collections.Contains common methods applicable for any collection object
 *                          add, addAll, remove, removeAll, clear, clearAll, contains, iterator
 *          Note - Collections(Utility class) v/s Collection(Interface)
 *
 *     2.List - Insertion order maintained & duplicates are allowed
 *
 *          2.1 ArrayList - Implemented using resizable array
 *              ArrayList al = new ArrayList(); -> Initial capacity=10
 *              ArrayList al = new ArrayList(initial_capacity);
 *
 *                  #NewCapacity = oldCapacity*(3/2) + 1
 *                  #Random Access interface is implemented(Any element can be accessed with same speed)
 *
 *          2.2 ArrayList v/s Vector
 *              ArrayList gives better performance as it is not thread-safe(no method is synchronised)
 *
 *          2.3 Getting synchronised version of ArrayList
 *              List list = Collections.synchronizedList(new ArrayList())
 *
 *          2.4 LinkedList - Implemented using doubly linked list
 *              Best suited for insertions and deletions
 *              Can be used as Stack & Queue
 *
 *
 *     3.Set - No insertion order & no insertion order
 *
 *          3.1 HashSet - UnderLying DS is hashtable + insertion order not preserved
 *
 *              3.1.1 LinkedHashSet(Used for cache applications) - Underlying DS HashTable + LinkedList
 *
 *     4.SortedSet - No duplicate & there is insertion order
 *          first() - first element of sorted set
 *          last() - last element of sorted set
 *          headSet(obj) - sorted set whose value is less than head element
 *          tailSet(obj) - sorted set whose value is greater than tail element
 *          subset(obj1, obj2) - subset which is > than obj1 and < obj2
 *          comparator() - defines underlying sorting technique
 *
 *     5.Navigable Set - Several methods for navigation purposes
 *
 *          5.1 TreeSet - Underlying DS is Balanced Tree
 *              TreeSet treeset = new TreeSet(); - natural sorting order
 *              TreeSet treeset = new TreeSet(Comparator_Comparable c); - comparator order
 *
 *     6.Queue - FIFO
 *
 *
 *     ----------------------------------------------
 *
 *     1.Map - Key Value pairs
 *          Map map = new HashMap(); - initial capacity - 16 & fillRatio - .75
 *
 *          1.1 LinkedHashMap - Implemented using hashtable + linkedlist(used for caches)
 *
 *          1.2 IdentityHashMap - If we want to use ==(reference comparision) instead of .equals(content comparison) for comparing and inserting keys
 *                  Integer i1 = new Integer(10);
 *                  Integer i2 = new Integer(10);
 *                  IdentityHashMap idm = new IdentityHashMap();
 *                  idm.put(i1, "Apple");
 *                  idm.put(i2, "Banana");
 *
 *                  //idm - {10:Apple, 10:Banana}, whereas in normal HashMap it would have been {10:"Banana"}
 *
 *          1.3 WeakHashMap - Even though an object is associated with WeakHashMap, it is eligible for garbage collection.
 *                            Whereas in case of hashmap, map is not eligible for GC even though there are no external references
 *
 *          1.4 Hashtable - Insertion order not preserved
 *                          Null insertion not allowed
 *                          All methods are synchronised
 *
 *                  1.4.1 Properties - Used for reading variables from properties file
 *                                     Child Class of Hashtable
 *
 *     2.Sorted Map - Map sorted according to some sorting order on keys
 *          firstKey() - first element of sorted set
 *          lastKey() - last element of sorted set
 *          headMap(obj) - sorted set whose value is less than head element
 *          tailMap(obj) - sorted set whose value is greater than tail element
 *          subMap(obj1, obj2) - subset which is > than obj1 and < obj2
 *          comparator() - defines underlying sorting technique
 *
 *        2.1.Navigable Map - Added functionalities for navigation purpose
 *
 *          #HashMap v/s HashTable - Not a single method in Hashtable is synchronized and null insertion is valid for both keys and values
 *              Synchronised verison of HashMap - Collections.synchronizedMap(hashmap)
 *
 *              2.1.1 TreeMap - Underlying DS is RB tree(keys are inserted according to some sorting order)
 *                              Only 1 null insertion allowed
 *                              By default keys sorted by increasing order
 * */
public class Collections {
}
