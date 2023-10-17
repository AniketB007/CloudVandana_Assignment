//perform sorting of array in descending order.
let arr=[23,12,5,43,10];
let arr1;

for(let i=0;i<arr.length;i++){
    for(let j=i;j<arr.length;j++){
        if(arr[i]< arr[j]){//condition for descending order
            arr1=arr[i];
            arr[i]=arr[j];
            arr[j]=arr1;
        }
    }
}

console.log(arr)