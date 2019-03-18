Jenkinsfile (Scripted pipeline)

node {
    stage('checkout'){
           //必须有，该checkout步骤将检出从源控制代码; scm是一个特殊变量，指示checkout步骤克隆触发此Pipeline运行的特定修订。
           checkout scm
       }
    stage('Example'){
        if(env.BRANCH_NAME=='master'){
            echo 'execute master'
        }else{
            echo 'execute elsewhere'
        }
    }
}

