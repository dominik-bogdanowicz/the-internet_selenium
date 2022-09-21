pipeline{
    agent any
    tools{
        maven 'mvn'
    }
    stages{
        stage('build'){
            steps{
                sh 'mvn -Dmaven.test.failure.ignore=true clean package'
            }
        }
        stage('test'){
            steps{
                sh 'mvn clean test'
            }
        }
        stage('email'){
            steps{
                emailext attachmentsPattern: 'target/surefire-reports/emailable-report.html',body:'test',subject:'test1',to:'dominik.bogdanowicz.kontakt@gmail.com'
            }
        }
    }
    post{
        always{
            archiveArtifacts artifacts: 'target/surefire-reports/emailable-report.html'
        }
        success{
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
}