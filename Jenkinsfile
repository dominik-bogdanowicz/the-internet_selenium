pipeline{
    agent any
    stages{
        stage('build'){
            sh 'mvn clean install'
        }
        stage('test'){
            sh 'mvn test'
            post{
                always {
                    step([$class: 'Publisher', reportFilenamePattern: '**/testng-result.xml'])
                }
            }
        }
        stage('post')

    }
}