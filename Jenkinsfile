node("master"){
    checkout scm
    def workspace = pwd()
    def TOMCAT_HOME = "/Users/yuanpeng/software/apache-tomcat-8.5.9"
    def MVN_HOME = "${MVN_HOME}/bin/mvn"

    stage('Build'){

        sh 'mvn clean package'
    }



}