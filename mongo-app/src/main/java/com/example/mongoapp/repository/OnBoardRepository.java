package com.example.mongoapp.repository;

import com.example.mongoapp.model.OnBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface OnBoardRepository extends MongoRepository<OnBoard, String> {
}
