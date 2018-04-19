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
              args '-v /root/.m2:/root/.m2' 
            }
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
