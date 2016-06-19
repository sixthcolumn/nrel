
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="cumDemand" type="{http://www.multispeak.org/Version_3.0}cumDemand" minOccurs="0"/>
 *           &lt;element name="coincidentalValue" type="{http://www.multispeak.org/Version_3.0}coincidentalValue" minOccurs="0"/>
 *           &lt;element name="demand" type="{http://www.multispeak.org/Version_3.0}flowDemand" minOccurs="0"/>
 *           &lt;element name="summation" type="{http://www.multispeak.org/Version_3.0}summation" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="tier" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registers", propOrder = {
    "cumDemandOrCoincidentalValueOrDemand"
})
public class Registers {

    @XmlElements({
        @XmlElement(name = "coincidentalValue", type = CoincidentalValue.class),
        @XmlElement(name = "demand", type = FlowDemand.class),
        @XmlElement(name = "cumDemand", type = CumDemand.class),
        @XmlElement(name = "summation", type = Summation.class)
    })
    protected List<Object> cumDemandOrCoincidentalValueOrDemand;
    @XmlAttribute(name = "tier")
    @XmlSchemaType(name = "unsignedInt")
    protected Long tier;

    /**
     * Gets the value of the cumDemandOrCoincidentalValueOrDemand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumDemandOrCoincidentalValueOrDemand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumDemandOrCoincidentalValueOrDemand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoincidentalValue }
     * {@link FlowDemand }
     * {@link CumDemand }
     * {@link Summation }
     * 
     * 
     */
    public List<Object> getCumDemandOrCoincidentalValueOrDemand() {
        if (cumDemandOrCoincidentalValueOrDemand == null) {
            cumDemandOrCoincidentalValueOrDemand = new ArrayList<Object>();
        }
        return this.cumDemandOrCoincidentalValueOrDemand;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTier(Long value) {
        this.tier = value;
    }

}
