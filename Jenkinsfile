node {
        stage('checkout'){
        //必须有，该checkout步骤将检出从源控制代码; scm是一个特殊变量，指示checkout步骤克隆触发此Pipeline运行的特定修订。
        checkout scm
        }

        def javaHome = tool('jdk1.8.0_92')
        def mvnHome = tool('mvn3.6.0')
        env.PATH = "${mvnHome}/bin:${env.PATH}"

        stage('mvn build'){
        //sh "JAVA_HOME=${javaHome} mvn clean package"
        configFileProvider([configFile(fileId: '****', variable: 'MAVEN_SETTINGS')]) {
        sh 'mvn -s $MAVEN_SETTINGS clean package'
        }
        }

        stage('mvn test'){
        sh "echo test"
        }

        stage('mvn deploy'){
        configFileProvider([configFile(fileId: '****', variable: 'MAVEN_SETTINGS')]) {
        sh 'mvn -s $MAVEN_SETTINGS deploy'
        }
        }
        }