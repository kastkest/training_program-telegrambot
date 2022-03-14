package com.github.kastkest.tptb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@SpringBootApplication
public class TrainingProgramTelegramBot {

	public static void main(String[] args) {
		SpringApplication.run(TrainingProgramTelegramBot.class, args);

	}

	public void execute(SendMessage sendMessage) {
	}
}
