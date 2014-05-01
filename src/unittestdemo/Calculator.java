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
public class Calculator {

    private String type;

    /**
     *
     * @param value is a mathematically correct product
     * @return
     */
    public int square(int value) {
        return value + value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
