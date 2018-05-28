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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author throne
 */
@Entity
@Table(name = "status")
@NamedQueries({
    @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s")})
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "status")
    private List<PxInterswitch> pxInterswitchList;
    @OneToMany(mappedBy = "billStatus")
    private List<BillItemTotal> billItemTotalList;
    @OneToMany(mappedBy = "employeeStatus")
    private List<Payerdata> payerdataList;
    @OneToMany(mappedBy = "status")
    private List<Bill> billList;

    public Status() {
    }

    public Status(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Payerdata> getPayerdataList() {
        return payerdataList;
    }

    public void setPayerdataList(List<Payerdata> payerdataList) {
        this.payerdataList = payerdataList;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
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
        if (!(object instanceof Status)) {
            return false;
        }
        Status other = (Status) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Status[ id=" + id + " ]";
    }
    
}
