#!/usr/bin/env groovy
pipeline{
        agent any

        stages {
            stage('Build') {
                steps {
                    echo 'Building..'
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                }
            }
            stage('Deploy') {
                steps {
                checkout scm
                sh 'mvn -version'

                sh "mvn clean install"
                }
            }
        }
        }
