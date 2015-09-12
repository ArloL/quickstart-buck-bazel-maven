java_binary(
    name = "app",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    main_class = "com.example.App",
    deps = [":dependencies"],
)

java_test(
    name = "app-test",
    srcs = glob(["src/test/java/**/*.java"]),
    deps = [":test-dependencies"],
    timeout = "short",
    size = "small"
)

java_library(
    name = "dependencies",
    exports = ["@guava//jar"],
)

java_library(
    name = "test-dependencies",
    exports = [
        "@junit//jar",
        "@hamcrest-core//jar"
    ],
)
