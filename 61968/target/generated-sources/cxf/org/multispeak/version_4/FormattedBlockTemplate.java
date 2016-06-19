
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formattedBlockTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formattedBlockTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedBlock" type="{http://www.multispeak.org/Version_4.1_Release}formattedBlock" minOccurs="0"/>
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
@XmlType(name = "formattedBlockTemplate", propOrder = {
    "templateName",
    "formattedBlock"
})
public class FormattedBlockTemplate
    extends MspObject
{

    protected String templateName;
    protected FormattedBlock formattedBlock;

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the formattedBlock property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedBlock }
     *     
     */
    public FormattedBlock getFormattedBlock() {
        return formattedBlock;
    }

    /**
     * Sets the value of the formattedBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedBlock }
     *     
     */
    public void setFormattedBlock(FormattedBlock value) {
        this.formattedBlock = value;
    }

}
