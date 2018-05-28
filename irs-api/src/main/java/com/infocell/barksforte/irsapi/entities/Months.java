/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infocell.barksforte.irsapi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author throne
 */
@Entity
@Table(name = "months")
@NamedQueries({
    @NamedQuery(name = "Months.findAll", query = "SELECT m FROM Months m")})
public class Months implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "value")
    @Temporal(TemporalType.DATE)
    private Date value;
    @OneToMany(mappedBy = "monthExpired")
    private List<RevWallet> revWalletList;
    @OneToMany(mappedBy = "monthIssue")
    private List<RevWallet> revWalletList1;

    public Months() {
    }

    public Months(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }

    public List<RevWallet> getRevWalletList() {
        return revWalletList;
    }

    public void setRevWalletList(List<RevWallet> revWalletList) {
        this.revWalletList = revWalletList;
    }

    public List<RevWallet> getRevWalletList1() {
        return revWalletList1;
    }

    public void setRevWalletList1(List<RevWallet> revWalletList1) {
        this.revWalletList1 = revWalletList1;
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
        if (!(object instanceof Months)) {
            return false;
        }
        Months other = (Months) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Months[ id=" + id + " ]";
    }
    
}
