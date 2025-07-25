public class VotingRunner {
    public static void main(String[] args) {

        
        Voting voting = new Voting("Suhas", 17);

     
        if (voting.getAge() >= 18) {
            System.out.println(voting.getName() + " is eligible for voting.");
        } else {
            System.out.println(voting.getName() + " is NOT eligible for voting.");
        }
    }
}
