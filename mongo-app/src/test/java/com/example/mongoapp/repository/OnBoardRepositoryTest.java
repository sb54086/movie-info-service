package com.example.mongoapp.repository;

import com.example.mongoapp.model.OnBoard;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;


import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
class OnBoardRepositoryTest {
    @Autowired
    private  OnBoardRepository repository;

    private static  final Logger logger= LoggerFactory.getLogger(OnBoardRepositoryTest.class);

    @BeforeEach
     void  setUp() {
        logger.info("Dumping the Test Data  to MongoDB");
        OnBoard  board;
        board = new OnBoard("domain1","model1","version.1.2","dvId0klapi",
                "hostPrinter",true,
                Collections.singletonMap("deviceProp1","valu1"),
                Collections.singletonMap("encryptionKey1","Value1"));
        repository.save(board);

        ;
    }
    @Test
    public void testFetchData(){
        logger.info("Testing FetchData");
      assertNotNull(repository.findAll().get(0));
    }
    @AfterEach
     void tearDown() {
        logger.info("Removing the Test Data  from MongoDB");
        repository.findAll().forEach((board)->{
            repository.deleteById(board.getDeviceId());
        });
    }
}