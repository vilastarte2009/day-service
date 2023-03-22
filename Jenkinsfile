pipeline {
    agent any
    tools{
        maven 'maven3'
    }
    stages{
       stage('Build Maven'){
           steps{
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vilastarte2009/day-service.git']])
               bat 'mvn clean install'
           }
       }
       stage('Build Docker'){
           steps{
               bat 'docker build -t vilastarte/day-service-jenkin:latest .'
           }
       }
       
       stage('Push Docker image'){
           steps{
               script{
                   withCredentials([string(credentialsId: 'docker_hub_pwd', variable: 'docker_hub_pwd')]) {
                   bat 'docker login -u vilastarte -p Sonali@11'
                     }
                   bat 'docker push vilastarte/day-service-jenkin:latest'
               }
                   
               }
           }
       }
    }
