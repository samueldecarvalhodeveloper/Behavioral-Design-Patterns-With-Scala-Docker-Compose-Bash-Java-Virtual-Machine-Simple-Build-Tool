FROM ubuntu:24.04

WORKDIR /src/app/

ENV JAVA_HOME=/usr/lib/java
ENV PATH=$JAVA_HOME/bin:$PATH

RUN apt update
RUN apt install curl gnupg software-properties-common tar -y

RUN curl -sL "https://download.oracle.com/java/23/archive/jdk-23_linux-x64_bin.tar.gz" -o /tmp/openjdk-23.tar.gz
RUN mkdir -p /usr/lib/java/
RUN tar -xzf /tmp/openjdk-23.tar.gz -C /usr/lib/java/ --strip-components=1
RUN rm /tmp/openjdk-23.tar.gz

RUN echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | tee /etc/apt/sources.list.d/sbt.list
RUN curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x99E82A75642AC823" | apt-key add - 
RUN apt update

RUN apt install sbt -y

COPY ./build.sbt /src/app/build.sbt
COPY ./project/build.properties /src/app/project/build.properties
COPY ./src/main/scala/Main.scala /src/app/src/main/scala/Main.scala
COPY ./src/main/scala/design_patterns/ /src/app/src/main/scala/design_patterns/

RUN sbt compile

CMD sbt run
