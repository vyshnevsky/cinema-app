package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.model.Role.RoleName;
import cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(RoleName roleName) {
        return roleDao.getByName(roleName).orElseThrow(
                () -> new RuntimeException(
                        String.format("There is no role: ", roleName)));
    }
}
