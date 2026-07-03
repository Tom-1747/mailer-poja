package com.example.mailer.endpoint.event.consumer.model;

import com.example.mailer.PojaGenerated;
import com.example.mailer.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
