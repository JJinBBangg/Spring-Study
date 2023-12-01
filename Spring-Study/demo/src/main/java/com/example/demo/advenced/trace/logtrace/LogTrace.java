package com.example.demo.advenced.trace.logtrace;

import com.example.demo.advenced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
