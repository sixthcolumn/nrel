
package org.multispeak.v5;

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
 * One 'registers' element is created for each billing tier of a reading and contains all registers for that tier. Total registers are identified by the absence of the 'tier' attribute. The first tier is identified by the 'tier' attribute set to 1, the second tier is identify by the 'tier' attribute set to 2,
 * 
 * <p>Java class for registers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="summation" type="{http://www.multispeak.org/V5.0}summation"/>
 *           &lt;element name="demand" type="{http://www.multispeak.org/V5.0}flowDemand"/>
 *           &lt;element name="cumDemand" type="{http://www.multispeak.org/V5.0}cumulativeDemand"/>
 *           &lt;element name="coincidentalValue" type="{http://www.multispeak.org/V5.0}coincidentalValue"/>
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
    "summationOrDemandOrCumDemand"
})
public class Registers {

    @XmlElements({
        @XmlElement(name = "coincidentalValue", type = CoincidentalValue.class),
        @XmlElement(name = "cumDemand", type = CumulativeDemand.class),
        @XmlElement(name = "demand", type = FlowDemand.class),
        @XmlElement(name = "summation", type = Summation.class)
    })
    protected List<Object> summationOrDemandOrCumDemand;
    @XmlAttribute(name = "tier")
    @XmlSchemaType(name = "unsignedInt")
    protected Long tier;

    /**
     * Gets the value of the summationOrDemandOrCumDemand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summationOrDemandOrCumDemand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummationOrDemandOrCumDemand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoincidentalValue }
     * {@link CumulativeDemand }
     * {@link FlowDemand }
     * {@link Summation }
     * 
     * 
     */
    public List<Object> getSummationOrDemandOrCumDemand() {
        if (summationOrDemandOrCumDemand == null) {
            summationOrDemandOrCumDemand = new ArrayList<Object>();
        }
        return this.summationOrDemandOrCumDemand;
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
