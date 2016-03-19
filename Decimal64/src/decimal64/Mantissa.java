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
public class Mantissa {
    
    String mantissa = "";
    DecimalConverter dc = new DecimalConverter();
    
    public Mantissa(){}
    
    public void getTheMantissa(int mantissa){
        
        dc.setDecimal(mantissa);
        this.mantissa = dc.DecimaltoBinary();
        
        
        if(this.mantissa.length()!=50)
        {
            int x = this.mantissa.length();
            
            for(int l = x; l != 50; l++)
                this.mantissa += 0;
        }
        
        System.out.println("Mantissa is " + this.mantissa);
    }
    
    public void setToNull(){
        this.mantissa = "";
    }

    public String getMantissa() {
        return mantissa;
    }

    public DecimalConverter getDc() {
        return dc;
    }

    public void setDc(DecimalConverter dc) {
        this.dc = dc;
    }
    
    
    
    
}
