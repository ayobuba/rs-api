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
@Table(name = "bill_item_total")
@NamedQueries({
    @NamedQuery(name = "BillItemTotal.findAll", query = "SELECT b FROM BillItemTotal b")})
public class BillItemTotal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "total")
    private Integer total;
    @Column(name = "loc")
    private String loc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount_paid")
    private Double amountPaid;
    @JoinColumn(name = "ref_bill", referencedColumnName = "id")
    @ManyToOne
    private BillItem refBill;
    @JoinColumn(name = "bill_status", referencedColumnName = "id")
    @ManyToOne
    private Status billStatus;

    public BillItemTotal() {
    }

    public BillItemTotal(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public BillItem getRefBill() {
        return refBill;
    }

    public void setRefBill(BillItem refBill) {
        this.refBill = refBill;
    }

    public Status getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Status billStatus) {
        this.billStatus = billStatus;
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
        if (!(object instanceof BillItemTotal)) {
            return false;
        }
        BillItemTotal other = (BillItemTotal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.BillItemTotal[ id=" + id + " ]";
    }
    
}
