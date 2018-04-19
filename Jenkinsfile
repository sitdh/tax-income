pipeline {
  agent none
  stages {
    stage('Build') {
      parallel {
        stage('Collacting constant') {
          steps {
            echo 'Hello'
          }
        }
        stage('Instrumeting source code') {
          steps {
            echo 'hi'
          }
        }
        stage('Analyze source code structure') {
          agent {
            docker { 
              image 'maven:3.5-jdk-9' 
            }
          }
          steps {
            sh 'mvn package -Dmaven.test.skip=true'
            echo 'mvn package'
          }
        }
      }
    }
    stage('Collecting constants') {
      steps {
        echo 'Collecting constants from source code'
      }
    }
  }
}
