package com.mongo.atlas.springboot.groups.service;


import com.mongo.atlas.springboot.groups.domain.Groups;
import com.mongo.atlas.springboot.groups.domain.GroupsList;
import com.mongo.atlas.springboot.groups.repository.GroupsRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupsServiceImpl implements GroupsService {

	@NonNull private final GroupsRepository groupsRepository;

	@Autowired
	public GroupsServiceImpl(GroupsRepository groupsRepository) {
		this.groupsRepository = groupsRepository;
	}

	public Groups save(Groups groups) {
		return groupsRepository.save(groups);
	}

	public GroupsList get() {
		return new GroupsList(groupsRepository.findAllByOrderByNameAsc());
	}

	public Optional<Groups> findById(String id) {
		return groupsRepository.findById(id);
	}

	public void delete(String id) {
		groupsRepository.deleteById(id);
	}

}
