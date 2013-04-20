include protobuf

project {
  modelVersion "4.0.0"
  groupId "com.sampullara.jaxrsprotobuf"
  artifactId "jaxrsprotobuf"
  packaging "jar"
  name "JAX-RS <-> Protobuf"
  version "1.0-SNAPSHOT"
  description "Integrates JAX-RS and Google protocol buffers"

  repositories {
    repository("maven2-repository.dev.java.net", "Java.net Repository for Maven", "http://download.java.net/maven/2")
  }

  dependencies {
    dependency("com.sun.jersey", "jersey-server", "1.0.1")
    dependency("com.sun.grizzly", "grizzly-servlet-webserver", "1.8.6.3")
    dependency("com.google.protobuf", "protobuf-java", "2.0.3")
    
    testdependency("com.sun.jersey", "jersey-client", "1.0.1")
    testdependency("junit", "junit", "4.5")
  }

  build {
    plugins {
      compiler("1.5")
      protoc("src/main/resources/addressbook.proto")
    }
  }

}
