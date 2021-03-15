# Getting started

Buy Airtime on the most simplistic System. We abstract all the nitty-gritty leaving you with just the option to specify the account number to receive airtime and how much. 

We guarantee 95% uptime, 99% reliability.

Just Request and we will make sure you get, in realtime. If not, you will be notified immediately by events.

Now, what Credo is faster that Credofaster!

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

## How to Use

The following section explains how to use the CredofasterPartnerApi library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *CredofasterPartnerApiLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

Clicking the ``` Add ``` button will open a dialog where you need to specify CredofasterPartnerApi in ``` Group Id ``` and CredofasterPartnerApiLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Credofaster%20Partner%20Api-Java&workspaceName=CredofasterPartnerApi&projectName=CredofasterPartnerApiLib&rootNamespace=ke.co.credofaster.partner.apitest)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *CredofasterPartnerApiLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| apiKey | Assigned APIKey |
| clientId | Assigned ClientId |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String apiKey = "XXXX-XXXX-XXXX-XXXX"; // Assigned APIKey
String clientId = "ABCDEDFG1234"; // Assigned ClientId

CredofasterPartnerApiClient client = new CredofasterPartnerApiClient(apiKey, clientId);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [MainController](#main_controller)
* [EventsController](#events_controller)

## <a name="main_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.credofaster.partner.apitest.controllers.MainController") MainController

### Get singleton instance

The singleton instance of the ``` MainController ``` class can be accessed from the API Client.

```java
MainController main = client.getMain();
```

### <a name="airtime_request_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.MainController.airtimeRequestAsync") airtimeRequestAsync

> Request Airtime Purchase


```java
void airtimeRequestAsync(
        final PartnerAirtimeRequest request,
        final APICallBack<List<PartnerAirtimeResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    PartnerAirtimeRequest request = new PartnerAirtimeRequest();
    // Invoking the API call with sample inputs
    main.airtimeRequestAsync(request, new APICallBack<List<PartnerAirtimeResponse>>() {
        public void onSuccess(HttpContext context, List<PartnerAirtimeResponse> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="airtime_balance_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.MainController.airtimeBalanceAsync") airtimeBalanceAsync

> Gets the current Working Balance. 
> Balance is SIGNED


```java
void airtimeBalanceAsync(final APICallBack<PartnerAirtimeBalanceResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
main.airtimeBalanceAsync(new APICallBack<PartnerAirtimeBalanceResponse>() {
    public void onSuccess(HttpContext context, PartnerAirtimeBalanceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="events_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.credofaster.partner.apitest.controllers.EventsController") EventsController

### Get singleton instance

The singleton instance of the ``` EventsController ``` class can be accessed from the API Client.

```java
EventsController events = client.getEvents();
```

### <a name="register_callback_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.EventsController.registerCallbackAsync") registerCallbackAsync

> A callback to receive the below Callbacks


```java
void registerCallbackAsync(
        final RegisterCallbackRequest request,
        final APICallBack<RegisterCallbackResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    RegisterCallbackRequest request = new RegisterCallbackRequest();
    // Invoking the API call with sample inputs
    events.registerCallbackAsync(request, new APICallBack<RegisterCallbackResponse>() {
        public void onSuccess(HttpContext context, RegisterCallbackResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="client_event_feedback_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.credofaster.partner.apitest.controllers.EventsController.clientEventFeedbackAsync") clientEventFeedbackAsync

> *Tags:*  ``` Skips Authentication ``` 

> You are required to provide a HTTP/HTTPS endpoint, to which we will publish various events. 
> 
> This Endpoint will be hosted on the CLIENT's Environment. If no endpoint is provided, we are not liable to any missing events. 
> 
> NOTE: A DETAILED PDF of all Events is shared on request. It contains application events, System Health Events and Alerts on the same.


```java
void clientEventFeedbackAsync(
        final EventCallbackPayload payloadToReceive,
        final APICallBack<EventCallbackFeedback> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| payloadToReceive |  ``` Required ```  | Sample Payload: {"EventId":"123456789","EventType":"QUEUED","RequestId":"A09797a11e2564061b859781b18bb34dd","EventData":{}} |


#### Example Usage

```java
try {
    String payloadToReceiveValue = "{\"EventId\":\"123456789\",\"EventType\":\"QUEUED\",\"RequestId\":\"A09797a11e2564061b859781b18bb34dd\",\"EventData\":{}}";
    EventCallbackPayload payloadToReceive = mapper.readValue(payloadToReceiveValue,new TypeReference<EventCallbackPayload> (){});
    // Invoking the API call with sample inputs
    events.clientEventFeedbackAsync(payloadToReceive, new APICallBack<EventCallbackFeedback>() {
        public void onSuccess(HttpContext context, EventCallbackFeedback response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)



