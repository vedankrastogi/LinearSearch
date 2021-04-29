public class MainMethod {
    public static void main(String[] args) {

    }
    public boolean search(int[] arr,int searchElement){//this is the method signature which contains an array
        // as input and an element to be seached.
        boolean response=false;//we assign the ture and false to the varible as response
        for (int i = 0; i < arr.length; i++) {//here we traverse in our array
            // [(arr.fori) this is the shortcut key to implement for loop upto the length od array.
            //now we compare each element with search element
            if(arr[i] == searchElement){
                //if found
                response=true;
                break;
            }
        }
        return response;
    }
    //we have to create method for find the index at which the element is found if not return -1
    public int findindex(int[] arr,int searchElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==searchElement){
                return i;
            }
        }
        return-1;
    }
    //find the index of nth occurence of given element
    public int findNthIndex(int[] arr,int givenElement,int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==givenElement){
            }
        }
        return -1;
    }


}
