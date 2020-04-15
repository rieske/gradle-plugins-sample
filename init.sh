#!/bin/bash

pushd .
cd published-plugin
./gradlew publish
popd

pushd.
cd jarred-plugin
./gradlew build
cp build/libs/jarred-plugin.jar ../jarred-plugin.jar
popd
