# Management API

Este é um projeto de API para gerenciar entidades satélites e seus dados de telemetria. A API permite adicionar entidades satélites, obter informações sobre satélites específicos, e adicionar dados de telemetria associados a cada satélite.

## Tecnologias Usadas

- Java
- Spring Boot
- JPA (Hibernate)
- PostgreSQL
- Lombok

## Funcionalidades

- **CRUD de Satélites**: Criação, leitura, atualização e exclusão de satélites.
- **Gerenciamento de Telemetria**: Adicionar dados de telemetria a um satélite existente.
- **Validações**: Verificações de integridade e validações de dados.

## Endpoints

### Satélites

- `GET /satellites/{id}`: Obtém informações sobre um satélite pelo ID.
- `POST /satellites`: Adiciona um novo satélite.

### Telemetria

- `POST /satellites/{satelliteId}/telemetry`: Adiciona dados de telemetria a um satélite específico.

## Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
   cd NOME_DO_REPOSITORIO
Configure o banco de dados PostgreSQL com as credenciais necessárias.

Altere as configurações do banco de dados no arquivo application.properties.

Execute a aplicação:

bash
Copy code
./mvnw spring-boot:run
Acesse a API em http://localhost:8080/satellites.
