pipeline {
    agent any

    stages {
        /*stage('docker') {
            steps {
                //sh 'echo $PATH'
                sh '/usr/local/bin/docker'
                //sh 'docker'
            }
        }
        stage('checkout') {
            steps {
                git credentialsId: 'bab965e9-4da3-4bfa-8844-0fc831ed1a73', url: 'https://github.com/chnvrajesh/course-service.git'
            }
        }*/
        stage('build') {
            steps {
                echo "${env.BUILD_NUMBER}-${env.BRANCH_NAME}"
                sh './gradlew clean build'
                //gradlew('clean', 'classes')
            }
        }
        stage('deploy') {
            steps {
                sh 'cp build/libs/course-service-0.0.1-SNAPSHOT.jar /Users/rajesh/Desktop/Project/Jenkins'
            }
        }
        stage('run') {
            steps {
                script {
                    sh '/usr/local/bin/docker build -t course_api .'
                }
                //sh 'nohup java -jar /Users/rajesh/Desktop/Project/Jenkins/course-service-0.0.1-SNAPSHOT.jar > /Users/rajesh/Desktop/Project/Jenkins/course_service.log &'
            }
        }
    }
}
