java_binary(
    name = "app",
    main_class = "com.example.App",
    deps = [":main"],
)

java_library(
    name = "main",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = [":guava"],
)

java_test(
    name = "app_test",
    srcs = glob(["src/test/java/**/*Test.java"]),
    resources = glob(["src/test/resources/**"]),
    source_under_test = [":main"],
    deps = [
        ":main",
        ":junit",
        ":hamcrest-core",
    ],
)

prebuilt_jar(
    name = "guava",
    binary_jar = ":remote-guava",
)

remote_file(
    name = "remote-guava",
    out = "com.google.guava.guava-18.0.jar",
    url = "mvn:com.google.guava:guava:jar:18.0",
    sha1 = "cce0823396aa693798f8882e64213b1772032b09",
)

prebuilt_jar(
    name = "junit",
    binary_jar = ":remote-junit",
)

remote_file(
    name = "remote-junit",
    out = "junit.junit-4.12.jar",
    url = "mvn:junit:junit:jar:4.12",
    sha1 = "2973d150c0dc1fefe998f834810d68f278ea58ec",
)

prebuilt_jar(
    name = "hamcrest-core",
    binary_jar = ":remote-hamcrest-core",
)

remote_file(
    name = "remote-hamcrest-core",
    out = "org.hamcrest.hamcrest-core.1.3.jar",
    url = "mvn:org.hamcrest:hamcrest-core:jar:1.3",
    sha1 = "42a25dc3219429f0e5d060061f71acb49bf010a0",
)
