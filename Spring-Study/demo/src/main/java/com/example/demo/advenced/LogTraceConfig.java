package com.example.demo.advenced;

import com.example.demo.advenced.trace.logtrace.FieldLogTrace;
import com.example.demo.advenced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace(){
        return new FieldLogTrace();
    }
}
