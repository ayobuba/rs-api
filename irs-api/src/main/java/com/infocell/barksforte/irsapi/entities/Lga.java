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
@Table(name = "lga")
@NamedQueries({
    @NamedQuery(name = "Lga.findAll", query = "SELECT l FROM Lga l")})
public class Lga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "others")
    private String others;
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    @ManyToOne
    private States stateId;
    @OneToMany(mappedBy = "lgaOfOrigin")
    private List<Payerdata> payerdataList;
    @OneToMany(mappedBy = "lga")
    private List<Cities> citiesList;

    public Lga() {
    }

    public Lga(Integer id) {
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

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public States getStateId() {
        return stateId;
    }

    public void setStateId(States stateId) {
        this.stateId = stateId;
    }

    public List<Payerdata> getPayerdataList() {
        return payerdataList;
    }

    public void setPayerdataList(List<Payerdata> payerdataList) {
        this.payerdataList = payerdataList;
    }

    public List<Cities> getCitiesList() {
        return citiesList;
    }

    public void setCitiesList(List<Cities> citiesList) {
        this.citiesList = citiesList;
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
        if (!(object instanceof Lga)) {
            return false;
        }
        Lga other = (Lga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Lga[ id=" + id + " ]";
    }
    
}
