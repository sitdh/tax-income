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
      parallel {
        steps('Test Case execute') {
          echo 'hello'
        }
        steps('Test Case execute') {
          echo 'hello'
        }

        post {
          always {
            mail  to: 'sitdhibong@gmail.com',
                  subject: "Hello ${currentBuild.fullDisplayName}",
                  body: 'Hello world'
          }
        }
      }
    }
  }
}
