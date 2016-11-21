package sys.spvisor.core.criteria.ana;

import sys.spvisor.core.criteria.AbstractCriteria;


public class RoleCriteria extends AbstractCriteria{
	private Long roleId;
	private String roleName;
	
	public Long getRoleId() {
		return roleId;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
