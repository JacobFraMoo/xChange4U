/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Jacob
 */
@Path("moneytransferport")
public class MoneyTransferPort {

    private WebServices_client.MoneyTransfer port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MoneyTransferPort
     */
    public MoneyTransferPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method completedTransfer
     * @param senderName resource URI parameter
     * @param senderLocation resource URI parameter
     * @param receiverName resource URI parameter
     * @param receiverLocation resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("completedtransfer/")
    public String getCompletedTransfer(@QueryParam("senderName") String senderName, @QueryParam("senderLocation") String senderLocation, @QueryParam("receiverName") String receiverName, @QueryParam("receiverLocation") String receiverLocation) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.completedTransfer(senderName, senderLocation, receiverName, receiverLocation);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private WebServices_client.MoneyTransfer getPort() {
        try {
            // Call Web Service Operation
            WebServices_client.MoneyTransfer_Service service = new WebServices_client.MoneyTransfer_Service();
            WebServices_client.MoneyTransfer p = service.getMoneyTransferPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
