pipeline{
    agent any
    tools{
        maven 'mvn'
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