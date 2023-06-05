# JavaSpringBibliotheque
Application Java Spring du groupe 2 : Andrei, Solène, Maati, Vincent
Modifier application.properties : spring.datasource.url:jdbc:postgresql://database-fil-rouge-groupe2.cbalwymx41tl.eu-west-3.rds.amazonaws.com/bibliofr
# Identifiants Amazon RDS
database-fil-rouge-groupe2.cbalwymx41tl.eu-west-3.rds.amazonaws.com
nom : bibliofr
login : masterfr
password : masterfrpass
groupe de sécurité : rds-security-g2 

# Identifiants de l'instance Amazon EC2
nom EC2 : biblio-fil-rouge-groupe2
point de terminaison : database-fil-rouge-groupe2.cbalwymx41tl.eu-west-3.rds.amazonaws.com
groupe de sécurité : group-security-g2

Nom paire de clé
key-pair-group2

#Une fois dans l'instance EC2
Télécharger et décompresser maven :
cd /opt
wget https://mirrors.estointernet.in/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
tar -xvf apache-maven-3.6.3-bin.tar.gz

Configurer la variable d'env pour maven :
M2_HOME='/opt/apache-maven-3.6.3'
PATH="$M2_HOME/bin:$PATH"
export PATH

Installer JDK for Amazon Corretto 17:
sudo yum install java-17-amazon-corretto-devel

Configurer la variable d'env pour le JKD (si nécessaire):
The installation location is /usr/lib/jvm/java-17-amazon-corretto.<cpu_arch>
JAVA_HOME='/usr/lib/jvm/java-17-amazon-corretto.'
PATH="$JAVA_HOME"/bin:$PATH"
export PATH

Faire les commandes mvn compile, mvn clean install.
Pour lancer l'application sur le serveur Tomcat embarqué dans le projet mvn springboot :
Exécuter la commande sur target : java -jar target/Bibliotheque-0.0.1-SNAPSHOT.jar
Ou depuis le dossier du clone : 
mvn exec:java -Dexec.mainClass="com.capgemini.showtime.BibliothequeApplication"
