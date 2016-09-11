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
public class TypingTutorNumeric {
    public static void main(String args[])
    {
        for(int j=0;j<5;j++)
        {
        for(int i=0;i<25;i++)
        {
            System.out.print(Double.valueOf(Math.random()*10).intValue());
            if(i%5==4)System.out.print(" ");
        }
            System.out.println();
        }
    }
    
}
