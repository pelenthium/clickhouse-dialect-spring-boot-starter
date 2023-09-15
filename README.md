[![Maven Central](https://img.shields.io/maven-central/v/io.github.pelenthium/clickhouse-dialect-spring-boot-starter)](https://maven-badges.herokuapp.com/maven-central/io.github.pelenthium/clickhouse-dialect-spring-boot-starter)
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![LinkedIn][linkedin-shield]][linkedin-url]
<br />
<h3 align="center">Clickhose Spring JDBC dialect</h3>

<p align="center">
Use clickhouse database within Spring JDBC
</p>

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
* [Contributing](#contributing)
* [License](#license)

<!-- ABOUT THE PROJECT -->
## About The Project

Started from 2.3.0 Spring Data JDBC has a Dialect interface for the fully supported databases it ships with a matching implementation.
This implementation adds to support [Clickhose database][clickhouse-url]

<!-- GETTING STARTED -->
## Getting Started
This starter registers Clickhouse Dialect to Spring JDBC, and doesn't provide any dependencies.

Just add to classpath and Clickhouse Dialect will be automatically register by ClickhouseDialectResolver
#### Gradle
First you need to add a maven repository to build.gradle
```groovy
    repositories {
         mavenCentral()
     }
```

And now declare dependency as usual

```groovy
    implementation 'io.github.pelenthium:clickhouse-dialect-spring-boot-starter:1.2.0'
```

#### Maven
Use declare dependency as usual

```xml
<dependency>
  <groupId>io.github.pelenthium</groupId>
  <artifactId>clickhouse-dialect-spring-boot-starter</artifactId>
  <version>1.2.0</version>
  <type>pom</type>
</dependency>
```

<!-- LICENSE -->
## License

Distributed under the Apache 2 License. See [LICENSE][license-url] for more information.


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/pelenthium/clickhouse-dialect-spring-boot-starter.svg?style=flat-square
[contributors-url]: https://github.com/pelenthium/clickhouse-dialect-spring-boot-starter/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/pelenthium/clickhouse-dialect-spring-boot-starter.svg?style=flat-square
[forks-url]: https://github.com/pelenthium/clickhouse-dialect-spring-boot-starter/network/members
[stars-shield]: https://img.shields.io/github/stars/pelenthium/clickhouse-dialect-spring-boot-starter.svg?style=flat-square
[stars-url]: https://github.com/pelenthium/clickhouse-dialect-spring-boot-starter/stargazers
[issues-shield]: https://img.shields.io/github/issues/pelenthium/clickhouse-dialect-spring-boot-starter.svg?style=flat-square
[issues-url]: https://github.com/pelenthium/clickhouse-dialect-spring-boot-starter/issues
[license-shield]: https://img.shields.io/github/license/pelenthium/clickhouse-dialect-spring-boot-starter.svg?style=flat-square
[license-url]: https://github.com/pelenthium/clickhouse-dialect-spring-boot-starter/blob/master/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/pelenthium
[clickhouse-url]: https://clickhouse.com/
