## Build

Simply use:

mvn clean install
## Feature and Deployment

On a running Karaf instance, you register the blueprint example features repository with:

karaf@root()> feature:repo-add mvn:com.java.examples/features/1.0-SNAPSHOT/xml

Then you can install the karaf-provider feature:

karaf@root()> feature:install karaf-provider

Now, you can install the karaf-client feature:

karaf@root()> feature:install karaf-client

When you install the client feature, you should see on the console:

karaf@root()> 1794197511025182174 | John Doo | AF3030