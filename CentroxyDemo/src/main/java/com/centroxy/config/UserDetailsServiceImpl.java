
package com.centroxy.config;

/*
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.centroxy.model.UserDtls; import
 * com.centroxy.repository.UserRepository;
 * 
 * @Service public class UserDetailsServiceImpl implements UserDetailsService {
 * 
 * 
 * @Autowired private UserRepository userRepo;
 * 
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException {
 * 
 * UserDtls user= userRepo.findByEmail(username);
 * 
 * if(user!=null) { return new CustomUserDetails(user); }
 * 
 * throw new UsernameNotFoundException("user not avlable"); }
 * 
 * }
 */




















import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Add this import

import com.centroxy.model.UserDtls;
import com.centroxy.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    @Transactional // Add this annotation
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDtls user = userRepo.findByEmail(username);
        if (user != null) {
            return new CustomUserDetails(user);
        }
        throw new UsernameNotFoundException("User not found");
    }
}

