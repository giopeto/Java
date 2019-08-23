package com.mongo.atlas.springboot.groups.service;

import com.mongo.atlas.springboot.groups.domain.Groups;
import com.mongo.atlas.springboot.groups.domain.GroupsList;

import java.util.Optional;

public interface GroupsService {

	public Groups save(Groups groups);
	public GroupsList get();
	public Optional<Groups> findById(String id);
	public void delete(String id);
}
