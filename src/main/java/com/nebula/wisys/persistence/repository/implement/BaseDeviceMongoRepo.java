package com.nebula.wisys.persistence.repository.implement;

import java.util.List;

import com.nebula.wisys.persistence.model.BaseDevice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.bson.types.ObjectId;

@Qualifier("BaseDeviceMongoRepo")
public interface BaseDeviceMongoRepo extends MongoRepository<BaseDevice, ObjectId> {

    @Query(value = "{'_id' : ?0}")
    List<BaseDevice> findByPID(ObjectId PID);

    @Query(value = "{'_id' : ?0}", delete = true)
    List<BaseDevice> deleteByPID(ObjectId PID);

}
