
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sectionalizer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sectionalizer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspOverCurrentDevice">
 *       &lt;sequence>
 *         &lt;element name="counts" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sectionalizerImpedances" type="{http://www.multispeak.org/Version_4.1_Release}sectionalizerImpedances" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectionalizer", propOrder = {
    "counts",
    "sectionalizerImpedances"
})
public class Sectionalizer
    extends MspOverCurrentDevice
{

    protected BigInteger counts;
    protected SectionalizerImpedances sectionalizerImpedances;

    /**
     * Gets the value of the counts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCounts() {
        return counts;
    }

    /**
     * Sets the value of the counts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCounts(BigInteger value) {
        this.counts = value;
    }

    /**
     * Gets the value of the sectionalizerImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link SectionalizerImpedances }
     *     
     */
    public SectionalizerImpedances getSectionalizerImpedances() {
        return sectionalizerImpedances;
    }

    /**
     * Sets the value of the sectionalizerImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionalizerImpedances }
     *     
     */
    public void setSectionalizerImpedances(SectionalizerImpedances value) {
        this.sectionalizerImpedances = value;
    }

}
