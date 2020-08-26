//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.08.26 à 07:05:45 PM WEST 
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
 *         &lt;element name="ClientBankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "clientBankCode"
})
@XmlRootElement(name = "InsertionRequest")
public class InsertionRequest {

    @XmlElement(name = "ClientLastName", required = true)
    protected String clientLastName;
    @XmlElement(name = "ClientFirstName", required = true)
    protected String clientFirstName;
    @XmlElement(name = "ClientBankCode", required = true)
    protected String clientBankCode;

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

}
