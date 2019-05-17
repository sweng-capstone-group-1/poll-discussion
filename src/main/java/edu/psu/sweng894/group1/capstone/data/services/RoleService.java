package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Role;
import edu.psu.sweng894.group1.capstone.data.repositories.RoleRepository;

public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        return null;
    }

    public Role updateRole(Role role) {
        return null;
    }

    public Role deleteRole(Role role) {
        return null;
    }
}
