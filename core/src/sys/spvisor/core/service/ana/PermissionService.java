package sys.spvisor.core.service.ana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sys.spvisor.core.criteria.ana.PermissionCriteria;
import sys.spvisor.core.dao.ana.PermissionDao;
import sys.spvisor.core.entity.ana.Permission;

@Service
public class PermissionService {
	
	@Autowired
	PermissionDao permissionDao;
	
	
	public List<Permission> getAllPermission() {
		PermissionCriteria criteria = new PermissionCriteria();
		return permissionDao.query(criteria);
	}
}
