Bill-CRUD-operations

------------------
1) We will make a project with an invoice payment / inquiry / payment cancellation processes.

2) A MemberAccount class with which we will associate invoices, a service class that performs create/read/update/delete operations such as MemberAccountService,

3) Keep the amount, process_date, bill_type information for the invoice.

4) The invoice will have a service class for which payment/inquiry/payment cancellation methods must be found.

5) MemberAccount must also have a memberCode consisting of id + the first 2 letters of the name, so that it will query and pay the invoice according to this code. MemberAccount must contain name, surname, id, code, balance information.

6) Let there be a Client class that will inherit the InvoiceService class. (We made an example while describing inheritance).

7) Let's call the invoice methods in the Service through this client.

8) Also, let's show 3 different implementations in the client, with the payment method being overloaded according to the invoice type. (There must be an attribute for the invoice type in the invoice model class. Invoice types; 1- telephone / 2- internet 3- water bill. take these values ​​as int)

9) While calling the methods in the client, let's call the invoice processing methods by taking the invoice type and memberCode from the user.

10) Invoice type and memberCode will be parameters in each invoice method. In addition to payment and payment cancellation, let's add the amount and invoice date to the parameter.

11) Let's create a custom exception class. If the amount entered in payment and payment cancellation and the amount in the customer's account are not sufficient, create an exception message.
