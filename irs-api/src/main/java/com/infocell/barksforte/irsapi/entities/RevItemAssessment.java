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
@Table(name = "rev_item_assessment")
@NamedQueries({
    @NamedQuery(name = "RevItemAssessment.findAll", query = "SELECT r FROM RevItemAssessment r")})
public class RevItemAssessment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "expiry")
    @Temporal(TemporalType.DATE)
    private Date expiry;
    @Column(name = "is_valid")
    private Boolean isValid;
    @JoinColumn(name = "payer", referencedColumnName = "id")
    @ManyToOne
    private Payerdata payer;
    @JoinColumn(name = "rev_item", referencedColumnName = "id")
    @ManyToOne
    private RevItem revItem;

    public RevItemAssessment() {
    }

    public RevItemAssessment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Payerdata getPayer() {
        return payer;
    }

    public void setPayer(Payerdata payer) {
        this.payer = payer;
    }

    public RevItem getRevItem() {
        return revItem;
    }

    public void setRevItem(RevItem revItem) {
        this.revItem = revItem;
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
        if (!(object instanceof RevItemAssessment)) {
            return false;
        }
        RevItemAssessment other = (RevItemAssessment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RevItemAssessment[ id=" + id + " ]";
    }
    
}
