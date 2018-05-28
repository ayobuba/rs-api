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
@Table(name = "payerdata")
@NamedQueries({
    @NamedQuery(name = "Payerdata.findAll", query = "SELECT p FROM Payerdata p")})
public class Payerdata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "othername")
    private String othername;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "jtb_tin")
    private String jtbTin;
    @Column(name = "taxpayer_company")
    private String taxpayerCompany;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "pic")
    private String pic;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "street")
    private String street;
    @Column(name = "phone")
    private String phone;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_by")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedBy;
    @Column(name = "created_by")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdBy;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "state_tin")
    private Integer stateTin;
    @OneToMany(mappedBy = "payer")
    private List<RevItemAssessment> revItemAssessmentList;
    @OneToMany(mappedBy = "payer")
    private List<Tcc> tccList;
    @JoinColumn(name = "nationality", referencedColumnName = "id")
    @ManyToOne
    private Countries nationality;
    @JoinColumn(name = "marital_status", referencedColumnName = "id")
    @ManyToOne
    private MaritalStatus maritalStatus;
    @JoinColumn(name = "gender", referencedColumnName = "id")
    @ManyToOne
    private Gender gender;
    @JoinColumn(name = "state_of_origin", referencedColumnName = "id")
    @ManyToOne
    private States stateOfOrigin;
    @JoinColumn(name = "lga_of_origin", referencedColumnName = "id")
    @ManyToOne
    private Lga lgaOfOrigin;
    @JoinColumn(name = "employee_status", referencedColumnName = "id")
    @ManyToOne
    private Status employeeStatus;
    @OneToMany(mappedBy = "payer")
    private List<Bill> billList;

    public Payerdata() {
    }

    public Payerdata(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getJtbTin() {
        return jtbTin;
    }

    public void setJtbTin(String jtbTin) {
        this.jtbTin = jtbTin;
    }

    public String getTaxpayerCompany() {
        return taxpayerCompany;
    }

    public void setTaxpayerCompany(String taxpayerCompany) {
        this.taxpayerCompany = taxpayerCompany;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Date modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getStateTin() {
        return stateTin;
    }

    public void setStateTin(Integer stateTin) {
        this.stateTin = stateTin;
    }

    public List<RevItemAssessment> getRevItemAssessmentList() {
        return revItemAssessmentList;
    }

    public void setRevItemAssessmentList(List<RevItemAssessment> revItemAssessmentList) {
        this.revItemAssessmentList = revItemAssessmentList;
    }

    public List<Tcc> getTccList() {
        return tccList;
    }

    public void setTccList(List<Tcc> tccList) {
        this.tccList = tccList;
    }

    public Countries getNationality() {
        return nationality;
    }

    public void setNationality(Countries nationality) {
        this.nationality = nationality;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public States getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(States stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public Lga getLgaOfOrigin() {
        return lgaOfOrigin;
    }

    public void setLgaOfOrigin(Lga lgaOfOrigin) {
        this.lgaOfOrigin = lgaOfOrigin;
    }

    public Status getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Status employeeStatus) {
        this.employeeStatus = employeeStatus;
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
        if (!(object instanceof Payerdata)) {
            return false;
        }
        Payerdata other = (Payerdata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Payerdata[ id=" + id + " ]";
    }
    
}
