pipeline {
 agent any
 environment {
 }

 stages {
 stage('Checkout') {
 steps {
 git branch: 'main', credentialsId: '90ad32f0-73f1-4bee-849a-796362d219ef', url: 'git@github.com:OnlyGIGO/FahrtoCel.git'
 }
 }
 stage('Build') {
 steps {
 bat "mvn clean install"
 }
 }
 stage('Test') {
 steps{
 bat "mvn test"
 }
 post {
 success {
 // Publish JUnit test results
 junit '**/target/surefire-reports/TEST-*.xml'
 // Generate JaCoCo code coverage report
 jacoco(execPattern: '**/target/jacoco.exec')
 }
 }
 }
 }
}