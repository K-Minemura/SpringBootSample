#!/bin/bash

set -e

cd repo

rm -rf ~/.gradle
ln -fs $(pwd)/gradleCache ~/.gradle

set +e
./gradlew --no-daemon test

if [ ! $? = 0 ]; then
#  tar cvfz artifact.tar.gz build
#  mv artifact.tar.gz ../unit-result
  echo "test failed." > ../unit-result/message.txt
  exit 1
fi

set -e
