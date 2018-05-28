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
@Table(name = "parastatal")
@NamedQueries({
    @NamedQuery(name = "Parastatal.findAll", query = "SELECT p FROM Parastatal p")})
public class Parastatal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "ministry", referencedColumnName = "id")
    @ManyToOne
    private Ministry ministry;
    @OneToMany(mappedBy = "parastatal")
    private List<RevItem> revItemList;
    @OneToMany(mappedBy = "parastatal")
    private List<Bill> billList;
    @OneToMany(mappedBy = "parastatal")
    private List<VehicleDetails> vehicleDetailsList;

    public Parastatal() {
    }

    public Parastatal(Integer id) {
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

    public Ministry getMinistry() {
        return ministry;
    }

    public void setMinistry(Ministry ministry) {
        this.ministry = ministry;
    }

    public List<RevItem> getRevItemList() {
        return revItemList;
    }

    public void setRevItemList(List<RevItem> revItemList) {
        this.revItemList = revItemList;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
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
        if (!(object instanceof Parastatal)) {
            return false;
        }
        Parastatal other = (Parastatal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Parastatal[ id=" + id + " ]";
    }
    
}
