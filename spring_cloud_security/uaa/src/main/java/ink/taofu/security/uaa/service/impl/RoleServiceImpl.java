package ink.taofu.security.uaa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ink.taofu.security.uaa.dao.RoleMapper;
import ink.taofu.security.uaa.entity.Role;
import ink.taofu.security.uaa.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
    
}
