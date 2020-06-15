# API REST com Spring Webflux e MongoDB:

## Iniciando o Projeto:

Spring Tool 4:

### Dependências:

* Spring Reactive Web. 
* Spring Data Reactive MongoDB

## [MongoLab](https://mlab.com/login/)

Conexão com o banco de dados:

> application.properties
~~~JAVA
spring.data.mongodb.uri=mongodb+srv://bruno:<password>@cluster0-ejuhl.gcp.mongodb.net/webflux?retryWrites=true&w=majority
spring.data.mongodb.database=webflux
~~~

> application.properties
~~~JAVA
MongoClient mongoClient = MongoClients.create("mongodb+srv://bruno:<password>@cluster0-ejuhl.gcp.mongodb.net/webflux?retryWrites=true&w=majority");
MongoDatabase database = mongoClient.getDatabase("webflux");
~~~

