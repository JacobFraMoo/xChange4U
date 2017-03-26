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
 * @author Jacob
 */
       
@WebService(serviceName = "MoneyTransfer")
public class MoneyTransfer { 
    /**
     * Web service operation
     * @param senderName
     * @param senderLocation
     * @param receiverName
     * @param receiverLocation
     * @return 
     */
    @WebMethod(operationName = "completedTransfer")
    public String completedTransfer (@WebParam(name="senderName" ) String senderName, @WebParam(name="senderLocation") String senderLocation, @WebParam(name="receiverName") String receiverName, @WebParam(name="receiverLocation") String receiverLocation) {
        String statement;
        statement = "Congratulations! " + receiverName + " from " + receiverLocation + " has received money from " + senderName + " in " + senderLocation + ".";
        return statement;       
    }
}
