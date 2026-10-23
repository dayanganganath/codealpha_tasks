pipeline {
    agent { label 'codealpha-linux' }

    stages {
        stage('Verify Agent') {
            steps {
                echo "Running on agent: ${env.NODE_NAME}"
                sh 'hostname'
                sh 'java -version'
            }
        }

        stage('Create Artifact') {
            steps {
                sh 'echo "CodeAlpha Jenkins Remoting demo completed." > result.txt'
                archiveArtifacts artifacts: 'result.txt', fingerprint: true
            }
        }
    }
}