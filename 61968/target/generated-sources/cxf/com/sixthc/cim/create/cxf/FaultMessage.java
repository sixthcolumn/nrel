
package com.sixthc.cim.create.cxf;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-06-12T10:32:03.671-04:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "MaintenanceOrdersFaultMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
public class FaultMessage extends Exception {
    
    private com.sixthc.cim.create.cxf.MaintenanceOrdersFaultMessageType maintenanceOrdersFaultMessage;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, com.sixthc.cim.create.cxf.MaintenanceOrdersFaultMessageType maintenanceOrdersFaultMessage) {
        super(message);
        this.maintenanceOrdersFaultMessage = maintenanceOrdersFaultMessage;
    }

    public FaultMessage(String message, com.sixthc.cim.create.cxf.MaintenanceOrdersFaultMessageType maintenanceOrdersFaultMessage, Throwable cause) {
        super(message, cause);
        this.maintenanceOrdersFaultMessage = maintenanceOrdersFaultMessage;
    }

    public com.sixthc.cim.create.cxf.MaintenanceOrdersFaultMessageType getFaultInfo() {
        return this.maintenanceOrdersFaultMessage;
    }
}
