/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import java.util.Set;

/**
 *
 * @author jaspertomas
 */
public class TypingTutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lessonindex=10;
        String outputmultiline[]={};
        String output="";
        Integer length=0;
        Integer maxlength=50;
        for(Character c:Constants.lessonsong.toCharArray())
        {
            if(contains2(Constants.lessonkeys[lessonindex],Character.toLowerCase(c)))
            {
                output+=c;
                length++;
            }
            if(length>=maxlength && c==' ')
            {
                output+="\n";
                length=0;
            }
        }
        //remove double spaces
        while(output.contains("  "))output=output.replace("  ", " ");

        //split output into multiple lines along \n's
        outputmultiline=output.split("\n");
        
        //print
        for(String s:outputmultiline)
            System.out.println(s);
    }
    public static <T> boolean contains2(final T[] array, final T v) {
    if (v == null) {
        for (final T e : array)
            if (e == null)
                return true;
    } else {
        for (final T e : array)
            if (e == v || v.equals(e))
                return true;
    }

    return false;
}}
