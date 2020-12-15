db.cwiczenia2.mapReduce(
function () {emit(this.sex, {count: 1, height: parseFloat(this.height), weight: parseFloat(this.weight)});}, 
function (key, values) {
  var newValues = {count: 0, height: 0, weight: 0};

  values.forEach(function (value) {
    newValues.count += 1;
    newValues.height += value.height;
    newValues.weight += value.weight;
  });
  newValues.height = newValues.height / newValues.count;
  newValues.weight = newValues.weight / newValues.count;
  
  return tmp;
}, {
  out: 'newCwiczenia2'
});

db.newCwiczenia2.find({})