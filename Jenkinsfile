#!groovy

properties([disableConcurrentBuilds()])

pipeline() {
    agent any

    stages {
        stage('Tests') {
            steps {
            bat 'mvn clean'
            bat 'mvn test'
            echo "Testing project..."
            }
        }
        stage('Package to jar') {
            steps {
            bat 'mvn package'
            echo "Project has been packaged"
            }
        }
        stage('Create docker image') {
            steps {
                bat 'docker build -t jenktest:latest .'
            }
        }
        stage('Run app in container') {
            steps {
                bat 'docker-compose up -d'
            }
        }

    }

}