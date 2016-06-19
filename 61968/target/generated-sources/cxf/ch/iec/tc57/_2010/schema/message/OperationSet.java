
package ch.iec.tc57._2010.schema.message;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Each operation set is a collection of operations that may require operational-integrity and/or sequence control.
 * 
 * <p>Java class for OperationSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enforceMsgSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enforceTransactionalIntegrity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Operation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="noun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="verb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="elementOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;any processContents='skip' namespace='##other' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationSet", propOrder = {
    "enforceMsgSequence",
    "enforceTransactionalIntegrity",
    "operation"
})
public class OperationSet {

    protected Boolean enforceMsgSequence;
    protected Boolean enforceTransactionalIntegrity;
    @XmlElement(name = "Operation")
    protected List<OperationSet.Operation> operation;

    /**
     * Gets the value of the enforceMsgSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceMsgSequence() {
        return enforceMsgSequence;
    }

    /**
     * Sets the value of the enforceMsgSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceMsgSequence(Boolean value) {
        this.enforceMsgSequence = value;
    }

    /**
     * Gets the value of the enforceTransactionalIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceTransactionalIntegrity() {
        return enforceTransactionalIntegrity;
    }

    /**
     * Sets the value of the enforceTransactionalIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceTransactionalIntegrity(Boolean value) {
        this.enforceTransactionalIntegrity = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationSet.Operation }
     * 
     * 
     */
    public List<OperationSet.Operation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<OperationSet.Operation>();
        }
        return this.operation;
    }


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
     *         &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="noun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="verb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="elementOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;any processContents='skip' namespace='##other' minOccurs="0"/>
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
        "operationId",
        "noun",
        "verb",
        "elementOperation",
        "any"
    })
    public static class Operation {

        @XmlElement(required = true)
        protected BigInteger operationId;
        protected String noun;
        protected String verb;
        @XmlElement(defaultValue = "false")
        protected Boolean elementOperation;
        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the operationId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOperationId() {
            return operationId;
        }

        /**
         * Sets the value of the operationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOperationId(BigInteger value) {
            this.operationId = value;
        }

        /**
         * Gets the value of the noun property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoun() {
            return noun;
        }

        /**
         * Sets the value of the noun property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoun(String value) {
            this.noun = value;
        }

        /**
         * Gets the value of the verb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerb() {
            return verb;
        }

        /**
         * Sets the value of the verb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerb(String value) {
            this.verb = value;
        }

        /**
         * Gets the value of the elementOperation property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isElementOperation() {
            return elementOperation;
        }

        /**
         * Sets the value of the elementOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setElementOperation(Boolean value) {
            this.elementOperation = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
