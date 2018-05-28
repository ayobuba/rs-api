/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infocell.barksforte.irsapi.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author throne
 */
@Entity
@Table(name = "rev_wallet")
@NamedQueries({
    @NamedQuery(name = "RevWallet.findAll", query = "SELECT r FROM RevWallet r")})
public class RevWallet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "rev_number")
    private Integer revNumber;
    @Column(name = "issued")
    private Boolean issued;
    @Column(name = "used")
    private Boolean used;
    @Column(name = "rfid")
    private Boolean rfid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @JoinColumn(name = "month_expired", referencedColumnName = "id")
    @ManyToOne
    private Months monthExpired;
    @JoinColumn(name = "month_issue", referencedColumnName = "id")
    @ManyToOne
    private Months monthIssue;
    @JoinColumn(name = "year_expired", referencedColumnName = "id")
    @ManyToOne
    private Years yearExpired;
    @JoinColumn(name = "year_issued", referencedColumnName = "id")
    @ManyToOne
    private Years yearIssued;

    public RevWallet() {
    }

    public RevWallet(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRevNumber() {
        return revNumber;
    }

    public void setRevNumber(Integer revNumber) {
        this.revNumber = revNumber;
    }

    public Boolean getIssued() {
        return issued;
    }

    public void setIssued(Boolean issued) {
        this.issued = issued;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Boolean getRfid() {
        return rfid;
    }

    public void setRfid(Boolean rfid) {
        this.rfid = rfid;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Months getMonthExpired() {
        return monthExpired;
    }

    public void setMonthExpired(Months monthExpired) {
        this.monthExpired = monthExpired;
    }

    public Months getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(Months monthIssue) {
        this.monthIssue = monthIssue;
    }

    public Years getYearExpired() {
        return yearExpired;
    }

    public void setYearExpired(Years yearExpired) {
        this.yearExpired = yearExpired;
    }

    public Years getYearIssued() {
        return yearIssued;
    }

    public void setYearIssued(Years yearIssued) {
        this.yearIssued = yearIssued;
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
        if (!(object instanceof RevWallet)) {
            return false;
        }
        RevWallet other = (RevWallet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RevWallet[ id=" + id + " ]";
    }
    
}
