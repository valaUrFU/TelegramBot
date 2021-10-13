import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Random;

public class BotLogic {

    public String formResponse(long chatId, String text) {
        if(text.equals("/start")) {
            return "Здравствуйте, вы попали к нам в бот, который поможет вам найти фильм на вечер." +
                    " Чтобы узнать больше информации напишите /help";
        }else if(text.equals("/help")){
            return "Напишите, какой фильм хотите найти";
        }return "ABOBA";
    }
}
