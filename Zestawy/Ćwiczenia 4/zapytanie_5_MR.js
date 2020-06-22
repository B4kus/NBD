printjson(db.people.mapReduce(
    function() {

    if(this.nationality == "Poland" && this.sex == "Female"){
        
        for(var i = 0; i < this.credit.length; i++){
            emit(this.credit[i].currency,this.credit[i].balance);
            }
    
        }
    },
    function(key, values) {
    
    var redVal = {sum_balance: 0, count: 0};
    
    for(var i = 0; i < values.length; i++){
    redVal.sum_balance = redVal.sum_balance + values[i];
    redVal.count++;
    }
    
    var redVal_2 = {sum_balance: 0, avg_balance: 0};
    redVal_2.sum_balance=redVal.sum_balance;
    redVal_2.avg_balance=redVal.sum_balance/redVal.count
    
    
    return redVal_2},
{
    out:"avg_bmi"
}
).find().toArray())
