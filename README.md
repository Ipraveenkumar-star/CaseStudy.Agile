pipeline {
    agent any // [cite: 62]
    stages { // [cite: 63]
        stage('Build') { 
            steps { echo 'Building...' } // [cite: 64]
        }
        stage('Test') { 
            steps { echo 'Testing...' } // [cite: 65]
        }
        stage('Deploy') { 
            steps { echo 'Deploying...' } // [cite: 66]
        }
    }
}
