java_binary(
    name = "app",
    main_class = "com.example.App",
    runtime_deps = [":main"],
)

java_library(
    name = "main",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = ["@guava//jar"],
)

java_test(
    name = "app_test",
    srcs = glob(["src/test/java/**/*Test.java"]),
    resources = glob(["src/test/resources/**"]),
    deps = [
        ":main",
        "@junit//jar",
        "@hamcrest-core//jar",
    ],
    timeout = "short",
    size = "small",
)
