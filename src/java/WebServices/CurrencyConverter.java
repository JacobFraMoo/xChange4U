/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author cmpdboar
 */
@WebService(serviceName = "CurrencyConverter")
public class CurrencyConverter {

    //Everything is pegged to the US dollar. 
    private final double USD = 1.00;
    
    //Currencies that are to be used in the first conversion.
    private final double SGBP = 1.22068;
    private final double SEUR = 1.06332;
    private final double SCNY = 0.144667;
    private final double SINR = 0.0152289;
    private final double SJPY = 0.00872602;
    private final double SZAR = 0.0764593;
    
    
    //Currencies that are to be used in the second conversion.
    private final double FCNY = 6.91296;
    private final double FEUR = 0.940807;
    private final double FGBP = 0.819380;
    private final double FINR = 65.6603;
    private final double FJPY = 114.586;
    private final double FZAR = 13.0660;

    
    /**
     * Web service operation
     * @param input
     * @param inCurrency
     * @param outCurrency
     * @return 
     */
    @WebMethod(operationName = "convert")
    public double convert(@WebParam(name = "input") double input, @WebParam(name = "inCurrency") double inCurrency, @WebParam(name = "outCurrency") double outCurrency) {
        double sum;
        sum = input * inCurrency;
        sum *= outCurrency;
        
        return sum;
    }
    
    
}