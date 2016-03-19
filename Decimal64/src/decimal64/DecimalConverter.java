/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal64;

/**
 *
 * @author John JP Andres
 */
public class DecimalConverter {
    
    String binary;
    Integer decimal;

    public DecimalConverter() {
    }
    
    public String DecimaltoBinary(int decimal)
    {   
        this.decimal = decimal;
        
        System.out.println("Decimal Number Input = " + decimal);
        //returns String binary
        return Integer.toBinaryString(this.decimal);
    }
    
    public void setToNull(){
        this.binary = "";
        this.decimal = 0;
    }
    
    public String DecimaltoBinary()
    {
        //returns String binary
        return Integer.toBinaryString(this.decimal);
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public Integer getDecimal() {
        return decimal;
    }

    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }
    
    
    
    
}
