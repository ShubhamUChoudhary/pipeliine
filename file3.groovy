pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
              echo 'helloooo' 
            }
        }
        stage('Build') { 
            steps {
                echo 'helloooo'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'helloooo'
            }
        }
    }
}