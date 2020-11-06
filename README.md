#Tutorial Webapp with Create React App and Spring Boot
[site: katenga](https://github.com/kantega/react-and-spring/)

###Passo a Passo:

####Criar um projeto spring-boot pelo site [spring initializr](https://start.spring.io/)
	Para ampliar as possibilidades do tutorial, instale JPA e H2. Oberserve para o banco de dados as configuraçãoes
	do arquivo application.properties e data.sql.
####Criar um controller no pacote controller e uma entidade Endereço, no pacote model
	Com essas classes será possível a criação do banco de dados e a comunicação com o springboot.

####Criar um app React JS na pasta src/front
	Lembrar de adicionar o proxy no package.json do react app:  "proxy": "http://localhost:8080",.
####Utilizar dois plugins para  a junção em um mesmo pacote JAR do backend e fronted
	frontend-maven-plugin 
	maven-antrun-plugin
