package com.example.demo.advenced.app.v3;

import com.example.demo.advenced.trace.TraceId;
import com.example.demo.advenced.trace.TraceStatus;
import com.example.demo.advenced.trace.hellotrace.HelloTraceV2;
import com.example.demo.advenced.trace.logtrace.LogTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV3 {
    private final OrderRepositoryV3 orderRepository;
    private final LogTrace trace;

    public void orderItem(String itemId) {

    TraceStatus status = null;
        try {
            status = trace.begin("OrderService.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }
    }
}
