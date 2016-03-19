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
public class BinaryConverter {
    
    String binary;
    double decimal;

    public BinaryConverter() {
    }
    
    public double BinarytoDecimal(){
        
        binary = binary.toUpperCase();
        
        try{
            decimal = Integer.parseInt(binary, 2);
            
        }
        catch(NumberFormatException ne){
            System.out.println("Invalid Input");
        }
        finally{
            
        }
        //returns String decimal
        return decimal;
    }
    
    public void setString(String s){
        this.binary = s;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }
    
    public void setToNull(){
        this.binary = "";
        this.decimal = 0;
    }
   
    
}
