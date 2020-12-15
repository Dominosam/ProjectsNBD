db.cwiczenia2.mapReduce(
  function () { emit( this.job, {workerQty:1}); },
  function (key, values) {
    var newValues = {workerQty: 0};

    values.forEach(function (value) {
      newValues.workerQty += value.workerQty;
    });

    return newValues;
  }, {
    out: "newCwiczenia2"
  }
);
  
  db.newCwiczenia2.find({})