
package org.multispeak.v5_0.ws.response;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.multispeak.v5_0.commontypes.Caller;
import org.multispeak.v5_0.commontypes.CodedNames;
import org.multispeak.v5_0.commontypes.CoordinateSystemInformation;
import org.multispeak.v5_0.commontypes.MessageContext;
import org.multispeak.v5_0.commontypes.MultiSpeakVersion;
import org.multispeak.v5_0.commontypes.Result;
import org.multispeak.v5_0.enumerations.CurrencyCode;


/**
 * This is the message header for response-type messages.
 * 
 * <p>Java class for MultiSpeakResponseMsgHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSpeakResponseMsgHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultiSpeakVersion" type="{http://www.multispeak.org/V5.0/commonTypes}MultiSpeakVersion"/>
 *         &lt;element name="Caller" type="{http://www.multispeak.org/V5.0/commonTypes}Caller"/>
 *         &lt;element name="CodedNames" type="{http://www.multispeak.org/V5.0/commonTypes}CodedNames" minOccurs="0"/>
 *         &lt;element name="CoordinateSystemInformation" type="{http://www.multispeak.org/V5.0/commonTypes}CoordinateSystemInformation" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.multispeak.org/V5.0/commonTypes}result"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DefaultRegisteredName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;attribute name="DefaultSystemName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;attribute name="DefaultUtility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DefaultCurrencyCode" type="{http://www.multispeak.org/V5.0/enumerations}currencyCode" />
 *       &lt;attribute name="MessageID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="MessageCreatedTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Context" type="{http://www.multispeak.org/V5.0/commonTypes}MessageContext" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSpeakResponseMsgHeader", propOrder = {
    "multiSpeakVersion",
    "caller",
    "codedNames",
    "coordinateSystemInformation",
    "result"
})
@XmlSeeAlso({
    MultiSpeakResponseMsgHeader.class
})
public class MultiSpeakResponseMsgHeader2 {

    @XmlElement(name = "MultiSpeakVersion", required = true)
    protected MultiSpeakVersion multiSpeakVersion;
    @XmlElement(name = "Caller", required = true)
    protected Caller caller;
    @XmlElement(name = "CodedNames")
    protected CodedNames codedNames;
    @XmlElement(name = "CoordinateSystemInformation")
    protected CoordinateSystemInformation coordinateSystemInformation;
    @XmlElement(name = "Result", required = true)
    protected Result result;
    @XmlAttribute(name = "DefaultRegisteredName")
    protected String defaultRegisteredName;
    @XmlAttribute(name = "DefaultSystemName")
    protected String defaultSystemName;
    @XmlAttribute(name = "DefaultUtility")
    protected String defaultUtility;
    @XmlAttribute(name = "DefaultCurrencyCode")
    protected CurrencyCode defaultCurrencyCode;
    @XmlAttribute(name = "MessageID", required = true)
    protected String messageID;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "MessageCreatedTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageCreatedTimeStamp;
    @XmlAttribute(name = "Context")
    protected MessageContext context;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the multiSpeakVersion property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSpeakVersion }
     *     
     */
    public MultiSpeakVersion getMultiSpeakVersion() {
        return multiSpeakVersion;
    }

    /**
     * Sets the value of the multiSpeakVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSpeakVersion }
     *     
     */
    public void setMultiSpeakVersion(MultiSpeakVersion value) {
        this.multiSpeakVersion = value;
    }

    /**
     * Gets the value of the caller property.
     * 
     * @return
     *     possible object is
     *     {@link Caller }
     *     
     */
    public Caller getCaller() {
        return caller;
    }

    /**
     * Sets the value of the caller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caller }
     *     
     */
    public void setCaller(Caller value) {
        this.caller = value;
    }

    /**
     * Gets the value of the codedNames property.
     * 
     * @return
     *     possible object is
     *     {@link CodedNames }
     *     
     */
    public CodedNames getCodedNames() {
        return codedNames;
    }

    /**
     * Sets the value of the codedNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedNames }
     *     
     */
    public void setCodedNames(CodedNames value) {
        this.codedNames = value;
    }

    /**
     * Gets the value of the coordinateSystemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemInformation }
     *     
     */
    public CoordinateSystemInformation getCoordinateSystemInformation() {
        return coordinateSystemInformation;
    }

    /**
     * Sets the value of the coordinateSystemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemInformation }
     *     
     */
    public void setCoordinateSystemInformation(CoordinateSystemInformation value) {
        this.coordinateSystemInformation = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the defaultRegisteredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRegisteredName() {
        return defaultRegisteredName;
    }

    /**
     * Sets the value of the defaultRegisteredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRegisteredName(String value) {
        this.defaultRegisteredName = value;
    }

    /**
     * Gets the value of the defaultSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSystemName() {
        return defaultSystemName;
    }

    /**
     * Sets the value of the defaultSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSystemName(String value) {
        this.defaultSystemName = value;
    }

    /**
     * Gets the value of the defaultUtility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultUtility() {
        return defaultUtility;
    }

    /**
     * Sets the value of the defaultUtility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultUtility(String value) {
        this.defaultUtility = value;
    }

    /**
     * Gets the value of the defaultCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getDefaultCurrencyCode() {
        return defaultCurrencyCode;
    }

    /**
     * Sets the value of the defaultCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setDefaultCurrencyCode(CurrencyCode value) {
        this.defaultCurrencyCode = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the messageCreatedTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageCreatedTimeStamp() {
        return messageCreatedTimeStamp;
    }

    /**
     * Sets the value of the messageCreatedTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageCreatedTimeStamp(XMLGregorianCalendar value) {
        this.messageCreatedTimeStamp = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link MessageContext }
     *     
     */
    public MessageContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageContext }
     *     
     */
    public void setContext(MessageContext value) {
        this.context = value;
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
