package com.mlabboot.groups.repository;

import com.mlabboot.groups.domain.Groups;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupsRepository extends MongoRepository<Groups, String> {

	Optional<Groups> findById(String id);
	List<Groups> findAllByOrderByNameAsc();
	void deleteById(String id);
}