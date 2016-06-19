
package org.multispeak.v5_0.commontypes;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.multispeak.v5_0.enumerations.EquipmentTypeKind;


/**
 * This is a reference to an engineering equipment catalog entry.
 * 
 * <p>Java class for equipmentCatalogRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipmentCatalogRef">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="objectGUID" use="required" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID" />
 *       &lt;attribute name="equipmentType" use="required" type="{http://www.multispeak.org/V5.0/enumerations}equipmentTypeKind" />
 *       &lt;attribute name="entryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipmentCatalogRef", propOrder = {
    "value"
})
public class EquipmentCatalogRef {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "objectGUID", required = true)
    protected String objectGUID;
    @XmlAttribute(name = "equipmentType", required = true)
    protected EquipmentTypeKind equipmentType;
    @XmlAttribute(name = "entryName")
    protected String entryName;
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
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeKind }
     *     
     */
    public EquipmentTypeKind getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeKind }
     *     
     */
    public void setEquipmentType(EquipmentTypeKind value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the entryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryName() {
        return entryName;
    }

    /**
     * Sets the value of the entryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryName(String value) {
        this.entryName = value;
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
