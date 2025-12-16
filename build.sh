#!/bin/bash
# Build script for Render

# Build the application
./gradlew clean build -x test

# The JAR file will be in build/libs/
