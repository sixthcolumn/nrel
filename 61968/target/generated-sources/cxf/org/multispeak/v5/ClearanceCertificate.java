
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A clearance (sometimes referred to as being a guarantee) is an assurance given to one or more field workers that a device will not be operated.  A clearance certificate can carry one or more clearanceInstances. Multiple clearance instances may be issued to the same person and additioanl clearanceInstances might be issued to different workers on the same job.  All clearanceInstances must be released before the clearanceCertificate is satisfied and the tagged device may be safely operated.
 * 
 * <p>Java class for clearanceCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearanceCertificate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="clearanceInstanceIDs" type="{http://www.multispeak.org/V5.0}clearanceInstanceIDs"/>
 *         &lt;element name="clearanceTags" type="{http://www.multispeak.org/V5.0}clearanceTags"/>
 *         &lt;element name="certificateAuthorizations" type="{http://www.multispeak.org/V5.0}certificateAuthorizations"/>
 *         &lt;element name="externalRequest" type="{http://www.multispeak.org/V5.0}externalRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearanceCertificate", propOrder = {
    "clearanceInstanceIDs",
    "clearanceTags",
    "certificateAuthorizations",
    "externalRequest"
})
public class ClearanceCertificate
    extends MspObject
{

    @XmlElement(required = true)
    protected ClearanceInstanceIDs clearanceInstanceIDs;
    @XmlElement(required = true)
    protected ClearanceTags clearanceTags;
    @XmlElement(required = true)
    protected CertificateAuthorizations certificateAuthorizations;
    protected ExternalRequest externalRequest;

    /**
     * Gets the value of the clearanceInstanceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceInstanceIDs }
     *     
     */
    public ClearanceInstanceIDs getClearanceInstanceIDs() {
        return clearanceInstanceIDs;
    }

    /**
     * Sets the value of the clearanceInstanceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceInstanceIDs }
     *     
     */
    public void setClearanceInstanceIDs(ClearanceInstanceIDs value) {
        this.clearanceInstanceIDs = value;
    }

    /**
     * Gets the value of the clearanceTags property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceTags }
     *     
     */
    public ClearanceTags getClearanceTags() {
        return clearanceTags;
    }

    /**
     * Sets the value of the clearanceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceTags }
     *     
     */
    public void setClearanceTags(ClearanceTags value) {
        this.clearanceTags = value;
    }

    /**
     * Gets the value of the certificateAuthorizations property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateAuthorizations }
     *     
     */
    public CertificateAuthorizations getCertificateAuthorizations() {
        return certificateAuthorizations;
    }

    /**
     * Sets the value of the certificateAuthorizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateAuthorizations }
     *     
     */
    public void setCertificateAuthorizations(CertificateAuthorizations value) {
        this.certificateAuthorizations = value;
    }

    /**
     * Gets the value of the externalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequest }
     *     
     */
    public ExternalRequest getExternalRequest() {
        return externalRequest;
    }

    /**
     * Sets the value of the externalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequest }
     *     
     */
    public void setExternalRequest(ExternalRequest value) {
        this.externalRequest = value;
    }

}
