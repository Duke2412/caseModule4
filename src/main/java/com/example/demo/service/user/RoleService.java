package com.example.demo.service.user;

import com.example.demo.model.Role;
import com.example.demo.service.Service;

public interface RoleService extends Service<Role> {
    Role findByName(String name);
}
