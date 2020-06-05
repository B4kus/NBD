db.people.insertOne({
    "sex" : "Male",
    "first_name" : "Szymon",
    "last_name" : "Szysz",
    "job" : "iOS Developer",
    "email" : "xxxx@xxxx.pl",
    "location" : {
        "city" : "Warszawa",
        "address" : {
            "streetname" : "XXXXXXXX",
            "streetnumber" : "XXXX"
        }
    },
    "description" : "non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit",
    "height" : "176.89",
    "weight" : "83.8",
    "birth_date" : "1996-11-25T11:51:38Z",
    "nationality" : "Poland",
    "credit" : [
        {
            "type" : "instapayment",
            "number" : "3581609550232321672",
            "currency" : "CZK",
            "balance" : "5658.66"
        },
        {
            "type" : "visa-electron",
            "number" : "637979654232338409",
            "currency" : "PLN",
            "balance" : "4280.15"
        },
        {
            "type" : "diners-club-international",
            "number" : "3539516232040777020",
            "currency" : "LKR",
            "balance" : "5402.31"
        },
        {
            "type" : "jcb",
            "number" : "56022234477278262112",
            "currency" : "CNY",
            "balance" : "4653.86"
        },
        {
            "type" : "jcb",
            "number" : "3529854509994014122",
            "currency" : "ARS",
            "balance" : "4944.8"
        }
    ]
})

