//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.10.02 à 02:15:38 PM WEST 
//


package org.example.createentity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientBankCode" type="{http://www.example.org/CreateEntity}bankCode"/>
 *         &lt;element name="ClientAccountType" type="{http://www.example.org/CreateEntity}accountType"/>
 *         &lt;element name="ClientAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientPhoneNumber" type="{http://www.example.org/CreateEntity}phoneNumber"/>
 *         &lt;element name="ClientCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientEmail" type="{http://www.example.org/CreateEntity}email"/>
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
    "clientLastName",
    "clientFirstName",
    "clientBankCode",
    "clientAccountType",
    "clientAddress",
    "clientPhoneNumber",
    "clientCountry",
    "clientCity",
    "clientEmail"
})
@XmlRootElement(name = "InsertionRequest")
public class InsertionRequest {

    @XmlElement(name = "ClientLastName", required = true)
    protected String clientLastName;
    @XmlElement(name = "ClientFirstName", required = true)
    protected String clientFirstName;
    @XmlElement(name = "ClientBankCode", required = true)
    protected String clientBankCode;
    @XmlElement(name = "ClientAccountType", required = true)
    protected String clientAccountType;
    @XmlElement(name = "ClientAddress", required = true)
    protected String clientAddress;
    @XmlElement(name = "ClientPhoneNumber", required = true)
    protected String clientPhoneNumber;
    @XmlElement(name = "ClientCountry", required = true)
    protected String clientCountry;
    @XmlElement(name = "ClientCity", required = true)
    protected String clientCity;
    @XmlElement(name = "ClientEmail", required = true)
    protected String clientEmail;

    /**
     * Obtient la valeur de la propriété clientLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLastName() {
        return clientLastName;
    }

    /**
     * Définit la valeur de la propriété clientLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLastName(String value) {
        this.clientLastName = value;
    }

    /**
     * Obtient la valeur de la propriété clientFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFirstName() {
        return clientFirstName;
    }

    /**
     * Définit la valeur de la propriété clientFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFirstName(String value) {
        this.clientFirstName = value;
    }

    /**
     * Obtient la valeur de la propriété clientBankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBankCode() {
        return clientBankCode;
    }

    /**
     * Définit la valeur de la propriété clientBankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBankCode(String value) {
        this.clientBankCode = value;
    }

    /**
     * Obtient la valeur de la propriété clientAccountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAccountType() {
        return clientAccountType;
    }

    /**
     * Définit la valeur de la propriété clientAccountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAccountType(String value) {
        this.clientAccountType = value;
    }

    /**
     * Obtient la valeur de la propriété clientAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAddress() {
        return clientAddress;
    }

    /**
     * Définit la valeur de la propriété clientAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAddress(String value) {
        this.clientAddress = value;
    }

    /**
     * Obtient la valeur de la propriété clientPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    /**
     * Définit la valeur de la propriété clientPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPhoneNumber(String value) {
        this.clientPhoneNumber = value;
    }

    /**
     * Obtient la valeur de la propriété clientCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCountry() {
        return clientCountry;
    }

    /**
     * Définit la valeur de la propriété clientCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCountry(String value) {
        this.clientCountry = value;
    }

    /**
     * Obtient la valeur de la propriété clientCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCity() {
        return clientCity;
    }

    /**
     * Définit la valeur de la propriété clientCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCity(String value) {
        this.clientCity = value;
    }

    /**
     * Obtient la valeur de la propriété clientEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * Définit la valeur de la propriété clientEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEmail(String value) {
        this.clientEmail = value;
    }

}
