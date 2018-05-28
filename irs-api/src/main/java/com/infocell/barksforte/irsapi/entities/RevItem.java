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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "rev_item")
@NamedQueries({
    @NamedQuery(name = "RevItem.findAll", query = "SELECT r FROM RevItem r")})
public class RevItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "fixed")
    private Boolean fixed;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Column(name = "modified_by")
    private Integer modifiedBy;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @JoinColumn(name = "ipsa", referencedColumnName = "id")
    @ManyToOne
    private IpsaCode ipsa;
    @JoinColumn(name = "parastatal", referencedColumnName = "id")
    @ManyToOne
    private Parastatal parastatal;
    @OneToMany(mappedBy = "revItem")
    private List<RevItemAssessment> revItemAssessmentList;
    @OneToMany(mappedBy = "revItem")
    private List<BillItem> billItemList;

    public RevItem() {
    }

    public RevItem(Integer id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFixed() {
        return fixed;
    }

    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public IpsaCode getIpsa() {
        return ipsa;
    }

    public void setIpsa(IpsaCode ipsa) {
        this.ipsa = ipsa;
    }

    public Parastatal getParastatal() {
        return parastatal;
    }

    public void setParastatal(Parastatal parastatal) {
        this.parastatal = parastatal;
    }

    public List<RevItemAssessment> getRevItemAssessmentList() {
        return revItemAssessmentList;
    }

    public void setRevItemAssessmentList(List<RevItemAssessment> revItemAssessmentList) {
        this.revItemAssessmentList = revItemAssessmentList;
    }

    public List<BillItem> getBillItemList() {
        return billItemList;
    }

    public void setBillItemList(List<BillItem> billItemList) {
        this.billItemList = billItemList;
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
        if (!(object instanceof RevItem)) {
            return false;
        }
        RevItem other = (RevItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RevItem[ id=" + id + " ]";
    }
    
}
