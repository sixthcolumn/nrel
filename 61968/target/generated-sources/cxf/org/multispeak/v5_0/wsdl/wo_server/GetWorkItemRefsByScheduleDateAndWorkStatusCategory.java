
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfScheduleDate;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCategory;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfScheduleDate" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfScheduleDate" minOccurs="0"/>
 *         &lt;element name="ArrayOfWorkStatusCategory" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkStatusCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrayOfScheduleDate",
    "arrayOfWorkStatusCategory"
})
@XmlRootElement(name = "GetWorkItemRefsByScheduleDateAndWorkStatusCategory")
public class GetWorkItemRefsByScheduleDateAndWorkStatusCategory {

    @XmlElement(name = "ArrayOfScheduleDate")
    protected ArrayOfScheduleDate arrayOfScheduleDate;
    @XmlElement(name = "ArrayOfWorkStatusCategory")
    protected ArrayOfWorkStatusCategory arrayOfWorkStatusCategory;

    /**
     * Gets the value of the arrayOfScheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScheduleDate }
     *     
     */
    public ArrayOfScheduleDate getArrayOfScheduleDate() {
        return arrayOfScheduleDate;
    }

    /**
     * Sets the value of the arrayOfScheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScheduleDate }
     *     
     */
    public void setArrayOfScheduleDate(ArrayOfScheduleDate value) {
        this.arrayOfScheduleDate = value;
    }

    /**
     * Gets the value of the arrayOfWorkStatusCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkStatusCategory }
     *     
     */
    public ArrayOfWorkStatusCategory getArrayOfWorkStatusCategory() {
        return arrayOfWorkStatusCategory;
    }

    /**
     * Sets the value of the arrayOfWorkStatusCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkStatusCategory }
     *     
     */
    public void setArrayOfWorkStatusCategory(ArrayOfWorkStatusCategory value) {
        this.arrayOfWorkStatusCategory = value;
    }

}
