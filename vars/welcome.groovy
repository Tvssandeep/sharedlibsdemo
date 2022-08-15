def call(){
sshagent(['tomcat-dev']) {
    sh "scp -o StrictHostKeyChecking=no target/myweb*.war ec2-user@172.31.13.210:/opt/tomcat8/webapps/"
    sh "ssh ec2-user@172.31.13.210 /opt/tomcat8/bin/shutdown.sh"
    sh "ssh ec2-user@172.31.13.210 /opt/tomcat8/bin/startup.sh"
}
