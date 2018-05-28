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
@Table(name = "tcc")
@NamedQueries({
    @NamedQuery(name = "Tcc.findAll", query = "SELECT t FROM Tcc t")})
public class Tcc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "address")
    private Integer address;
    @Column(name = "year1")
    @Temporal(TemporalType.DATE)
    private Date year1;
    @Column(name = "year2")
    @Temporal(TemporalType.DATE)
    private Date year2;
    @Column(name = "year3")
    @Temporal(TemporalType.DATE)
    private Date year3;
    @Column(name = "tax_paid_yr1")
    @Temporal(TemporalType.DATE)
    private Date taxPaidYr1;
    @Column(name = "tax_paid_yr2")
    @Temporal(TemporalType.DATE)
    private Date taxPaidYr2;
    @Column(name = "tax_paid_yr3")
    @Temporal(TemporalType.DATE)
    private Date taxPaidYr3;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "income1")
    private Double income1;
    @Column(name = "income2")
    private Double income2;
    @Column(name = "income3")
    private Double income3;
    @Column(name = "source_of_income")
    private Integer sourceOfIncome;
    @Column(name = "expiry_date")
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    @Column(name = "billref")
    private Integer billref;
    @Column(name = "prev_receipt3")
    private Integer prevReceipt3;
    @Column(name = "prev_receipt2")
    private Integer prevReceipt2;
    @Column(name = "prev_receipt1")
    private Integer prevReceipt1;
    @JoinColumn(name = "payer", referencedColumnName = "id")
    @ManyToOne
    private Payerdata payer;

    public Tcc() {
    }

    public Tcc(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Date getYear1() {
        return year1;
    }

    public void setYear1(Date year1) {
        this.year1 = year1;
    }

    public Date getYear2() {
        return year2;
    }

    public void setYear2(Date year2) {
        this.year2 = year2;
    }

    public Date getYear3() {
        return year3;
    }

    public void setYear3(Date year3) {
        this.year3 = year3;
    }

    public Date getTaxPaidYr1() {
        return taxPaidYr1;
    }

    public void setTaxPaidYr1(Date taxPaidYr1) {
        this.taxPaidYr1 = taxPaidYr1;
    }

    public Date getTaxPaidYr2() {
        return taxPaidYr2;
    }

    public void setTaxPaidYr2(Date taxPaidYr2) {
        this.taxPaidYr2 = taxPaidYr2;
    }

    public Date getTaxPaidYr3() {
        return taxPaidYr3;
    }

    public void setTaxPaidYr3(Date taxPaidYr3) {
        this.taxPaidYr3 = taxPaidYr3;
    }

    public Double getIncome1() {
        return income1;
    }

    public void setIncome1(Double income1) {
        this.income1 = income1;
    }

    public Double getIncome2() {
        return income2;
    }

    public void setIncome2(Double income2) {
        this.income2 = income2;
    }

    public Double getIncome3() {
        return income3;
    }

    public void setIncome3(Double income3) {
        this.income3 = income3;
    }

    public Integer getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(Integer sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getBillref() {
        return billref;
    }

    public void setBillref(Integer billref) {
        this.billref = billref;
    }

    public Integer getPrevReceipt3() {
        return prevReceipt3;
    }

    public void setPrevReceipt3(Integer prevReceipt3) {
        this.prevReceipt3 = prevReceipt3;
    }

    public Integer getPrevReceipt2() {
        return prevReceipt2;
    }

    public void setPrevReceipt2(Integer prevReceipt2) {
        this.prevReceipt2 = prevReceipt2;
    }

    public Integer getPrevReceipt1() {
        return prevReceipt1;
    }

    public void setPrevReceipt1(Integer prevReceipt1) {
        this.prevReceipt1 = prevReceipt1;
    }

    public Payerdata getPayer() {
        return payer;
    }

    public void setPayer(Payerdata payer) {
        this.payer = payer;
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
        if (!(object instanceof Tcc)) {
            return false;
        }
        Tcc other = (Tcc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tcc[ id=" + id + " ]";
    }
    
}
