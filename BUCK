java_binary(
    name = "app",
    main_class = "com.example.App",
    deps = [":main"],
)

java_library(
    name = "main",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = ["//dep:guava"],
)

java_test(
    name = "app_test",
    srcs = glob(["src/test/java/**/*Test.java"]),
    resources = glob(["src/test/resources/**"]),
    source_under_test = [":main"],
    deps = [
        ":main",
        "//dep::junit",
        "//dep:hamcrest-core",
    ],
)
