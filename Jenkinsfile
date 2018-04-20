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
    }

    stage('Test') {
      steps('Test Case execute') {
        echo 'hello'
      }
    }
  }
}
