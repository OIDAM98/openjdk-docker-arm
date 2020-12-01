# Description

Simple _Hello-World_ application to test `adoptopenjdk:11-jre-hotspot` as a base image for a Docker container.

It is meant to be run inside a Raspberry Pi 4.

The `Dockerfile` and important folders to create the image are inside the `target/docker/` folder. Can be created again by using the `sbt docker:stage` command.

# Results

The output of the image when ran inside a Raspberry Pi 4 is the following:

![docker-jdk-pi](https://user-images.githubusercontent.com/4955553/100628058-6a7ac200-32ed-11eb-8afd-884e1ee985e0.jpg)

## Specs of the Raspberry Pi used:

**OS**:  Raspbian lite 10 armv7l 32 bits.
**Kernel**: 5.4.72-v7l+
**Docker**: 19.03.13, build 4484c46
**Hardware**:
- Raspberry Pi 4 Model B Rev 1.2, 4 GB Ram
- Booting from a Kingston SSD A400 120GB SATA 3