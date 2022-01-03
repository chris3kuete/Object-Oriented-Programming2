/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidation;

/**
 *
 * @author sa
 */
public class PasswordCheck {

    private String password;

    public PasswordCheck() {

    }

    public PasswordCheck(String pass) {
        password = pass;
    }

    public void setPassword(String pass) {
        password = pass;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkLength() {
        return password.length()< 10;   
        
    }

    public boolean checkLetterOrDigit() {
        char ch[]= password.toCharArray();
        
        for (char c : ch) {
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            
        }
        return true;
    }
    
    public boolean atLeastTwoDigits(){
        int count =0;
        char ch[]=password.toCharArray();
        for (char c : ch) {
            if(Character.isDigit(c)){
                count++;
            }
            
        }
        return count>=2;
    }

}
