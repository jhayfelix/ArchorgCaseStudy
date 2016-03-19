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
public class Combi {
    
    String e = "",
            m = "",
            combifield = "";
    DecimalConverter dc = new DecimalConverter();

    public Combi() {
    }
    
    public void setToNull(){
        this.e = "";
        this.m = "";
        this.combifield = "";
    }
    
    public void checkCombi(int mantissa, String exponent){
//        int firstnumber = new Integer(mantissa.substring(0,1)).intValue(); 
//        System.out.println(firstnumber);
//        
        int firstnumber;
        firstnumber = getFirstDigit(mantissa);
        
        if(firstnumber >= 0 && firstnumber <= 7 || firstnumber <= -1 && firstnumber >= -7)
        {
           e += exponent.substring(0,2);
           m += getMantissa123(firstnumber);
           //combifield
           combifield += e;
           combifield += m;
           
        }
        
        else if(firstnumber == 8 || firstnumber == 9 || firstnumber == -9 || firstnumber == -8)
        {
            combifield += "11";
            e += exponent.substring(0,2);
            m += getMantissa3(firstnumber);
            //combifield
            combifield += e;
            combifield += m;
        }
        
        //Checking
        System.out.println("Exponent in combi " + e);
        System.out.println("Mantissa in combi " +m);
        System.out.println("Mantissa " +mantissa);
        System.out.println("Exponent " +exponent);
        System.out.println("Firstnumber " +firstnumber);
        System.out.println("CombiField " +combifield);
        
        
    }
    
    public String getMantissa3(int i){
        String get10X = "", tempA = "";
        //converts integer into binary
        tempA = dc.DecimaltoBinary(i);
        
        System.out.println("Mantiss Binary " + tempA);
        
        //getsubstring index 1 and 2
        return get10X = tempA.substring(3,4);
    }
    
    public String getMantissa123(int i){
        String tempA = "";
        //converts integer into binary
        if(i >= 0 && i <= 3)
        {
          return tempA += "0" + dc.DecimaltoBinary(i);
        }
        //else if(i >= 4 && i <= 7)    
          return tempA = dc.DecimaltoBinary(i);        
//         getsubstring index 1 and 2
//        return get0XX = tempA.substring(1,2);
    }
    
    /**
     *
     * @param i
     * @return
     */
    public int getFirstDigit(int i) {
    while (Math.abs(i) >= 10 ) {
        i = i / 10;
    }
        return Math.abs(i);
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getCombifield() {
        return combifield;
    }
 
}
