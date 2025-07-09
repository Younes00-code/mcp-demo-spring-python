Ce projet démontre comment construire une **application agentique** de type chatbot en utilisant **Spring AI**, le **protocole MCP (Model Context Protocol)**, et des serveurs backends basés sur **NodeJS** et **Python**.  
L'objectif est de permettre des interactions intelligentes et contextuelles avec l'utilisateur à travers un agent conversationnel connecté à divers outils métiers.


Objectifs du projet

- Développer un **agent IA intelligent** capable de comprendre et exécuter des commandes métiers.
- Intégrer des **serveurs MCP** écrits en Python et NodeJS.
- Créer un **client Spring Boot** connecté à ces serveurs via le protocole MCP.
- Offrir une expérience fluide via une **UI Swagger**, une **API REST**, et une **interface Angular**.

1. [Présentation du protocole MCP](#1-présentation-du-protocole-mcp)
2. [Architecture globale du projet](#2-architecture-globale-du-projet)
3. [Serveur MCP avec Java Spring (SSE)](#3-serveur-mcp-avec-java-spring-sse)
4. [Serveurs MCP avec NodeJS & Python (STDIO)](#4-serveurs-mcp-avec-nodejs--python-stdio)
5. [Client Spring AI avec LLMs (Llama3, Claude, OpenAI)](#5-client-spring-ai-avec-llms-llama3-claude-openai)
6. [Interface de test (Swagger / Postman)](#6-interface-de-test-swagger--postman)
7. [Frontend Angular ou React (à venir)](#7-frontend-angular-ou-react-à-venir)


La classe StockTools.java
McpServerApplication

![image](https://github.com/user-attachments/assets/52e72e26-abab-473e-b60e-20b919b4944a)

![image](https://github.com/user-attachments/assets/5e66ead3-f016-4b32-8fa5-22ec8982c5a4)

![image](https://github.com/user-attachments/assets/dd79b207-a313-43aa-914f-711a8ec474f3)

tests avec postman 
![image](https://github.com/user-attachments/assets/a5e8f055-ea99-4d52-98f0-b7b6330e80b0)
![image](https://github.com/user-attachments/assets/108d6e30-c209-4ed3-93cb-27c1a2bb8fd2)
![image](https://github.com/user-attachments/assets/39321cb3-282c-4fe4-b9c6-7ac60ab5a7d8)


Cote serveur client 

AIAgent 

![image](https://github.com/user-attachments/assets/ef0d884f-b4fc-4905-b0d4-7cd05e5efa65)

L'application McpClientApplication

![image](https://github.com/user-attachments/assets/0d82113c-867e-4a48-9a07-4853b85b2bd8)
swagger ui 
![Capture d'écran 2025-07-09 110126](https://github.com/user-attachments/assets/43fd5d63-bd33-4a85-b659-a7e187adfe82)
chatboot
![Capture d'écran 2025-07-09 110228](https://github.com/user-attachments/assets/b4be4f7d-baf9-4894-adf6-227dfab24278)
exemple de reponse 
![Capture d'écran 2025-07-09 112514](https://github.com/user-attachments/assets/6ad5a2ab-6076-4edc-b11a-aaff37c00eec)
