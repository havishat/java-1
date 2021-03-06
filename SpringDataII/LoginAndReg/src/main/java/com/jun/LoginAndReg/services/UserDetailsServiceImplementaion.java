package com.jun.LoginAndReg.services;

import java.util.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.jun.LoginAndReg.models.User;
import com.jun.LoginAndReg.repositories.UserRepository;
@Service
public class UserDetailsServiceImplementaion implements UserDetailsService {
	private UserRepository userReoisitory;
	
	public UserDetailsServiceImplementaion(UserRepository userReoisitory) {
		this.userReoisitory = userReoisitory;
	}
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userReoisitory.findByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getAuthorities());
	}

	private List<GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        
        return authorities;
    }
}
