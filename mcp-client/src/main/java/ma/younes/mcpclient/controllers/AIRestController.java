package ma.younes.mcpclient.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ma.younes.mcpclient.agents.AIAgent;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AIRestController {

    private final AIAgent agent;

    public AIRestController(AIAgent agent) {
        this.agent = agent;
    }

    @Operation(
            summary = "Interroger le modèle LLM",
            description = "Envoie une requête texte au modèle LLM (comme Llama 3 via Ollama)"
    )
    @GetMapping("/chat")
    public String chat(
            @Parameter(description = "Question ou instruction à envoyer au modèle")
            @RequestParam String query) {
        // Appel réel à ton agent LLM
        return agent.askLLM(query);
    }
}
