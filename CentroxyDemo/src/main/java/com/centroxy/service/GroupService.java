package com.centroxy.service;

import com.centroxy.model.Group;

public interface GroupService {
	
	Group saveGroup(Group group);
	Group getGroupbyName(int id);

}
