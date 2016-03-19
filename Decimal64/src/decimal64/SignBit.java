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
public class SignBit {
    String signbit = "";
    
    public void setSignBit(int m){
        
        if(m >= 0)
            this.signbit += 0;
        else
            this.signbit += 1;
        
        System.out.println("Signbit is " + signbit);
       
    }

    public String getSignbit() {
        return signbit;
    }
    
    public void setToNull(){
        this.signbit = "";
    }
    
    
    
}
