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
@Table(name = "transdetails")
@NamedQueries({
    @NamedQuery(name = "Transdetails.findAll", query = "SELECT t FROM Transdetails t")})
public class Transdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "receiptno")
    private Integer receiptno;
    @Column(name = "payment_reference")
    private Integer paymentReference;
    @Column(name = "payment_status")
    private Integer paymentStatus;
    @Column(name = "payment_log_id")
    private Integer paymentLogId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "item_amount")
    private Double itemAmount;
    @Column(name = "is_reversal")
    private Boolean isReversal;
    @Column(name = "is_repeated")
    private Boolean isRepeated;
    @Column(name = "notice_date")
    @Temporal(TemporalType.DATE)
    private Date noticeDate;
    @Column(name = "client_ip")
    private String clientIp;
    @JoinColumn(name = "transaction", referencedColumnName = "id")
    @ManyToOne
    private Transactions transaction;

    public Transdetails() {
    }

    public Transdetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(Integer receiptno) {
        this.receiptno = receiptno;
    }

    public Integer getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(Integer paymentReference) {
        this.paymentReference = paymentReference;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getPaymentLogId() {
        return paymentLogId;
    }

    public void setPaymentLogId(Integer paymentLogId) {
        this.paymentLogId = paymentLogId;
    }

    public Double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Boolean getIsReversal() {
        return isReversal;
    }

    public void setIsReversal(Boolean isReversal) {
        this.isReversal = isReversal;
    }

    public Boolean getIsRepeated() {
        return isRepeated;
    }

    public void setIsRepeated(Boolean isRepeated) {
        this.isRepeated = isRepeated;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Transactions getTransaction() {
        return transaction;
    }

    public void setTransaction(Transactions transaction) {
        this.transaction = transaction;
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
        if (!(object instanceof Transdetails)) {
            return false;
        }
        Transdetails other = (Transdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transdetails[ id=" + id + " ]";
    }
    
}
