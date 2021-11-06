import java.sql.*;
import java.util.*;
public class MyMovieProject {
 
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        try {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:product.db");
        if(con!=null)
        {
        	//PreparedStatement pstmt=con.prepareStatement("insert into MyProjectMovies values(?,?,?,?,?)");
        	PreparedStatement pstmt=con.prepareStatement("select Movie_Name from MyProjectMovies where Actor_Name='prabhas'");
        	ResultSet rs=pstmt.executeQuery();
        	System.out.println("MovieName"+"\t"+"ActorName"+"\t"+"ActressName"+"\t"+"Year"+"\t"+"DirectorName");
        	System.out.println("______________________________________________________________");
        	while( rs.next()) {
               System.out.println(rs.getString(1));
             }
        	/*Statement s=con.createStatement();
            int f=s.executeUpdate("create table MyProjectMovies(Movie_Name varchar2(20) NOT NULL,Actor_Name varchar2(20) NOT NULL,Actress_Name varchar2(20) NOT NULL,Year number NOT NULL,direct_name varchar2(20) NOT NULL)");
            System.out.println("Table Created");*/
          /* System.out.println("Enter movie name");
            String Movie_Name=sc.next();
            System.out.println("Enter actor name");
            String Actor_Name=sc.next();
            System.out.println("Enter actress name");
            String Actress_Name=sc.next();
            System.out.println("Enter year of movie");
            int Year=sc.nextInt();
            System.out.println("Enter name of the director");
            String direct_Name=sc.next();
            pstmt.setString(1,Movie_Name);
            pstmt.setString(2,Actor_Name);
            pstmt.setString(3,Actress_Name);
            pstmt.setInt(4,Year);
            pstmt.setString(5,direct_Name);
           int x= pstmt.executeUpdate();
           System.out.println(x);*/
        }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
}