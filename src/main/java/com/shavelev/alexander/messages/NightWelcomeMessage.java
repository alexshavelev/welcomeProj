package com.shavelev.alexander.messages;

import com.shavelev.alexander.Message;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user on 23.11.15.
 */
public class NightWelcomeMessage implements Message {
    private static final String MESSAGES_FILE = "messages";
    private static final String NIGHT = "night";
    private static final String RECIPIENT = "recipient";
    private static final String END_SYMBOL = "symbol.end";

    @Override
    public String getWelcomeMessage() {
        StringBuilder message = new StringBuilder();
        message.append(ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(NIGHT))
                .append(", ")
                .append(ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(RECIPIENT))
                .append(ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(END_SYMBOL));
        return message.toString();
    }

    @Override
    public void printMessage() {
        System.out.println(getWelcomeMessage());
    }
}