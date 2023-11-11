package list;

public class basic {

    public void insert(int[] nums, int index, int value){
        int length = nums.length - 1;

        for (int i=length; i>index; i--) {
            nums[i] = nums[i-1];
        }
        nums[index] = value;
    } 

    public void delete(int[] nums, int index, int value) {
        int length = nums.length - 1;
        for (int i=index; i<length; i++) {
            nums[i] = nums[i+1];
        } 
        nums[length] = 0;
    }

    public class listNode {
        listNode next;
        int value;
        public listNode(int x) {  value = x;  }
    }

}
