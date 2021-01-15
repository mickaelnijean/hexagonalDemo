package com.mickaelnijean.hexagonalDemo.persistence.mapper;

import com.mickaelnijean.hexagonalDemo.persistence.model.UserJpa;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsMapper {
    public UserDetails toUserDetails(UserJpa userByMail){
        return UserDetailsImpl.builder()
                       .mail(userByMail.getMail())
                       .password(userByMail.getPassword())
                       .firstName(userByMail.getFirstName())
                       .lastName(userByMail.getLastName())
                       .build();
    }
}
