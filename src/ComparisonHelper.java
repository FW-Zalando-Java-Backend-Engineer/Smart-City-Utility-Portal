public class ComparisonHelper {

    public static boolean isHigherUsage(int user1Units, int user2Units) {
        // TODO: Use relational and logical operators to compare usage

        // Return true only if user1 used more AND used over 100 units
        return (user1Units > user2Units) && (user1Units > 100);
    }
}
