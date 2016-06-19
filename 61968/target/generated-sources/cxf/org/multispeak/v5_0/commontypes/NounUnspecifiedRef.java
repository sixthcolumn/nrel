
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.DesignReference;
import org.multispeak.v5.WorkOrderReference;


/**
 * The nounUnspecifiedRef is used when it is desirable to refer to an object of known noun type using either an objectID or a multiPartIdentifier. 
 * 
 * <p>Java class for nounUnspecifiedRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nounUnspecifiedRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="objectID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="objectName" type="{http://www.multispeak.org/V5.0/commonTypes}multiPartIdentifier"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nounUnspecifiedRef", propOrder = {
    "objectID",
    "objectName"
})
@XmlSeeAlso({
    WorkOrderReference.class,
    DesignReference.class
})
public class NounUnspecifiedRef {

    protected ObjectID objectID;
    protected MultiPartIdentifier objectName;

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setObjectID(ObjectID value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPartIdentifier }
     *     
     */
    public MultiPartIdentifier getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPartIdentifier }
     *     
     */
    public void setObjectName(MultiPartIdentifier value) {
        this.objectName = value;
    }

}
