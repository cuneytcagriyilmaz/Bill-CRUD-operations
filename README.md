Bill-CRUD-operations

------------------
We will make a project with an invoice payment / inquiry / payment cancellation processes.
A MemberAccount class with which we will associate invoices, a service class that performs create/read/update/delete operations such as MemberAccountService,
Keep the amount, process_date, bill_type information for the invoice.
The invoice will have a service class for which payment/inquiry/payment cancellation methods must be found.
MemberAccount must also have a memberCode consisting of id + the first 2 letters of the name, so that it will query and pay the invoice according to this code. MemberAccount must contain name, surname, id, code, balance information.
Let there be a Client class that will inherit the InvoiceService class. (We made an example while describing inheritance).
Let's call the invoice methods in the Service through this client.
Also, let's show 3 different implementations in the client, with the payment method being overloaded according to the invoice type. (There must be an attribute for the invoice type in the invoice model class. Invoice types; 1- telephone / 2- internet 3- water bill. take these values ​​as int)
While calling the methods in the client, let's call the invoice processing methods by taking the invoice type and memberCode from the user.
Invoice type and memberCode will be parameters in each invoice method. In addition to payment and payment cancellation, let's add the amount and invoice date to the parameter.
Let's create a custom exception class. If the amount entered in payment and payment cancellation and the amount in the customer's account are not sufficient, create an exception message.