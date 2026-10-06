class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int n = students.length;
        Queue<Integer> student = new LinkedList<>();
        for(int i = 0; i< n; i++){
            student.add(students[i]);
        }

        int res = n;

        for( int i = 0; i< sandwiches.length; i++){
            int attempts = 0;
            while (!student.isEmpty() && student.peek() != sandwiches[i] && attempts < student.size()) {
                student.add(student.poll());
                attempts++;
            }
            if (student.isEmpty() || student.peek() != sandwiches[i]) {
                break;
            }
            student.poll();
            res--;
        }

        return res;
        
    }
}