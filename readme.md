# Codility task sbt project template

[![](https://travis-ci.com/laughedelic/codility.g8.svg?branch=master)](https://travis-ci.com/laughedelic/codility.g8)
[![](https://img.shields.io/badge/license-CC_BY--SA_4.0-blue.svg)](https://creativecommons.org/licenses/by-sa/4.0/)

This is a Giter8 template for solving [Codility](https://app.codility.com) test tasks in Scala.

### Usage

1. Apply the template:
    * either with [giter8](http://www.foundweekends.org/giter8):
        ```shell
        g8 laughedelic/codility.g8
        ```
    * or with [sbt v1.0 or newer](http://www.scala-sbt.org/download.html):
        ```shell
        sbt new laughedelic/codility.g8
        ```
    It will ask you for the name of the project, input and output types. You can change it later in the code.
2. Write your solution in `src/main/scala/Solution.scala`
3. Add test cases in `src/test/scala/Solution.scala` and run `sbt test`
4. Once it's ready, copy-paste the content of `src/main/scala/Solution.scala` to the Codility editor and run tests there
