package com.shavelev.alexander.messages;

import com.shavelev.alexander.messages.Message;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by user on 23.11.15.
 */
public class DayWelcomeMessage extends Message {
    private static final String DAY = "day";

    @Override
    public String getRecipient() {
        return DAY;
    }

}
