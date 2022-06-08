package Theory;

public class c15foreachloop {
    public static void main(String[] args) {
//        int[] marks = {98, 45, 99, 80};
        String[] marks = {"parishkar", "singh", "rajawat"};
        System.out.println(marks.length);
        for(String ele: marks){
            System.out.println( ele);
        }
    }
}
