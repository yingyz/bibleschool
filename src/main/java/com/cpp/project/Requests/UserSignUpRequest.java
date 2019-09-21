package com.cpp.project.Requests;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.util.Date;

public class UserSignUpRequest {

    @NotBlank(message = "User Name Cannot be Blank")
    @Email
    private String username;

    @NotBlank(message = "Password Cannot be Blank")
    @Size(min = 6)
    private String password;

    @NotBlank(message = "First Name Cannot be Blank")
    private String firstName;

    @NotBlank(message = "Last Name Cannot be Blank")
    private String lastName;

    @NotBlank(message = "Chinese Name Cannot be Blank")
    private String chineseName;

    @NotBlank(message = "Email Cannot be Blank")
    private String email;

    private String street;
    private String city;
    private String state;
    private String zip;
    private String language;
    private String dialect;
    private String gender;
    private String phone;
    private Integer age;
    private String birthday;
    private String birth_city;
    private String birth_nation;

    private String highestGrade;
    private String highestGradeCountry;
    private String otherUniversityAttended;
    private String degreeEarned;
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



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirth_city() {
        return birth_city;
    }

    public void setBirth_city(String birth_city) {
        this.birth_city = birth_city;
    }

    public String getBirth_nation() {
        return birth_nation;
    }

    public void setBirth_nation(String birth_nation) {
        this.birth_nation = birth_nation;
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
