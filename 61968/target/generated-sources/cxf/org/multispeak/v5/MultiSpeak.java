
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.ConnectivityModelKind;
import org.multispeak.v5_0.enumerations.DocumentType;


/**
 * The MultiSpeak class is a container that can be used to carry a combination of any multiplicity of any class. Batch messages SHALL wrap data instances in a MultiSpeak container.
 * 
 * <p>Java class for MultiSpeak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSpeak">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdContainer" type="{http://www.multispeak.org/V5.0}createdContainer" minOccurs="0"/>
 *         &lt;element name="changedContainer" type="{http://www.multispeak.org/V5.0}changedContainer" minOccurs="0"/>
 *         &lt;element name="deletedContainer" type="{http://www.multispeak.org/V5.0}deletedContainer" minOccurs="0"/>
 *         &lt;element name="responseContainer" type="{http://www.multispeak.org/V5.0}responseContainer" minOccurs="0"/>
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
@XmlType(name = "MultiSpeak", propOrder = {
    "createdContainer",
    "changedContainer",
    "deletedContainer",
    "responseContainer"
})
public class MultiSpeak {

    protected CreatedContainer createdContainer;
    protected ChangedContainer changedContainer;
    protected DeletedContainer deletedContainer;
    protected ResponseContainer responseContainer;
    @XmlAttribute(name = "documentType")
    protected DocumentType documentType;
    @XmlAttribute(name = "connectivityModel")
    protected ConnectivityModelKind connectivityModel;

    /**
     * Gets the value of the createdContainer property.
     * 
     * @return
     *     possible object is
     *     {@link CreatedContainer }
     *     
     */
    public CreatedContainer getCreatedContainer() {
        return createdContainer;
    }

    /**
     * Sets the value of the createdContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatedContainer }
     *     
     */
    public void setCreatedContainer(CreatedContainer value) {
        this.createdContainer = value;
    }

    /**
     * Gets the value of the changedContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedContainer }
     *     
     */
    public ChangedContainer getChangedContainer() {
        return changedContainer;
    }

    /**
     * Sets the value of the changedContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedContainer }
     *     
     */
    public void setChangedContainer(ChangedContainer value) {
        this.changedContainer = value;
    }

    /**
     * Gets the value of the deletedContainer property.
     * 
     * @return
     *     possible object is
     *     {@link DeletedContainer }
     *     
     */
    public DeletedContainer getDeletedContainer() {
        return deletedContainer;
    }

    /**
     * Sets the value of the deletedContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletedContainer }
     *     
     */
    public void setDeletedContainer(DeletedContainer value) {
        this.deletedContainer = value;
    }

    /**
     * Gets the value of the responseContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContainer }
     *     
     */
    public ResponseContainer getResponseContainer() {
        return responseContainer;
    }

    /**
     * Sets the value of the responseContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContainer }
     *     
     */
    public void setResponseContainer(ResponseContainer value) {
        this.responseContainer = value;
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
