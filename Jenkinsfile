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
            bat 'mvn clean install'
            echo "project has been packaged"
            }
        }

    }

}