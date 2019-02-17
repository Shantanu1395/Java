package com.OptimalStructures.example.OptimalStructures.SampleClasses.OOPS;


/**
 * #Main concepts -
 *      1.Data hiding (use private keyword)
 *      2.Abstraction - Hiding internal details and providing only overview(using abstract classes and interfaces)
 *      3.Encapsulation - Wrapping up data and corresponding methods into single module(Data hiding + abstraction)
 *
 *
 * #5 Pillars - SOLID
 *      1.Single Responsibility -Each class should have only 1 responsibility
 *      2.Open-Closed - Open for extension & closed for modification
 *      3.Liskov Substitution - Child class should replace base class while extension
 *      4.Interface Segregation -
 *      5.Dependency Injection -
 *
 * #Overloading(Compile Time polymorphism) - Method resolution based on reference types.
 *      Automatic Promotion - If type doesn't matches with lower type then it checks for higher type
 *          byte -> short -> int -> long -> float -> double
 *
 *      Method signature(return type not included) - method(x, y)
 *          For overloading, method signature should be different
 *
 *      Priority -
 *          Child class > Parent Class
 *
 * #Overriding(Runtime polymorphism) - return types can vary(covariant return types)
 *
 *      1.Method signature should match
 *
 *      2.Covariant return type in bases and sub classes -
 *          Object ->(Yes) String
 *             (NO)<-
 *          Number ->(Yes) Integer
 *             (NO)<-
 *
 *      3.Access specifier while overriding
 *
 *          (X) - Incorrect
 *          (O) - Correct
 *
 *          final ->  Non-final  (X)
 *                <-             (O)
 *
 *          Abstract -> Non Abstract (O)
 *                   <-              (O)
 *
 *          Synchronised -> Non-synchronised (O)
 *                       <-                  (O)
 *
 *          Native -> Non native (O)
 *                 <-            (O)
 *
 *          Strictfp -> Non Strictfp (O)
 *                   <-              (O)
 *          --------------------------------------------
 *          Can't decrease scope of modifier while overriding, but we can increase it
 *              private < default < protected < public
 *       (Can't override)
 *                          ---------------------->(default, protected and public)
 *                                      ---------->(protected and public)
 *                                               ->(public)
 *          --------------------------------------------------------------------------------------
 *          Note - If parent(X) & child(X) then it is not overriding
 *                  X = final, private & static
 *          ----------------------------------------------------------------------------------------
 *      4. Both methods should throw same exception(if any) while overriding
 *
 * #Polymorphism(many forms)
 *      Runtime
 *      Compile Time
 * */
public class OOPSConcepts {
}
