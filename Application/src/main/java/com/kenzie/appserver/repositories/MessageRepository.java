package com.kenzie.appserver.repositories;

import com.kenzie.appserver.repositories.model.MessageRecord;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

import org.springframework.data.repository.CrudRepository;

/** This file was created by another team member **/

@EnableScan
public interface MessageRepository extends CrudRepository<MessageRecord, String> {
}
