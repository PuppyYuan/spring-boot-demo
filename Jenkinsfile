node("master"){
    checkout scm
    def workspace = pwd()
    def TOMCAT_HOME = "/Users/yuanpeng/software/apache-tomcat-8.5.9"

    stage('Package'){
        echo "initial packaging ..."

        sh 'mvn clean package'

        echo "package complete"
    }

    stage('Deploy'){
        echo "initial deploying"

        sh """


        rm -rf ${TOMCAT_HOME}/webapps/spring-boot-demo-0.0.1*

        cp target/spring-boot-demo-0.0.1.war ${TOMCAT_HOME}/webapps

        ${TOMCAT_HOME}/bin/catalina.sh start


        """
    }

}