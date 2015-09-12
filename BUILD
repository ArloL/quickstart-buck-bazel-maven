java_binary(
    name = "app",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "com.example.App",
    deps = ["//:guava"],
)

java_library(
    name = "guava",
    exports = ["@guava//jar"],
)
