package ma.younes.mcpclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class ChatClientConfiguration {

    // Force Spring à utiliser le modèle Ollama pour ChatClient.Builder
    @Bean
    public ChatClient.Builder chatClientBuilder(@Qualifier("ollamaChatModel") ChatModel chatModel) {
        return ChatClient.builder(chatModel);
    }
}
