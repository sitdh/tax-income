pipeline {
  agent any
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
