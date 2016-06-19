package ch.iec.tc57._2011.enddevicecontrols;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-06-12T10:32:06.332-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "SendEndDeviceControls", 
                  wsdlLocation = "file:/usr/local/git/nrel/61968/wsdl/SendEndDeviceControls.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2011/EndDeviceControls") 
public class SendEndDeviceControls extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "SendEndDeviceControls");
    public final static QName SendEndDeviceControlsPort = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "SendEndDeviceControls_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/usr/local/git/nrel/61968/wsdl/SendEndDeviceControls.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SendEndDeviceControls.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/usr/local/git/nrel/61968/wsdl/SendEndDeviceControls.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SendEndDeviceControls(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SendEndDeviceControls(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SendEndDeviceControls() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SendEndDeviceControls(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SendEndDeviceControls(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SendEndDeviceControls(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SendEndDeviceControlsPort
     */
    @WebEndpoint(name = "SendEndDeviceControls_Port")
    public SendEndDeviceControlsPort getSendEndDeviceControlsPort() {
        return super.getPort(SendEndDeviceControlsPort, SendEndDeviceControlsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SendEndDeviceControlsPort
     */
    @WebEndpoint(name = "SendEndDeviceControls_Port")
    public SendEndDeviceControlsPort getSendEndDeviceControlsPort(WebServiceFeature... features) {
        return super.getPort(SendEndDeviceControlsPort, SendEndDeviceControlsPort.class, features);
    }

}
