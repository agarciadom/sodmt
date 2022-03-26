# Sample web services for testing

These web services were developed as a base to create the test generators in SODM+T.

## Run the web services

In order to build, test and run the web services, run these commands using Java 11+:

```shell
mvn -pl '!grinder' clean install
cd ws-impl
mvn jetty:run
```

This includes a number of manually written ContiPerf tests, which were created to help develop the automated generators.

## Running tests with The Grinder

For the performance tests, you will have to use Java 8 (The Grinder has not been updated to work on Java 11).
It's best to use the Docker image for Maven with Java 8 for it.
First, obtain the IP address for your Docker interface:

```shell
ip addr show docker0
```

Once you have the IP address, update these lines of `grinder/src/test/jython/soap.py` with the correct URL:

```python
test_service(
    name="OrdersImplService",
    url="http://172.17.0.1:8080/orders",
    ...
)
```

You can now run the tests with:

```shell
docker run -it --rm -v "$(pwd):/maven" -w /maven \
  maven:3-openjdk-8 \
  bash -c 'cd grinder; ./run-grinder.sh'
```
