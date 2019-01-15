
Welcome to the Tradenity Java SDK
=================================

## Prerequisites

To use the Tradenity SDK, you must have:

-  Working Java development environment (currently JDK 1.7 is the only tested version, but Java 6 and 8 should work).
-  Active account in [Tradenity](http://www.tradenity.com)


## Installation

The SDK is available through maven central, You can install it using any compatible tool.


### Maven

```xml
<dependency>
    <groupId>com.tradenity</groupId>
    <artifactId>java-sdk</artifactId>
    <version>1.0.1</version>
</dependency>

```

### Gradle

Add this line to the `dependency section`

`compile com.tradenity:java-sdk:1.0.1`

### Ivy

```xml

<dependency org="com.tradenity" name="java-sdk" rev="1.0.1"/>

```


## Setup your credentials

First of all, you have to get API keys for your store, you can find it in your store `Edit` page.
To get there navigate to the stores list page, click on the `Edit` button next to your store name, scroll down till you find the `API Keys` section.


## Initialize the library

With the API key in hand, you can initialize the Tradenity client.
Tradenity client needs the API key and an instance of `SessionTokenStore`
which is an object that makes Tradenity session integrates with the web framework's session mechanism.
The Java SDK provide the interface and a default implementation suitable for single user application (such as android app),
and it's easy to implement your own for other frameworks, It is a simple 3 method interface.
If you are using Spring framework or Grails, the [Spring SDK extension](https://github.com/tradenity/java-sdk-spring-ext) provide implementation suitable for Spring and Grails.



```java

TradenityClient client = new TradenityClient('sk_1234567')

```
Make sure to replace the api keys with the ones for your store, otherwise you will get authentication error

## Make your First call

The Tradenity SDK is organized into a group of model entitiy classes that corresponds to the REST API's resources, each encapsulate the operation for a specific entity model,
for example to perform operations related to the `Brand` resource you can use the corresponding `tradenity.sdk.entities.Brand` class.


Now, just call any method in your code.

```java

BrandService brandService = new BrandService(client);
Brand brand = brandService.findById("1243-9786786-jhgjtu-789s6i");

```

## Tutorials and sample applications

We provide 2 sample applications, actually it is the same application implemented using 2 frameworks: `Spring MVC`, and `Grails`.

Live demo of [Camerastore](http://camera-store-sample.tradenity.com), check it out to have an idea of what Tradenity API can do.

You can find the code at Github:

[Camera store for spring mvc code](https://github.com/tradenity/camerastore-java-springmvc-sample).

[Camera store for grails code](https://github.com/tradenity/camerastore-groovy-grails-sample).

We also provide a detailed explanation of the code of these sample applications in the form of a step by step tutorials:

[Camera store for spring mvc tutorial](http://docs.tradenity.com/kb/tutorials/java/springmvc).

[Camera store for grails tutorial](http://docs.tradenity.com/kb/tutorials/groovy/grails).

