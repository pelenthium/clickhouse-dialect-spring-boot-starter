[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
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

Started frm 2.3.0 Spring Data JDBC now has a Dialect interface for the fully supported databases it ships with a matching implementation.
This is implementation to support [Clickhose database][clickhouse-url]

<!-- GETTING STARTED -->
## Getting Started
This starter register Clickhouse Dialect to Spring JDBC, and don't provide any dependencies

Just add to classpath and Clickhouse Dialect will be automatically register by ClickhouseDialectResolver
#### Gradle
First of all you need to add a new maven repository to build.gradle
```groovy
    repositories {
         maven {
             url  "https://dl.bintray.com/pelenthium/maven"
         }
     }
```

And now declare dependency as usual

```groovy
    implementation 'com.github.pelenthium.spring:clickhouse-dialect-spring-boot-starter:1.0.1'
```

#### Maven
First of all you need to add a new maven repository to ~/.m2/settings.xml
```xml
<?xml version='1.0' encoding='UTF-8'?>
 <settings xsi:schemaLocation='http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd' xmlns='http://maven.apache.org/SETTINGS/1.0.0' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>
 <profiles>
 	<profile>
 		<repositories>
 			<repository>
 				<snapshots>
 					<enabled>false</enabled>
 				</snapshots>
 				<id>bintray-pelenthium-maven</id>
 				<name>bintray</name>
 				<url>https://dl.bintray.com/pelenthium/maven</url>
 			</repository>
 		</repositories>
 		<id>bintray</id>
 	</profile>
 </profiles>
 <activeProfiles>
 	<activeProfile>bintray</activeProfile>
 </activeProfiles>
 </settings>
```

And now declare dependency as usual

```xml
<dependency>
  <groupId>com.github.pelenthium.spring</groupId>
  <artifactId>clickhouse-dialect-spring-boot-starter</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.


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
[license-url]: https://github.com/pelenthium/clickhouse-dialect-spring-boot-starter/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/pelenthium
[clickhouse-url]: images/screenshot.png