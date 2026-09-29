pipeline {
    agent any

    stages {
        stage('Build and test') {
            steps {
                checkout scm
                bat 'mvn -B clean verify'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESSFUL!'
        }
        failure {
            echo 'BUILD FAILED!'
        }
    }
}
