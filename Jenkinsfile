pipeline{
    agent any
    tools{
        maven 'mvn'
    }
    stages{
        stage('build'){
            steps{
                echo 'Build not necessary?'
            }
        }
        stage('test'){
            steps{
                sh 'mvn clean test'

            }
        }
    }
}