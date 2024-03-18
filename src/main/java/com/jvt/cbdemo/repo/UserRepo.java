package com.jvt.cbdemo.repo;

import com.jvt.cbdemo.model.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CouchbaseRepository<User, Integer> {
}
