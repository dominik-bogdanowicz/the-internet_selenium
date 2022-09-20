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
                env.ForEmailPlugin = env.WORKSPACE
                emailext attachmentsPattern: 'target/surefire-reports/emailable-report.html',body:'',subject:'',to:'dominik.bogdanowicz.kontakt@gmail.com'
            }
        }
    }
    post{
        always{
            archiveArtifacts artifacts: 'target/surefire-reports/emailable-report.html'
        }
    }
}