java_library(
    name = "app",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = ["//:guava"],
)

prebuilt_jar(
    name = 'guava',
    binary_jar = ':remote-guava',
)

remote_file(
    name = 'remote-guava',
    out = 'com.google.guava.guava-18.0.jar',
    url = 'mvn:com.google.guava:guava:jar:18.0',
    sha1 = 'cce0823396aa693798f8882e64213b1772032b09',
)
