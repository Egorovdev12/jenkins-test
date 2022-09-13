#!groovy

properties([disableConcurrentBuilds()])

pipeline() {
    agent any

    stages {
        stage('MyFirstStep') {
            steps {
            echo "Preparing project..."
            }
        }
        stage('Maven') {
            steps {
            bat 'mvn clean'
            bat 'mvn package'
            echo "project has been packaged"
            }
        }

    }

}