
package ch.iec.tc57._2011.meterservicerequests;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-06-12T10:32:05.459-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class SendMeterServiceRequestsPort_SendMeterServiceRequestsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterServiceRequests", "SendMeterServiceRequests");

    private SendMeterServiceRequestsPort_SendMeterServiceRequestsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SendMeterServiceRequests.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SendMeterServiceRequests ss = new SendMeterServiceRequests(wsdlURL, SERVICE_NAME);
        SendMeterServiceRequestsPort port = ss.getSendMeterServiceRequestsPort();  
        
        {
        System.out.println("Invoking closedMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _closedMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _closedMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_closedMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _closedMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _closedMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_closedMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _closedMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.closedMeterServiceRequests(_closedMeterServiceRequests_header, _closedMeterServiceRequests_payload, _closedMeterServiceRequests_reply);

            System.out.println("closedMeterServiceRequests._closedMeterServiceRequests_header=" + _closedMeterServiceRequests_header.value);
            System.out.println("closedMeterServiceRequests._closedMeterServiceRequests_payload=" + _closedMeterServiceRequests_payload.value);
            System.out.println("closedMeterServiceRequests._closedMeterServiceRequests_reply=" + _closedMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deletedMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _deletedMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _deletedMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_deletedMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _deletedMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _deletedMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_deletedMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _deletedMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.deletedMeterServiceRequests(_deletedMeterServiceRequests_header, _deletedMeterServiceRequests_payload, _deletedMeterServiceRequests_reply);

            System.out.println("deletedMeterServiceRequests._deletedMeterServiceRequests_header=" + _deletedMeterServiceRequests_header.value);
            System.out.println("deletedMeterServiceRequests._deletedMeterServiceRequests_payload=" + _deletedMeterServiceRequests_payload.value);
            System.out.println("deletedMeterServiceRequests._deletedMeterServiceRequests_reply=" + _deletedMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changedMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _changedMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _changedMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_changedMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _changedMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _changedMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_changedMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _changedMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.changedMeterServiceRequests(_changedMeterServiceRequests_header, _changedMeterServiceRequests_payload, _changedMeterServiceRequests_reply);

            System.out.println("changedMeterServiceRequests._changedMeterServiceRequests_header=" + _changedMeterServiceRequests_header.value);
            System.out.println("changedMeterServiceRequests._changedMeterServiceRequests_payload=" + _changedMeterServiceRequests_payload.value);
            System.out.println("changedMeterServiceRequests._changedMeterServiceRequests_reply=" + _changedMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createdMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _createdMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _createdMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_createdMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _createdMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _createdMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_createdMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _createdMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.createdMeterServiceRequests(_createdMeterServiceRequests_header, _createdMeterServiceRequests_payload, _createdMeterServiceRequests_reply);

            System.out.println("createdMeterServiceRequests._createdMeterServiceRequests_header=" + _createdMeterServiceRequests_header.value);
            System.out.println("createdMeterServiceRequests._createdMeterServiceRequests_payload=" + _createdMeterServiceRequests_payload.value);
            System.out.println("createdMeterServiceRequests._createdMeterServiceRequests_reply=" + _createdMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking canceledMeterServiceRequests...");
        ch.iec.tc57._2011.schema.message.HeaderType _canceledMeterServiceRequests_headerVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType> _canceledMeterServiceRequests_header = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.HeaderType>(_canceledMeterServiceRequests_headerVal);
        ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType _canceledMeterServiceRequests_payloadVal = null;
        javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType> _canceledMeterServiceRequests_payload = new javax.xml.ws.Holder<ch.iec.tc57._2011.meterservicerequestsmessage.MeterServiceRequestsPayloadType>(_canceledMeterServiceRequests_payloadVal);
        javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType> _canceledMeterServiceRequests_reply = new javax.xml.ws.Holder<ch.iec.tc57._2011.schema.message.ReplyType>();
        try {
            port.canceledMeterServiceRequests(_canceledMeterServiceRequests_header, _canceledMeterServiceRequests_payload, _canceledMeterServiceRequests_reply);

            System.out.println("canceledMeterServiceRequests._canceledMeterServiceRequests_header=" + _canceledMeterServiceRequests_header.value);
            System.out.println("canceledMeterServiceRequests._canceledMeterServiceRequests_payload=" + _canceledMeterServiceRequests_payload.value);
            System.out.println("canceledMeterServiceRequests._canceledMeterServiceRequests_reply=" + _canceledMeterServiceRequests_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
