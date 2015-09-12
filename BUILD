java_binary(
    name = "app",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    main_class = "com.example.App",
    deps = ["//:guava"],
)

java_library(
    name = "guava",
    exports = ["@guava//jar"],
)
