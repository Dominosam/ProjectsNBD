db.cwiczenia2.mapReduce(
  function () {
    if (!this.credit) return;
    this.credit.forEach(function (credit) {
      emit(credit.currency, parseFloat(credit.balance) || 0);
    });
  },
  function (key, values) {
    return Array.sum(values)
  }, {
    out: "newCwiczenia2"
  }
);
  
db.newCwiczenia2.find({})