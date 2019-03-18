#!/usr/bin/env groovy
pipeline{
        def mvnHome = tool 'maven3.6.0'
        env.PATH = "${mvnHome}/bin:${env.PATH}"

        stages {
            stage('mvn test') {
                sh "mvn test"
                }

            stage('mvn build') {
                sh "mvn clean install "

                }

            }
        }
