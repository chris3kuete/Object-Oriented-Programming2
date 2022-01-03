/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidation;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class PasswordValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String pas;
        System.out.println("Enter a password");
        pas=scan.nextLine();
        
        PasswordCheck p =new PasswordCheck(pas);
        
        boolean checkLength = p.checkLength();
        boolean checkLetterOrDigit=p.checkLetterOrDigit();
        boolean atLeastTwoDigits= p.atLeastTwoDigits();
        
        if (checkLength && checkLetterOrDigit && atLeastTwoDigits){
            System.out.println("is valid");
            
        }else{
            System.out.println("not valid");
       
        }
        
    }
    
    
}
