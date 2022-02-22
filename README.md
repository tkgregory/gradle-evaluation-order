This repository is an example to go along with this [YouTube tutorial video](https://youtu.be/DY6bn14Gu58) and article 
at [tomgregory.com](https://tomgregory.com/gradle-evaluation-order-for-multi-project-builds).

## Running


1. See all the configured projects:

`./gradlew projects`


2. Demonstrates the configuration of sub-projects from the parent *build.gradle*
and also from sub-project *build.gradle* files:

`./gradlew hello goodbye`

(also demonstrates the Gradle lifecycle phases)

3. Demonstrates using *afterEvaluate* to dynamically configure a task 
name based on a configuration property:

`./gradlew makeSmallTalkToTom`

## Need Gradle support?
Contact me if you need help with Gradle at [tom@tomgregory.com](mailto:tom@tomgregory.com).
