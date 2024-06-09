pipeline {
    agent any 
    stages {
        stage('Clone Repository') {
            steps {
                sh(script: 'echo Cloning repository...')
            }
        }
        stage('Deploy') { 
            steps {
                sh(script: 'echo Deploying application...')
                sh(script: 'echo Disk usage:')
                sh(script: 'df -h')
            }
        }
    }
}
