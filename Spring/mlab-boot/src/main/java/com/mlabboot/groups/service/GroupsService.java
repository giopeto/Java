package com.mlabboot.groups.service;

import com.mlabboot.groups.domain.Groups;
import com.mlabboot.groups.domain.GroupsList;

import java.util.Optional;

public interface GroupsService {

	public Groups save(Groups groups);
	public GroupsList get();
	public Optional<Groups> findById(String id);
	public void delete(String id);
}
