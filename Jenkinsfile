#!groovy

properties([disableConcurrentBuilds()])

pipeline() {
    agent any

    stages {
        stage('Tests') {
            steps {
            bat 'mvn clean'
            bat 'mvn tests'
            echo "Testing project..."
            }
        }
        stage('Package to jar') {
            steps {
            bat 'mvn package'
            echo "Project has been packaged"
            }
        }

    }

}