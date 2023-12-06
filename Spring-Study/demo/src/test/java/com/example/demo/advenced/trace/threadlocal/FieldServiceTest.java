package com.example.demo.advenced.trace.threadlocal;

import com.example.demo.advenced.trace.threadlocal.code.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class FieldServiceTest {

    private FieldService fieldService = new FieldService();

    @Test
    @DisplayName("field test")
    void test(){

        log.info("main start");
        Runnable userA = () -> fieldService.logic("userA");
        Runnable userB = () -> fieldService.logic("userB");
        Thread threadA = new Thread(userA);
        threadA.setName("Thread-A");
        Thread threadB = new Thread(userB);
        threadB.setName("Thread-B");


        threadA.start();
//        sleep(2000); // 동시성문제 없도록 설계
        threadB.start();
        sleep(1500); // main thread 종료 지연
        log.info("main end");

    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
