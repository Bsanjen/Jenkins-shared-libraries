def call(String ProjectName, String ImageTag, String DcokerHubuser){

  sh "docker build -t ${DockerHubuser}/${ProjectName}:${ImageTag} ."
}
