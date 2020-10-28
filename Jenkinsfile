pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Verify') {
            steps {
                bat "mvn verify"
            }
        }
    }
	post {
        success {
		
		publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: ''])
            
        }
    }
}