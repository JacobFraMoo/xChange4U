/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import WebServices_client.MoneyTransfer_Service;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Jacob
 */
@Named(value = "moneyBean")
@ManagedBean
@RequestScoped
public class MoneyBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WebServicesCurrencyExchange-master/MoneyTransfer.wsdl")
    private MoneyTransfer_Service service;
    private String receiverName;
    private String receiverLocation;
    private String senderName;
    private String senderLocation;
    private String transferResult;
    
    public String getReceiverName() {
        return receiverName;
    }
    
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    
    public String getReceiverLocation() {
        return receiverLocation;
    }
    
    public void setReceiverLocation(String receiverLocation) {
        this.receiverLocation = receiverLocation;
    }
    
    public String getSenderLocation() {
        return senderLocation;
    }
    
    public void setSenderLocation(String senderLocation) {
        this.senderLocation = senderLocation;
    }
    
    public String getSenderName() {
        return senderName;
    }
    
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getTransferResult() {
        return transferResult;
    }
    
    public void setTransferResult (String transferResult) {
        this.transferResult = transferResult;
    }
    
    private String completedTransfer(java.lang.String senderName, java.lang.String senderLocation, 
        java.lang.String receiverName, java.lang.String receiverLocation) {
        WebServices_client.MoneyTransfer port = service.getMoneyTransferPort();
        return port.completedTransfer(senderName, senderLocation, receiverName, receiverLocation);
    }    
}
