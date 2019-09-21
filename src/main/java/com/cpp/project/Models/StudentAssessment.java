package com.cpp.project.Models;

import javax.persistence.*;

@Entity
public class StudentAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name = "highest_grade")
    private String highestGrade;

    @Column(name = "highest_grade_country")
    private String highestGradeCountry;

    @Column(name = "other_university_attended")
    private String otherUniversityAttended;

    @Column(name ="degree_earned")
    private String degreeEarned;

    @Column(name ="favorite_language")
    private String favoriteLanguage;

    private String churchAttended;
    private String churchAttendedAddress;
    private String churchAttendedCity;
    private String churchAttendedState;
    private String churchAttendedZip;
    private String churchAttendedPastorName;
    private String churchAttendedServingPosition;
    private String churchAttendedPhone;
    private String employerName;
    private String employerPhone;
    private String employerAddress;
    private String employerCity;
    private String employerState;
    private String employerZip;
    private String maritalStatus;
    private String spouseName;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String emergencyContactAddress;
    private String emergencyContactCity;
    private String emergencyContactState;
    private String emergencyContactZip;
    private String informationFirstHearBibleUniversity;
    private String informationReasonChooseUniversity;
    private String informationHowBecomeChristian;
    private String lifeGoal;

    public StudentAssessment(String highestGrade, String highestGradeCountry, String otherUniversityAttended, String degreeEarned, String favoriteLanguage, String churchAttended, String churchAttendedAddress, String churchAttendedCity, String churchAttendedState, String churchAttendedZip, String churchAttendedPastorName, String churchAttendedServingPosition, String churchAttendedPhone, String employerName, String employerPhone, String employerAddress, String employerCity, String employerState, String employerZip, String maritalStatus, String spouseName, String emergencyContactName, String emergencyContactPhone, String emergencyContactAddress, String emergencyContactCity, String emergencyContactState, String emergencyContactZip, String informationFirstHearBibleUniversity, String informationReasonChooseUniversity, String informationHowBecomeChristian, String lifeGoal) {
        this.highestGrade = highestGrade;
        this.highestGradeCountry = highestGradeCountry;
        this.otherUniversityAttended = otherUniversityAttended;
        this.degreeEarned = degreeEarned;
        this.favoriteLanguage = favoriteLanguage;
        this.churchAttended = churchAttended;
        this.churchAttendedAddress = churchAttendedAddress;
        this.churchAttendedCity = churchAttendedCity;
        this.churchAttendedState = churchAttendedState;
        this.churchAttendedZip = churchAttendedZip;
        this.churchAttendedPastorName = churchAttendedPastorName;
        this.churchAttendedServingPosition = churchAttendedServingPosition;
        this.churchAttendedPhone = churchAttendedPhone;
        this.employerName = employerName;
        this.employerPhone = employerPhone;
        this.employerAddress = employerAddress;
        this.employerCity = employerCity;
        this.employerState = employerState;
        this.employerZip = employerZip;
        this.maritalStatus = maritalStatus;
        this.spouseName = spouseName;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.emergencyContactAddress = emergencyContactAddress;
        this.emergencyContactCity = emergencyContactCity;
        this.emergencyContactState = emergencyContactState;
        this.emergencyContactZip = emergencyContactZip;
        this.informationFirstHearBibleUniversity = informationFirstHearBibleUniversity;
        this.informationReasonChooseUniversity = informationReasonChooseUniversity;
        this.informationHowBecomeChristian = informationHowBecomeChristian;
        this.lifeGoal = lifeGoal;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHighestGrade() {
        return highestGrade;
    }

    public void setHighestGrade(String highestGrade) {
        this.highestGrade = highestGrade;
    }

    public String getHighestGradeCountry() {
        return highestGradeCountry;
    }

    public void setHighestGradeCountry(String highestGradeCountry) {
        this.highestGradeCountry = highestGradeCountry;
    }

    public String getOtherUniversityAttended() {
        return otherUniversityAttended;
    }

    public void setOtherUniversityAttended(String otherUniversityAttended) {
        this.otherUniversityAttended = otherUniversityAttended;
    }

    public String getDegreeEarned() {
        return degreeEarned;
    }

    public void setDegreeEarned(String degreeEarned) {
        this.degreeEarned = degreeEarned;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getChurchAttended() {
        return churchAttended;
    }

    public void setChurchAttended(String churchAttended) {
        this.churchAttended = churchAttended;
    }

    public String getChurchAttendedAddress() {
        return churchAttendedAddress;
    }

    public void setChurchAttendedAddress(String churchAttendedAddress) {
        this.churchAttendedAddress = churchAttendedAddress;
    }

    public String getChurchAttendedCity() {
        return churchAttendedCity;
    }

    public void setChurchAttendedCity(String churchAttendedCity) {
        this.churchAttendedCity = churchAttendedCity;
    }

    public String getChurchAttendedState() {
        return churchAttendedState;
    }

    public void setChurchAttendedState(String churchAttendedState) {
        this.churchAttendedState = churchAttendedState;
    }

    public String getChurchAttendedZip() {
        return churchAttendedZip;
    }

    public void setChurchAttendedZip(String churchAttendedZip) {
        this.churchAttendedZip = churchAttendedZip;
    }

    public String getChurchAttendedPastorName() {
        return churchAttendedPastorName;
    }

    public void setChurchAttendedPastorName(String churchAttendedPastorName) {
        this.churchAttendedPastorName = churchAttendedPastorName;
    }

    public String getChurchAttendedServingPosition() {
        return churchAttendedServingPosition;
    }

    public void setChurchAttendedServingPosition(String churchAttendedServingPosition) {
        this.churchAttendedServingPosition = churchAttendedServingPosition;
    }

    public String getChurchAttendedPhone() {
        return churchAttendedPhone;
    }

    public void setChurchAttendedPhone(String churchAttendedPhone) {
        this.churchAttendedPhone = churchAttendedPhone;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerPhone() {
        return employerPhone;
    }

    public void setEmployerPhone(String employerPhone) {
        this.employerPhone = employerPhone;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public String getEmployerCity() {
        return employerCity;
    }

    public void setEmployerCity(String employerCity) {
        this.employerCity = employerCity;
    }

    public String getEmployerState() {
        return employerState;
    }

    public void setEmployerState(String employerState) {
        this.employerState = employerState;
    }

    public String getEmployerZip() {
        return employerZip;
    }

    public void setEmployerZip(String employerZip) {
        this.employerZip = employerZip;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    public String getEmergencyContactCity() {
        return emergencyContactCity;
    }

    public void setEmergencyContactCity(String emergencyContactCity) {
        this.emergencyContactCity = emergencyContactCity;
    }

    public String getEmergencyContactState() {
        return emergencyContactState;
    }

    public void setEmergencyContactState(String emergencyContactState) {
        this.emergencyContactState = emergencyContactState;
    }

    public String getEmergencyContactZip() {
        return emergencyContactZip;
    }

    public void setEmergencyContactZip(String emergencyContactZip) {
        this.emergencyContactZip = emergencyContactZip;
    }

    public String getInformationFirstHearBibleUniversity() {
        return informationFirstHearBibleUniversity;
    }

    public void setInformationFirstHearBibleUniversity(String informationFirstHearBibleUniversity) {
        this.informationFirstHearBibleUniversity = informationFirstHearBibleUniversity;
    }

    public String getInformationReasonChooseUniversity() {
        return informationReasonChooseUniversity;
    }

    public void setInformationReasonChooseUniversity(String informationReasonChooseUniversity) {
        this.informationReasonChooseUniversity = informationReasonChooseUniversity;
    }

    public String getInformationHowBecomeChristian() {
        return informationHowBecomeChristian;
    }

    public void setInformationHowBecomeChristian(String informationHowBecomeChristian) {
        this.informationHowBecomeChristian = informationHowBecomeChristian;
    }

    public String getLifeGoal() {
        return lifeGoal;
    }

    public void setLifeGoal(String lifeGoal) {
        this.lifeGoal = lifeGoal;
    }
}
