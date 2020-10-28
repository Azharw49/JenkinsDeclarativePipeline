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
		
		emailext body: '''Hi Team,

		The build is successfull''', recipientProviders: [buildUser()], subject: 'Build Status', to: 'azharw49@gmail.com'
            
        }
    }
}