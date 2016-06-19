
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Extensions;
import org.multispeak.v5_0.enumerations.ConnectivityModelKind;
import org.multispeak.v5_0.enumerations.DocumentType;


/**
 * <p>Java class for CPSM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPSM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/V5.0/commonTypes}extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="documentType" type="{http://www.multispeak.org/V5.0/enumerations}documentType" />
 *       &lt;attribute name="connectivityModel" type="{http://www.multispeak.org/V5.0/enumerations}connectivityModelKind" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPSM", propOrder = {
    "extensions"
})
public class CPSM {

    protected Extensions extensions;
    @XmlAttribute(name = "documentType")
    protected DocumentType documentType;
    @XmlAttribute(name = "connectivityModel")
    protected ConnectivityModelKind connectivityModel;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the connectivityModel property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityModelKind }
     *     
     */
    public ConnectivityModelKind getConnectivityModel() {
        return connectivityModel;
    }

    /**
     * Sets the value of the connectivityModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityModelKind }
     *     
     */
    public void setConnectivityModel(ConnectivityModelKind value) {
        this.connectivityModel = value;
    }

}
