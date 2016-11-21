package sys.spvisor.core.dao.ana;

import java.util.List;

import sys.spvisor.core.dao.IGenericDao;
import sys.spvisor.core.entity.ana.Menu;



public interface MenuDao extends IGenericDao<Menu, Long> {
	public List<Menu> getMenusByUserId(long userId);
	public List<Menu> getUsedMenusByUserId(long userId);
	public List<Menu> getUsedMenusByUserCaseId(long userId);
	public List<Menu> getAllMenus();
}
