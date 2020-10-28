pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                bat mvn clean
            }
        }
        stage('Test') {
            steps {
                bat mvn test
            }
        }
        stage('Verify') {
            steps {
                bat mvn verify
            }
        }
    }
}