package org.telegram.telegrambots.meta.api.objects.webapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

/**
 * Contains data sent from a web app to the bot.
 * @author Ruben Bermudez
 * @version 6.0
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@SuperBuilder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebAppData implements BotApiObject {
    private static final String DATA_FIELD = "data";
    private static final String BUTTON_TEXT_FIELD = "button_text";

    /**
     * The data
     */
    @JsonProperty(DATA_FIELD)
    @NonNull
    private String data;
    /**
     * Text of the web_app keyboard button, from which the web app was opened
     */
    @JsonProperty(BUTTON_TEXT_FIELD)
    @NonNull
    private String buttonText;

}
