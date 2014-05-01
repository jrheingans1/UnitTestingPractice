/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestdemo;

/**
 *
 * @author jrheingans1
 */
public class Employee {

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName cannot be null or empty, and must be at least 2
     * characters and no more then 30. No special characters, except for the
     * hyphen and space.
     */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty() || isNotWithinRange(lastName)
                || isNotLegalCharacter(lastName)) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }
    private boolean isNotLegalCharacter(String lastName){
        boolean result = false;
        
        char[] ca = lastName.toCharArray();
        for(char c : ca){
            if (c == ' ' || c == '-'){
                result = false;
            } else if(!Character.isLetter(c)){
                result = true;
            }
        }
        return result;
    }
    private boolean isNotWithinRange(String lastName) {
        boolean result = false;

        int len = lastName.length();
        if (len < 2 || len > 30) {
            result = true;
        }
        return result;
    }

}
