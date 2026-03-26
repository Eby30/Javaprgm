public class ScoreCheck {
    public static void main(String[] args) {
        //storing scores of 5 students
        int[] scores = {95, 82, 67, 45, 88};
        //looping through each score
        for(int i = 0; i<scores.length;i++){
            int score = scores[i];

            System.out.print("Score"+ score + "-");
        //Checking the scores    
            if (score >= 90){
                System.out.println("Excellent");
            }else if (score >= 75){
                System.err.println("Good");
            }else if (score >= 50){
                System.err.println("Average");
            }else {
                System.err.println("Fail");
            }
        }
    }
}
