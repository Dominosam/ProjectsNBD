db.cwiczenia2.insertOne(
{
	"sex" : "Male",
	"first_name" : "Dominik",
	"last_name" : "Samsel",
	"job" : ".NET Dev",
	"email" : "moj.email.123@gmail.com",
	"location" : {
		"city" : "Warszawa",
		"address" : {
			"streetname" : "Koszykowa",
			"streetnumber" : "86"
		}
	},
	"description" : ".NET Dev",
	"height" : "175",
	"weight" : "70",
	"birth_date" : "1997-11-23T00:00:00Z",
	"nationality" : "Poland",
	"credit" : [
		{
			"type" : "maestro",
			"number" : "0001000100010001",
			"currency" : "PLN",
			"balance" : "100"
		}
	]
}
)