package com.authentication.service;

import com.authentication.entities.AppRole;
import com.authentication.entities.AppUser;

public interface AccountService {

    AppUser saveUser(String username, String password, String confirmedPassword);
    AppRole saveRole(AppRole appRole);
    AppUser loadUserByUsername(String username);
    void addRoleToUser(String username, String roleName);

}
