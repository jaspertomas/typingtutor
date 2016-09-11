/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;


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
        int lessonindex=11-1;
        int maxrows=15;
        int rows=0;
        String outputmultiline[]={};
        String output="";
        Integer length=0;
        Integer maxlength=50;
        Integer wordlength=0;
        Integer minwordlength=4;
        for(Character c:Constants.lessonsong.toCharArray())
        {
            //only if c is a space
            if(c==' ')
            {
                //if line is already greater than max length, cut it off
                if(length>=maxlength)
                {
                    //turn the space into a newline
                    output+="\n";
                    rows++;
                    length=0;
                    wordlength=0;
                }
                //if word is too short 
                //except for full keyboard
                else if(wordlength<=minwordlength && lessonindex!=10)
                {
                    //do not add the space
                }
                else
                {
                    output+=c;
                    wordlength=0;
                }
            }
            else if(contains2(Constants.lessonkeys[lessonindex],Character.toLowerCase(c)))
            {
                output+=c;
                length++;
                wordlength++;
            }
            if(rows==maxrows && lessonindex!=10)break;
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
