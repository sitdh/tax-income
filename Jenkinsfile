pipeline {
  agent {
      docker { image 'node:7-alpine' }
  }
  stages {
    stage('Build') {
      parallel {
        stage('Collacting constant') {
          steps {
            sh 'node --version'
          }
        }
        stage('Instrumeting source code') {
          steps {
            echo 'hi'
          }
        }
        stage('Analyze source code structure') {
          agent {
            docker { image: 'maven:3.5-jdk-9' }
          }
          steps {
            sh 'mvn -B -DskipTests clean package'
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
