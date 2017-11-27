pipeline {
  agent any
  stages {
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            sh 'echo "test 01"'
          }
        }
        stage('Test2') {
          steps {
            sh 'echo "test02"'
          }
        }
      }
    }
  }
}