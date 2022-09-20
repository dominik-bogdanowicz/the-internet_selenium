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
        stage('email'){
            steps{
                emailext attachmentsPattern: 'target/surefire-reports/emailable-report.html',body:'',subject:'',to:'gmpsdet08082022@yahoo.com'
            }
        }
    }
    post{
        always{
            archiveArtifacts artifacts: 'target/surefire-reports/emailable-report.html'
        }
    }
}