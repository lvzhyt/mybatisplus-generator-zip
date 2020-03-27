//package com.paw.generator.service.impl;
//
//import com.paw.generator.service.SysGeneratorService;
//import org.apache.commons.io.IOUtils;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class SysGeneratorServiceImplTest {
//
//    @Autowired
//    private SysGeneratorService sysGeneratorService;
//
//    @Test
//    public void generatorCode() throws IOException {
//
//        String[] tableNames = {"oauth_client_details"};
//        byte[] data = sysGeneratorService.generatorCode(tableNames);
//        FileOutputStream fos = new FileOutputStream("code.zip");
//        IOUtils.write(data, fos);
//        fos.close();
//        System.out.println("============= generatorCode ok  =============");
//    }
//}