package com.example.springobserver;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

// Child Module
@Component
public class CustomEventListener {

    @EventListener
    public void handleCustomEvent(CustomEvent event) {
        System.out.println("Received event - " + event.getMessage());
        // Xử lý logic tại đây
    }
}
