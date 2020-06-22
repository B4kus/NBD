printjson(db.people.aggregate(
{ $match : { nationality : "Poland" ,sex : "Female" } },
{ $unwind : "$credit" },
{ $group :
        { _id: "$credit.currency",
        avg_currency: { $avg: "$credit.balance" } ,
        sum_currency: { $sum: "$credit.balance" }
        }
}).toArray())
