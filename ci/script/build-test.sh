#!/bin/bash

set -e

cd repo

rm -rf ~/.gradle
ln -fs $(pwd)/gradleCache ~/.gradle

set +e
./gradlew --no-daemon build -x test

if [ ! $? = 0 ]; then
  echo "build failed" > ../build/message.txt
  exit 1
fi

set -e

mv build/libs/SpringBootSample.jar ../build/app.jar
