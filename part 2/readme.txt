Circuit breaker is one of the pattern used by develop while devloping the microservices
it is one of the pattern which help to manage downstream service failure in a proper manner

# What is circuit breaker pattern?
this pattern comes into the picture while communicating between the services
for example we have two service: Service A and Sevice B
Sevice A is calling to Service B, if service B is down due to some infrastructure outrage. 
Service A is not getting a result and it will hang by throwing an exception and then another request comes and 
it also faces the same stiutation

Life cycle of pattern state
there are 3 main states in circuit breaker pattern
1. closed
2. open
3. half open

CLOSED STATE
when both services which are interacting are up and running, circuit is closed. circuit breaker is counting the number of remote API calls continously

OPEN STATE
as soon as the percentage of failing remore API call is excedding the given threashol limit, circuit breaker changes its state to OPEN state, caling microservices will fail immediatelly and an exception will be returned that means flow is interupted

HALF OPEN STATE
after staying at OPEN state for a given timeout period, circuit breaker automatically turn its state into HALF open state. in this state only limited number of remote API call are allowed to pass through. if the failing calls count is greather than this limited number, breaker turn again into OPEN state otherwise it is closed



# Resilience4j
- it is light weight, easy to yse fault tolerant library inspired by netflix hystrix


it provide variour feature
- circuit breaker - fault tolerance
- rate imiter - block too many request
- time limyer - limit time while calling remote opeartion
- retyr mechanism
- cach
- bulkhead





