import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbHelper helper = new DbHelper();//netbeans add jar
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "delete from musteri where musteriid=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,1);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Silindi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);


        } finally {
            statement.close();
            connection.close();

        }

    }

    public static void selectDemo() throws Exception {
        DbHelper helper = new DbHelper();//netbeans add jar
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select musteriid,musteriadi,musterisoyadi from musteri");
            ArrayList<Musteri> musteri = new ArrayList<Musteri>();

            while (resultSet.next()) {
                musteri.add(new Musteri(
                        resultSet.getInt("musteriid"),
                        resultSet.getString("musteriadi"),
                        resultSet.getString("musterisoyadi")));
            }
            System.out.println(musteri.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);


        } finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        DbHelper helper = new DbHelper();//netbeans add jar
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "insert into musteri(musteriadi,musterisoyadi) values(?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Şükriye");
            statement.setString(2, "Ölmez");
            int result = statement.executeUpdate();
            System.out.println("Kayıt Eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);


        } finally {
            statement.close();
            connection.close();

        }
    }
    public static void updatedata() throws SQLException{
        DbHelper helper = new DbHelper();//netbeans add jar
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "update musteri set musteriadi='Muhammet Uur' where musteriid=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,2);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Güncellendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);


        } finally {
            statement.close();
            connection.close();

        }
    }
}