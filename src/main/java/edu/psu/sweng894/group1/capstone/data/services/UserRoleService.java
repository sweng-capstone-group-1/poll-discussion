package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.UserRole;
import edu.psu.sweng894.group1.capstone.data.repositories.UserRoleRepository;

public class UserRoleService {

    private UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public UserRole createUserRole(UserRole userRole) {
        return null;
    }

    public UserRole updateUserRole(UserRole userRole) {
        return null;
    }

    public UserRole deleteUserRole(UserRole userRole) {
        return null;
    }
}
