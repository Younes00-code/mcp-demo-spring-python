By Ziani Younes      Master SDIA MEKNES M1
 
Ce projet démontre comment construire une **application agentique** de type chatbot en utilisant **Spring AI**, le **protocole MCP (Model Context Protocol)**, et des serveurs backends basés sur **NodeJS** et **Python**.  
L'objectif est de permettre des interactions intelligentes et contextuelles avec l'utilisateur à travers un agent conversationnel connecté à divers outils métiers.


Objectifs du projet

- Développer un **agent IA intelligent** capable de comprendre et exécuter des commandes métiers.
- Intégrer des **serveurs MCP** écrits en Python et NodeJS.
- Créer un **client Spring Boot** connecté à ces serveurs via le protocole MCP.
- Offrir une expérience fluide via une **UI Swagger**, une **API REST**, et une **interface Angular**.




La classe StockTools.java

Définit un ensemble de méthodes des opérations sur des sociétes et leurs actions comme la partie du stock par exemple.
Durant une partie du projet on essaye de rendre ces methodes comme des tools acceessible via spring IA à l'aide du protocole MCP 
utilisation des annotations : @Tools  afin d'enregistrer dans la liste des tools disponibles pour l’agent l'ensemble des méthodes définies dans notre classe
                              @@Description
![image](https://github.com/user-attachments/assets/52e72e26-abab-473e-b60e-20b919b4944a)

McpServerApplication

La partie application executable 
![image](https://github.com/user-attachments/assets/5e66ead3-f016-4b32-8fa5-22ec8982c5a4)

![image](https://github.com/user-attachments/assets/dd79b207-a313-43aa-914f-711a8ec474f3)

tests avec postman  et demande de tools

![image](https://github.com/user-attachments/assets/a5e8f055-ea99-4d52-98f0-b7b6330e80b0)
![image](https://github.com/user-attachments/assets/108d6e30-c209-4ed3-93cb-27c1a2bb8fd2)
![image](https://github.com/user-attachments/assets/39321cb3-282c-4fe4-b9c6-7ac60ab5a7d8)


Cote serveur client 

AIAgent 

Cette classe définit un agent conversationnel intelligent reposant sur Spring AI, conçu pour :

interpréter et répondre à des requêtes formulées en langage naturel via la méthode askLLM(...),

s'appuyer sur des outils métiers personnalisés pour enrichir ses réponses,

exploiter une mémoire contextuelle qui conserve l'historique des échanges récents, afin de maintenir la cohérence du dialogue.


![image](https://github.com/user-attachments/assets/ef0d884f-b4fc-4905-b0d4-7cd05e5efa65)

L'application McpClientApplication

modele utilisé :  tinyllama 
![image](https://github.com/user-attachments/assets/ef169a86-b378-4296-8130-e18857cb3e80)



![image](https://github.com/user-attachments/assets/0d82113c-867e-4a48-9a07-4853b85b2bd8)
swagger ui 
pour tester notre chatboot en envoyant une requete
![Capture d'écran 2025-07-09 110126](https://github.com/user-attachments/assets/43fd5d63-bd33-4a85-b659-a7e187adfe82)
chatboot interface créée avec angular 
![Capture d'écran 2025-07-09 110228](https://github.com/user-attachments/assets/b4be4f7d-baf9-4894-adf6-227dfab24278)
exemple de reponse du modèle
![Capture d'écran 2025-07-09 112514](https://github.com/user-attachments/assets/6ad5a2ab-6076-4edc-b11a-aaff37c00eec)
