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
                    sh "mvn clean install -Dmaven.test.skip=true"
                }
            }
        }
        }
