pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'develop',
                    url: 'https://github.com/sups1/Selenium-Practice.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed'
        }
        success {
            echo 'Build & Tests passed'
        }
        failure {
            echo 'Build or Tests failed'
        }
    }
}