/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infocell.barksforte.irsapi.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author throne
 */
@Entity
@Table(name = "bill_item")
@NamedQueries({
    @NamedQuery(name = "BillItem.findAll", query = "SELECT b FROM BillItem b")})
public class BillItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "is_certify")
    private Boolean isCertify;
    @OneToMany(mappedBy = "billRef")
    private List<PxInterswitch> pxInterswitchList;
    @OneToMany(mappedBy = "refBill")
    private List<BillItemTotal> billItemTotalList;
    @OneToMany(mappedBy = "refbill")
    private List<Transactions> transactionsList;
    @JoinColumn(name = "bill", referencedColumnName = "id")
    @ManyToOne
    private Bill bill;
    @JoinColumn(name = "rev_item", referencedColumnName = "id")
    @ManyToOne
    private RevItem revItem;
    @OneToMany(mappedBy = "billref")
    private List<Remita> remitaList;
    @OneToMany(mappedBy = "billRef")
    private List<VehicleDetails> vehicleDetailsList;

    public BillItem() {
    }

    public BillItem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsCertify() {
        return isCertify;
    }

    public void setIsCertify(Boolean isCertify) {
        this.isCertify = isCertify;
    }

    public List<PxInterswitch> getPxInterswitchList() {
        return pxInterswitchList;
    }

    public void setPxInterswitchList(List<PxInterswitch> pxInterswitchList) {
        this.pxInterswitchList = pxInterswitchList;
    }

    public List<BillItemTotal> getBillItemTotalList() {
        return billItemTotalList;
    }

    public void setBillItemTotalList(List<BillItemTotal> billItemTotalList) {
        this.billItemTotalList = billItemTotalList;
    }

    public List<Transactions> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<Transactions> transactionsList) {
        this.transactionsList = transactionsList;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public RevItem getRevItem() {
        return revItem;
    }

    public void setRevItem(RevItem revItem) {
        this.revItem = revItem;
    }

    public List<Remita> getRemitaList() {
        return remitaList;
    }

    public void setRemitaList(List<Remita> remitaList) {
        this.remitaList = remitaList;
    }

    public List<VehicleDetails> getVehicleDetailsList() {
        return vehicleDetailsList;
    }

    public void setVehicleDetailsList(List<VehicleDetails> vehicleDetailsList) {
        this.vehicleDetailsList = vehicleDetailsList;
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
        if (!(object instanceof BillItem)) {
            return false;
        }
        BillItem other = (BillItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.BillItem[ id=" + id + " ]";
    }
    
}
