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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IdentityDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="IdentityDocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssuingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidenceCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Birthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Visa" type="{}VisaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocumentType", propOrder = {
    "identityDocumentNumber",
    "identityDocumentType",
    "issuingCountryCode",
    "citizenshipCountryCode",
    "residenceCountryCode",
    "issueDate",
    "expiryDate",
    "birthdate",
    "birthplace",
    "gender",
    "nameTitle",
    "givenName",
    "middleName",
    "surname",
    "surnameSuffix",
    "visas",
    "visa"
})
public class IdentityDocumentType {

    @XmlElement(name = "IdentityDocumentNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocumentNumber;
    @XmlElement(name = "IdentityDocumentType", required = true)
    protected String identityDocumentType;
    @XmlElement(name = "IssuingCountryCode")
    protected String issuingCountryCode;
    @XmlElement(name = "CitizenshipCountryCode")
    protected String citizenshipCountryCode;
    @XmlElement(name = "ResidenceCountryCode")
    protected String residenceCountryCode;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "Birthplace")
    protected String birthplace;
    @XmlElement(name = "Gender")
    protected TravelerDetailType.Gender gender;
    @XmlElement(name = "NameTitle")
    protected String nameTitle;
    @XmlElement(name = "GivenName")
    protected List<String> givenName;
    @XmlElement(name = "MiddleName")
    protected List<String> middleName;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "SurnameSuffix")
    protected String surnameSuffix;
    @XmlElement(name = "Visas")
    protected List<VisaType> visas;
    @XmlElement(name = "Visa")
    protected VisaType visa;

    /**
     * Gets the value of the identityDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocumentNumber() {
        return identityDocumentNumber;
    }

    /**
     * Sets the value of the identityDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocumentNumber(String value) {
        this.identityDocumentNumber = value;
    }

    /**
     * Gets the value of the identityDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocumentType() {
        return identityDocumentType;
    }

    /**
     * Sets the value of the identityDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocumentType(String value) {
        this.identityDocumentType = value;
    }

    /**
     * Gets the value of the issuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountryCode() {
        return issuingCountryCode;
    }

    /**
     * Sets the value of the issuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCountryCode(String value) {
        this.issuingCountryCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the birthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * Sets the value of the birthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplace(String value) {
        this.birthplace = value;
    }


    public TravelerDetailType.Gender getGender() {
		return gender;
	}

	public void setGender(TravelerDetailType.Gender gender) {
		this.gender = gender;
	}

	public void setGivenName(List<String> givenName) {
		this.givenName = givenName;
	}

	public void setMiddleName(List<String> middleName) {
		this.middleName = middleName;
	}

	/**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the surnameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameSuffix() {
        return surnameSuffix;
    }

    /**
     * Sets the value of the surnameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameSuffix(String value) {
        this.surnameSuffix = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaType }
     * 
     * 
     */
    public List<VisaType> getVisas() {
        if (visas == null) {
            visas = new ArrayList<VisaType>();
        }
        return this.visas;
    }

	public void setVisas(List<VisaType> visas) {
		this.visas = visas;
	}

	public VisaType getVisa() {
		return visa;
	}

	public void setVisa(VisaType visa) {
		this.visa = visa;
	}

}
