printjson(db.people.aggregate({ $unwind : "$credit" },{ $group : { _id: "$credit.currency", sum_currency :{ $sum: "$credit.balance"}}}).toArray())

