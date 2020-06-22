printjson(db.people.mapReduce(
    function() { emit(this.job,1); },
    function(key, values) {
     var jobs = {};
     var v = {};
     values.forEach(function(n) {
         for(var i in n){
             if(!jobs[i])
                 jobs[i]=0
               jobs[i] +=v[i];}
    return jobs})},
{out:"post_total"}
).find().toArray())
