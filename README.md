This repository is an example to go along with the article 
at [tomgregory.com](https://tomgregory.com/gradle-evaluation-order-for-multi-project-builds).

## Running

1. Demonstrates the configuration of sub-projects from the parent *build.gradle*
and also from sub-project *build.gradle* files:

`./gradlew hello goodbye`

(also demonstrates the Gradle lifecycle phases)

2. Demonstrates using *afterEvaluate* to dynamically configure a task 
name based on a configuration property:

`./gradlew makeSmallTalkToTom`