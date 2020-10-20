package com.example.mongoapp.repository;

import com.example.mongoapp.model.OnBoard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OnBoardRepository extends MongoRepository<OnBoard, String> {
}
