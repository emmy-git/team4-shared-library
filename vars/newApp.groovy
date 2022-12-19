def call(String repoUrl){
    pipeline{
        agent any 
        stages{
            stage('1-build'){
                sh 'free -g'
            }
        }
            stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage('closing'){
            steaps{
                echo "new demo"
            }
           }   
    }
}
