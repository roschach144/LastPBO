import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// from 4 -  47 was by Tito
class Voter {
    private int id;
    private String name;
    private int age;
    private boolean voted;

    public Voter() {
    }

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
        this.voted = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }
}
// from 48 - 91 was by Cinta
class Candidate {
    private int id;
    private String name;
    private String party;
    private int voteCount;

    public Candidate() {
    }

    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
        this.voteCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
//from 92 - 166 was Niko
class Election {
    private int id;
    private String title;
    private Date startDate;
    private Date endDate;
    private List<Candidate> candidates;
    private List<Voter> voters;

    public Election() {
        candidates = new ArrayList<>();
        voters = new ArrayList<>();
    }

    public Election(String title, Date startDate, Date endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        candidates = new ArrayList<>();
        voters = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void registerVoter(Voter voter) {
        voters.add(voter);
    }

    public List<Voter> getVoters() {
        return voters;
    }

    public void openElection() {
        // Perform necessary actions to open the election
    }

    public void closeElection() {
        // Perform necessary actions to close the election
    }
}
//From here to the bottom of was by Farizi
class Admin {
    private int id;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void monitorActivity() {
        // Perform monitoring activity
    }
}

public class VotingApp {
    public static void main(String[] args) {
        // Create an instance of Election
        Election election = new Election("General Election", new Date(), new Date());

        // Create some candidates
        Candidate candidate1 = new Candidate("John Doe", "Party A");
        Candidate candidate2 = new Candidate("Jane Smith", "Party B");

        // Add candidates to the election
        election.addCandidate(candidate1);
        election.addCandidate(candidate2);

        // Create some voters
        Voter voter1 = new Voter("Alice", 25);
        Voter voter2 = new Voter("Bob", 30);

        // Register voters for the election
        election.registerVoter(voter1);
        election.registerVoter(voter2);

        // Open the election
        election.openElection();

        // Perform voting process
        voter1.setVoted(true);
        candidate1.setVoteCount(candidate1.getVoteCount() + 1);

        voter2.setVoted(true);
        candidate2.setVoteCount(candidate2.getVoteCount() + 1);

        // Close the election
        election.closeElection();

        // Display the election results
        System.out.println("Election Results: " + election.getTitle());
        for (Candidate candidate : election.getCandidates()) {
            System.out.println(candidate.getName() + " (" + candidate.getParty() + "): " +
                    candidate.getVoteCount() + " votes");
        }
    }
}
