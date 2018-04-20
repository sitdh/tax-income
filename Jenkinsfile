pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Collacting constant') {
          steps {
            echo 'Listing files from checked out repository'
            echo 'Collecting constant'
          }
        }
        stage('Instrumeting source code') {
          steps {
            echo 'Capture source code to another branch'
            echo 'Add Traversal marker'
          }
        }
        stage('Analyze source code structure') {
          steps {
            echo 'mvn package: create jar file'
            echo 'Create call graph: call "staticg" from cg container'
          }
        }
      }
      stage('Generate Test case') {
        steps {
          echo 'Listing files from checked out repository'
          echo 'Collecting constant'
        }
      }
      stage('Getting value file') {
      }
    }
    stage('Test') {
      steps {
        echo 'Path selection'
        echo 'Random input data'
        echo 'Generate test case'
      }
    }
    stage('Inform') {
      steps {
        echo 'Mail to tester'
      }
    }
  }
}
