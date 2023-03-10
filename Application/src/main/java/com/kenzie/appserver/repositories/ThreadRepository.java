package com.kenzie.appserver.repositories;

import com.kenzie.appserver.repositories.model.ThreadRecord;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

import org.springframework.data.repository.CrudRepository;

/** This file was created by another team member **/

@EnableScan
public interface ThreadRepository extends CrudRepository<ThreadRecord, String> {
}
