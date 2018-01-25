properties properties: [
        [$class: 'BuildDiscarderProperty', strategy: [$class: 'LogRotator', artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '30', numToKeepStr: '10']],
        disableConcurrentBuilds()
]

@Library('holisticon-build-library')
def build = new de.holisticon.ci.jenkins.Build()

node {
    def buildNumber = env.BUILD_NUMBER
    def branchName = env.BRANCH_NAME
    def workspace = env.WORKSPACE
    def buildUrl = env.BUILD_URL

    // PRINT ENVIRONMENT TO JOB
    echo "workspace directory is $workspace"
    echo "build URL is $buildUrl"
    echo "build Number is $buildNumber"
    echo "branch name is $branchName"
    echo "PATH is $env.PATH"

    try {
        stage('Checkout') {
            deleteDir()
            checkout scm
        }

        stage('Build') {
            sh "./gradlew clean checkstyleMain checkstyleTest build"
        }

        stage('Test') {
            sh "./gradlew test"
            //junit 'target/test-reports/TEST*.xml'
        }

        stage('Deploy') {
            // TODO
        }

    } catch (e) {
        rocketSend channel: 'holi-oss', emoji: ':rotating_light:', message: 'Fehler nach folgenden Änderungen: ' + build.summarizeBuild(currentBuild)
        throw e
    }

}