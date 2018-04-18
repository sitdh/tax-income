pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Collacting constant') {
          steps {
            echo 'Build Jar file '
          }
        }
        stage('Instrumeting source code') {
          steps {
            echo 'hi'
          }
        }
        stage('Analyze source code structure') {
          steps {
            echo 'Create Jar file'
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
