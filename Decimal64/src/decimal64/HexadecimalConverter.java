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
public class HexadecimalConverter {
    
    String hexadecimal = "hey";
    double decimal;
    
    HexadecimalConverter(){}
    
    public double HextoDecimal(){
        
        hexadecimal = hexadecimal.toUpperCase();
        
        try{
            decimal = Integer.parseInt(hexadecimal, 16);
            
        }
        catch(NumberFormatException ne){
            System.out.println("Invalid Input");
            setBye();
        }
        finally{
            
        }
        //returns string decimal
        return decimal;
    }
    
    public double HextoDecimal(String hexadecimal){
        
        this.hexadecimal = hexadecimal.toUpperCase();
        
        try{
            decimal = Integer.parseInt(this.hexadecimal, 16);
            
        }
        catch(NumberFormatException ne){
            System.out.println("Invalid Input");
            setBye();
        }
        finally{
            
        }
        //returns string decimal
        return decimal;
    }
    
    public void setBye(){
        this.hexadecimal = "stop";
        this.decimal = 0;
    }
    
    public void setToNull(){
        this.hexadecimal = "";
        this.decimal = 0;
    }
    
    
    public void setString(String s){
        this.hexadecimal = s;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }
    
}
