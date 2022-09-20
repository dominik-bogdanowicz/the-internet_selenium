pipeline{
    agent any
    tools{
        maven 'Maven 11'
        jdk 'jdk11'
    }
    stages{
        stage('build'){
            steps{
                withMaven(){
                    sh 'mvn clean install'
                }
            }
        }
        stage('test'){
            steps{
                withMaven(){
                    sh 'mvn test'
                }
                post{
                    always {
                        step([$class: 'Publisher', reportFilenamePattern: '**/testng-result.xml'])
                    }
                }
            }
        }
    }
}