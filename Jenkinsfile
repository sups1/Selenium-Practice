pipeline {
    agent any

    tools {
        jdk 'JDK17'        // change to your Jenkins JDK name
        maven 'Maven3'     // change to your Jenkins Maven name
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'develop',
                    url: 'https://github.com/sups1/Selenium-Practice.git'
            }
        }

        stage('Clean & Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh '''
                mvn test \
                -Dtest=FileUpload,Practice
                '''
            }
        }
    }

    post {
        always {
            echo 'Build Finished'
        }
        success {
            echo 'Tests Passed'
        }
        failure {
            echo 'Tests Failed'
        }
    }
}