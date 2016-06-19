
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains information about how the ACLineSegment is constructed and provides a link to the lineConstructionEntry in the engineering catalog.
 * 
 * <p>Java class for constructionItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constructionItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionItem" type="{http://www.multispeak.org/V5.0}constructionItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructionItems", propOrder = {
    "constructionItem"
})
public class ConstructionItems {

    @XmlElement(required = true)
    protected List<ConstructionItem> constructionItem;

    /**
     * Gets the value of the constructionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructionItem }
     * 
     * 
     */
    public List<ConstructionItem> getConstructionItem() {
        if (constructionItem == null) {
            constructionItem = new ArrayList<ConstructionItem>();
        }
        return this.constructionItem;
    }

}
