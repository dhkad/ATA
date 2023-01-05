pipeline {
    agent any
    tools {
        maven 'apache-maven-3.8.6'
        jdk 'JAVA_HOME'
    }
    stages {
	stage('Checkout code') {
        	steps {
		// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
        branches: [[name: '*/main']],
        extensions: [[$class: 'CloneOption', timeout: 120]],
        gitTool: 'Default', 
        userRemoteConfigs: [[url: 'https://github.com/dhkad/ATA.git']]
    ])
           	checkout scm
        }
    }
		
	stage("Test stage"){
	steps{
	withMaven(maven: 'apache-maven-3.8.6'){
	sh'mvn test'}}}
	
			  
	
	stage("Cucumber Report"){
		steps{
			// Get some code from a GitHub repository
    		checkout([$class: 'GitSCM',
        	branches: [[name: '*/main']],
        	extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [[url: 'https://github.com/dhkad/ATA.git']]
			 ]) 
		cucumber buildStatus: "UNSTABLE",
		fileIncludePattern: "**/cucumber.json",
                jsonReportDirectory: 'target'}}

}

}
