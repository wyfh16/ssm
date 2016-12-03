package com.xwq.ssm.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.xwq.ssm.dao.IUserDao;
import com.xwq.ssm.pojo.User;
import com.xwq.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource  
    private IUserDao userDao;

	public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);  
	}
    
}
