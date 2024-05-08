package com.centroxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroxy.model.Group;
import com.centroxy.repository.GroupRepository;

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	private GroupRepository groupRepository;
	
	@Override
	public Group saveGroup(Group group) {
		 
		
		return groupRepository.save(group);
	}

	@Override
	public Group getGroupbyName(int id) {
		 
		return groupRepository.findById(id).get();
	}

	 

}
