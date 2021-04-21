let timeAfter10Sec = ((getPresenttime()+10)%60);// current second + 10 second
function getPresenttime()// it will return current second
{
  let presentDate = new Date();
  return presentDate.getSeconds();
}
let presentTime = getPresenttime();

let count = 0;
let n = 0;
function calculatePopulation(country)
{
  const l = country.length;
presentTime = getPresenttime(); //present second
  if(presentTime===timeAfter10Sec||count==0) //count is used so that n will be assigned once when count == 0 though present time may not be equal to timeafter10second
  {
   n = Math.random()*(1000000000*l-1000000000)+1000000000;
  count++;
  timeAfter10Sec = ((getPresenttime()+10)%60);//once time is equal timeafter 10 second must be reset
}
  return parseInt(n);
}
let i=0;
while(i<100000) // loop is used to check the test case whether the population is being changed or not after 10 seconds
{
  let country = "India";
  
    let popn =calculatePopulation(country);
  
  console.log("Population of",country," is ",popn);
  i++;
}

