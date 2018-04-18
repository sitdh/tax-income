pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Build Jar file '
          }
        }
        stage('') {
          steps {
            echo 'hi'
          }
        }
      }
    }
    stage('Instrumatation') {
      steps {
        echo 'Instrumenting source code'
      }
    }
    stage('Collecting constants') {
      steps {
        echo 'Collecting constants from source code'
      }
    }
  }
}