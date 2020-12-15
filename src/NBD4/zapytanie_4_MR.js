db.cwiczenia2.mapReduce(
	function () {
		var bmi = Math.round((+this.weight * 1000000 / (Math.pow(this.height,2))) ) / 100
		
		emit(this.nationality, { qty: 1, minBMI: bmi, maxBMI: bmi, avgBMI: bmi });
	}, 
	function (nationality, values) {
		newValues = { qty: 0, minBMI: 0, maxBMI: 0, avgBMI: 0 }
		
		for (var index = 0; index < values.length; index++) {
			newValues.qty += values[index].qty;
			
			if (newValues.minBMI == 0) {
				newValues.minBMI = values[index].minBMI;
			}
			
			newValues.minBMI = Math.min(newValues.minBMI, values[index].minBMI);
			newValues.maxBMI = Math.max(newValues.maxBMI, values[index].maxBMI);
			newValues.avgBMI += values[index].avgBMI;       
		}
		
		newValues.avgBMI = Math.round((newValues.avgBMI / newValues.qty) * 100) / 100;
		
		return newValues;
	},{ out: "newCwiczenia2"}
)
db.newCwiczenia2.find({})