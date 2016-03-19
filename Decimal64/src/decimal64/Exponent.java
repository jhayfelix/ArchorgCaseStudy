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
public class Exponent {
    String exponent = "";
    int excessVal = 398;
    int newExponent = 0;
    DecimalConverter dc = new DecimalConverter();

    public Exponent() {
    }
    
    public void getTheExponent(int x){
        newExponent = excessVal + x;
        
        dc.setDecimal(newExponent);
        this.exponent = dc.DecimaltoBinary();
                
        if(exponent.length()<10)
        {
            String lel = exponent;
            exponent = "0";
            exponent += lel;
        }
        
        System.out.println("Exponent is " + this.exponent);
  
    }

    public String getExponent(){
        return this.exponent;
    }
    
    public String getExponentForCOMBI(){
        return this.exponent = this.exponent.substring(2,exponent.length());
    }
    
    public void setToNull(){
        this.exponent = "";
        this.newExponent = 0;
    }
    
    
    
}
