pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        agent {
          docker { 
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
          }
        }
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
