package com.employee.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_tbl")
public class Employee {

	@Id
    @GeneratedValue
    private int id;
    private String firtsName;
    private String LastName;
    private String empolymentId;
    private Date startDate;
    private String designation;
    private String department;
    private Date endDate;
    private String status;
    private Date dob;
    private String reportingManager;
	private String gender;
    private String bloodGroup;
    private String address;
    private String dependentFirstName;
	private String dependentLastName;
	private String dependentGender;
	private Date dependentDob;
	private String dependentRelationship;
	private String educationType;
	private Date educationStartDate;
	private Date educationEndDate;
	private String eduactionQualificationType;
	private Date institution;
	private String institutionAddress;
	private int percentage;
    
	
    public String getDependentFirstName() {
		return dependentFirstName;
	}
	public void setDependentFirstName(String dependentFirstName) {
		this.dependentFirstName = dependentFirstName;
	}
	public String getDependentLastName() {
		return dependentLastName;
	}
	public void setDependentLastName(String dependentLastName) {
		this.dependentLastName = dependentLastName;
	}
	public String getDependentGender() {
		return dependentGender;
	}
	public void setDependentGender(String dependentGender) {
		this.dependentGender = dependentGender;
	}
	public Date getDependentDob() {
		return dependentDob;
	}
	public void setDependentDob(Date dependentDob) {
		this.dependentDob = dependentDob;
	}
	public String getDependentRelationship() {
		return dependentRelationship;
	}
	public void setDependentRelationship(String dependentRelationship) {
		this.dependentRelationship = dependentRelationship;
	}
	public String getEducationType() {
		return educationType;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
	public Date getEducationStartDate() {
		return educationStartDate;
	}
	public void setEducationStartDate(Date educationStartDate) {
		this.educationStartDate = educationStartDate;
	}
	public Date getEducationEndDate() {
		return educationEndDate;
	}
	public void setEducationEndDate(Date educationEndDate) {
		this.educationEndDate = educationEndDate;
	}
	public String getEduactionQualificationType() {
		return eduactionQualificationType;
	}
	public void setEduactionQualificationType(String eduactionQualificationType) {
		this.eduactionQualificationType = eduactionQualificationType;
	}
	public Date getInstitution() {
		return institution;
	}
	public void setInstitution(Date institution) {
		this.institution = institution;
	}
	public String getInstitutionAddress() {
		return institutionAddress;
	}
	public void setInstitutionAddress(String institutionAddress) {
		this.institutionAddress = institutionAddress;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmpolymentId() {
		return empolymentId;
	}
	public void setEmpolymentId(String empolymentId) {
		this.empolymentId = empolymentId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
    
}
