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
@Table(name = "bill")
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "billdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date billdate;
    @Column(name = "isagentbill")
    private Boolean isagentbill;
    @Column(name = "client_ip")
    private String clientIp;
    @JoinColumn(name = "parastatal", referencedColumnName = "id")
    @ManyToOne
    private Parastatal parastatal;
    @JoinColumn(name = "mda_zone", referencedColumnName = "id")
    @ManyToOne
    private MdaZone mdaZone;
    @JoinColumn(name = "payer", referencedColumnName = "id")
    @ManyToOne
    private Payerdata payer;
    @JoinColumn(name = "status", referencedColumnName = "id")
    @ManyToOne
    private Status status;
    @JoinColumn(name = "title", referencedColumnName = "id")
    @ManyToOne
    private Title title;
    @OneToMany(mappedBy = "bill")
    private List<BillItem> billItemList;

    public Bill() {
    }

    public Bill(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public Boolean getIsagentbill() {
        return isagentbill;
    }

    public void setIsagentbill(Boolean isagentbill) {
        this.isagentbill = isagentbill;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Parastatal getParastatal() {
        return parastatal;
    }

    public void setParastatal(Parastatal parastatal) {
        this.parastatal = parastatal;
    }

    public MdaZone getMdaZone() {
        return mdaZone;
    }

    public void setMdaZone(MdaZone mdaZone) {
        this.mdaZone = mdaZone;
    }

    public Payerdata getPayer() {
        return payer;
    }

    public void setPayer(Payerdata payer) {
        this.payer = payer;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bill[ id=" + id + " ]";
    }
    
}
