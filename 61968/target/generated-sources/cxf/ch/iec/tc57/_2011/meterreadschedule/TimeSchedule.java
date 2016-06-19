
package ch.iec.tc57._2011.meterreadschedule;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Description of anything that changes through time.
 * 				Time schedule is used to perform a single-valued function of time.
 * 				Use inherited 'type' attribute to give additional information on
 * 				this schedule, such as: periodic (hourly, daily, weekly, monthly,
 * 				etc.), day of the month, by date, calendar (specific times and
 * 				dates).
 * 
 * <p>Java class for TimeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}Seconds" minOccurs="0"/>
 *         &lt;element name="recurrencePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrencePeriod" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}Seconds" minOccurs="0"/>
 *         &lt;element name="scheduleInterval">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TimePoints" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="relativeTimeInterval" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}Seconds" minOccurs="0"/>
 *                   &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="window" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "TimeSchedule", propOrder = {
    "disabled",
    "offset",
    "recurrencePattern",
    "recurrencePeriod",
    "scheduleInterval",
    "timePoints"
})
public class TimeSchedule {

    protected Boolean disabled;
    protected Float offset;
    protected String recurrencePattern;
    protected Float recurrencePeriod;
    @XmlElement(required = true)
    protected TimeSchedule.ScheduleInterval scheduleInterval;
    @XmlElement(name = "TimePoints")
    protected List<TimeSchedule.TimePoints> timePoints;

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOffset(Float value) {
        this.offset = value;
    }

    /**
     * Gets the value of the recurrencePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrencePattern() {
        return recurrencePattern;
    }

    /**
     * Sets the value of the recurrencePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrencePattern(String value) {
        this.recurrencePattern = value;
    }

    /**
     * Gets the value of the recurrencePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRecurrencePeriod() {
        return recurrencePeriod;
    }

    /**
     * Sets the value of the recurrencePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRecurrencePeriod(Float value) {
        this.recurrencePeriod = value;
    }

    /**
     * Gets the value of the scheduleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSchedule.ScheduleInterval }
     *     
     */
    public TimeSchedule.ScheduleInterval getScheduleInterval() {
        return scheduleInterval;
    }

    /**
     * Sets the value of the scheduleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSchedule.ScheduleInterval }
     *     
     */
    public void setScheduleInterval(TimeSchedule.ScheduleInterval value) {
        this.scheduleInterval = value;
    }

    /**
     * Gets the value of the timePoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timePoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimePoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSchedule.TimePoints }
     * 
     * 
     */
    public List<TimeSchedule.TimePoints> getTimePoints() {
        if (timePoints == null) {
            timePoints = new ArrayList<TimeSchedule.TimePoints>();
        }
        return this.timePoints;
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
     *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "end",
        "start"
    })
    public static class ScheduleInterval {

        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar end;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar start;

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEnd(XMLGregorianCalendar value) {
            this.end = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

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
     *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="relativeTimeInterval" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}Seconds" minOccurs="0"/>
     *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="window" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "dateTime",
        "relativeTimeInterval",
        "sequenceNumber",
        "window"
    })
    public static class TimePoints {

        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTime;
        protected Float relativeTimeInterval;
        protected BigInteger sequenceNumber;
        protected TimeSchedule.TimePoints.Window window;

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTime(XMLGregorianCalendar value) {
            this.dateTime = value;
        }

        /**
         * Gets the value of the relativeTimeInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getRelativeTimeInterval() {
            return relativeTimeInterval;
        }

        /**
         * Sets the value of the relativeTimeInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setRelativeTimeInterval(Float value) {
            this.relativeTimeInterval = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNumber(BigInteger value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the window property.
         * 
         * @return
         *     possible object is
         *     {@link TimeSchedule.TimePoints.Window }
         *     
         */
        public TimeSchedule.TimePoints.Window getWindow() {
            return window;
        }

        /**
         * Sets the value of the window property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeSchedule.TimePoints.Window }
         *     
         */
        public void setWindow(TimeSchedule.TimePoints.Window value) {
            this.window = value;
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
         *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "end",
            "start"
        })
        public static class Window {

            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar end;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar start;

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEnd(XMLGregorianCalendar value) {
                this.end = value;
            }

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setStart(XMLGregorianCalendar value) {
                this.start = value;
            }

        }

    }

}
