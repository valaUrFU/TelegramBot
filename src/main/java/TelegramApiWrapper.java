import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Random;

class TelegramApiWrapper extends TelegramLongPollingBot {

    private BotLogic bot;

    public TelegramApiWrapper(BotLogic bot)
    {
        this.bot = bot;
    }

    @Override
    public String getBotUsername() {
        return "MovieBot";
    }

    @Override
    public String getBotToken() {
        return System.getenv("TelegramBotToken");
    }

    @Override
    public void onUpdateReceived(Update update) {
        try
        {
            if (!update.hasMessage())
            {
                return;
            }

            var message = update.getMessage();
            var currentChatId = message.getChatId();
            var response = bot.formResponse(currentChatId, message.getText());
            sendResponse(currentChatId, response);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void sendResponse(Long chatId, String msgText)
    {
        var sender = new SendMessage();
        sender.setChatId(chatId.toString());
        sender.setText(msgText);

        try
        {
            execute(sender);
        } catch (TelegramApiException e)
        {
            e.printStackTrace();
        }
    }


}
