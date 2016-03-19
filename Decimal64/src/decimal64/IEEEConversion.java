/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal64;

/**
 *
 * @author John JP Andresp
 */
public class IEEEConversion {
    private HexadecimalConverter hex = new HexadecimalConverter();
    private BinaryConverter bin = new BinaryConverter();
    private Mantissa mts = new Mantissa();
    private SignBit sb = new SignBit();
    private Exponent exp = new Exponent();
    private Combi com = new Combi();
    private DecimalConverter deci = new DecimalConverter();

    public IEEEConversion(HexadecimalConverter hex, BinaryConverter bin, DecimalConverter deci,
                           Mantissa mts, SignBit sb, Exponent exp, Combi com  ){
        this.bin = bin;
        this.com = com;
        this.exp = exp;
        this.hex = hex;
        this.mts = mts;
        this.sb = sb;
        this.deci = deci;
    }

    public IEEEConversion() {
    }
    
    public String getMantissa(){
        return mts.getMantissa();
    }
    
    public void setMantissa(int mantissa){
        mts.getTheMantissa(mantissa);
    }
    
    public String getSignBit(){
        return sb.getSignbit();
    }
    
    public void setSignBit(int mantissa){
        sb.setSignBit(mantissa);
    }
    
    public void checkCombi(int mantissa, String exponent){
        com.checkCombi(mantissa,exponent);
    }
   
    public String getCombi(){
        return com.getCombifield();
    }
    
    public void setExponent(int x){
        exp.getTheExponent(x);
    }
    
    public String getExponent(){
        return exp.getExponent();
    }
    
    public double HextoDecimal(String hexadecimal){
        return hex.HextoDecimal(hexadecimal);
    }
    
    public double getDecimal(){
        return hex.getDecimal();
    }
    
    public String getExponentForCOMBI(){
        return exp.getExponentForCOMBI();
    }
    
    public String finalAnswer(String sbit, String combi, String exponent,
                                String mantis){
        String s = "";
        
        return s += sbit + " " + combi + " " + exponent + " " + mantis;
    }
    
    public String disengage(){
        return hex.getHexadecimal();
    }
    
    public void setToNull(){
        hex.setToNull();
        exp.setToNull();
        sb.setToNull();
        com.setToNull();
        mts.setToNull();
        bin.setToNull();
        deci.setToNull();
    }
     
}
