/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infocell.barksforte.irsapi.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author throne
 */
@Entity
@Table(name = "px_interswitch")
@NamedQueries({
    @NamedQuery(name = "PxInterswitch.findAll", query = "SELECT p FROM PxInterswitch p")})
public class PxInterswitch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "txn_ref")
    private Integer txnRef;
    @Column(name = "transaction_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "retrieval_reference_number")
    private Integer retrievalReferenceNumber;
    @Column(name = "response_description")
    private Integer responseDescription;
    @Column(name = "card_number")
    private Integer cardNumber;
    @Column(name = "response_code")
    private Integer responseCode;
    @Column(name = "payment_reference")
    private String paymentReference;
    @Column(name = "lead_bank_cbn_code")
    private String leadBankCbnCode;
    @Column(name = "lead_bank_name")
    private String leadBankName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @JoinColumn(name = "bill_ref", referencedColumnName = "id")
    @ManyToOne
    private BillItem billRef;
    @JoinColumn(name = "status", referencedColumnName = "id")
    @ManyToOne
    private Status status;

    public PxInterswitch() {
    }

    public PxInterswitch(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTxnRef() {
        return txnRef;
    }

    public void setTxnRef(Integer txnRef) {
        this.txnRef = txnRef;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(Integer retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    public Integer getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(Integer responseDescription) {
        this.responseDescription = responseDescription;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getLeadBankCbnCode() {
        return leadBankCbnCode;
    }

    public void setLeadBankCbnCode(String leadBankCbnCode) {
        this.leadBankCbnCode = leadBankCbnCode;
    }

    public String getLeadBankName() {
        return leadBankName;
    }

    public void setLeadBankName(String leadBankName) {
        this.leadBankName = leadBankName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BillItem getBillRef() {
        return billRef;
    }

    public void setBillRef(BillItem billRef) {
        this.billRef = billRef;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PxInterswitch)) {
            return false;
        }
        PxInterswitch other = (PxInterswitch) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PxInterswitch[ id=" + id + " ]";
    }
    
}
