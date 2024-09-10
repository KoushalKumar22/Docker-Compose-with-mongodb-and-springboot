package com.Example.DockerComposeDemo.Repository;

import com.Example.DockerComposeDemo.entity.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends MongoRepository<Profile,Integer> {
    List<Profile> findByName(String name);
}
