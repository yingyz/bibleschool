package com.cpp.project.Services;

import com.cpp.project.Exceptions.Exception.DuplicateAccountException;
import com.cpp.project.Models.StudentAssessment;
import com.cpp.project.Models.User;
import com.cpp.project.Models.UserInfo;
import com.cpp.project.Repository.UserRepo;
import com.cpp.project.Requests.UserSignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserService implements UserDetailsService {


    @Autowired
    UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User createUser(UserSignUpRequest userSignUpRequest){

        try {
            User user = new User();
            user.setFirstName(userSignUpRequest.getFirstName());
            user.setLastName(userSignUpRequest.getLastName());
            user.setChineseName(userSignUpRequest.getChineseName());
            user.setUsername(userSignUpRequest.getUsername());
            user.setPassword(bCryptPasswordEncoder.encode(userSignUpRequest.getPassword()));
            user.setEmail(userSignUpRequest.getEmail());

            Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(userSignUpRequest.getBirthday());
            UserInfo userInfo = new UserInfo(userSignUpRequest.getStreet(),
                    userSignUpRequest.getCity(),
                    userSignUpRequest.getState(),
                    userSignUpRequest.getZip(),
                    userSignUpRequest.getLanguage(),
                    userSignUpRequest.getDialect(),
                    userSignUpRequest.getGender(),
                    userSignUpRequest.getPhone(),
                    userSignUpRequest.getAge(),
                    birthday,
                    userSignUpRequest.getBirth_city(),
                    userSignUpRequest.getBirth_nation());

            user.setUserInfo(userInfo);

            StudentAssessment studentAssessment = new StudentAssessment(
                    userSignUpRequest.getHighestGrade(),
                    userSignUpRequest.getHighestGradeCountry(),
                    userSignUpRequest.getOtherUniversityAttended(),
                    userSignUpRequest.getDegreeEarned(),
                    userSignUpRequest.getFavoriteLanguage(),
                    userSignUpRequest.getChurchAttended(),
                    userSignUpRequest.getChurchAttendedAddress(),
                    userSignUpRequest.getChurchAttendedCity(),
                    userSignUpRequest.getChurchAttendedState(),
                    userSignUpRequest.getChurchAttendedZip(),
                    userSignUpRequest.getChurchAttendedPastorName(),
                    userSignUpRequest.getChurchAttendedServingPosition(),
                    userSignUpRequest.getChurchAttendedPhone(),
                    userSignUpRequest.getEmployerName(),
                    userSignUpRequest.getEmployerPhone(),
                    userSignUpRequest.getEmployerAddress(),
                    userSignUpRequest.getEmployerCity(),
                    userSignUpRequest.getEmployerState(),
                    userSignUpRequest.getEmployerZip(),
                    userSignUpRequest.getMaritalStatus(),
                    userSignUpRequest.getSpouseName(),
                    userSignUpRequest.getEmergencyContactName(),
                    userSignUpRequest.getEmergencyContactPhone(),
                    userSignUpRequest.getEmergencyContactAddress(),
                    userSignUpRequest.getEmergencyContactCity(),
                    userSignUpRequest.getEmergencyContactState(),
                    userSignUpRequest.getEmergencyContactZip(),
                    userSignUpRequest.getInformationFirstHearBibleUniversity(),
                    userSignUpRequest.getInformationReasonChooseUniversity(),
                    userSignUpRequest.getInformationHowBecomeChristian(),
                    userSignUpRequest.getLifeGoal()
            );

            user.setStudentAssessment(studentAssessment);
            return userRepo.save(user);

        } catch(Exception e) {
            throw new DuplicateAccountException("Username " + userSignUpRequest.getUsername() + " already exists");
        }

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User();
    }
}
