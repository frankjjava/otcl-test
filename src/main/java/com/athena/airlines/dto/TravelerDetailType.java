//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 08:30:56 PM IST 
//


package com.athena.airlines.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TravelerDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{}TravelerSummaryType">
 *       &lt;sequence>
 *         &lt;element name="Gender" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>TravelerGenderSimpleType">
 *                 &lt;attribute name="refs">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FQTVs" type="{}TravelerFQTV_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contacts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerDetailType", propOrder = {
    "gender",
    "fqtVs",
    "contacts"
})
public class TravelerDetailType
    extends TravelerSummaryType
{

    @XmlElement(name = "Gender")
    protected TravelerDetailType.Gender gender;
    @XmlElement(name = "FQTVs")
    protected List<TravelerFQTVType> fqtVs;
    @XmlElement(name = "Contacts")
    protected Contacts contacts;

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerDetailType.Gender }
     *     
     */
    public TravelerDetailType.Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerDetailType.Gender }
     *     
     */
    public void setGender(TravelerDetailType.Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the fqtVs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fqtVs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFQTVs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerFQTVType }
     * 
     * 
     */
    public List<TravelerFQTVType> getFQTVs() {
        if (fqtVs == null) {
            fqtVs = new ArrayList<TravelerFQTVType>();
        }
        return this.fqtVs;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>TravelerGenderSimpleType">
     *       &lt;attribute name="refs">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value",
        "values"
    })
    public static class Gender {

//        @XmlValue
        protected TravelerGenderSimpleType value;
        @XmlElement(name = "Values")
        protected List<TravelerGenderSimpleType> values;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerGenderSimpleType }
         *     
         */
        public TravelerGenderSimpleType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerGenderSimpleType }
         *     
         */
        public void setValue(TravelerGenderSimpleType value) {
            this.value = value;
        }

        public List<TravelerGenderSimpleType> getValues() {
			return values;
		}

		public void setValues(List<TravelerGenderSimpleType> values) {
			this.values = values;
		}

		/**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

    }

}
