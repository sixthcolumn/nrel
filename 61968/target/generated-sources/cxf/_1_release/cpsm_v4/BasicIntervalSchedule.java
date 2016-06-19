
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BasicIntervalSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicIntervalSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="value1Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value2Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BasicIntervalSchedule", propOrder = {
    "startTime",
    "value1Unit",
    "value2Unit"
})
@XmlSeeAlso({
    IrregularIntervalSchedule.class,
    RegularIntervalSchedule.class
})
public class BasicIntervalSchedule
    extends MspCIMObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected String value1Unit;
    protected String value2Unit;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the value1Unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue1Unit() {
        return value1Unit;
    }

    /**
     * Sets the value of the value1Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue1Unit(String value) {
        this.value1Unit = value;
    }

    /**
     * Gets the value of the value2Unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue2Unit() {
        return value2Unit;
    }

    /**
     * Sets the value of the value2Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue2Unit(String value) {
        this.value2Unit = value;
    }

}
