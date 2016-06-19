
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkIDChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkIDChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="checkData" type="{http://www.multispeak.org/V5.0}checkData"/>
 *         &lt;element name="authorizedCheckData" type="{http://www.multispeak.org/V5.0}authorizedCheckData"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkIDChoice", propOrder = {
    "checkData",
    "authorizedCheckData"
})
public class CheckIDChoice {

    protected CheckData checkData;
    protected AuthorizedCheckData authorizedCheckData;

    /**
     * Gets the value of the checkData property.
     * 
     * @return
     *     possible object is
     *     {@link CheckData }
     *     
     */
    public CheckData getCheckData() {
        return checkData;
    }

    /**
     * Sets the value of the checkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckData }
     *     
     */
    public void setCheckData(CheckData value) {
        this.checkData = value;
    }

    /**
     * Gets the value of the authorizedCheckData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedCheckData }
     *     
     */
    public AuthorizedCheckData getAuthorizedCheckData() {
        return authorizedCheckData;
    }

    /**
     * Sets the value of the authorizedCheckData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedCheckData }
     *     
     */
    public void setAuthorizedCheckData(AuthorizedCheckData value) {
        this.authorizedCheckData = value;
    }

}
