
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about authorization events related to this clearanceCertificate.
 * 
 * <p>Java class for certificateAuthorizations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certificateAuthorizations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificateAuthorization" type="{http://www.multispeak.org/V5.0}authorization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificateAuthorizations", propOrder = {
    "certificateAuthorization"
})
public class CertificateAuthorizations {

    protected List<Authorization> certificateAuthorization;

    /**
     * Gets the value of the certificateAuthorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateAuthorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorization }
     * 
     * 
     */
    public List<Authorization> getCertificateAuthorization() {
        if (certificateAuthorization == null) {
            certificateAuthorization = new ArrayList<Authorization>();
        }
        return this.certificateAuthorization;
    }

}
