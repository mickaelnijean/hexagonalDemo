package com.mickaelnijean.hexagonalDemo.persistence.repository;

import com.mickaelnijean.hexagonalDemo.persistence.mapper.UserDetailsMapper;
import com.mickaelnijean.hexagonalDemo.persistence.model.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("database")
public class AuthenticationDatabaseUserDetailsService implements UserDetailsService {
    
    @Autowired
    private UserDatabaseJpaRepository userDatabaseJpaRepository;
    @Autowired
    private UserDetailsMapper userDetailsMapper;
    
    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException{
        UserJpa userByMail = userDatabaseJpaRepository.findById(mail).orElse(UserJpa.NONE);
        UserDetails databaseUserDetailsByMail = this.userDetailsMapper.toUserDetails(userByMail);
        return databaseUserDetailsByMail;
    }
}
