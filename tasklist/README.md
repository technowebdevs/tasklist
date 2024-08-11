Run locally:

	Clone the code
	setup mysql on local
		brew install mysql
		brew services start mysql
		connect from root user and create tasklist db (create database tasklist)
		create user lists (create user list identified by lists)
	Add an entry to your /etc/hosts file as 
	127.0.0.1   host.docker.internal
	Run as spring application	

Build and Docker run

	Run below command from root directory
		mvn clean 
		mvn clean install
		docker rmi -f tasklist
		docker build --no-cache -t tasklist -f docker/Dockerfile .
		docker run -p 8080:8080 tasklist -d
		curl http://localhost:8080/lists