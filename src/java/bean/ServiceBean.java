/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Services.CurrencyConverter_Service;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Did
 */
@Named(value = "serviceBean")
@ManagedBean
@RequestScoped
public class ServiceBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CurrencyWebService/CurrencyConverter.wsdl")
    private CurrencyConverter_Service service;

    private double input = 1;
    private double result;
    private double select1;
    private double select2;
    
    //Currencies that are to be used in the first conversion. So starting conversion (Conversion > USD)
    private final double SCNY = 0.144667;
    private final double SEUR = 1.06332;
    private final double SGBP = 1.22068;
    private final double SINR = 0.0152289;
    private final double SJPY = 0.00872602;
    private final double SZAR = 0.0764593;
    private final double USD = 1;
    
    //Currencies that are to be used in the second conversion. Ending conversion (USD > GoalCurrency)
    private final double FCNY = 6.91296;
    private final double FEUR = 0.940807;
    private final double FGBP = 0.819380;
    private final double FINR = 65.6603;
    private final double FJPY = 114.586;
    private final double FZAR = 13.0660;

    private double toList[] = {SGBP, USD, SEUR, SCNY, SINR, SJPY,SZAR};
    private double fromList[] = {FGBP, USD, FEUR, FCNY, FINR, FJPY,FZAR};
    public String currencies[] = {"GBP", "USD", "EUR", "CNY", "INR", "JPY", "ZAR"};
    public ServiceBean() {
    }

    public String[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String[] currencies) {
        this.currencies = currencies;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getSelect1() {
        return select1;
    }

    public void setSelect1(double select1) {
        this.select1 = select1;
    }

    public double getSelect2() {
        return select2;
    }

    public void setSelect2(double select2) {
        this.select2 = select2;
    }

    public double[] getToList() {
        return toList;
    }

    public void setToList(double[] toList) {
        this.toList = toList;
    }

    public double[] getFromList() {
        return fromList;
    }

    public void setFromList(double[] fromList) {
        this.fromList = fromList;
    }

//    Webservice for converting an input amount with 2 different currencies.
    private static double convert(double input, double inCurrency, double outCurrency) {
        Services.CurrencyConverter_Service service = new Services.CurrencyConverter_Service();
        Services.CurrencyConverter port = service.getCurrencyConverterPort();
        return port.convert(input, inCurrency, outCurrency);
    }
    
    //Sets the result equal to the users input and selections.
    public void submit() {
           this.result= convert(this.input, this.select1, this.select2);

    }
}
