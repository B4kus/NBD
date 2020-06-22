printjson(db.people.mapReduce(
    function(){
        emit(this.nationality, {height: this.height, weight: this.weight});
    },
    function(key,val){
        var bmi = {avg: 0}
       
        for(var i = 0; i < val.length ;i++){
            var bmi = val[i].weight / (val[i].height * val[i].height);
            bmi.avg += bmi;

            if(!(bmi.max > bmi)){
                bmi.max = bmi
            }
            if(!(bmi.min < bmi)){
                bmi.min = bmi
            }
        }
        bmi.avg /= val.length;
        
        return bmi;
    },
{
    out:"bmi"
}
).find().toArray())
