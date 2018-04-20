pipeline {
  agent none
  stages {
    stage('Build') {
      parallel {
        stage('Collecting constants') {
          agent any
          steps {
            echo 'Listing files from checked out repository'
            echo 'Collecting constant'
          }
        }
        stage('Instrument source code') {
          agent any
          steps {
            echo 'Listing files from checked out repository'
            echo 'Collecting constant'
          }
        }
        stage('Analyze source code') {
          agent any
          steps {
            echo 'Listing files from checked out repository'
            echo 'Collecting constant'
          }
        }
      }

      post {
        always {
          echo 'Send message'
        }
      }
    }

    stage('Test') {
      steps {
        echo 'hello'
      }
    }
  }
}
