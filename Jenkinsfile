pipeline {

    agent any

    tools {
        maven 'Maven-3'
    }

    stages {

        stage('Build') {
            steps {
                echo 'Building Spring Boot application'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests'
                bat 'mvn test'
            }

            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging Spring Boot application'
                bat 'mvn package'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}