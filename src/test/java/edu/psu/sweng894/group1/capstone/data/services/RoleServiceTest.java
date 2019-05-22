package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Role;
import edu.psu.sweng894.group1.capstone.data.repositories.RoleRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the role service.
 */
public class RoleServiceTest {

    private RoleService roleService;

    @Before
    public void before() {

        // stub repo service
        RoleRepository repo = new RoleRepository() {
        };
        this.roleService = new RoleService(repo);
    }

    @Test
    public void testRoleInsert() {
        Role role = new Role();
        Role insertedRole = this.roleService.createRole(role);
        Assert.assertNotNull("role is null", insertedRole);
        Assert.assertNotNull("inserted role id is null", insertedRole.getId());
    }

    @Test
    public void testRoleUpdate() {

        Role start = new Role();
        Role inserted = this.roleService.createRole(start);

        String newName = "-new-name-";
        inserted.setName(newName);
        Role finalRole = this.roleService.updateRole(inserted);

        Assert.assertNotNull("final role is null", finalRole);
        Assert.assertNotNull(newName, finalRole.getName());

    }

}