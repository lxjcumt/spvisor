package sys.spvisor.core.vo.ana;

import java.sql.Date;
import java.sql.Timestamp;

import org.hibernate.validator.constraints.Length;

import sys.spvisor.core.annotation.Mobile;
import sys.spvisor.core.entity.ana.User;
import sys.spvisor.core.entity.ana.UserCase;
import sys.spvisor.core.vo.VoConvertor;

public class UserConvertorCase extends VoConvertor<User, UserCase> {

	@Override
	public User convert(UserCase bo) {
		if (bo==null)
			return null;
		User vo = new User();
		vo.setId(bo.getRealId());
		
		vo.setLoginName(bo.getLoginName());
		vo.setName(bo.getName());
		vo.setLoginPassword(bo.getLoginPassword());
		vo.setStatus(bo.getStatus());
		vo.setStatusName(bo.getStatusName());
		vo.setPwdErrCnt(bo.getPwdErrCnt());
		
		vo.setMobile(bo.getMobile());
		vo.setEmail(bo.getEmail());
		vo.setPhone(bo.getPhone());
		vo.setMemo(bo.getMemo());
		vo.setCreateDatetime(bo.getCreateDatetime());
		vo.setUpdateDatetime(bo.getUpdateDatetime());
		vo.setExpirationDate(bo.getExpirationDate());
		vo.setRoles(bo.getRoles());
		
		vo.setDkSerialNumber(bo.getDkSerialNumber());
		return vo;
	}

}
