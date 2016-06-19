
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for endDeviceShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceShipment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="utility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shippedToAddress" type="{http://www.multispeak.org/Version_4.1_Release}address" minOccurs="0"/>
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transponderIDRange" type="{http://www.multispeak.org/Version_4.1_Release}transponderIDRange" minOccurs="0"/>
 *         &lt;element name="receivedElectricMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfReceivedElectricMeter" minOccurs="0"/>
 *         &lt;element name="receivedModules" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfModule" minOccurs="0"/>
 *         &lt;element name="receivedLoadManagementDevices" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfLoadManagementDevice" minOccurs="0"/>
 *         &lt;element name="receivedCDDevices" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCDDevice" minOccurs="0"/>
 *         &lt;element name="receivedGasMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfReceivedGasMeter" minOccurs="0"/>
 *         &lt;element name="receivedWaterMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfReceivedWaterMeter" minOccurs="0"/>
 *         &lt;element name="receivedPropaneMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfReceivedPropaneMeter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceShipment", propOrder = {
    "rest"
})
public class EndDeviceShipment
    extends MspObject
{

    @XmlElementRefs({
        @XmlElementRef(name = "shippedDate", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "manufacturer", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "poReferenceNumber", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedElectricMeters", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedGasMeters", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "shippingTicketNumber", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "recipient", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "transponderIDRange", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedDate", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "shippedToAddress", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedWaterMeters", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "utility", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedLoadManagementDevices", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedModules", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedPropaneMeters", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class),
        @XmlElementRef(name = "receivedCDDevices", namespace = "http://www.multispeak.org/Version_4.1_Release", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Utility" is used by two different parts of a schema. See: 
     * line 7766 of file:/usr/local/git/nrel/61968/wsdl/cb_server_special.wsdl
     * line 65 of file:/usr/local/git/nrel/61968/wsdl/cb_server_special.wsdl
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfReceivedElectricMeter }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfReceivedGasMeter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TransponderIDRange }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfReceivedWaterMeter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfLoadManagementDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfModule }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfCDDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayOfReceivedPropaneMeter }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
