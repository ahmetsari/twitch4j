package com.github.twitch4j.chat.events;

import lombok.Getter;

/**
 * @author ahmet.sari
 */
@Getter
public class IRCWebsocketMessageEvent {
    String message;

    public IRCWebsocketMessageEvent(String message) {
        this.message = message;
    }
}
