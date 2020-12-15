db.cwiczenia2.mapReduce(
	function () {
		for (i = 0; i < this.credit.length; i++) {
			emit(this.credit[i].currency, { qty: 1, balance: +this.credit[i].balance });
		}
	}, 
	function (key, values) {
		newValues = { qty: 0, balance: 0 };
		
		for (i = 0; i < values.length; i++) {
			newValues.qty += values[i].qty;
			newValues.balance += values[i].balance;
		}
		
		newValues.balance = Math.round(newValues.balance * 100) / 100;
		newValues.avarage = Math.round((newValues.balance / newValues.qty) * 100) / 100;
		
		return newValues
	}, 
	{ query: { sex: "Female", nationality: "Poland" }, 
	out: "newCwiczenia2" })
db.newCwiczenia2.find({})