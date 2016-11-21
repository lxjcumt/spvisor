package sys.spvisor.core.dao.ana;

import java.util.List;

import sys.spvisor.core.dao.IGenericDao;
import sys.spvisor.core.entity.ana.Permission;

public interface PermissionDao extends IGenericDao<Permission, Long>{
	public List<Permission> getPermissionsByUserId(long userId);
	public List<Permission> getPermissionByRoleId(long roleId);
	public List<Permission> getPermissionByRoleCaseId(long roleId);
}
