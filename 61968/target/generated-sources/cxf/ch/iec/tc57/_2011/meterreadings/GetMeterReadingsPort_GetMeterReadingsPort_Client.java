
package ch.iec.tc57._2011.meterreadings;

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
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-06-12T10:32:04.536-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class GetMeterReadingsPort_GetMeterReadingsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2011/MeterReadings", "GetMeterReadings");

    private GetMeterReadingsPort_GetMeterReadingsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GetMeterReadings.WSDL_LOCATION;
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
      
        GetMeterReadings ss = new GetMeterReadings(wsdlURL, SERVICE_NAME);
        GetMeterReadingsPort port = ss.getGetMeterReadingsPort();  
        
        {
        System.out.println("Invoking getMeterReadings...");
        ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsRequestMessageType _getMeterReadings_getMeterReadingsRequestMessage = null;
        try {
            ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsResponseMessageType _getMeterReadings__return = port.getMeterReadings(_getMeterReadings_getMeterReadingsRequestMessage);
            System.out.println("getMeterReadings.result=" + _getMeterReadings__return);

        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
