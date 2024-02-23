pipeline {
 agent any
 environment {
    MAVEN_HOME = tool 'maven 3.9.6'
 }

 stages {
 stage('Checkout') {
 steps {
 git branch: 'main', credentialsId: '90ad32f0-73f1-4bee-849a-796362d219ef', url: 'git@github.com:OnlyGIGO/FahrtoCel.git'
 }
 }
 stage('Build') {
 steps {
 bat "\"${env.MAVEN_HOME}bin\\mvn.cmd\" clean install"
 }
 }
 stage('Test') {
 steps{
 bat "\"${env.MAVEN_HOME}bin\\mvn.cmd\" test"
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