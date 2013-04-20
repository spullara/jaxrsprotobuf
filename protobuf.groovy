protoc = { project, protofile ->
    project.plugin {
      artifactId "maven-antrun-plugin"
      executions {
        execution {
          id "generate-sources"
          phase "generate-sources"
          configuration {
            tasks {
              mkdir(dir:"target/generated-sources")
              exec(executable:"protoc") {
                arg(value:"--java_out=target/generated-sources")
                arg(value:protofile)
              }
            }
            sourceRoot "target/generated-sources"
          }
          goals {
            goal "run"
          }
        }
      }
    }
}