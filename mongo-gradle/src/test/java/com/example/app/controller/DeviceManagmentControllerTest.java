package com.example.app.controller;

import com.example.app.cotroller.DeviceManagmentController;
import com.example.app.model.Device;
import com.example.app.service.DeviceManagmentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

//@SpringBootTest
//@TestPropertySource("classpath:application-test.properties")
//Required for properties to Test the controller
public class DeviceManagmentControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    DeviceManagmentController deviceMController;

    @Mock
    DeviceManagmentService deviceMService;

    @BeforeEach
    public void setup(){
        mockMvc= MockMvcBuilders.standaloneSetup(deviceMController)
                //.setControllerAdvice(handler) //If advised any controller for exception
           .build();
    }
    @Test
    public void saveDeviceTest() throws Exception {
        Device requestDevice=new Device();
            requestDevice.setActive(true);

            requestDevice.setManufactureDate(new Date());
            requestDevice.setDeviceProperties(Collections.singletonMap("propert1","value1"));
            requestDevice.setName("printer");
            requestDevice.setModel("R1ZC");
            requestDevice.setVersion("1.0");
        Device responseDevice= requestDevice;
        responseDevice.setDeviceId(UUID.randomUUID().toString());


        BDDMockito.given(deviceMService.saveDevice(Mockito.any(Device.class))).willReturn(responseDevice);
           mockMvc.
                   perform(
                           MockMvcRequestBuilders
                                   .post("/v1/api/devices")
                                   .header("Authorization","accessTokenValue")
                                   .content(asJsonString(requestDevice))
                                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                                   .accept(MediaType.APPLICATION_JSON_VALUE)

                   ).andExpect(MockMvcResultMatchers.status().isOk());

    }
    public static String asJsonString(final Object object){
        try {
            return new ObjectMapper().writeValueAsString(object);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
