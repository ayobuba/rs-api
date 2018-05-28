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
@Table(name = "states")
@NamedQueries({
    @NamedQuery(name = "States.findAll", query = "SELECT s FROM States s")})
public class States implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "stateId")
    private List<Lga> lgaList;
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    @ManyToOne
    private Countries countryId;
    @OneToMany(mappedBy = "stateOfOrigin")
    private List<Payerdata> payerdataList;

    public States() {
    }

    public States(Integer id) {
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

    public List<Lga> getLgaList() {
        return lgaList;
    }

    public void setLgaList(List<Lga> lgaList) {
        this.lgaList = lgaList;
    }

    public Countries getCountryId() {
        return countryId;
    }

    public void setCountryId(Countries countryId) {
        this.countryId = countryId;
    }

    public List<Payerdata> getPayerdataList() {
        return payerdataList;
    }

    public void setPayerdataList(List<Payerdata> payerdataList) {
        this.payerdataList = payerdataList;
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
        if (!(object instanceof States)) {
            return false;
        }
        States other = (States) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.States[ id=" + id + " ]";
    }
    
}
