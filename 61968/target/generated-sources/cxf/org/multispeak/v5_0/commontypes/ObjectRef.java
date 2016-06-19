
package org.multispeak.v5_0.commontypes;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.multispeak.v5.ConduitContentsRef;
import org.multispeak.v5.WorkItemRef;


/**
 * This is a reference to any type of object.  An objectRef is known when the noun type is not necessarily known in advance and hence must be specified in the message payload.  Thus, an objectRef MUST have at least the noun and either an objectGUID OR a name.  It is expected that the combination of noun.objectGUID OR noun.name is unique.  An objectRef is a HARD, NOUN-SPECIFIED object identifier.
 * 
 * <p>Java class for objectRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectRef">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="primaryIdentifierName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secondaryIdentifierName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noun" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="objectGUID" use="required" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID" />
 *       &lt;attribute name="utility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registeredName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;attribute name="systemName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectRef", propOrder = {
    "value"
})
@XmlSeeAlso({
    NetworkModelRef.class,
    ConduitContentsRef.class,
    WorkItemRef.class
})
public class ObjectRef {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "primaryIdentifierName")
    protected String primaryIdentifierName;
    @XmlAttribute(name = "secondaryIdentifierName")
    protected String secondaryIdentifierName;
    @XmlAttribute(name = "noun", required = true)
    protected QName noun;
    @XmlAttribute(name = "objectGUID", required = true)
    protected String objectGUID;
    @XmlAttribute(name = "utility")
    protected String utility;
    @XmlAttribute(name = "registeredName")
    protected String registeredName;
    @XmlAttribute(name = "systemName")
    protected String systemName;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the primaryIdentifierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdentifierName() {
        return primaryIdentifierName;
    }

    /**
     * Sets the value of the primaryIdentifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdentifierName(String value) {
        this.primaryIdentifierName = value;
    }

    /**
     * Gets the value of the secondaryIdentifierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryIdentifierName() {
        return secondaryIdentifierName;
    }

    /**
     * Sets the value of the secondaryIdentifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryIdentifierName(String value) {
        this.secondaryIdentifierName = value;
    }

    /**
     * Gets the value of the noun property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getNoun() {
        return noun;
    }

    /**
     * Sets the value of the noun property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setNoun(QName value) {
        this.noun = value;
    }

    /**
     * Gets the value of the objectGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectGUID() {
        return objectGUID;
    }

    /**
     * Sets the value of the objectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectGUID(String value) {
        this.objectGUID = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Gets the value of the registeredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredName() {
        return registeredName;
    }

    /**
     * Sets the value of the registeredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredName(String value) {
        this.registeredName = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
