package com.OptimalStructures.example.OptimalStructures.SampleClasses;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * ------------<h2>Description of a class</h2>----------------
 * This class represents student and mentions it's relevant attributes.
 *
 * @author  Shantanu Saini
 * @version 1.0
 * @since   2019-02-04
 */
public final class OptimalStudent {
    /**
     * This represents name of a student
     * It if final as name of a student will not change once set
     * */
    private final String name;

    /**
     * This variable represents a map of Subject
     * and marks generally used to represent relationship amongst subject name and marks
     */
    //Using interfaces as a type instead of classes
        //Don't use this - private final HashMap<String, Float> SubjectMarks = new HashMap<>();
    private final Map<String, Float> SubjectMarks;

    /**
     * This variable represents the rollNumber of a student
     * */
    private final int rollnumber;




    /**
     * Parametrised Constructor for the OptimalStudent Class
     * */
    public OptimalStudent(String name, Map<String, Float> subjectMarks, int rollnumber) {
        //Validate Parameters
        if(name.length()>0 && name!=null)
            this.name = name;
        else
            throw new ArithmeticException("Name length should be greater than 0");

        //Validate and make defensive copy for mutable objects
        if(!CollectionUtils.isEmpty(subjectMarks)){
            Map<String, Float> defensiveMap = new HashMap<>(subjectMarks);
            SubjectMarks = defensiveMap;
        }else{
            SubjectMarks = new HashMap<>();
        }

        //Validate
        if(rollnumber>0)
            this.rollnumber = rollnumber;
        else
            throw new ArithmeticException("Roll number should be greater than 0");
    }


    /**
     * ### Method is a verb - Should start with small letter ###
     * This method is used to check whether the name passed
     * to the parameter is the same as that set in the object of the class.
     *
     * @param name This is the first parameter to getInfo method.It represents the name of the student and check if the same student of present in the class.
     * @return boolean This returns the name is set in this class
     */
    public boolean getInfo(String name){
       //Validating the input parameter
       if(name.equals("") || name==null)
           return false;

       return this.name.equals(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof OptimalStudent){
            OptimalStudent other = (OptimalStudent)obj;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(this.name, other.name);
            builder.append(this.rollnumber, other.rollnumber);
            builder.append(this.SubjectMarks, other.SubjectMarks);
            return builder.isEquals();
        }
        return false;
    }


    @Override
    public int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(name);
        builder.append(rollnumber);
        builder.append(SubjectMarks);
        return builder.toHashCode();
    }


    @Override
    public String toString() {
        return this.name+" "+this.rollnumber+" "+SubjectMarks.keySet();
    }


    /**
     * This is the main method which makes use of addNum method.
     * @param args Unused.
     * @return Nothing.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {

    }
}
