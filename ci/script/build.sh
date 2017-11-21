#!/bin/bash

set -e

cd repo

rm -rf ~/.gradle
ln -fs $(pwd)/gradleCache ~/.gradle

./gradlew --no-daemon build -x test
mv build/libs/SpringBootSample-0.0.1-SNAPSHOT.jar ../build/app.jar
