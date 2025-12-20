### Executar módulo dijkstra

Para executar o módulo dijkstra é necessário instalar os dois JARs da pasta lib no repositório Maven local. 
Execute o comando na pasta dijkstra para instalar o `jgrapht-jdk1.6.jar`:
```
mvn install:install-file \
  -Dfile=lib/jgrapht-jdk1.6.jar \
  -DgroupId=jgrapht \
  -DartifactId=jgrapht-jdk1.6 \
  -Dversion=0.8.2 \
  -Dpackaging=jar
```

Instale o `jgraph.jar`:
```
mvn install:install-file \
  -Dfile=lib/jgraph.jar \
  -DgroupId=jgraph \
  -DartifactId=jgraph \
  -Dversion=5.13.0.0 \
  -Dpackaging=jar
```

Build:
```
mvn clean install
```

Rodar:
```
java -jar dijkstra/target/dijkstra-1.0-SNAPSHOT.jar
```