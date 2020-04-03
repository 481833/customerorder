# Accelerator Customer Order Demo with Spring Boot, PostgreSQL, JPA, Hibernate REST API

## Steps to Setup

**1. Clone the repository**

```bash
git clone https://github.com/481833/customerorder.git
```

**2. Configure PostgreSQL**

First, create a database named `customerdb`. Then, open `src/main/resources/application.properties` file and change the spring datasource username and password as per your PostgreSQL installation.

**3. Run the app**

Type the following command from the root directory of the project to run it -

```bash
mvn spring-boot:run
```

Alternatively, you can package the application in the form of a JAR file and then run it like so -

```bash
mvn clean package
java -jar target/CustomerOrder-0.0.1-SNAPSHOT.jar
```

**4. API access**

Get all Customers and create customer

```bash
http://localhost:8089/api/v1/customers
```

Update and Delete Customer

```bash
http://localhost:8089/api/v1/customers/{customerId)
```

Get all Orders

```bash
http://localhost:8089/api/v1/orders
...

Get Orders by Customer annd create Order

```bash
http://localhost:8089/api/v1/customers/{customerId}/orders
...

Update and Delete Order

```bash
http://localhost:8089/api/v1/customers/{customerId}/orders/{orderId}
...


