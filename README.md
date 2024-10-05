# GreenGo

GreenGo é um projeto que visa facilitar a conexão entre ONGs e empresas com foco em sustentabilidade. Através de um sistema de matchmaking, o projeto permite que empresas encontrem projetos de ONGs que se alinhem com seus interesses e práticas sustentáveis.

## Funcionalidades

### Matchmaking de ONGs e Empresas

- Implementado um serviço de matchmaking que conecta ONGs a empresas, com base em critérios como participação em eventos sustentáveis e impacto ambiental dos projetos.
- O endpoint `/match` permite que a aplicação realize o matchmaking e retorne informações sobre as correspondências encontradas.

### Listagem de Partidas

- Adicionada a funcionalidade para listar todas as partidas realizadas entre ONGs e empresas.
- O endpoint `/match/listar` pode ser utilizado para recuperar todas as partidas registradas na base de dados.

### Dependências

- O projeto utiliza as seguintes dependências:
  - Spring Boot
  - JPA (Java Persistence API)
  - Hibernate
  - Lombok
  - Outros conforme necessidade do projeto

## Como Executar o Projeto

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/seuusuario/GreenGo.git
   cd GreenGo
Instale as dependências: mvn install


Execute o projeto: mvn spring-boot:run
