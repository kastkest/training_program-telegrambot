package com.github.kastkest.tptb.command;

import com.github.kastkest.tptb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static final String STOP_MESSAGE = "Ну и вали, ленивая жопа \uD83D\uDE1F.";

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}
