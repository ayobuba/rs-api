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
@Table(name = "vehicle_details")
@NamedQueries({
    @NamedQuery(name = "VehicleDetails.findAll", query = "SELECT v FROM VehicleDetails v")})
public class VehicleDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "chasis_no")
    private String chasisNo;
    @Column(name = "plate_no")
    private String plateNo;
    @Column(name = "engine_no")
    private Integer engineNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "engine_capacity")
    private Double engineCapacity;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "gross")
    private Double gross;
    @Column(name = "date_issued")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateIssued;
    @Column(name = "exp_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expDate;
    @Column(name = "revenue_zone")
    private Integer revenueZone;
    @Column(name = "make_model")
    private Integer makeModel;
    @JoinColumn(name = "color", referencedColumnName = "id")
    @ManyToOne
    private Colors color;
    @JoinColumn(name = "bill_ref", referencedColumnName = "id")
    @ManyToOne
    private BillItem billRef;
    @JoinColumn(name = "parastatal", referencedColumnName = "id")
    @ManyToOne
    private Parastatal parastatal;
    @JoinColumn(name = "vehicle_type", referencedColumnName = "id")
    @ManyToOne
    private VehicleType vehicleType;

    public VehicleDetails() {
    }

    public VehicleDetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChasisNo() {
        return chasisNo;
    }

    public void setChasisNo(String chasisNo) {
        this.chasisNo = chasisNo;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public Integer getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(Integer engineNo) {
        this.engineNo = engineNo;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getRevenueZone() {
        return revenueZone;
    }

    public void setRevenueZone(Integer revenueZone) {
        this.revenueZone = revenueZone;
    }

    public Integer getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(Integer makeModel) {
        this.makeModel = makeModel;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public BillItem getBillRef() {
        return billRef;
    }

    public void setBillRef(BillItem billRef) {
        this.billRef = billRef;
    }

    public Parastatal getParastatal() {
        return parastatal;
    }

    public void setParastatal(Parastatal parastatal) {
        this.parastatal = parastatal;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
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
        if (!(object instanceof VehicleDetails)) {
            return false;
        }
        VehicleDetails other = (VehicleDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.VehicleDetails[ id=" + id + " ]";
    }
    
}
