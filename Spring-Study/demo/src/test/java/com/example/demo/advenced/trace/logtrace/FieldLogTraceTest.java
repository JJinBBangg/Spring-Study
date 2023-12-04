package com.example.demo.advenced.trace.logtrace;

import com.example.demo.advenced.trace.TraceStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class FieldLogTraceTest {
    FieldLogTrace trace = new FieldLogTrace();


    @Test
    @DisplayName("begin_end_level2")
    void test1(){
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status2);
        trace.end(status1);

    }

}