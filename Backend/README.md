# N11 Bootcamp Graduation Project BackEnd

## Technologies & Structures Used
<ul>
    <li>Java 11</li>
    <li>Spring Boot</li>
    <li>Spring Data JPA</li>
    <li>Spring HATEOAS</li>
    <li>MapStruct</li>
    <li>Loombak</li>
    <li>Validation</li>
    <li>Swagger</li>
    <li>PostgreSQL</li>
    <li>Unit Test</li>
    <li>Builder Design Pattern</li>
    <li>Factory Design Pattern</li>
    <li>Single Design Pattern</li>
    <li>Basic Result Type</li>
    <li>Twilio Sms Send</li>
    <li><b>tckimlik.nvi.gov.tr</b> Mernis Check Customer</li>
</ul>

## ENDPOINTS

## Crd Package

> - Credit Package
### For Credit

* [Show Credits](documents/api/credit/show-credits.md) : `GET /api/credits`
* [Show Credit](documents/api/credit/show-credit.md) : `GET /api/credits/{id}`
* [Show Credit By Credit Name](documents/api/credit/show-credit-creditName.md) : `GET /api/credits/name/{creditName}`
* [Create Credit](documents/api/credit/create-credit.md) : `POST /api/credits`
* [Delete Credit](documents/api/credit/delete-credit.md) : `DELETE /api/credits/{id}`

## Csr Package

> - Customer Package
### For Customer

* [Show Customers](documents/api/customer/show-customers.md) : `GET /api/customers`
* [Show Customer](documents/api/customer/show-customer.md) : `GET /api/customers/{id}`
* [Show Customer By Identity Number](documents/api/customer/show-customer-identityNumber.md) : `GET /api/customers/identityNumber/{identityNumber}`
* [Create Customer](documents/api/customer/create-customer.md) : `POST /api/customers`
* [Update Customer](documents/api/customer/update-customer.md) : `PUT /api/customers`
* [Delete Customer](documents/api/customer/delete-customer.md) : `DELETE /api/customers/{id}`

### For Customer Guarantee

* [Show Guarantees](documents/api/guarantee/show-guarantees.md) : `GET /api/guarantees`
* [ShowGuarantee](documents/api/guarantee/show-guarantee.md) : `GET /api/guarantees/{id}`
* [Show Customer By Customer Id](documents/api/guarantee/show-guarantee-customerId.md) : `GET /api/guarantees/customer/{customerId}`
* [Create Guarantee](documents/api/guarantee/create-guarantee.md) : `POST /api/guarantees`
* [Create Guarantees](documents/api/guarantee/create-guarantees.md) : `POST /api/guarantees/all`
* [Delete Guarantee](documents/api/guarantee/delete-guarantee.md) : `DELETE /api/guarantees/{id}`

### For Customer Credit

* [Show Customer Credits](documents/api/customerCredit/show-customerCredits.md) : `GET /api/customer-credits`
* [Show Customer Credit](documents/api/customerCredit/show-customerCredit.md) : `GET /api/customer-credits/{id}`
* [Show Customer Credits By Customer Id](documents/api/customerCredit/show-customerCredits-customerId.md) : `GET /api/customer-credits/customer/{customerId}`
* [Show Customer Credits By Credit Id](documents/api/customerCredit/show-customerCredits-creditId.md) : `GET /api/customer-credits/credit/{creditId}`
* [Show Customer Credit Result](documents/api/customerCredit/show-customerCredits-result.md) : `GET /api/customer-credits/credit-result/{identityNumber}/{dateOfBirth}`
* [Show Customer Credit Result Approved](documents/api/customerCredit/show-customerCredits-resultApproved.md) : `GET /api/customer-credits/credit-result-approved/{identityNumber}/{dateOfBirth}`
* [Show Customer Credit Active Credit By Customer](documents/api/customerCredit/show-customerCredits-activeCredits.md) : `GET /api/customer-credits/active-credits-customer/{customerId}`
* [Create Customer Credit Apply](documents/api/customerCredit/create-customerCredit.md) : `POST /api/customer-credits`
* [Put Customer Credit Response](documents/api/customerCredit/update-customerCredit.md) : `POST /api/customer-credits`
* [Delete Customer Credit](documents/api/customerCredit/delete-customerCredit.md) : `DELETE /api/customer-credits/{id}`

## Cnt Package

> - Contact Package
### For Message

* [Show Messages](documents/api/message/show-messages.md) : `GET /api/messages`
* [Show Message](documents/api/message/show-message.md) : `GET /api/messages/{id}`
* [Show Message By Phone Number](documents/api/message/show-messages-phoneNumber.md) : `GET /api/messages/phone/{phoneNumber}`
* [Create Message](documents/api/message/create-message.md) : `POST /api/messages`
* [Delete Message](documents/api/message/delete-message.md) : `DELETE /api/messages/{id}`

## Gen Package

> - Generic Package
- [Adapter](src/main/java/com/omerozturk/N11GraduationProject/gen/adapter) 
   - Credit Score Service
   - Mernis Service
   - Twilio Sms Service
   
- [Configuration](src/main/java/com/omerozturk/N11GraduationProject/gen/configuration)
   - SwaggerConfiguration 
   - TwilioConfiguration
   
   
- [Excaption](src/main/java/com/omerozturk/N11GraduationProject/gen/excaption)
   - CustomizedResponseEntityExceptionHandler
   - ExceptionResponse
   
- [Utilities](src/main/java/com/omerozturk/N11GraduationProject/gen/utilities)
   - Entity
        - BaseEntity
		- SmsRequest
		
   - Enums
        - EnumStatus
		- EnumYesNo
		
   - Result
        - Result
		   - SuccessResult		
		   - ErrorResult   
        - DataResult
		   - SuccessDataResult		
		   - ErrorDataResult

   - Service
        - BaseEntityService
		   - findAll		
		   - findById
		   - save		
		   - delete		   
		   

## Uml Diagram

* [Show Crd Package Uml Diagram](documents/UmlDiagram/crd/readme.md) 
* [Show Csr Package Uml Diagram](documents/UmlDiagram/csr/readme.md) 
* [Show Cnt Package Uml Diagram](documents/UmlDiagram/cnt/readme.md) 

## OpenApi Swagger

* [Show OpenApi Yaml File](documents/swagger/openapi.yaml) 
* [Show OpenApi Json File](documents/swagger/openapi.json) 

* [Run the Back of Swagger Adress](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/)

## Author

**Ömer Öztürk**

* [github/omerozturk18](https://github.com/omerozturk18)
