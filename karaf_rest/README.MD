On a running Karaf instance, register the features repository using:

karaf@root()> feature:repo-add mvn:com.java.examples/rest-features/1.0-SNAPSHOT/xml

Then, you can install the service provider feature:

karaf@root()> feature:install karaf-rest-provider

karaf@root()> feature:install karaf-rest-client-http

karaf@root()> feature:install karaf-rest-client-cxf
