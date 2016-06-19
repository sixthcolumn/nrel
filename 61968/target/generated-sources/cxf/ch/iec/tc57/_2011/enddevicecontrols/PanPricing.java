
package ch.iec.tc57._2011.enddevicecontrols;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PAN action/command used to issue pricing
 * 				information to a PAN device.
 * 
 * <p>Java class for PanPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanPricing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iec.ch/TC57/2011/EndDeviceControls#}EndDeviceAction">
 *       &lt;sequence>
 *         &lt;element name="providerID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PanPricingDetails" type="{http://iec.ch/TC57/2011/EndDeviceControls#}PanPricingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanPricing", propOrder = {
    "providerID",
    "panPricingDetails"
})
public class PanPricing
    extends EndDeviceAction
{

    protected BigInteger providerID;
    @XmlElement(name = "PanPricingDetails")
    protected List<PanPricingDetail> panPricingDetails;

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProviderID(BigInteger value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the panPricingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panPricingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanPricingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanPricingDetail }
     * 
     * 
     */
    public List<PanPricingDetail> getPanPricingDetails() {
        if (panPricingDetails == null) {
            panPricingDetails = new ArrayList<PanPricingDetail>();
        }
        return this.panPricingDetails;
    }

}
